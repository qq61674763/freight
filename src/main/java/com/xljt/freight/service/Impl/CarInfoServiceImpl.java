package com.xljt.freight.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xljt.freight.domain.CarInfo;
import com.xljt.freight.mapper.CarInfoDAO;
import com.xljt.freight.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Car info service.
 *
 * @author xu
 * @date 2020.04.15
 */
@Service
public class CarInfoServiceImpl implements CarInfoService {

    private CarInfoDAO carInfoDAO;

    public CarInfoServiceImpl(CarInfoDAO carInfoDAO) {
        this.carInfoDAO = carInfoDAO;
    }

    /**
     * Car info upload.
     *
     * @author xu
     * @date 2020.04.13
     */
    @Override
    public void carInfoUpload() {
        CarInfo carInfo = carInfoDAO.selectByPrimaryKey(1L);
        JSON car = (JSON) JSON.toJSON(carInfo);
        String carInfoString = car.toJSONString();
    }
}
