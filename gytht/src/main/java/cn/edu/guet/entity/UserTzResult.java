package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UserTzResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    @TableField("itemCode")
    private String itemcode;

    /**
     * 患者usercode
     */
    private String userCode;

    /**
     * 体质判定结果
     */
    private String tzDetermine;

    /**
     * 答题时间
     */
    private Date tcmRemark;

    /**
     * 体质判定结果:倾向是（基本是）
     */
    private String tzTendency;


}
