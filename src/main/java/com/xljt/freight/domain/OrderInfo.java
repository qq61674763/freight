package com.xljt.freight.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * OrderInfo 订单信息
 * @author xu
 */
public class OrderInfo implements Serializable {
    private Long id;

    /**
     * 【原始单号】  必填，上游企业委托运输单号
     */
    private String originalDocumentNumber;

    /**
     * 【运单号】  必填，运单号
     */
    private String shippingNoteNumber;

    /**
     * 【分段分单号】  必填，分段运输和多车运输由四位数字组成， 前两位代表一单多车的序号，后两位代表分段序号。若运输形式为一单一车填 0000
     */
    private String serialNumber;

    /**
     * 【运输总车辆数】  必填，同一运单号的货物总共使用的运输车辆总数
     */
    private Integer vehicleAmount;

    /**
     * 【运输组织类型代码】  必填，代码集参见wlhy.mot.gov.cn
     */
    private Integer transportTypeCode;

    /**
     * 【运单上传时间】  必填，网络货运经营者上传运单到省级监测系统的时间。YYYYMMDDhhmmss
     */
    private Integer sendToProDateTime;

    /**
     * 【网络货运经营者名称】必填
     */
    private String carrier;

    /**
     * 【统一社会信用代码】  必填
     */
    private String unifiedSocialCreditIdentifier;

    /**
     * 【道路运输经营许可证编号】  必填，网络货运经营者的道路运输经营许可证编号
     */
    private String permitNumber;

    /**
     * 【运单生成时间】必填，网络货运经营者信息系统正式成交生成运单的日期时间。YYYYMMDDhhmmss
     */
    private Integer consignmentDateTime;

    /**
     * 【业务类型代码】 必填，代码集参见wlhy.mot.gov.cn
     */
    private String businessTypeCode;

    /**
     * 【发货日期时间】必填，本单货物的发货时间YYYYMMDDhhmmss
     */
    private Integer despatchActualDateTime;

    /**
     * 【收货日期时间】必填，本单货物的收货时间YYYYMMDDhhmmss
     */
    private Integer goodsReceiptDateTime;

    /**
     * 【托运人信息ID】
     */
    private Long consignorInfo_id;

    /**
     * 【收货方信息ID】
     */
    private Long consigneeInfo_id;

    /**
     * 【运费金额】必填，托运人与网络货运经营者签订运输合同确定的运费金额，货币单位为人民币（元）， 保留 3 位小数，如整数的话，以.000 填充。如是一笔业务分几辆车运，需将托运人针对这笔业务付给网络货运经营者的运输费用分摊到每辆车上

     */
    private BigDecimal totalMonetaryAmount;

    /**
     * 【车辆信息ID】
     */
    private Long vehicleInfo_id;

    /**
     * 【实际承运人信息ID】
     */
    private Long actualCarrierInfo_id;

    /**
     * 【保险信息ID】
     */
    private Long insuranceInformation_id;

    /**
     * 【备注】选填
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalDocumentNumber() {
        return originalDocumentNumber;
    }

    public void setOriginalDocumentNumber(String originalDocumentNumber) {
        this.originalDocumentNumber = originalDocumentNumber;
    }

    public String getShippingNoteNumber() {
        return shippingNoteNumber;
    }

    public void setShippingNoteNumber(String shippingNoteNumber) {
        this.shippingNoteNumber = shippingNoteNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getVehicleAmount() {
        return vehicleAmount;
    }

    public void setVehicleAmount(Integer vehicleAmount) {
        this.vehicleAmount = vehicleAmount;
    }

    public Integer getTransportTypeCode() {
        return transportTypeCode;
    }

    public void setTransportTypeCode(Integer transportTypeCode) {
        this.transportTypeCode = transportTypeCode;
    }

    public Integer getSendToProDateTime() {
        return sendToProDateTime;
    }

    public void setSendToProDateTime(Integer sendToProDateTime) {
        this.sendToProDateTime = sendToProDateTime;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getUnifiedSocialCreditIdentifier() {
        return unifiedSocialCreditIdentifier;
    }

    public void setUnifiedSocialCreditIdentifier(String unifiedSocialCreditIdentifier) {
        this.unifiedSocialCreditIdentifier = unifiedSocialCreditIdentifier;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    public Integer getConsignmentDateTime() {
        return consignmentDateTime;
    }

    public void setConsignmentDateTime(Integer consignmentDateTime) {
        this.consignmentDateTime = consignmentDateTime;
    }

    public String getBusinessTypeCode() {
        return businessTypeCode;
    }

    public void setBusinessTypeCode(String businessTypeCode) {
        this.businessTypeCode = businessTypeCode;
    }

    public Integer getDespatchActualDateTime() {
        return despatchActualDateTime;
    }

    public void setDespatchActualDateTime(Integer despatchActualDateTime) {
        this.despatchActualDateTime = despatchActualDateTime;
    }

    public Integer getGoodsReceiptDateTime() {
        return goodsReceiptDateTime;
    }

    public void setGoodsReceiptDateTime(Integer goodsReceiptDateTime) {
        this.goodsReceiptDateTime = goodsReceiptDateTime;
    }

    public Long getConsignorInfo_id() {
        return consignorInfo_id;
    }

    public void setConsignorInfo_id(Long consignorInfo_id) {
        this.consignorInfo_id = consignorInfo_id;
    }

    public Long getConsigneeInfo_id() {
        return consigneeInfo_id;
    }

    public void setConsigneeInfo_id(Long consigneeInfo_id) {
        this.consigneeInfo_id = consigneeInfo_id;
    }

    public BigDecimal getTotalMonetaryAmount() {
        return totalMonetaryAmount;
    }

    public void setTotalMonetaryAmount(BigDecimal totalMonetaryAmount) {
        this.totalMonetaryAmount = totalMonetaryAmount;
    }

    public Long getVehicleInfo_id() {
        return vehicleInfo_id;
    }

    public void setVehicleInfo_id(Long vehicleInfo_id) {
        this.vehicleInfo_id = vehicleInfo_id;
    }

    public Long getActualCarrierInfo_id() {
        return actualCarrierInfo_id;
    }

    public void setActualCarrierInfo_id(Long actualCarrierInfo_id) {
        this.actualCarrierInfo_id = actualCarrierInfo_id;
    }

    public Long getInsuranceInformation_id() {
        return insuranceInformation_id;
    }

    public void setInsuranceInformation_id(Long insuranceInformation_id) {
        this.insuranceInformation_id = insuranceInformation_id;
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
        OrderInfo other = (OrderInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOriginalDocumentNumber() == null ? other.getOriginalDocumentNumber() == null : this.getOriginalDocumentNumber().equals(other.getOriginalDocumentNumber()))
            && (this.getShippingNoteNumber() == null ? other.getShippingNoteNumber() == null : this.getShippingNoteNumber().equals(other.getShippingNoteNumber()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getVehicleAmount() == null ? other.getVehicleAmount() == null : this.getVehicleAmount().equals(other.getVehicleAmount()))
            && (this.getTransportTypeCode() == null ? other.getTransportTypeCode() == null : this.getTransportTypeCode().equals(other.getTransportTypeCode()))
            && (this.getSendToProDateTime() == null ? other.getSendToProDateTime() == null : this.getSendToProDateTime().equals(other.getSendToProDateTime()))
            && (this.getCarrier() == null ? other.getCarrier() == null : this.getCarrier().equals(other.getCarrier()))
            && (this.getUnifiedSocialCreditIdentifier() == null ? other.getUnifiedSocialCreditIdentifier() == null : this.getUnifiedSocialCreditIdentifier().equals(other.getUnifiedSocialCreditIdentifier()))
            && (this.getPermitNumber() == null ? other.getPermitNumber() == null : this.getPermitNumber().equals(other.getPermitNumber()))
            && (this.getConsignmentDateTime() == null ? other.getConsignmentDateTime() == null : this.getConsignmentDateTime().equals(other.getConsignmentDateTime()))
            && (this.getBusinessTypeCode() == null ? other.getBusinessTypeCode() == null : this.getBusinessTypeCode().equals(other.getBusinessTypeCode()))
            && (this.getDespatchActualDateTime() == null ? other.getDespatchActualDateTime() == null : this.getDespatchActualDateTime().equals(other.getDespatchActualDateTime()))
            && (this.getGoodsReceiptDateTime() == null ? other.getGoodsReceiptDateTime() == null : this.getGoodsReceiptDateTime().equals(other.getGoodsReceiptDateTime()))
            && (this.getConsignorInfo_id() == null ? other.getConsignorInfo_id() == null : this.getConsignorInfo_id().equals(other.getConsignorInfo_id()))
            && (this.getConsigneeInfo_id() == null ? other.getConsigneeInfo_id() == null : this.getConsigneeInfo_id().equals(other.getConsigneeInfo_id()))
            && (this.getTotalMonetaryAmount() == null ? other.getTotalMonetaryAmount() == null : this.getTotalMonetaryAmount().equals(other.getTotalMonetaryAmount()))
            && (this.getVehicleInfo_id() == null ? other.getVehicleInfo_id() == null : this.getVehicleInfo_id().equals(other.getVehicleInfo_id()))
            && (this.getActualCarrierInfo_id() == null ? other.getActualCarrierInfo_id() == null : this.getActualCarrierInfo_id().equals(other.getActualCarrierInfo_id()))
            && (this.getInsuranceInformation_id() == null ? other.getInsuranceInformation_id() == null : this.getInsuranceInformation_id().equals(other.getInsuranceInformation_id()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOriginalDocumentNumber() == null) ? 0 : getOriginalDocumentNumber().hashCode());
        result = prime * result + ((getShippingNoteNumber() == null) ? 0 : getShippingNoteNumber().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getVehicleAmount() == null) ? 0 : getVehicleAmount().hashCode());
        result = prime * result + ((getTransportTypeCode() == null) ? 0 : getTransportTypeCode().hashCode());
        result = prime * result + ((getSendToProDateTime() == null) ? 0 : getSendToProDateTime().hashCode());
        result = prime * result + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        result = prime * result + ((getUnifiedSocialCreditIdentifier() == null) ? 0 : getUnifiedSocialCreditIdentifier().hashCode());
        result = prime * result + ((getPermitNumber() == null) ? 0 : getPermitNumber().hashCode());
        result = prime * result + ((getConsignmentDateTime() == null) ? 0 : getConsignmentDateTime().hashCode());
        result = prime * result + ((getBusinessTypeCode() == null) ? 0 : getBusinessTypeCode().hashCode());
        result = prime * result + ((getDespatchActualDateTime() == null) ? 0 : getDespatchActualDateTime().hashCode());
        result = prime * result + ((getGoodsReceiptDateTime() == null) ? 0 : getGoodsReceiptDateTime().hashCode());
        result = prime * result + ((getConsignorInfo_id() == null) ? 0 : getConsignorInfo_id().hashCode());
        result = prime * result + ((getConsigneeInfo_id() == null) ? 0 : getConsigneeInfo_id().hashCode());
        result = prime * result + ((getTotalMonetaryAmount() == null) ? 0 : getTotalMonetaryAmount().hashCode());
        result = prime * result + ((getVehicleInfo_id() == null) ? 0 : getVehicleInfo_id().hashCode());
        result = prime * result + ((getActualCarrierInfo_id() == null) ? 0 : getActualCarrierInfo_id().hashCode());
        result = prime * result + ((getInsuranceInformation_id() == null) ? 0 : getInsuranceInformation_id().hashCode());
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
        sb.append(", originalDocumentNumber=").append(originalDocumentNumber);
        sb.append(", shippingNoteNumber=").append(shippingNoteNumber);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", vehicleAmount=").append(vehicleAmount);
        sb.append(", transportTypeCode=").append(transportTypeCode);
        sb.append(", sendToProDateTime=").append(sendToProDateTime);
        sb.append(", carrier=").append(carrier);
        sb.append(", unifiedSocialCreditIdentifier=").append(unifiedSocialCreditIdentifier);
        sb.append(", permitNumber=").append(permitNumber);
        sb.append(", consignmentDateTime=").append(consignmentDateTime);
        sb.append(", businessTypeCode=").append(businessTypeCode);
        sb.append(", despatchActualDateTime=").append(despatchActualDateTime);
        sb.append(", goodsReceiptDateTime=").append(goodsReceiptDateTime);
        sb.append(", consignorInfo_id=").append(consignorInfo_id);
        sb.append(", consigneeInfo_id=").append(consigneeInfo_id);
        sb.append(", totalMonetaryAmount=").append(totalMonetaryAmount);
        sb.append(", vehicleInfo_id=").append(vehicleInfo_id);
        sb.append(", actualCarrierInfo_id=").append(actualCarrierInfo_id);
        sb.append(", insuranceInformation_id=").append(insuranceInformation_id);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
