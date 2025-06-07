package com.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Table2")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Table2 {
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    @Column(name = "STAGE_ID")
    private int stageId;

    @Column(name = "JOB_CODE")
    private String jobCode;

    //21
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    @JoinColumn(name = "JOB_CARD_ID")
    private Table1 table1;

    @Column(name = "STAGE_NUMBER")
    private int stageNumber;

    @Column(name = "STAGE_DESCRIPTION")
    private String stageDescription;
}