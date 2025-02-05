package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Customer")
@Data
@ToString(exclude = {"orders"})
@EqualsAndHashCode(exclude = {"orders"} )
@AllArgsConstructor
@NoArgsConstructor
//@JdbcTypeCode(SqlTypes.JSON)

public class Customer  implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private int customerID;
 
    private String name;
    private String email;
    private String phone;
    private String address;
 
//  @OneToMany(mappedBy = "customer", cascade = CascadeType.MERGE)
  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//  @JoinTable(
//		  name = "customer_Order",
//        joinColumns = @JoinColumn(name = "customer_ID"),
//        inverseJoinColumns = @JoinColumn(name = "Order_iD")
//		  
//		  )
  
//   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   //@JoinColumn(name="orderid")
   @JsonIgnoreProperties("customer")

   private List<Order> orders = new ArrayList<>();
   
  
}
