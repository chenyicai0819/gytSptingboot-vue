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
 * 2型糖尿病患者随访信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_health_diabetes")
public class HealthDiabetes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * baseinfo中的patient_id
     */
    @TableField("PATIENT_ID")
    private String patientId;

    /**
     * 责任医师姓名
     */
    @TableField("RESP_DOCTOR_NAME")
    private String respDoctorName;

    /**
     * 随访方式
     */
    @TableField("VISIT_WAY")
    private String visitWay;

    /**
     * 本次随访日期
     */
    @TableField("THIS_FOLLOWUP_VISIT_DATE")
    private Date thisFollowupVisitDate;

    /**
     * 随访评价结果
     */
    @TableField("VISIT_EVAL_RESULT")
    private String visitEvalResult;

    /**
     * 下次随访日期
     */
    @TableField("NEXT_FOLLOWUP_DATE")
    private Date nextFollowupDate;

    /**
     * 随访医师姓名
     */
    @TableField("FOLLOWUP_VISIT_DOCTOR_NAME")
    private String followupVisitDoctorName;

    /**
     * 症状名称
     */
    @TableField("SYMPTOM_NAME")
    private String symptomName;

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
