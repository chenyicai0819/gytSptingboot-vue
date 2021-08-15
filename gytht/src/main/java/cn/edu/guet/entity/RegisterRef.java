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
 * 用户挂号关系表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_register_ref")
public class RegisterRef implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 预约号码
     */
    @TableField("REGISTER_NUM")
    private Integer registerNum;

    /**
     * 号源code
     */
    @TableField("SOURCE_CODE")
    private String sourceCode;

    /**
     * 用户code
     */
    @TableField("USER_CODE")
    private String userCode;

    /**
     * 就诊人code
     */
    @TableField("PATIENT_CODE")
    private String patientCode;

    /**
     * 就诊状态
     */
    @TableField("REGISTER_STATUS")
    private String registerStatus;

    /**
     * 匿名评价
     */
    @TableField("ANONYMOUS")
    private Boolean anonymous;

    /**
     * 总体评分
     */
    @TableField("OVERALL_SOURCE")
    private Double overallSource;

    /**
     * 诊疗效果评分
     */
    @TableField("EFFECT_SOURCE")
    private Double effectSource;

    /**
     * 诊疗环境评分
     */
    @TableField("ENVIRONMENT_SOURCE")
    private Double environmentSource;

    /**
     * 服务态度评分
     */
    @TableField("SERVICE_SOURCE")
    private Double serviceSource;

    /**
     * 所患疾病
     */
    @TableField("ILLNESS")
    private String illness;

    /**
     * 就诊评分
     */
    @TableField("SOURCE")
    private Double source;

    @TableField("CREATER")
    private String creater;

    @TableField("itemCreateAt")
    private Date itemcreateat;

    @TableField("UPDATER")
    private String updater;

    @TableField("itemUpdateAt")
    private Date itemupdateat;


}
