package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 健康档案体检信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_health_children")
public class HealthChildren implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * baseinfo中patient_id
     */
    @TableField("PATIENT_ID")
    private String patientId;

    /**
     * 新生儿姓名
     */
    @TableField("NEWBORN_NAME")
    private String newbornName;

    /**
     * 新生儿性别
     */
    @TableField("NEWBORN_SEX")
    private String newbornSex;

    /**
     * 新生儿出生日期
     */
    @TableField("NEWBORN_BIRTH_DATE")
    private Date newbornBirthDate;

    /**
     * 总检结论
     */
    @TableField("EXAM_SUMMARY")
    private String examSummary;

    /**
     * 新生儿身份证件类别
     */
    @TableField("NEWBORN_ID_TYPE")
    private String newbornIdType;

    /**
     * 新生儿身份证件号码
     */
    @TableField("NEWBORN_ID_NO")
    private String newbornIdNo;

    /**
     * 父亲姓名
     */
    @TableField("FATHER_NAME")
    private String fatherName;

    /**
     * 母亲姓名
     */
    @TableField("MOTHER_NAME")
    private String motherName;

    /**
     * 出生体重(g)
     */
    @TableField("BIRTH_WEIGHT")
    private BigDecimal birthWeight;

    /**
     * 出生身长
     */
    @TableField("BIRTH_LENGTH")
    private BigDecimal birthLength;

    /**
     * 体重
     */
    @TableField("WEIGHT")
    private BigDecimal weight;

    /**
     * 身长
     */
    @TableField("LENGTH")
    private BigDecimal length;

    /**
     * 喂养方式类别
     */
    @TableField("FEED_WAY")
    private String feedWay;

    /**
     * 药物使用途径
     */
    @TableField("DRUG_ROUTE")
    private String drugRoute;

    /**
     * 每天吃奶次数
     */
    @TableField("DAILY_FEEDING_TIMES")
    private Integer dailyFeedingTimes;

    /**
     * 每天吃奶量（mL)
     */
    @TableField("DAILY_FEEDING_AMOUNT")
    private Integer dailyFeedingAmount;

    /**
     * 既往患病种类
     */
    @TableField("STOOL_TIMES")
    private Integer stoolTimes;

    /**
     * 随访医生名称
     */
    @TableField("VISIT_DOCTOR_NAME")
    private String visitDoctorName;

    /**
     * 本次访问日期
     */
    @TableField("THIS_VISIT_DATE")
    private Date thisVisitDate;

    /**
     * 下次访问日期
     */
    @TableField("NEXT_VISIT_DATE")
    private Date nextVisitDate;

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
