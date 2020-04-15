package com.xljt.freight.service.Impl;

import com.xljt.freight.service.CarInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Car info service impl test.
 *
 * @author xu
 * @date 2020.04.15
 */
@SpringBootTest
class CarInfoServiceImplTest {

    @Autowired
    private CarInfoService carInfoService;

    @Test
    void carInfoUpload() {
        carInfoService.carInfoUpload();
    }
}
