package com.studio.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.studio.common.annotation.Excel;
import com.studio.common.core.domain.BaseEntity;

/**
 * 成果对象 achievement
 *
 * @author 理想三旬
 * @date 2022-10-07
 */
public class Achievement extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 成果id
     */
    @Excel(name = "成果id")
    private Long id;

    /**
     * 类别
     */
    @Excel(name = "类别")
    private String type;

    /**
     * 名称
     */
    @Excel(name = "名称")
    private String name;

    /**
     * 取得时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "取得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /**
     * 描述
     */
    @Excel(name = "描述")
    private String content;

    /**
     * 贡献者
     */
    @Excel(name = "贡献者")
    private String author;

    /**
     * 图片
     */
    @Excel(name = "图片")
    private String images;

    /**
     * 文件
     */
    @Excel(name = "文件")
    private String files;

    /**
     * 是否删除
     */
    private String delFlag;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImages() {
        return images;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getFiles() {
        return files;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("type", getType())
                .append("name", getName())
                .append("time", getTime())
                .append("content", getContent())
                .append("author", getAuthor())
                .append("images", getImages())
                .append("files", getFiles())
                .append("delFlag", getDelFlag())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
