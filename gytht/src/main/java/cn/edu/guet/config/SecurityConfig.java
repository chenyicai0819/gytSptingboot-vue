package cn.edu.guet.config;

import cn.edu.guet.config.handler.*;
import cn.edu.guet.config.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsUtils;

/**
 * @author George
 * @project SpringSecurityDemo
 * @package cn.edu.guet.config
 * @date 2021/8/13 11:39
 * @since 1.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  // 数据库获取到用户信息
  @Override
  @Bean
  public UserDetailsService userDetailsService(){
    return new UserDetailsServiceImpl();
  }
  // 密码加密
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
  // 授权
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    // super.configure(http);

    // 链式编程
    //关闭跨站防御
    http.cors()
        .and()
        .csrf().disable()
        // 开启formLogin认证
        .formLogin()
        // 验证成功之后跳转的路径
        .successHandler(new LoginSuccessHandlerImpl())
        .failureHandler(new LoginFailureHandlerImpl())
      .and()
        // 资源控制逻辑
        .authorizeRequests()
        // 允许所有人访问的地址
        .antMatchers("/login").permitAll()
        .anyRequest()
        // 所有请求都需要通过权限认证才可以访问
        .authenticated()
      .and()
      // 开启注销功能,并设置注销之后到达的界面
        .logout()
        .logoutSuccessHandler(new LogoutHandlerImpl())
        .permitAll()
        // 登出之后删除cookie和session
        // 可能会与记住我相冲突
        .deleteCookies("JSESSIONID")
        .invalidateHttpSession(true)
      // 记住我功能，cookie默认保存两周
      // cookie可能不安全
      .and()
        .exceptionHandling()
        .accessDeniedHandler(new AccessDeniedHandlerImpl())
        .authenticationEntryPoint(new AuthenticationEntryPointImpl());

  }

  // 认证
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    //Spring security 5.0中新增了多种加密方式，也改变了密码的格式。
    //要想我们的项目还能够正常登陆，需要修改一下configure中的代码。我们要将前端传过来的密码进行某种方式加密
    //spring security 官方推荐的是使用bcrypt加密方式。
    auth.userDetailsService(userDetailsService());
  }

  @Override
  public void configure(WebSecurity web) throws Exception{
    // 设置静态资源不经过过滤器
    web.ignoring()
      .antMatchers("/css/**","/fonts/**","/img/**","/js/**")
            .antMatchers(HttpMethod.OPTIONS, "/**");
  }
}
