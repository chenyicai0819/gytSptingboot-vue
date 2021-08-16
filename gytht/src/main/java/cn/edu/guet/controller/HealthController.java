package cn.edu.guet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.controller
 * @date 2021/8/15 16:21
 * @since 1.0
 */
@RestController
@RequestMapping(("/healthProtection"))
public class HealthController {
    @RequestMapping("/healthPreservation")
    public String healthPreservation(){
        return "/healthProtection/healthPreservation";
    }
}
