package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 角色名称
     */
    @TableField("ROLE_NAME")
    private String roleName;

    /**
     * 角色说明
     */
    @TableField("ROLE_DESCRIPTION")
    private String roleDescription;

    /**
     * 应用id
     */
    @TableField("APP_CODE")
    private String appCode;

    /**
     * 类型（0：普通，1：管理员）
     */
    @TableField("ROLE_TYPE")
    private Integer roleType;

    @TableField("CREATER")
    private String creater;

    @TableField("itemCreateAt")
    private Date itemcreateat;

    @TableField("UPDATER")
    private String updater;

    @TableField("itemUpdateAt")
    private Date itemupdateat;


}
