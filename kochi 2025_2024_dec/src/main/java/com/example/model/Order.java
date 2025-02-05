package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.transaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@Table(name = "tableforordering")
@Table(name = "order1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
//Transaction t;
	@Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private int orderID;
 
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    
   @JoinColumn(name = "CustomerID", nullable = false)
    //@JsonIgnoreProperties("orders")
    private Customer customer;
 
    @Column(name = "RestaurantID")
    private int restaurantID;
 
    private String status;
    private double totalAmount;

//    @ManyToMany
//    @JoinTable(
//        name = "Order_MenuItem",
//        joinColumns = @JoinColumn(name = "OrderID"),
//        inverseJoinColumns = @JoinColumn(name = "ItemID")
//    )
//
//    private List<MenuItem> menuItems = new ArrayList<>();

}