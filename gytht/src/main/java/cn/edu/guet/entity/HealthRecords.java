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
 * 健康档案信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_health_records")
public class HealthRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 真实姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 性别
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 出生日期
     */
    @TableField("BIRTH")
    private Date birth;

    /**
     * 电话号码
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 地址省份code
     */
    @TableField("ADRESS_PRO")
    private String adressPro;

    /**
     * 市级code
     */
    @TableField("ADRESS_CITY")
    private String adressCity;

    /**
     * 地区省份
     */
    @TableField("ADRESS_COUNTRY")
    private String adressCountry;

    /**
     * 地址(手动输入)
     */
    @TableField("ADRESS")
    private String adress;

    /**
     * 民族
     */
    @TableField("NATION")
    private String nation;

    /**
     * 血型
     */
    @TableField("BLOOD_TYPE")
    private String bloodType;

    /**
     * 文化程度
     */
    @TableField("EDUCATION")
    private String education;

    /**
     * 职业
     */
    @TableField("OCCUPATION")
    private String occupation;

    /**
     * 身高
     */
    @TableField("HEIGHT")
    private Double height;

    /**
     * 体重
     */
    @TableField("WEIGHT")
    private Double weight;

    /**
     * BMI
     */
    @TableField("BMI")
    private String bmi;

    /**
     * 疾病史
     */
    @TableField("DISEASE_HISTORY")
    private String diseaseHistory;

    /**
     * 过敏
     */
    @TableField("ALLERGY")
    private String allergy;

    /**
     * 用户code
     */
    @TableField("USER_CODE")
    private String userCode;

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
