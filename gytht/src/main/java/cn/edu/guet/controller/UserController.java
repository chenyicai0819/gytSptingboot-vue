package cn.edu.guet.controller;

import cn.edu.guet.entity.Resource;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.controller
 * @date 2021/8/14 15:55
 * @since 1.0
 */
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/getUserRole")
    public Resource getUserRole(String name){
        return userService.selectRoleByName(name);
    }
    @GetMapping("/selectPhone")
    public String selectPhone(String name){
        return userService.selectPhone(name);
    }
    @GetMapping("/selectOldPwd")
    public String selectOldPwd(String name){
        return userService.selectOldPwd(name);
    }
    @GetMapping("/updataPwd")
    public boolean updataPwd(String username,String password){
        int isTrue=userService.updataPwd(username,password);
        if (isTrue==1){
            return true;
        }else{
            return false;
        }
    }
}

