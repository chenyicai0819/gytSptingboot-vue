package cn.edu.guet.config.util;



import cn.hutool.json.JSONUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.util
 * @date 2021/8/15 13:23
 * @since 1.0
 */
public class SecurityHandlerUtil {
    /**
     * security处理返回结果
     * @param response 响应
     * @param result 结果
     * @throws IOException
     */
    public static void responseHandler(HttpServletResponse response, ResultJSON result) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(JSONUtil.toJsonStr(result));
        writer.flush();
        writer.close();
    }
}

