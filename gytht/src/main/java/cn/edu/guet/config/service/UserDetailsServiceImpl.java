package cn.edu.guet.config.service;

import cn.edu.guet.entity.Resource;
import cn.edu.guet.entity.Role;
import cn.edu.guet.entity.Users;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;

/**
 * @author George
 * @project SpringSecurityDemo
 * @package cn.edu.guet.config.service
 * @date 2021/8/13 19:08
 * @since 1.0
 */
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  private IUserService userService;

  @Autowired
  HttpServletRequest request;

  // 密码加密
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    request.setAttribute("username",username);
    if (username == null || "".equals(username)) {
      throw new RuntimeException("用户名不能为空");
    }
    //根据用户名查询用户
    Users users= userService.selectByName(username);
    if (users == null) {
      throw new RuntimeException("用户不存在");
    }

    Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
    if (users != null) {
      Resource resource = userService.selectRoleByName(username);
      grantedAuthorities.add(new SimpleGrantedAuthority(resource.getResourceName()));
    }

    // 返回的是：用户名(id)，密码，权限
    // 都是从数据库查出来的
    System.out.println(users.getUsername());
    System.out.println(passwordEncoder().encode(users.getPassword()));
    System.out.println(grantedAuthorities);
    return new User(users.getUsername(), passwordEncoder().encode(users.getPassword()), grantedAuthorities);
  }
}
