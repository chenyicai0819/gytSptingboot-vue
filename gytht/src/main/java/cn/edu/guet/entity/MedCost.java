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
 * 就诊费用记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_med_cost")
public class MedCost implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 门诊记录表编号
     */
    @TableField("OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 就诊机构名称
     */
    @TableField("VISIT_ORG_NAME")
    private String visitOrgName;

    /**
     * 就诊科室名称
     */
    @TableField("VISIT_DEPT_NAME")
    private String visitDeptName;

    /**
     * 就诊日期时间
     */
    @TableField("VISIT_DTIME")
    private Date visitDtime;

    @TableField("SPECIFICATIONS")
    private String specifications;

    @TableField("PRICE")
    private Double price;

    @TableField("NUM")
    private String num;

    /**
     * 门诊个人承担费用金额（元）
     */
    @TableField("OUTPAT_Self_Payment")
    private Double outpatSelfPayment;

    /**
     * 住院个人承担费用金额（元）
     */
    @TableField("INPAT_Self_Payment")
    private Double inpatSelfPayment;

    @TableField("CREATER")
    private String creater;

    @TableField("itemCreateAt")
    private Date itemcreateat;

    @TableField("UPDATER")
    private String updater;

    @TableField("itemUpdateAt")
    private Date itemupdateat;


}
