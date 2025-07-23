package com.example.bilingsoftware.io;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponse {


    private  String itemId;
    private String  name;
    private BigDecimal price;
    private String  categoryId;
    private String description;
    private String  categoryname;
    private String imgurl;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
