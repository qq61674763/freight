package com.xljt.freight.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xljt.freight.service.CarInfoService;

/**
 * The type Car info service.
 *
 * @author xu
 * @date 2020.04.15
 */
public class CarInfoServiceImpl implements CarInfoService {
    /**
     * Car info upload.
     *
     * @author xu
     * @date 2020.04.13
     */
    @Override
    public void carInfoUpload() {

        JSONObject carInfo = new JSONObject();
        carInfo.put("vehicleNumber", "");
    }
}
