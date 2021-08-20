package cn.edu.guet.aspect;

import cn.edu.guet.entity.Testlog;
import cn.edu.guet.service.IMUserLoginLogService;
import cn.edu.guet.service.IUserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * 登录日志
 */
@Aspect
@Component
public class LoginLogAop {

    @Autowired
    private IMUserLoginLogService mUserLoginLogService;
    @Autowired
    private IUserService userService;

    //@Pointcut("execution(public * cn.edu.guet.service.impl.UserServiceImpl.selectByName(..))")
    public void login(){}


    //@AfterReturning(value = "login()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) throws Throwable {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //请求地址
        String url = request.getRequestURL().toString();
        //请求方法
        String method = request.getMethod();
        //请求IP
        String host = request.getRemoteHost();
        //uri
        String uri = request.getRequestURI();
        // result的值就是被拦截方法的返回值
        Testlog testlog = new Testlog();
        // testlog.setId((int) (Math.random()*100));
        // testlog.setName(method);
        //切点的参数值
        Object[] arg =joinPoint.getArgs();
        String username = (String) arg[0];
        mUserLoginLogService.addUserLoginLog(testlog);
    }
}
