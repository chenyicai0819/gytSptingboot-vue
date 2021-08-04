package cn.edu.guet.mapper;

import cn.edu.guet.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.mapper
 * @date 2021/8/4 9:29
 * @since 1.0
 */

/**
 * myBatis-plus测试接口
 */
@Mapper
public interface TestMapper extends BaseMapper<User> {
}
