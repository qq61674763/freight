package com.xljt.freight.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * CarInfo
 * @author 
 */
public class CarInfo implements Serializable {
    private Long id;

    /**
     * 【车辆牌照号】必填，对应运单技术规范第 26 项
     */
    private String vehicleNumber;

    /**
     * 【车牌颜色代码】必填，对应运单技术规范第 27 项
     */
    private String vehiclePlateColorCode;

    /**
     * 【车辆类型代码】必填。参考机动车行驶证填写，代码集参见 wlhy.mot.gov.cn
     */
    private String vehicleType;

    /**
     * 【所有人】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写
     */
    private String owner;

    /**
     * 【使用性质】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写。
     */
    private String useCharacter;

    /**
     * 【车辆识别代号】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写
     */
    private String VIN;

    /**
     * 【发证机关】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写
     */
    private String issuingOrganizations;

    /**
     * 【注册日期】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写。YYYYMMDD
     */
    private Integer registerDate;

    /**
     * 【发证日期】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写。YYYYMMDD
     */
    private Integer issueDate;

    /**
     * 【车辆能源类型】必填，代码集参见wlhy.mot.gov.cn
     */
    private String vehicleEnergyType;

    /**
     * 【核定载质量】必填，参考机动车行驶证填写，默认单位：吨，保留两位小数，如整数的话，以.00 填充。小数点不计入总长
     */
    private BigDecimal vehicleTonnage;

    /**
     * 【吨位】必填，车辆总质量，默认单位：吨，保留两位小数，如整数的话，以.00 填充。小数点不计入总长
     */
    private BigDecimal grossMass;

    /**
     * 【道路运输证号】必填，总质量 4.5 吨及以下普通货运车辆的，可填“车籍地 6 位行政区域代码
+000000”
     */
    private String roadTransportCertificateNumber;

    /**
     * 【挂车牌照号】选填
     */
    private Integer trailerVehiclePlateNumber;

    /**
     * 【备注】
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehiclePlateColorCode() {
        return vehiclePlateColorCode;
    }

    public void setVehiclePlateColorCode(String vehiclePlateColorCode) {
        this.vehiclePlateColorCode = vehiclePlateColorCode;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUseCharacter() {
        return useCharacter;
    }

    public void setUseCharacter(String useCharacter) {
        this.useCharacter = useCharacter;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getIssuingOrganizations() {
        return issuingOrganizations;
    }

    public void setIssuingOrganizations(String issuingOrganizations) {
        this.issuingOrganizations = issuingOrganizations;
    }

    public Integer getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Integer registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Integer issueDate) {
        this.issueDate = issueDate;
    }

    public String getVehicleEnergyType() {
        return vehicleEnergyType;
    }

    public void setVehicleEnergyType(String vehicleEnergyType) {
        this.vehicleEnergyType = vehicleEnergyType;
    }

    public BigDecimal getVehicleTonnage() {
        return vehicleTonnage;
    }

    public void setVehicleTonnage(BigDecimal vehicleTonnage) {
        this.vehicleTonnage = vehicleTonnage;
    }

    public BigDecimal getGrossMass() {
        return grossMass;
    }

    public void setGrossMass(BigDecimal grossMass) {
        this.grossMass = grossMass;
    }

    public String getRoadTransportCertificateNumber() {
        return roadTransportCertificateNumber;
    }

    public void setRoadTransportCertificateNumber(String roadTransportCertificateNumber) {
        this.roadTransportCertificateNumber = roadTransportCertificateNumber;
    }

    public Integer getTrailerVehiclePlateNumber() {
        return trailerVehiclePlateNumber;
    }

    public void setTrailerVehiclePlateNumber(Integer trailerVehiclePlateNumber) {
        this.trailerVehiclePlateNumber = trailerVehiclePlateNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CarInfo other = (CarInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVehicleNumber() == null ? other.getVehicleNumber() == null : this.getVehicleNumber().equals(other.getVehicleNumber()))
            && (this.getVehiclePlateColorCode() == null ? other.getVehiclePlateColorCode() == null : this.getVehiclePlateColorCode().equals(other.getVehiclePlateColorCode()))
            && (this.getVehicleType() == null ? other.getVehicleType() == null : this.getVehicleType().equals(other.getVehicleType()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getUseCharacter() == null ? other.getUseCharacter() == null : this.getUseCharacter().equals(other.getUseCharacter()))
            && (this.getVIN() == null ? other.getVIN() == null : this.getVIN().equals(other.getVIN()))
            && (this.getIssuingOrganizations() == null ? other.getIssuingOrganizations() == null : this.getIssuingOrganizations().equals(other.getIssuingOrganizations()))
            && (this.getRegisterDate() == null ? other.getRegisterDate() == null : this.getRegisterDate().equals(other.getRegisterDate()))
            && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
            && (this.getVehicleEnergyType() == null ? other.getVehicleEnergyType() == null : this.getVehicleEnergyType().equals(other.getVehicleEnergyType()))
            && (this.getVehicleTonnage() == null ? other.getVehicleTonnage() == null : this.getVehicleTonnage().equals(other.getVehicleTonnage()))
            && (this.getGrossMass() == null ? other.getGrossMass() == null : this.getGrossMass().equals(other.getGrossMass()))
            && (this.getRoadTransportCertificateNumber() == null ? other.getRoadTransportCertificateNumber() == null : this.getRoadTransportCertificateNumber().equals(other.getRoadTransportCertificateNumber()))
            && (this.getTrailerVehiclePlateNumber() == null ? other.getTrailerVehiclePlateNumber() == null : this.getTrailerVehiclePlateNumber().equals(other.getTrailerVehiclePlateNumber()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVehicleNumber() == null) ? 0 : getVehicleNumber().hashCode());
        result = prime * result + ((getVehiclePlateColorCode() == null) ? 0 : getVehiclePlateColorCode().hashCode());
        result = prime * result + ((getVehicleType() == null) ? 0 : getVehicleType().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getUseCharacter() == null) ? 0 : getUseCharacter().hashCode());
        result = prime * result + ((getVIN() == null) ? 0 : getVIN().hashCode());
        result = prime * result + ((getIssuingOrganizations() == null) ? 0 : getIssuingOrganizations().hashCode());
        result = prime * result + ((getRegisterDate() == null) ? 0 : getRegisterDate().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getVehicleEnergyType() == null) ? 0 : getVehicleEnergyType().hashCode());
        result = prime * result + ((getVehicleTonnage() == null) ? 0 : getVehicleTonnage().hashCode());
        result = prime * result + ((getGrossMass() == null) ? 0 : getGrossMass().hashCode());
        result = prime * result + ((getRoadTransportCertificateNumber() == null) ? 0 : getRoadTransportCertificateNumber().hashCode());
        result = prime * result + ((getTrailerVehiclePlateNumber() == null) ? 0 : getTrailerVehiclePlateNumber().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vehicleNumber=").append(vehicleNumber);
        sb.append(", vehiclePlateColorCode=").append(vehiclePlateColorCode);
        sb.append(", vehicleType=").append(vehicleType);
        sb.append(", owner=").append(owner);
        sb.append(", useCharacter=").append(useCharacter);
        sb.append(", VIN=").append(VIN);
        sb.append(", issuingOrganizations=").append(issuingOrganizations);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", vehicleEnergyType=").append(vehicleEnergyType);
        sb.append(", vehicleTonnage=").append(vehicleTonnage);
        sb.append(", grossMass=").append(grossMass);
        sb.append(", roadTransportCertificateNumber=").append(roadTransportCertificateNumber);
        sb.append(", trailerVehiclePlateNumber=").append(trailerVehiclePlateNumber);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}