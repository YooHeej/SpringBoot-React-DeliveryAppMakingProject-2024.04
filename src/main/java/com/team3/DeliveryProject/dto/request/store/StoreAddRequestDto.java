package com.team3.DeliveryProject.dto.request.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreAddRequestDto {

    private String email;
    private String name;
    private int type;
    private String category;
    private String address;
    private String storePictureName;
    private String phone;
    private String content;
    private int minDeliveryPrice;
    private int deliveryTip;
    private int minDeliveryTime;
    private int maxDeliveryTime;
    private String operationHours;
    private String closedDays;
    private String addressCode;
}
