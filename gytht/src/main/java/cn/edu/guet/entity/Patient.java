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
 * 就诊人信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_patient")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 就诊人名称
     */
    @TableField("PATIENT_NAME")
    private String patientName;

    /**
     * 性别
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 身份证件类型
     */
    @TableField("IDCARD_TYPE")
    private String idcardType;

    /**
     * 证件号码
     */
    @TableField("IDCARD_NO")
    private String idcardNo;

    /**
     * 电话号码
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 关系
     */
    @TableField("RELATIONSHIP")
    private String relationship;

    /**
     * 是否为默认就诊人
     */
    @TableField("DEFAULT_PATIENT")
    private String defaultPatient;

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
     * 婚姻状况
     */
    @TableField("MARITAL_STATUS")
    private String maritalStatus;

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

    @TableField("BIRTHDATE")
    private Date birthdate;


}
