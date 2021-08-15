package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 体质类型	
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_knowledge_tcm_type")
public class KnowledgeTcmType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "type_id", type = IdType.ID_WORKER)
    private String typeId;

    /**
     * 体质名称
     */
    private String typeName;

    /**
     * 体质类型
     */
    private String typeNumber;

    /**
     * 体质特征
     */
    private String lbZttz;

    /**
     * 形体特征
     */
    private String lbXttz;

    /**
     * 常见表现
     */
    private String lbCjbx;

    /**
     * 心理特征
     */
    private String lbXltz;

    /**
     * 发病倾向
     */
    private String lbFbqx;

    /**
     * 对外界环境适应能力
     */
    private String lbDwjhjsynl;

    /**
     * 测评结果
     */
    private String tlZttz;

    /**
     * 针对人群
     */
    private String tlZdrq;

    /**
     * 情志调摄
     */
    private String tlQztj;

    /**
     * 饮食调养
     */
    private String tlTyfsYs;

    /**
     * 起居调摄
     */
    private String tlTyfsQj;

    /**
     * 运动保健
     */
    private String tlTyfsYd;

    /**
     * 穴位保健
     */
    private String tlTyfsXwbj;

    private String optionsText;

    private String optionsValue;

    private String delFlag;

    @TableField("uptFlag")
    private String uptflag;


}
