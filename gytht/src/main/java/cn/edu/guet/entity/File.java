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
 * 文件上传记录表
 * </p>
 *
 * @author George
 * @since 2021-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_natmeha_file")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "itemID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 唯一标识
     */
    @TableField("itemCode")
    private String itemcode;

    /**
     * 数据源itemcode
     */
    @TableField("DATA_CODE")
    private String dataCode;

    /**
     * 上传人
     */
    @TableField("UPLOADER")
    private String uploader;

    /**
     * 上传人的id
     */
    @TableField("UPLOADER_CODE")
    private String uploaderCode;

    /**
     * 附件名称
     */
    @TableField("FILE_NAME")
    private String fileName;

    /**
     * 附件文件类型 文档或图片
     */
    @TableField("FILE_TYPE")
    private String fileType;

    @TableField("FILE_SIZE")
    private Double fileSize;

    /**
     * 附件路径
     */
    @TableField("FILE_PATH")
    private String filePath;

    @TableField("itemCreateAt")
    private Date itemcreateat;


}
