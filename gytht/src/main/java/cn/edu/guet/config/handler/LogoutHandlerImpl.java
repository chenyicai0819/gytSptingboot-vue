package cn.edu.guet.config.handler;

import cn.edu.guet.config.util.ResultJSON;
import cn.edu.guet.config.util.SecurityHandlerUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static cn.edu.guet.config.util.ResultArgsUtil.LOGOUT_SUCCESS_CODE;
import static cn.edu.guet.config.util.ResultArgsUtil.LOGOUT_SUCCESS_MSG;


/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.config.handler
 * @date 2021/8/15 13:37
 * @since 1.0
 */
public class LogoutHandlerImpl implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        SecurityHandlerUtil.responseHandler(httpServletResponse,new ResultJSON(LOGOUT_SUCCESS_CODE,LOGOUT_SUCCESS_MSG));
    }
}
