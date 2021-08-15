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
 * 电子病历信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_med_records")
public class MedRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    @TableField("CREATER")
    private String creater;

    @TableField("itemCreateAt")
    private Date itemcreateat;

    @TableField("UPDATER")
    private String updater;

    @TableField("itemUpdateAt")
    private Date itemupdateat;

    /**
     * 门诊记录表编号
     */
    @TableField("OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 身份证号
     */
    @TableField("IDCARD_NO")
    private String idcardNo;

    /**
     * 就诊机构名称
     */
    @TableField("VISIT_ORG_NAME")
    private String visitOrgName;

    /**
     * 就诊日期时间
     */
    @TableField("VISIT_DTIME")
    private Date visitDtime;

    /**
     * 健康问题评估
     */
    @TableField("HEALTH_PROBLEM_EVAL")
    private String healthProblemEval;

    /**
     * 就诊医师
     */
    @TableField("RESP_DOCTOR_NAME")
    private String respDoctorName;

    /**
     * 门诊诊断名称
     */
    @TableField("OUTPAT_DIAG_NAME")
    private String outpatDiagName;

    /**
     * 诊断日期
     */
    @TableField("DIAG_DATE")
    private Date diagDate;

    /**
     * 入院科室名称
     */
    @TableField("IN_DEPT_NAME")
    private String inDeptName;

    /**
     * 入院日期时间
     */
    @TableField("IN_DTIME")
    private Date inDtime;

    /**
     * 出院日期时间
     */
    @TableField("OUT_DTIME")
    private Date outDtime;

    /**
     * 住院原因
     */
    @TableField("IN_REASON_CODE")
    private String inReasonCode;

    /**
     * 床号
     */
    @TableField("IN_BED")
    private String inBed;

    /**
     * 出院科室名称
     */
    @TableField("OUT_DEPT_NAME")
    private String outDeptName;

    /**
     * 其他医学处置
     */
    @TableField("OTHER_MEDICAL_TREATMENT")
    private String otherMedicalTreatment;

    /**
     * 就诊科室名称
     */
    @TableField("VISIT_DEPT_NAME")
    private String visitDeptName;


}
