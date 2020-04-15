package com.xljt.freight.mapper;

import com.xljt.freight.domain.CarInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface CarInfoDAO {
    int deleteByPrimaryKey(Long id);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}