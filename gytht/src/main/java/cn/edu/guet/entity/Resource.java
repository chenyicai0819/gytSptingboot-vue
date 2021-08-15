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
 * 权限表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Resource implements Serializable {

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
     * 权限名称
     */
    @TableField("RESOURCE_NAME")
    private String resourceName;

    /**
     * 权限类型
     */
    @TableField("RESOURCE_TYPE")
    private String resourceType;

    /**
     * 父级id
     */
    @TableField("RESOURCE_PCODE")
    private String resourcePcode;

    /**
     * 等级
     */
    @TableField("RESOURCE_LEVEL")
    private String resourceLevel;

    /**
     * 权限访问地址
     */
    @TableField("RESOURCE_URL")
    private String resourceUrl;

    /**
     * 权限描述
     */
    @TableField("RESOURCE_DESCRIPTION")
    private String resourceDescription;

    /**
     * 排序
     */
    @TableField("SORT")
    private Integer sort;

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


}
