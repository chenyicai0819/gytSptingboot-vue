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
 * 产后42天健康健康检查记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_health_postpartum")
public class HealthPostpartum implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * baseinfo中patient_id
     */
    @TableField("PATIENT_ID")
    private String patientId;

    /**
     * 健康状况详细描述
     */
    @TableField("HEALTH_CONDITION_DESCR")
    private String healthConditionDescr;

    /**
     * 心理状况详细描述
     */
    @TableField("PSYCHOLOGY_CONDITION_DESCR")
    private String psychologyConditionDescr;

    /**
     * 伤口愈合状况
     */
    @TableField("WOUND_HEALING")
    private String woundHealing;

    /**
     * 产妇健康状况评估描述
     */
    @TableField("PUERPERA_HEALTH_EVAL_DESCR")
    private String puerperaHealthEvalDescr;

    /**
     * 访视医师姓名
     */
    @TableField("VISIT_DOCTOR_NAME")
    private String visitDoctorName;

    /**
     * 孕产妇健康指导类别
     */
    @TableField("PREG_HEALTH_GUIDE")
    private String pregHealthGuide;

    /**
     * 备注
     */
    @TableField("NOTES")
    private String notes;

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
