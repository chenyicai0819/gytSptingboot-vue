package cn.edu.guet.service.impl;

import cn.edu.guet.entity.Resource;
import cn.edu.guet.entity.Role;
import cn.edu.guet.entity.Users;
import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.service.impl
 * @date 2021/8/15 15:16
 * @since 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Users selectByName(String username) {
        return userMapper.selectByName(username);
    }

    @Override
    public Resource selectRoleByName(String username) {
        return userMapper.selectRoleByName(username);
    }

    @Override
    public String selectPhone(String name) {
        return userMapper.selectPhone(name);
    }

    @Override
    public String selectOldPwd(String name) {
        return userMapper.selectOldPwd(name);
    }
}
