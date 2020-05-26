package com.business.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "patients")
public class PatientInfo implements Serializable {
    /**
     * 病人id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 病人性别
     */
    private String sex;

    /**
     * 病人生日
     */
    private Date birthday;

    /**
     * 病人身高
     */
    private String height;

    /**
     * 病人体重
     */
    private String weight;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取病人id
     *
     * @return id - 病人id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置病人id
     *
     * @param id 病人id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取病人姓名
     *
     * @return name - 病人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人姓名
     *
     * @param name 病人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取病人性别
     *
     * @return sex - 病人性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置病人性别
     *
     * @param sex 病人性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取病人生日
     *
     * @return birthday - 病人生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置病人生日
     *
     * @param birthday 病人生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取病人身高
     *
     * @return height - 病人身高
     */
    public String getHeight() {
        return height;
    }

    /**
     * 设置病人身高
     *
     * @param height 病人身高
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 获取病人体重
     *
     * @return weight - 病人体重
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置病人体重
     *
     * @param weight 病人体重
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }
}