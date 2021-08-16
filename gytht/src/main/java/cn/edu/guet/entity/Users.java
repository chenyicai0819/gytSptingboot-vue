package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 机构id(关联organization表中的itemID）
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 登陆账号
     */
    @TableField("USERNAME")
    private String username;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 盐
     */
    @TableField("SALT")
    private String salt;

    /**
     * 用户名
     */
    @TableField("NAME")
    private String name;

    /**
     * 性别
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 肖像
     */
    @TableField("PORTRAIT")
    private Blob portrait;

    /**
     * 身份证件类型
     */
    @TableField("IDCARD_TYPE")
    private String idcardType;

    /**
     * 证件号码
     */
    @TableField("IDCARD_NO")
    private String idcardNo;

    /**
     * email
     */
    @TableField("EMAIL")
    private String email;

    @TableField("STATE")
    private String state;

    /**
     * 电话号码
     */
    @TableField("mobilePhone")
    private String mobilephone;

    /**
     * 创建人
     */
    @TableField("CREATER")
    private String creater;

    /**
     * 创建时间
     */
    @TableField("itemCreateAt")
    private Date itemcreateat;

    /**
     * 修改人
     */
    @TableField("UPDATER")
    private String updater;

    /**
     * 修改时间
     */
    @TableField("itemUpdateAt")
    private Date itemupdateat;

    /**
     * 地级机构id
     */
    @TableField("CITYID")
    private String cityid;

    /**
     * 类型（0：普通，1：管理员）
     */
    @TableField("TYPE")
    private Integer type;

    /**
     * 出生日期
     */
    @TableField("BIRTH")
    private Date birth;

    @TableField("WX_OPENID")
    private String wxOpenid;


}
