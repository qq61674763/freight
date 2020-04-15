package com.xljt.freight.mapper;

import com.xljt.freight.domain.CarInfo;
import org.springframework.stereotype.Repository;

/**
 * CarInfoDAO继承基类
 */
@Repository
public interface CarInfoDAO extends MyBatisBaseDao<CarInfo, Long> {
}