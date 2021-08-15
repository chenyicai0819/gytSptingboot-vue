package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 今日热点记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_hotspot")
public class Hotspot implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 热点名称
     */
    @TableField("HOTSPOT_TITLE")
    private String hotspotTitle;

    /**
     * 介绍
     */
    @TableField("HOTSPOT_CONTENT")
    private String hotspotContent;

    /**
     * 数据状态
     */
    @TableField("DATA_STATUS")
    private String dataStatus;

    /**
     * 数据类型(用来区分处中药常识以外几项）
     */
    @TableField("DATA_TYPE")
    private String dataType;

    @TableField("USER_CODE")
    private String userCode;

    /**
     * 创建者
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
