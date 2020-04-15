package com.xljt.freight.domain;

import lombok.Data;

/**
 * The type Header info.
 *
 * @author xu
 * @date 2020.04.14
 */
@Data
public class HeaderInfo {
    String messageReferenceNumber;
    String documentName;
    String documentVersionNumber;
    String senderCode;
    String enterpriseSendercode;
    String messageSendingDateTime;
    String iPCType;
    String token;
}
