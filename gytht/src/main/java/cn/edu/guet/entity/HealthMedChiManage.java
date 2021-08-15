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
 * 老年人中医药健康管理服务信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_health_med_chi_manage")
public class HealthMedChiManage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 姓名
     */
    @TableField("PATIENT_ID")
    private String patientId;

    /**
     * 责任医师姓名
     */
    @TableField("IDENTITY_1_SCORE")
    private Integer identity1Score;

    /**
     * 随访方式
     */
    @TableField("IDENTITY_2_SCORE")
    private Integer identity2Score;

    /**
     * 本次随访日期
     */
    @TableField("IDENTITY_3_SCORE")
    private Integer identity3Score;

    /**
     * 摄盐量分级
     */
    @TableField("IDENTITY_4_SCORE")
    private Integer identity4Score;

    /**
     * 目标摄盐量分级
     */
    @TableField("IDENTITY_5_SCORE")
    private Integer identity5Score;

    /**
     * 心理调整评价结果
     */
    @TableField("IDENTITY_6_SCORE")
    private Integer identity6Score;

    /**
     * 随访遵医行为评价结果
     */
    @TableField("IDENTITY_7_SCORE")
    private Integer identity7Score;

    /**
     * 下次随访日期
     */
    @TableField("IDENTITY_8_SCORE")
    private Integer identity8Score;

    /**
     * 随访医师姓名
     */
    @TableField("IDENTITY_9_SCORE")
    private Integer identity9Score;

    /**
     * 主要体质
     */
    @TableField("BODY_TYPE")
    private String bodyType;

    /**
     * 情志调摄指导
     */
    @TableField("GUIDE_FEELING")
    private String guideFeeling;

    /**
     * 饮食调养指导
     */
    @TableField("GUIDE_FOOD")
    private String guideFood;

    /**
     * 起居调摄指导
     */
    @TableField("GUIDE_LIFE")
    private String guideLife;

    /**
     * 运动保健指导
     */
    @TableField("GUIDE_SPORTS")
    private String guideSports;

    /**
     * 穴位保健指导
     */
    @TableField("GUIDE_POINTS")
    private String guidePoints;

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
