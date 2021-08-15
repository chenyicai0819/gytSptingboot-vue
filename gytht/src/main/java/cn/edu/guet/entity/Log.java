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
 * 日志记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * uuid
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 应用id
     */
    @TableField("APP_CODE")
    private String appCode;

    /**
     * 错误标题
     */
    @TableField("LOG_TITLE")
    private String logTitle;

    /**
     * 日志等级
     */
    @TableField("LOG_LEVEL")
    private String logLevel;

    /**
     * 创建人
     */
    @TableField("CREATER")
    private String creater;

    @TableField("itemCreateAt")
    private Date itemcreateat;

    @TableField("UPDATER")
    private String updater;

    /**
     * 修改时间
     */
    @TableField("itemUpdateAt")
    private Date itemupdateat;


}
