package com.ashvin.projects.learn_mongodb.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Data
@Document(collection = "orders")
// 1 is for ascending order sorting -1 is for descending order sorting
@CompoundIndex(name = "idx_quantity_status",def = "{quantity: 1, status: 1}")
public class Order {

    // this class is used to create documents inside orders collection in e-commerce database
    @Id
    private String id;

    private Integer quantity;
    private Double totalPrice;

    @Indexed
    private String status;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private Address address;
}
