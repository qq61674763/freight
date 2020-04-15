package com.xljt.freight.domain;

import lombok.Data;


/**
 * The type Result message.
 *
 * @author xu
 * @date 2020.04.10
 */
@Data
public class ResultMessage {

    /**
     * The Success.
     */
    private Boolean success;

    /**
     * The Code.
     */
    private String code;

    /**
     * The Msg.
     */
    private String msg;

    /**
     * The Data.
     */
    private Object data;
}
