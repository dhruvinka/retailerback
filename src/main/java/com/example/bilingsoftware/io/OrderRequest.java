package com.example.bilingsoftware.io;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest
{
    private String customerName;
    private String phoneNumber;
    private List<OrderItemRequest> cartItems;
    private  Double subtotal;
    private  Double tax;
    private  Double grandTotal;
    private  String paymentMethod;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public  static  class OrderItemRequest
    {

        private  String itemId;
        private  String name;
        private Double price;
        private Integer q;


    }


}
