
package com.example.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Table1")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Table1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_CARD_ID")
    private int jobCardId;

    @Column(name = "JOB_CODE")
    private String jobCode;

    @Column(name = "DOC_NO")
    private Integer docNo;

    @Column(name = "JOB_NAME")
    private String jobName;
}