package cn.edu.guet.service;

import cn.edu.guet.entity.Resource;
import cn.edu.guet.entity.Role;
import cn.edu.guet.entity.Users;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.service
 * @date 2021/8/15 15:15
 * @since 1.0
 */
public interface IUserService {
    Users selectByName(String username);
    Resource selectRoleByName(String username);
}
