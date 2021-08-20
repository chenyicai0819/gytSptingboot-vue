package cn.edu.guet.service.impl;

import cn.edu.guet.entity.Testlog;
import cn.edu.guet.mapper.TestLogMapper;
import cn.edu.guet.service.IMUserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.service.impl
 * @date 2021/8/20 0:45
 * @since 1.0
 */
@Service
public class UserLoginLogService implements IMUserLoginLogService {

    @Autowired
    private TestLogMapper testLogMapper;

    @Override
    public void addUserLoginLog(Testlog testlog) {
    }
}
