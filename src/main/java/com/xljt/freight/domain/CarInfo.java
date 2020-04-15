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
    private String vehiclenumber;

    /**
     * 【车牌颜色代码】必填，对应运单技术规范第 27 项
     */
    private String vehicleplatecolorcode;

    /**
     * 【车辆类型代码】必填。参考机动车行驶证填写，代码集参见 wlhy.mot.gov.cn
     */
    private String vehicletype;

    /**
     * 【所有人】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写
     */
    private String owner;

    /**
     * 【使用性质】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写。
     */
    private String usecharacter;

    /**
     * 【车辆识别代号】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写
     */
    private String vin;

    /**
     * 【发证机关】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写
     */
    private String issuingorganizations;

    /**
     * 【注册日期】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写。YYYYMMDD
     */
    private Integer registerdate;

    /**
     * 【发证日期】总质量 4.5 吨及以下普通货运车辆必填，按照机动车行驶证填写。YYYYMMDD
     */
    private Integer issuedate;

    /**
     * 【车辆能源类型】必填，代码集参见wlhy.mot.gov.cn
     */
    private String vehicleenergytype;

    /**
     * 【核定载质量】必填，参考机动车行驶证填写，默认单位：吨，保留两位小数，如整数的话，以.00 填充。小数点不计入总长
     */
    private BigDecimal vehicletonnage;

    /**
     * 【吨位】必填，车辆总质量，默认单位：吨，保留两位小数，如整数的话，以.00 填充。小数点不计入总长
     */
    private BigDecimal grossmass;

    /**
     * 【道路运输证号】必填，总质量 4.5 吨及以下普通货运车辆的，可填“车籍地 6 位行政区域代码
+000000”
     */
    private String roadtransportcertificatenumber;

    /**
     * 【挂车牌照号】选填
     */
    private Integer trailervehicleplatenumber;

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

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getVehicleplatecolorcode() {
        return vehicleplatecolorcode;
    }

    public void setVehicleplatecolorcode(String vehicleplatecolorcode) {
        this.vehicleplatecolorcode = vehicleplatecolorcode;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUsecharacter() {
        return usecharacter;
    }

    public void setUsecharacter(String usecharacter) {
        this.usecharacter = usecharacter;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getIssuingorganizations() {
        return issuingorganizations;
    }

    public void setIssuingorganizations(String issuingorganizations) {
        this.issuingorganizations = issuingorganizations;
    }

    public Integer getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Integer registerdate) {
        this.registerdate = registerdate;
    }

    public Integer getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Integer issuedate) {
        this.issuedate = issuedate;
    }

    public String getVehicleenergytype() {
        return vehicleenergytype;
    }

    public void setVehicleenergytype(String vehicleenergytype) {
        this.vehicleenergytype = vehicleenergytype;
    }

    public BigDecimal getVehicletonnage() {
        return vehicletonnage;
    }

    public void setVehicletonnage(BigDecimal vehicletonnage) {
        this.vehicletonnage = vehicletonnage;
    }

    public BigDecimal getGrossmass() {
        return grossmass;
    }

    public void setGrossmass(BigDecimal grossmass) {
        this.grossmass = grossmass;
    }

    public String getRoadtransportcertificatenumber() {
        return roadtransportcertificatenumber;
    }

    public void setRoadtransportcertificatenumber(String roadtransportcertificatenumber) {
        this.roadtransportcertificatenumber = roadtransportcertificatenumber;
    }

    public Integer getTrailervehicleplatenumber() {
        return trailervehicleplatenumber;
    }

    public void setTrailervehicleplatenumber(Integer trailervehicleplatenumber) {
        this.trailervehicleplatenumber = trailervehicleplatenumber;
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
            && (this.getVehiclenumber() == null ? other.getVehiclenumber() == null : this.getVehiclenumber().equals(other.getVehiclenumber()))
            && (this.getVehicleplatecolorcode() == null ? other.getVehicleplatecolorcode() == null : this.getVehicleplatecolorcode().equals(other.getVehicleplatecolorcode()))
            && (this.getVehicletype() == null ? other.getVehicletype() == null : this.getVehicletype().equals(other.getVehicletype()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getUsecharacter() == null ? other.getUsecharacter() == null : this.getUsecharacter().equals(other.getUsecharacter()))
            && (this.getVin() == null ? other.getVin() == null : this.getVin().equals(other.getVin()))
            && (this.getIssuingorganizations() == null ? other.getIssuingorganizations() == null : this.getIssuingorganizations().equals(other.getIssuingorganizations()))
            && (this.getRegisterdate() == null ? other.getRegisterdate() == null : this.getRegisterdate().equals(other.getRegisterdate()))
            && (this.getIssuedate() == null ? other.getIssuedate() == null : this.getIssuedate().equals(other.getIssuedate()))
            && (this.getVehicleenergytype() == null ? other.getVehicleenergytype() == null : this.getVehicleenergytype().equals(other.getVehicleenergytype()))
            && (this.getVehicletonnage() == null ? other.getVehicletonnage() == null : this.getVehicletonnage().equals(other.getVehicletonnage()))
            && (this.getGrossmass() == null ? other.getGrossmass() == null : this.getGrossmass().equals(other.getGrossmass()))
            && (this.getRoadtransportcertificatenumber() == null ? other.getRoadtransportcertificatenumber() == null : this.getRoadtransportcertificatenumber().equals(other.getRoadtransportcertificatenumber()))
            && (this.getTrailervehicleplatenumber() == null ? other.getTrailervehicleplatenumber() == null : this.getTrailervehicleplatenumber().equals(other.getTrailervehicleplatenumber()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVehiclenumber() == null) ? 0 : getVehiclenumber().hashCode());
        result = prime * result + ((getVehicleplatecolorcode() == null) ? 0 : getVehicleplatecolorcode().hashCode());
        result = prime * result + ((getVehicletype() == null) ? 0 : getVehicletype().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getUsecharacter() == null) ? 0 : getUsecharacter().hashCode());
        result = prime * result + ((getVin() == null) ? 0 : getVin().hashCode());
        result = prime * result + ((getIssuingorganizations() == null) ? 0 : getIssuingorganizations().hashCode());
        result = prime * result + ((getRegisterdate() == null) ? 0 : getRegisterdate().hashCode());
        result = prime * result + ((getIssuedate() == null) ? 0 : getIssuedate().hashCode());
        result = prime * result + ((getVehicleenergytype() == null) ? 0 : getVehicleenergytype().hashCode());
        result = prime * result + ((getVehicletonnage() == null) ? 0 : getVehicletonnage().hashCode());
        result = prime * result + ((getGrossmass() == null) ? 0 : getGrossmass().hashCode());
        result = prime * result + ((getRoadtransportcertificatenumber() == null) ? 0 : getRoadtransportcertificatenumber().hashCode());
        result = prime * result + ((getTrailervehicleplatenumber() == null) ? 0 : getTrailervehicleplatenumber().hashCode());
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
        sb.append(", vehiclenumber=").append(vehiclenumber);
        sb.append(", vehicleplatecolorcode=").append(vehicleplatecolorcode);
        sb.append(", vehicletype=").append(vehicletype);
        sb.append(", owner=").append(owner);
        sb.append(", usecharacter=").append(usecharacter);
        sb.append(", vin=").append(vin);
        sb.append(", issuingorganizations=").append(issuingorganizations);
        sb.append(", registerdate=").append(registerdate);
        sb.append(", issuedate=").append(issuedate);
        sb.append(", vehicleenergytype=").append(vehicleenergytype);
        sb.append(", vehicletonnage=").append(vehicletonnage);
        sb.append(", grossmass=").append(grossmass);
        sb.append(", roadtransportcertificatenumber=").append(roadtransportcertificatenumber);
        sb.append(", trailervehicleplatenumber=").append(trailervehicleplatenumber);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}