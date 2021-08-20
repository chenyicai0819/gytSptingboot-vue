package cn.edu.guet.aspect;

import cn.edu.guet.entity.TestUpdataLog;
import cn.edu.guet.entity.Testlog;
import cn.edu.guet.mapper.TestLogMapper;
import cn.edu.guet.util.Uuid;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

import static cn.edu.guet.config.util.ResultArgsUtil.UPDATA_SUCCESS_CODE;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.aspect
 * @date 2021/8/20 11:27
 * @since 1.0
 */
@Aspect
@Component
public class UpdataAop {
    @Autowired
    TestLogMapper testLogMapper;

    @Pointcut("execution(public * cn.edu.guet.service.impl.UserServiceImpl.updataPwd(..))")
    public void updataPwd(){}

    @AfterReturning(value = "updataPwd()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) throws Throwable {
        //切点的参数值
        Object[] arg =joinPoint.getArgs();
        String username = (String) arg[0];
        String password = (String) arg[1];
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Uuid uuid=new Uuid();
        Date date = new Date();
        Timestamp nousedate = new Timestamp(date.getTime());
        TestUpdataLog testUpdataLog=new TestUpdataLog();
        testUpdataLog.setUuid(uuid.getUuid());
        testUpdataLog.setMethod(request.getMethod());
        testUpdataLog.setRequestURL(String.valueOf(request.getRequestURL()));
        testUpdataLog.setRemoteHOST(request.getRemoteHost());
        testUpdataLog.setRequestURI(request.getRequestURI());
        testUpdataLog.setCODE(String.valueOf(UPDATA_SUCCESS_CODE));
        testUpdataLog.setUsername(username);
        testUpdataLog.setSql("UPDATE user SET password="+password+" WHERE username="+username);
        testUpdataLog.setUpdataTime(nousedate);
        testLogMapper.addUpdataLog(testUpdataLog);
    }
}
