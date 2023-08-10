package com.example.orderservice.vo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestOrder {

    private String productId;

    private Integer qty;

    private Integer unitPrice;
}
