package cn.edu.guet.entity;

import java.sql.Timestamp;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.entity
 * @date 2021/8/20 0:41
 * @since 1.0
 */
public class Testlog {
    private String uuid;
    private String method;
    private String RequestURL;
    private String RemoteHOST;
    private String RequestURI;
    private String CODE;
    private String username;
    private Timestamp loginTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequestURL() {
        return RequestURL;
    }

    public void setRequestURL(String requestURL) {
        RequestURL = requestURL;
    }

    public String getRemoteHOST() {
        return RemoteHOST;
    }

    public void setRemoteHOST(String remoteHOST) {
        RemoteHOST = remoteHOST;
    }

    public String getRequestURI() {
        return RequestURI;
    }

    public void setRequestURI(String requestURI) {
        RequestURI = requestURI;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }
}
