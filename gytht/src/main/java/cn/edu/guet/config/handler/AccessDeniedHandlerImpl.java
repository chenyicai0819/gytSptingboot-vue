package cn.edu.guet.config.handler;

import cn.edu.guet.config.util.ResultJSON;
import cn.edu.guet.config.util.SecurityHandlerUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static cn.edu.guet.config.util.ResultArgsUtil.AUTHORIZE_FAILURE_CODE;
import static cn.edu.guet.config.util.ResultArgsUtil.AUTHORIZE_FAILURE_MSG;


/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.config.handler
 * @date 2021/8/15 13:38
 * @since 1.0
 */
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        SecurityHandlerUtil.responseHandler(httpServletResponse,new ResultJSON(AUTHORIZE_FAILURE_CODE,AUTHORIZE_FAILURE_MSG));
    }
}

