package cn.edu.guet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.controller
 * @date 2021/8/14 15:56
 * @since 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/imgCode")
    public String getImgCode(){
        String imgCode= String.valueOf(Math.random()*1000000);
        return imgCode;
    }
}
