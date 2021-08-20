package cn.edu.guet.config.handler;

import cn.edu.guet.config.util.ResultJSON;
import cn.edu.guet.config.util.SecurityHandlerUtil;
import cn.edu.guet.entity.Testlog;
import cn.edu.guet.mapper.TestLogMapper;
import cn.edu.guet.service.IMUserLoginLogService;
import cn.edu.guet.service.impl.UserLoginLogService;
import cn.edu.guet.util.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static cn.edu.guet.config.util.ResultArgsUtil.USER_LOGIN_SUCCESS_CODE;
import static cn.edu.guet.config.util.ResultArgsUtil.USER_LOGIN_SUCCESS_MSG;


/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.config.handler
 * @date 2021/8/15 13:34
 * @since 1.0
 */
@Service
public class LoginSuccessHandlerImpl implements AuthenticationSuccessHandler {

    //因为HAndler是一个filter，不能直接注入属性
    private static TestLogMapper testLogMapper;
    @Resource
    public void setTestLogMapper(TestLogMapper testLogMapper){
        LoginSuccessHandlerImpl.testLogMapper=testLogMapper;
    }


    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        SecurityHandlerUtil.responseHandler(httpServletResponse,new ResultJSON(USER_LOGIN_SUCCESS_CODE,USER_LOGIN_SUCCESS_MSG));
        Uuid uuid=new Uuid();
        Date date = new Date();
        Timestamp nousedate = new Timestamp(date.getTime());
        Testlog testlog=new Testlog();
        testlog.setUuid(uuid.getUuid());
        testlog.setMethod(httpServletRequest.getMethod());
        testlog.setRequestURL(String.valueOf(httpServletRequest.getRequestURL()));
        testlog.setRemoteHOST(httpServletRequest.getRemoteHost());
        testlog.setRequestURI(httpServletRequest.getRequestURI());
        testlog.setCODE(String.valueOf(USER_LOGIN_SUCCESS_CODE));
        testlog.setUsername(httpServletRequest.getParameter("username"));
        testlog.setLoginTime(nousedate);
        testLogMapper.addUserLoginLog(testlog);
    }
}
