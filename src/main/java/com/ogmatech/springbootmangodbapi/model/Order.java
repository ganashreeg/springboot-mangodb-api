package com.ogmatech.springbootmangodbapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Order {
    @Id
    private String _id;
    private String orderNumber;
    private String orderReceivedAt;
    private String orderReceivedById;
    private Date orderExpectedDeliveryAt;
    private Date orderDeliveredAt;
    private String orderDeliveredBy;
    private String orderDeliveredById;
    private Date orderCompletedAt;
    private Boolean isQucikOrder;
    private Boolean isDiscount;
    private Boolean isExtraCharge;
    private Boolean isTemporaryOrder;
    private Integer orderTotalAmount;
    private Integer payableAmount;
    private String orderNote;
}
