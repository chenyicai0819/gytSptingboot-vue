package cn.edu.guet.mapper;

import cn.edu.guet.entity.Testlog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.mapper
 * @date 2021/8/20 0:46
 * @since 1.0
 */
@Mapper
public interface TestLogMapper {
    void addUserLoginLog(Testlog testlog);
}
