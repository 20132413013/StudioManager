package com.studio.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.studio.common.annotation.Excel;
import com.studio.common.core.domain.BaseEntity;

/**
 * 项目对象 project
 *
 * @author 理想三旬
 * @date 2022-10-08
 */
public class Project extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 项目id
     */
    @Excel(name = "项目id")
    private Long id;

    /**
     * 项目名称
     */
    @Excel(name = "项目名称")
    private String name;

    /**
     * 项目类型    0.个人 1.团队
     */
    @Excel(name = "项目类型    0.个人 1.团队 ")
    private String type;

    /**
     * 项目开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "项目开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /**
     * 项目结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "项目结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 项目描述
     */
    @Excel(name = "项目描述")
    private String content;

    /**
     * 项目成果图
     */
    @Excel(name = "项目成果图")
    private String images;

    /**
     * 项目文件/源码
     */
    @Excel(name = "项目文件/源码")
    private String files;

    /**
     * 项目地址
     */
    @Excel(name = "项目地址")
    private String url;

    /**
     * 经费
     */
    @Excel(name = "经费")
    private Long money;

    /**
     * 删除标记  0.已删除 1.未删除
     */
    private String delFlag;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
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

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getMoney() {
        return money;
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
                .append("name", getName())
                .append("type", getType())
                .append("startTime", getStartTime())
                .append("endTime", getEndTime())
                .append("content", getContent())
                .append("images", getImages())
                .append("files", getFiles())
                .append("url", getUrl())
                .append("money", getMoney())
                .append("delFlag", getDelFlag())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
