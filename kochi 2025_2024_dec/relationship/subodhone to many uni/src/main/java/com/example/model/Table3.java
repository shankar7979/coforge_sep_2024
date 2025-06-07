package com.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Table3")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Table3 {
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_DETAIL_ID")
    private int itemDetailId;
    //32
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "STAGE_ID")
    private Table2 table2;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "ITEM_NAME")
    private String itemName;
}