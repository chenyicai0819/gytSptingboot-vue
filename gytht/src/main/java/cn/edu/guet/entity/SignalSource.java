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
 * 号源维护记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_signal_source")
public class SignalSource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 医生code
     */
    @TableField("DOCTOR_CODE")
    private String doctorCode;

    /**
     * 挂号类别
     */
    @TableField("REGISTER_TYPE")
    private String registerType;

    /**
     * 就诊时间
     */
    @TableField("REGISTER_DATE")
    private Date registerDate;

    /**
     * 预约量
     */
    @TableField("REGISTER_COUNT")
    private Integer registerCount;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    @TableField("USER_CODE")
    private String userCode;

    @TableField("CREATER")
    private String creater;

    @TableField("itemCreateAt")
    private Date itemcreateat;

    @TableField("UPDATER")
    private String updater;

    @TableField("itemUpdateAt")
    private Date itemupdateat;


}
