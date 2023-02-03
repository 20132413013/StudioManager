package com.studio.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.studio.common.annotation.Excel;
import com.studio.common.core.domain.BaseEntity;

/**
 * 学生管理对象 student
 * 
 * @author ruoyi
 * @date 2022-10-11
 */
public class Student extends BaseEntity
{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 用户姓名 */
    @Excel(name = "学生姓名")
    private String username;

    /** 学生来源（0：高考，1：春招） */
    @Excel(name = "学生来源", readConverterExp = "0=：高考，1：春招")
    private Long source;

    /** 生源（0：农村，1：城市） */
    @Excel(name = "生源", readConverterExp = "0=：农村，1：城市")
    private Long placeOfOrigin;

    /** 数学成绩 */
    @Excel(name = "数学成绩")
    private Long mathematics;

    /** 英语成绩 */
    @Excel(name = "英语成绩")
    private Long english;

    /** 综合成绩 */
    @Excel(name = "综合成绩")
    private Integer comprehensive;

    /** 班级 */
    @Excel(name = "班级")
    private String userClass;

    /** 加入时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "加入时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date joining;

    /** 是否常在 */
    @Excel(name = "是否常在")
    private Long permanent;

    /** 就业城市 */
    @Excel(name = "就业城市")
    private String employmentCity;

    /** 就业单位 */
    @Excel(name = "就业单位")
    private String employmentUnit;

    /** 就业待遇 */
    @Excel(name = "就业待遇")
    private String employmentTreatment;

    /** 保留字段一 */
    @Excel(name = "保留字段一")
    private String studentRetain0;

    /** 保留字段二 */
    @Excel(name = "保留字段二")
    private String studentRetain1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studentRetain2;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setSource(Long source) 
    {
        this.source = source;
    }

    public Long getSource() 
    {
        return source;
    }
    public void setPlaceOfOrigin(Long placeOfOrigin) 
    {
        this.placeOfOrigin = placeOfOrigin;
    }

    public Long getPlaceOfOrigin() 
    {
        return placeOfOrigin;
    }
    public void setMathematics(Long mathematics) 
    {
        this.mathematics = mathematics;
    }

    public Long getMathematics() 
    {
        return mathematics;
    }
    public void setEnglish(Long english) 
    {
        this.english = english;
    }

    public Long getEnglish() 
    {
        return english;
    }
    public void setComprehensive(Integer comprehensive) 
    {
        this.comprehensive = comprehensive;
    }

    public Integer getComprehensive() 
    {
        return comprehensive;
    }
    public void setUserClass(String userClass) 
    {
        this.userClass = userClass;
    }

    public String getUserClass() 
    {
        return userClass;
    }
    public void setJoining(Date joining) 
    {
        this.joining = joining;
    }

    public Date getJoining() 
    {
        return joining;
    }
    public void setPermanent(Long permanent) 
    {
        this.permanent = permanent;
    }

    public Long getPermanent() 
    {
        return permanent;
    }
    public void setEmploymentCity(String employmentCity) 
    {
        this.employmentCity = employmentCity;
    }

    public String getEmploymentCity() 
    {
        return employmentCity;
    }
    public void setEmploymentUnit(String employmentUnit) 
    {
        this.employmentUnit = employmentUnit;
    }

    public String getEmploymentUnit() 
    {
        return employmentUnit;
    }
    public void setEmploymentTreatment(String employmentTreatment) 
    {
        this.employmentTreatment = employmentTreatment;
    }

    public String getEmploymentTreatment() 
    {
        return employmentTreatment;
    }
    public void setStudentRetain0(String studentRetain0) 
    {
        this.studentRetain0 = studentRetain0;
    }

    public String getStudentRetain0() 
    {
        return studentRetain0;
    }
    public void setStudentRetain1(String studentRetain1) 
    {
        this.studentRetain1 = studentRetain1;
    }

    public String getStudentRetain1() 
    {
        return studentRetain1;
    }
    public void setStudentRetain2(String studentRetain2) 
    {
        this.studentRetain2 = studentRetain2;
    }

    public String getStudentRetain2() 
    {
        return studentRetain2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("source", getSource())
            .append("placeOfOrigin", getPlaceOfOrigin())
            .append("mathematics", getMathematics())
            .append("english", getEnglish())
            .append("comprehensive", getComprehensive())
            .append("userClass", getUserClass())
            .append("joining", getJoining())
            .append("permanent", getPermanent())
            .append("employmentCity", getEmploymentCity())
            .append("employmentUnit", getEmploymentUnit())
            .append("employmentTreatment", getEmploymentTreatment())
            .append("studentRetain0", getStudentRetain0())
            .append("studentRetain1", getStudentRetain1())
            .append("studentRetain2", getStudentRetain2())
            .toString();
    }
}
