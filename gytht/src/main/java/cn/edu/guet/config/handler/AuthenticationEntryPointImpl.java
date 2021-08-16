package cn.edu.guet.config.handler;

import cn.edu.guet.config.util.ResultJSON;
import cn.edu.guet.config.util.SecurityHandlerUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static cn.edu.guet.config.util.ResultArgsUtil.USER_NOT_LOGIN_FAILURE_CODE;
import static cn.edu.guet.config.util.ResultArgsUtil.USER_NOT_LOGIN_FAILURE_MSG;


/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.config.handler
 * @date 2021/8/15 13:44
 * @since 1.0
 */
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        SecurityHandlerUtil.responseHandler(httpServletResponse,new ResultJSON(USER_NOT_LOGIN_FAILURE_CODE,USER_NOT_LOGIN_FAILURE_MSG));
    }
}
