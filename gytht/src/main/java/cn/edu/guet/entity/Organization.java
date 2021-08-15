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
 * 机构表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 机构名称
     */
    @TableField("ORG_NAME")
    private String orgName;

    /**
     * 机构编码
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 描述
     */
    @TableField("ORG_DESCRIPTION")
    private String orgDescription;

    /**
     * 标识符(用来标识机构类型)
     */
    @TableField("ORG_IDENTIFY")
    private String orgIdentify;

    /**
     * 备用字段
     */
    private String backup1;

    /**
     * 备用字段
     */
    private String backup2;

    /**
     * 左值
     */
    @TableField("LEFT")
    private Integer left;

    /**
     * 右值
     */
    @TableField("RIGHT")
    private Integer right;

    /**
     * 层级
     */
    @TableField("LEVEL")
    private Integer level;

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
