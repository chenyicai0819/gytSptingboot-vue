package cn.edu.guet.mapper;

import cn.edu.guet.entity.Resource;
import cn.edu.guet.entity.Role;
import cn.edu.guet.entity.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.mapper
 * @date 2021/8/15 14:06
 * @since 1.0
 */
@Mapper
public interface UserMapper {
    Users selectByName(String username);
    Resource selectRoleByName(String username);
    String selectPhone(String name);
    String selectOldPwd(String name);
}
