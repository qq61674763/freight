package com.xljt.freight.common;

/**
 * 业务类型
 * @author xurao
 * @date 2020/04/08
 */
public enum IPCTypeEnum {

    /**
     * 电子运单上传
     */
    OrderUpload("WLHY_YD1001", "电子运单"),
    /**
     * 资金流水上传
     */
    CapitalFlowUpload("WLHY_ZJ1001", "资金流水单"),
    /**
     * 车辆基本信息上传
     */
    CarInfoUpload("WLHY_CL1001", "车辆信息单"),
    /**
     * 驾驶员基本信息上传
     */
    DriverUpload("WLHY_JSY1001", "驾驶员信息单"),
    /**
     * 位置信息上传
     */
    LocationUpload("WLHY_WZ1001", "位置信息单");

    /**
     * Instantiates a new Ipc type enum.
     *
     * @param name the name
     * @param chineseName the chinese name
     * @author xu
     * @date 2020.04.10
     */
    IPCTypeEnum(String name, String chineseName) {
    }
}
