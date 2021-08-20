package cn.edu.guet.util;

import java.util.UUID;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.util
 * @date 2021/8/20 9:44
 * @since 1.0
 */
public class Uuid {
    public String getUuid() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
