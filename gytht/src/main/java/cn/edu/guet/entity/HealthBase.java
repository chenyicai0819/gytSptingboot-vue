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
 * 健康档案基本信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_health_base")
public class HealthBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    @TableField("PATIENT_ID")
    private String patientId;

    /**
     * 真实姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 证件类型代码
     */
    @TableField("ID_TYPE")
    private String idType;

    /**
     * 身份证件号码
     */
    @TableField("ID_NO")
    private String idNo;

    /**
     * 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别)
     */
    @TableField("SEX")
    private String sex;

    /**
     * 出生日期
     */
    @TableField("BIRTH_DATE")
    private Date birthDate;

    /**
     * 文化程度
     */
    @TableField("EDUCATION")
    private String education;

    /**
     * 户口性质
     */
    @TableField("ACCO_PROPERTY")
    private String accoProperty;

    /**
     * 婚姻状况
     */
    @TableField("MARRIAGE")
    private String marriage;

    /**
     * 移动电话
     */
    @TableField("MOBILE_PHONE")
    private String mobilePhone;

    /**
     * 民族
     */
    @TableField("NATIONALITY")
    private String nationality;

    /**
     * 出生详细地址
     */
    @TableField("BIRTH_PLACE")
    private String birthPlace;

    /**
     * 既往患病种类
     */
    @TableField("PAST_SICKNESS_TYPE")
    private String pastSicknessType;

    /**
     * 家族性疾病名称
     */
    @TableField("FAMILY_DISEASE")
    private String familyDisease;

    /**
     * 患者与本人关系
     */
    @TableField("PATIENT_RELATION")
    private String patientRelation;

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
