package cn.edu.guet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 问卷题库表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_knowledge_tcm_question")
public class KnowledgeTcmQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "q_id", type = IdType.ID_WORKER)
    private String qId;

    private String typeId;

    private String qNumber;

    private String qText;

    private String optionsText;

    private String optionsValue;

    private String delFlag;

    private String feaId;

    private String qSex;


}
