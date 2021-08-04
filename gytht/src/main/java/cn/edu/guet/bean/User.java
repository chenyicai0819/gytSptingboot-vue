package cn.edu.guet.bean;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.bean
 * @date 2021/8/4 9:27
 * @since 1.0
 */

/**
 * myBatis-puls测试类
 */
public class User {
    private String userid;
    private String username;
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
