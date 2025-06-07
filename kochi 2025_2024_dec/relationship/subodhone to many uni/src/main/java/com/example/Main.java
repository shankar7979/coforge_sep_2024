
package com.example;

import com.example.dao.Table2Repository;
import com.example.dao.Table3Repository;
import com.example.model.Table1;
import com.example.model.Table2;
import com.example.model.Table3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication

public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    Table2Repository table2repo;

    @Autowired
    Table3Repository table3repo;

    @Transactional

    @Override
    public void run(String... args) throws Exception {
        //t3-- 32 manytoone
        // t2 -- 21  manytoone

        Table3 table31 = Table3.builder().itemCode("itm1001").itemName("book").build();
        Table3 table32 = Table3.builder().itemCode("itm1002").itemName("pen").build();
        Table3 table33 = Table3.builder().itemCode("itm1003").itemName("pencil").build();

        Table2 table21 = Table2.builder().jobCode("job1001").stageDescription("staGE1").stageNumber(1).build();

        table31.setTable2(table21);
        table32.setTable2(table21);
        table33.setTable2(table21);

        table3repo.save(table31);
        table3repo.save(table32);
        table3repo.save(table33);

        Table2 table22 = Table2.builder().jobCode("job10011").stageDescription("staGE11").stageNumber(11).build();
        Table2 table23 = Table2.builder().jobCode("job10012").stageDescription("staGE12").stageNumber(12).build();
        Table2 table24 = Table2.builder().jobCode("job10013").stageDescription("staGE13").stageNumber(13).build();

        Table1 table1 = Table1.builder().docNo(1).jobCode("jbocode11").jobName("myjobname1").build();

        table22.setTable1(table1);
        table23.setTable1(table1);
        table24.setTable1(table1);

        table2repo.save(table22);
        table2repo.save(table23);
        table2repo.save(table24);

    }
}
