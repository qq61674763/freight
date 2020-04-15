package com.xljt.freight.mapper;

import com.xljt.freight.domain.OrderInfo;
import org.springframework.stereotype.Repository;


/**
 * The interface Order info dao.
 *
 * @author xu
 * @date 2020.04.09
 */
@Repository
public interface OrderInfoDAO {

    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     * @author xu
     * @date 2020.04.09
     */
    int deleteByPrimaryKey(Long id);

    /**
     * Insert int.
      *
     * @param record the record
     * @return the int
     * @author xu
     * @date 2020.04.10
     */
    int insert(OrderInfo record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     * @author xu
     * @date 2020.04.10
     */
    int insertSelective(OrderInfo record);

    /**
     * Select by primary key order info.
     *
     * @param id the id
     * @return the order info
     */
    OrderInfo selectByPrimaryKey(Long id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(OrderInfo record);
}
