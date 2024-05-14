package com.team3.DeliveryProject.dto.response.cart;

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
public class CartDetailInnerMenuOptionsResponseDto {

    private String menuOptionName;
    private int menuOptionPrice;
}
