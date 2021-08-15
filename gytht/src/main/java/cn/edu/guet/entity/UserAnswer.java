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
 * 
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user_answer")
public class UserAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    @TableField("itemCode")
    private String itemcode;

    /**
     * 患者id
     */
    private String userId;

    /**
     * 题目id
     */
    private String qId;

    /**
     * 患者答题选项
     */
    private String qOption;

    /**
     * 答题时间
     */
    private Date tcmRemark;

    /**
     * 体质类型id
     */
    private String typeId;

    /**
     * 患者本次答题题目序号
     */
    private String seq;

    /**
     * 是否生效（1：是  0：否）
     */
    private String useflag;

    /**
     * 预留字段，暂未使用
     */
    private String flag1;

    /**
     * 预留字段，暂未使用
     */
    private String flag2;

    /**
     * 预留字段，暂未使用
     */
    private String flag3;

    @TableField("uptFlag")
    private String uptflag;

    /**
     * 体质测评结果itemcode
     */
    private String resultItemcode;


}
