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
 * 医院服务团队记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_doctor")
public class Doctor implements Serializable {

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
     * 医生姓名
     */
    @TableField("DOCTOR_NAME")
    private String doctorName;

    /**
     * 医生职称
     */
    @TableField("DOCTOR_TITLE")
    private String doctorTitle;

    /**
     * 擅长治疗
     */
    @TableField("DOCTOR_TREATMENT")
    private String doctorTreatment;

    /**
     * 评分
     */
    @TableField("DOCTOR_SORCE")
    private Double doctorSorce;

    /**
     * 科室code（默认都为中医科）
     */
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 挂号类别
     */
    @TableField("NUM_TYPE")
    private String numType;

    /**
     * 用户code
     */
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

    /**
     * 机构（医院）itemcode
     */
    @TableField("ORG_CODE")
    private String orgCode;


}
