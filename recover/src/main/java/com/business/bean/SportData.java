package com.business.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sport_data")
public class SportData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_id")
    private Long patientId;

    /**
     * 腰部右侧方位角
     */
    @Column(name = "waist_right_azimuth")
    private String waistRightAzimuth;

    /**
     * 腰部右侧俯仰角
     */
    @Column(name = "waist_right_pitch")
    private String waistRightPitch;

    /**
     * 腰部右侧横滚角
     */
    @Column(name = "waist_right_roll")
    private String waistRightRoll;

    /**
     * 腰部左侧方位角
     */
    @Column(name = "waist_left_azimuth")
    private String waistLeftAzimuth;

    /**
     * 腰部左侧俯仰角
     */
    @Column(name = "waist_left_pitch")
    private String waistLeftPitch;

    /**
     * 腰部左侧横滚角
     */
    @Column(name = "waist_left_roll")
    private String waistLeftRoll;

    /**
     * 右大腿方位角
     */
    @Column(name = "thigh_right_azimuth")
    private String thighRightAzimuth;

    /**
     * 右大腿俯仰角
     */
    @Column(name = "thigh_right_pitch")
    private String thighRightPitch;

    /**
     * 右大腿横滚角
     */
    @Column(name = "thigh_right_roll")
    private String thighRightRoll;

    /**
     * 左大腿方位角
     */
    @Column(name = "thigh_left_azimuth")
    private String thighLeftAzimuth;

    /**
     * 左大腿俯仰角
     */
    @Column(name = "thigh_left_pitch")
    private String thighLeftPitch;

    /**
     * 左大腿横滚角
     */
    @Column(name = "thigh_left_roll")
    private String thighLeftRoll;

    /**
     * 右小腿方位角
     */
    @Column(name = "calf_right_azimuth")
    private String calfRightAzimuth;

    /**
     * 右小腿俯仰角
     */
    @Column(name = "calf_right_pitch")
    private String calfRightPitch;

    /**
     * 右小腿横滚角
     */
    @Column(name = "calf_right_roll")
    private String calfRightRoll;

    /**
     * 左小腿方位角
     */
    @Column(name = "calf_left_azimuth")
    private String calfLeftAzimuth;

    /**
     * 左小腿俯仰角
     */
    @Column(name = "calf_left_pitch")
    private String calfLeftPitch;

    /**
     * 左小腿横滚角
     */
    @Column(name = "calf_left_roll")
    private String calfLeftRoll;

    /**
     * 右上臂方位角
     */
    @Column(name = "upper_arm_right_azimuth")
    private String upperArmRightAzimuth;

    /**
     * 右上臂俯仰角
     */
    @Column(name = "upper_arm_right_pitch")
    private String upperArmRightPitch;

    /**
     * 右上臂横滚角
     */
    @Column(name = "upper_arm_right_roll")
    private String upperArmRightRoll;

    /**
     * 左上臂方位角
     */
    @Column(name = "upper_arm_left_azimuth")
    private String upperArmLeftAzimuth;

    /**
     * 左上臂俯仰角
     */
    @Column(name = "upper_arm_left_pitch")
    private String upperArmLeftPitch;

    /**
     * 左上臂横滚角
     */
    @Column(name = "upper_arm_left_roll")
    private String upperArmLeftRoll;

    /**
     * 右小臂方位角
     */
    @Column(name = "forearm_right_azimuth")
    private String forearmRightAzimuth;

    /**
     * 右小臂俯仰角
     */
    @Column(name = "forearm_right_pitch")
    private String forearmRightPitch;

    /**
     * 右小臂横滚角
     */
    @Column(name = "forearm_right_roll")
    private String forearmRightRoll;

    /**
     * 左小臂方位角
     */
    @Column(name = "forearm_left_azimuth")
    private String forearmLeftAzimuth;

    /**
     * 左小臂俯仰角
     */
    @Column(name = "forearm_left_pitch")
    private String forearmLeftPitch;

    /**
     * 左小臂横滚角
     */
    @Column(name = "forearm_left_roll")
    private String forearmLeftRoll;

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
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return patient_id
     */
    public Long getPatientId() {
        return patientId;
    }

    /**
     * @param patientId
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * 获取腰部右侧方位角
     *
     * @return waist_right_azimuth - 腰部右侧方位角
     */
    public String getWaistRightAzimuth() {
        return waistRightAzimuth;
    }

    /**
     * 设置腰部右侧方位角
     *
     * @param waistRightAzimuth 腰部右侧方位角
     */
    public void setWaistRightAzimuth(String waistRightAzimuth) {
        this.waistRightAzimuth = waistRightAzimuth;
    }

    /**
     * 获取腰部右侧俯仰角
     *
     * @return waist_right_pitch - 腰部右侧俯仰角
     */
    public String getWaistRightPitch() {
        return waistRightPitch;
    }

    /**
     * 设置腰部右侧俯仰角
     *
     * @param waistRightPitch 腰部右侧俯仰角
     */
    public void setWaistRightPitch(String waistRightPitch) {
        this.waistRightPitch = waistRightPitch;
    }

    /**
     * 获取腰部右侧横滚角
     *
     * @return waist_right_roll - 腰部右侧横滚角
     */
    public String getWaistRightRoll() {
        return waistRightRoll;
    }

    /**
     * 设置腰部右侧横滚角
     *
     * @param waistRightRoll 腰部右侧横滚角
     */
    public void setWaistRightRoll(String waistRightRoll) {
        this.waistRightRoll = waistRightRoll;
    }

    /**
     * 获取腰部左侧方位角
     *
     * @return waist_left_azimuth - 腰部左侧方位角
     */
    public String getWaistLeftAzimuth() {
        return waistLeftAzimuth;
    }

    /**
     * 设置腰部左侧方位角
     *
     * @param waistLeftAzimuth 腰部左侧方位角
     */
    public void setWaistLeftAzimuth(String waistLeftAzimuth) {
        this.waistLeftAzimuth = waistLeftAzimuth;
    }

    /**
     * 获取腰部左侧俯仰角
     *
     * @return waist_left_pitch - 腰部左侧俯仰角
     */
    public String getWaistLeftPitch() {
        return waistLeftPitch;
    }

    /**
     * 设置腰部左侧俯仰角
     *
     * @param waistLeftPitch 腰部左侧俯仰角
     */
    public void setWaistLeftPitch(String waistLeftPitch) {
        this.waistLeftPitch = waistLeftPitch;
    }

    /**
     * 获取腰部左侧横滚角
     *
     * @return waist_left_roll - 腰部左侧横滚角
     */
    public String getWaistLeftRoll() {
        return waistLeftRoll;
    }

    /**
     * 设置腰部左侧横滚角
     *
     * @param waistLeftRoll 腰部左侧横滚角
     */
    public void setWaistLeftRoll(String waistLeftRoll) {
        this.waistLeftRoll = waistLeftRoll;
    }

    /**
     * 获取右大腿方位角
     *
     * @return thigh_right_azimuth - 右大腿方位角
     */
    public String getThighRightAzimuth() {
        return thighRightAzimuth;
    }

    /**
     * 设置右大腿方位角
     *
     * @param thighRightAzimuth 右大腿方位角
     */
    public void setThighRightAzimuth(String thighRightAzimuth) {
        this.thighRightAzimuth = thighRightAzimuth;
    }

    /**
     * 获取右大腿俯仰角
     *
     * @return thigh_right_pitch - 右大腿俯仰角
     */
    public String getThighRightPitch() {
        return thighRightPitch;
    }

    /**
     * 设置右大腿俯仰角
     *
     * @param thighRightPitch 右大腿俯仰角
     */
    public void setThighRightPitch(String thighRightPitch) {
        this.thighRightPitch = thighRightPitch;
    }

    /**
     * 获取右大腿横滚角
     *
     * @return thigh_right_roll - 右大腿横滚角
     */
    public String getThighRightRoll() {
        return thighRightRoll;
    }

    /**
     * 设置右大腿横滚角
     *
     * @param thighRightRoll 右大腿横滚角
     */
    public void setThighRightRoll(String thighRightRoll) {
        this.thighRightRoll = thighRightRoll;
    }

    /**
     * 获取左大腿方位角
     *
     * @return thigh_left_azimuth - 左大腿方位角
     */
    public String getThighLeftAzimuth() {
        return thighLeftAzimuth;
    }

    /**
     * 设置左大腿方位角
     *
     * @param thighLeftAzimuth 左大腿方位角
     */
    public void setThighLeftAzimuth(String thighLeftAzimuth) {
        this.thighLeftAzimuth = thighLeftAzimuth;
    }

    /**
     * 获取左大腿俯仰角
     *
     * @return thigh_left_pitch - 左大腿俯仰角
     */
    public String getThighLeftPitch() {
        return thighLeftPitch;
    }

    /**
     * 设置左大腿俯仰角
     *
     * @param thighLeftPitch 左大腿俯仰角
     */
    public void setThighLeftPitch(String thighLeftPitch) {
        this.thighLeftPitch = thighLeftPitch;
    }

    /**
     * 获取左大腿横滚角
     *
     * @return thigh_left_roll - 左大腿横滚角
     */
    public String getThighLeftRoll() {
        return thighLeftRoll;
    }

    /**
     * 设置左大腿横滚角
     *
     * @param thighLeftRoll 左大腿横滚角
     */
    public void setThighLeftRoll(String thighLeftRoll) {
        this.thighLeftRoll = thighLeftRoll;
    }

    /**
     * 获取右小腿方位角
     *
     * @return calf_right_azimuth - 右小腿方位角
     */
    public String getCalfRightAzimuth() {
        return calfRightAzimuth;
    }

    /**
     * 设置右小腿方位角
     *
     * @param calfRightAzimuth 右小腿方位角
     */
    public void setCalfRightAzimuth(String calfRightAzimuth) {
        this.calfRightAzimuth = calfRightAzimuth;
    }

    /**
     * 获取右小腿俯仰角
     *
     * @return calf_right_pitch - 右小腿俯仰角
     */
    public String getCalfRightPitch() {
        return calfRightPitch;
    }

    /**
     * 设置右小腿俯仰角
     *
     * @param calfRightPitch 右小腿俯仰角
     */
    public void setCalfRightPitch(String calfRightPitch) {
        this.calfRightPitch = calfRightPitch;
    }

    /**
     * 获取右小腿横滚角
     *
     * @return calf_right_roll - 右小腿横滚角
     */
    public String getCalfRightRoll() {
        return calfRightRoll;
    }

    /**
     * 设置右小腿横滚角
     *
     * @param calfRightRoll 右小腿横滚角
     */
    public void setCalfRightRoll(String calfRightRoll) {
        this.calfRightRoll = calfRightRoll;
    }

    /**
     * 获取左小腿方位角
     *
     * @return calf_left_azimuth - 左小腿方位角
     */
    public String getCalfLeftAzimuth() {
        return calfLeftAzimuth;
    }

    /**
     * 设置左小腿方位角
     *
     * @param calfLeftAzimuth 左小腿方位角
     */
    public void setCalfLeftAzimuth(String calfLeftAzimuth) {
        this.calfLeftAzimuth = calfLeftAzimuth;
    }

    /**
     * 获取左小腿俯仰角
     *
     * @return calf_left_pitch - 左小腿俯仰角
     */
    public String getCalfLeftPitch() {
        return calfLeftPitch;
    }

    /**
     * 设置左小腿俯仰角
     *
     * @param calfLeftPitch 左小腿俯仰角
     */
    public void setCalfLeftPitch(String calfLeftPitch) {
        this.calfLeftPitch = calfLeftPitch;
    }

    /**
     * 获取左小腿横滚角
     *
     * @return calf_left_roll - 左小腿横滚角
     */
    public String getCalfLeftRoll() {
        return calfLeftRoll;
    }

    /**
     * 设置左小腿横滚角
     *
     * @param calfLeftRoll 左小腿横滚角
     */
    public void setCalfLeftRoll(String calfLeftRoll) {
        this.calfLeftRoll = calfLeftRoll;
    }

    /**
     * 获取右上臂方位角
     *
     * @return upper_arm_right_azimuth - 右上臂方位角
     */
    public String getUpperArmRightAzimuth() {
        return upperArmRightAzimuth;
    }

    /**
     * 设置右上臂方位角
     *
     * @param upperArmRightAzimuth 右上臂方位角
     */
    public void setUpperArmRightAzimuth(String upperArmRightAzimuth) {
        this.upperArmRightAzimuth = upperArmRightAzimuth;
    }

    /**
     * 获取右上臂俯仰角
     *
     * @return upper_arm_right_pitch - 右上臂俯仰角
     */
    public String getUpperArmRightPitch() {
        return upperArmRightPitch;
    }

    /**
     * 设置右上臂俯仰角
     *
     * @param upperArmRightPitch 右上臂俯仰角
     */
    public void setUpperArmRightPitch(String upperArmRightPitch) {
        this.upperArmRightPitch = upperArmRightPitch;
    }

    /**
     * 获取右上臂横滚角
     *
     * @return upper_arm_right_roll - 右上臂横滚角
     */
    public String getUpperArmRightRoll() {
        return upperArmRightRoll;
    }

    /**
     * 设置右上臂横滚角
     *
     * @param upperArmRightRoll 右上臂横滚角
     */
    public void setUpperArmRightRoll(String upperArmRightRoll) {
        this.upperArmRightRoll = upperArmRightRoll;
    }

    /**
     * 获取左上臂方位角
     *
     * @return upper_arm_left_azimuth - 左上臂方位角
     */
    public String getUpperArmLeftAzimuth() {
        return upperArmLeftAzimuth;
    }

    /**
     * 设置左上臂方位角
     *
     * @param upperArmLeftAzimuth 左上臂方位角
     */
    public void setUpperArmLeftAzimuth(String upperArmLeftAzimuth) {
        this.upperArmLeftAzimuth = upperArmLeftAzimuth;
    }

    /**
     * 获取左上臂俯仰角
     *
     * @return upper_arm_left_pitch - 左上臂俯仰角
     */
    public String getUpperArmLeftPitch() {
        return upperArmLeftPitch;
    }

    /**
     * 设置左上臂俯仰角
     *
     * @param upperArmLeftPitch 左上臂俯仰角
     */
    public void setUpperArmLeftPitch(String upperArmLeftPitch) {
        this.upperArmLeftPitch = upperArmLeftPitch;
    }

    /**
     * 获取左上臂横滚角
     *
     * @return upper_arm_left_roll - 左上臂横滚角
     */
    public String getUpperArmLeftRoll() {
        return upperArmLeftRoll;
    }

    /**
     * 设置左上臂横滚角
     *
     * @param upperArmLeftRoll 左上臂横滚角
     */
    public void setUpperArmLeftRoll(String upperArmLeftRoll) {
        this.upperArmLeftRoll = upperArmLeftRoll;
    }

    /**
     * 获取右小臂方位角
     *
     * @return forearm_right_azimuth - 右小臂方位角
     */
    public String getForearmRightAzimuth() {
        return forearmRightAzimuth;
    }

    /**
     * 设置右小臂方位角
     *
     * @param forearmRightAzimuth 右小臂方位角
     */
    public void setForearmRightAzimuth(String forearmRightAzimuth) {
        this.forearmRightAzimuth = forearmRightAzimuth;
    }

    /**
     * 获取右小臂俯仰角
     *
     * @return forearm_right_pitch - 右小臂俯仰角
     */
    public String getForearmRightPitch() {
        return forearmRightPitch;
    }

    /**
     * 设置右小臂俯仰角
     *
     * @param forearmRightPitch 右小臂俯仰角
     */
    public void setForearmRightPitch(String forearmRightPitch) {
        this.forearmRightPitch = forearmRightPitch;
    }

    /**
     * 获取右小臂横滚角
     *
     * @return forearm_right_roll - 右小臂横滚角
     */
    public String getForearmRightRoll() {
        return forearmRightRoll;
    }

    /**
     * 设置右小臂横滚角
     *
     * @param forearmRightRoll 右小臂横滚角
     */
    public void setForearmRightRoll(String forearmRightRoll) {
        this.forearmRightRoll = forearmRightRoll;
    }

    /**
     * 获取左小臂方位角
     *
     * @return forearm_left_azimuth - 左小臂方位角
     */
    public String getForearmLeftAzimuth() {
        return forearmLeftAzimuth;
    }

    /**
     * 设置左小臂方位角
     *
     * @param forearmLeftAzimuth 左小臂方位角
     */
    public void setForearmLeftAzimuth(String forearmLeftAzimuth) {
        this.forearmLeftAzimuth = forearmLeftAzimuth;
    }

    /**
     * 获取左小臂俯仰角
     *
     * @return forearm_left_pitch - 左小臂俯仰角
     */
    public String getForearmLeftPitch() {
        return forearmLeftPitch;
    }

    /**
     * 设置左小臂俯仰角
     *
     * @param forearmLeftPitch 左小臂俯仰角
     */
    public void setForearmLeftPitch(String forearmLeftPitch) {
        this.forearmLeftPitch = forearmLeftPitch;
    }

    /**
     * 获取左小臂横滚角
     *
     * @return forearm_left_roll - 左小臂横滚角
     */
    public String getForearmLeftRoll() {
        return forearmLeftRoll;
    }

    /**
     * 设置左小臂横滚角
     *
     * @param forearmLeftRoll 左小臂横滚角
     */
    public void setForearmLeftRoll(String forearmLeftRoll) {
        this.forearmLeftRoll = forearmLeftRoll;
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
        sb.append(", patientId=").append(patientId);
        sb.append(", waistRightAzimuth=").append(waistRightAzimuth);
        sb.append(", waistRightPitch=").append(waistRightPitch);
        sb.append(", waistRightRoll=").append(waistRightRoll);
        sb.append(", waistLeftAzimuth=").append(waistLeftAzimuth);
        sb.append(", waistLeftPitch=").append(waistLeftPitch);
        sb.append(", waistLeftRoll=").append(waistLeftRoll);
        sb.append(", thighRightAzimuth=").append(thighRightAzimuth);
        sb.append(", thighRightPitch=").append(thighRightPitch);
        sb.append(", thighRightRoll=").append(thighRightRoll);
        sb.append(", thighLeftAzimuth=").append(thighLeftAzimuth);
        sb.append(", thighLeftPitch=").append(thighLeftPitch);
        sb.append(", thighLeftRoll=").append(thighLeftRoll);
        sb.append(", calfRightAzimuth=").append(calfRightAzimuth);
        sb.append(", calfRightPitch=").append(calfRightPitch);
        sb.append(", calfRightRoll=").append(calfRightRoll);
        sb.append(", calfLeftAzimuth=").append(calfLeftAzimuth);
        sb.append(", calfLeftPitch=").append(calfLeftPitch);
        sb.append(", calfLeftRoll=").append(calfLeftRoll);
        sb.append(", upperArmRightAzimuth=").append(upperArmRightAzimuth);
        sb.append(", upperArmRightPitch=").append(upperArmRightPitch);
        sb.append(", upperArmRightRoll=").append(upperArmRightRoll);
        sb.append(", upperArmLeftAzimuth=").append(upperArmLeftAzimuth);
        sb.append(", upperArmLeftPitch=").append(upperArmLeftPitch);
        sb.append(", upperArmLeftRoll=").append(upperArmLeftRoll);
        sb.append(", forearmRightAzimuth=").append(forearmRightAzimuth);
        sb.append(", forearmRightPitch=").append(forearmRightPitch);
        sb.append(", forearmRightRoll=").append(forearmRightRoll);
        sb.append(", forearmLeftAzimuth=").append(forearmLeftAzimuth);
        sb.append(", forearmLeftPitch=").append(forearmLeftPitch);
        sb.append(", forearmLeftRoll=").append(forearmLeftRoll);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }
}