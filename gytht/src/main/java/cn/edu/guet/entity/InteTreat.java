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
 * 智能就诊信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_inte_treat")
public class InteTreat implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 性别
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 证件号码
     */
    @TableField("BIRTH")
    private Date birth;

    /**
     * 不适部位
     */
    @TableField("DISCOMFORT_SITE")
    private String discomfortSite;

    /**
     * 不适症状
     */
    @TableField("SYMPTOM")
    private String symptom;

    /**
     * 辅助描述症状
     */
    @TableField("DESCRIBE")
    private String describe;

    /**
     * 处于节点位置
     */
    @TableField("POSITION")
    private String position;

    /**
     * 节点是否完成
     */
    @TableField("STATUS")
    private String status;

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
