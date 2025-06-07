package com.example.dao;

//import com.ticket.mysql.model.Table1;
import com.example.model.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table1Repository extends JpaRepository<Table1, Integer> {

}
