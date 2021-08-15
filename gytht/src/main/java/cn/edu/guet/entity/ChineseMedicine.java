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
 * 中药常识信息记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_chinese_medicine")
public class ChineseMedicine implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 中药材名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 别名
     */
    @TableField("ALIAS")
    private String alias;

    /**
     * 功效分类
     */
    @TableField("CLASSIFICATION")
    private String classification;

    /**
     * 采制
     */
    @TableField("HARVESTING")
    private String harvesting;

    /**
     * 性味
     */
    @TableField("TASTE")
    private String taste;

    /**
     * 归经
     */
    @TableField("MER_TROPISM")
    private String merTropism;

    /**
     * 主治
     */
    @TableField("GOVERNANCE")
    private String governance;

    /**
     * 用法用量
     */
    @TableField("USAGE")
    private String usage;

    /**
     * 数据状态
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
