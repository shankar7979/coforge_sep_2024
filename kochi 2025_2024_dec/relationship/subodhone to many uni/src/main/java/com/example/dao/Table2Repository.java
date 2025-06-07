package com.example.dao;

//import com.ticket.mysql.model.Table2;
import com.example.model.Table2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table2Repository extends JpaRepository<Table2, Integer> {
}
