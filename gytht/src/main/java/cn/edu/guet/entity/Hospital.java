package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

/**
 * <p>
 * 国医堂信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_hospital")
public class Hospital implements Serializable {

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
     * 国医堂名称
     */
    @TableField("HOSPITAL_NAME")
    private String hospitalName;

    /**
     * 医院等级
     */
    @TableField("HOSPITAL_LEVEL")
    private String hospitalLevel;

    /**
     * 预约量
     */
    @TableField("HOSPITAL_BOOKING")
    private Integer hospitalBooking;

    /**
     * 评分
     */
    @TableField("HOSPITAL_SOURCE")
    private Double hospitalSource;

    /**
     * 距离（暂定）
     */
    @TableField("HOSPITAL_DISTANCE")
    private Integer hospitalDistance;

    /**
     * 医院电话
     */
    @TableField("HOSPITAL_PHONE")
    private String hospitalPhone;

    /**
     * 医院地址省份
     */
    @TableField("HOSPITAL_PRO")
    private String hospitalPro;

    /**
     * 医院地址市
     */
    @TableField("HOSPITAL_CITY")
    private String hospitalCity;

    /**
     * 地址省份
     */
    @TableField("HOSPITAL_COUNTRY")
    private String hospitalCountry;

    /**
     * 医院详细地址
     */
    @TableField("HOSPITAL_ADRESS")
    private String hospitalAdress;

    /**
     * 简介
     */
    @TableField("INTRODUCE")
    private Blob introduce;

    /**
     * 数据状态
     */
    @TableField("STATUS")
    private String status;

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
