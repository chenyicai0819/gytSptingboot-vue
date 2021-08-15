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
 * 开展项目、功效特色记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_project")
public class Project implements Serializable {

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
     * 开展项目、功效特色名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 项目、功效特色简介
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 数据区分
     */
    @TableField("DATA_TYPE")
    private String dataType;

    /**
     * 功效特色价格
     */
    @TableField("PRICE")
    private Integer price;

    /**
     * 数据状态
     */
    @TableField("DATA_STATUS")
    private String dataStatus;

    @TableField("USER_CODE")
    private String userCode;

    /**
     * 浏览次数
     */
    @TableField("VISIT_NUM")
    private Integer visitNum;

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
     * 评分
     */
    @TableField("PROJECT_SORCE")
    private Double projectSorce;


}
