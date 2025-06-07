package com.example.dao;

//import com.ticket.mysql.model.Table3;
import com.example.model.Table3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table3Repository extends JpaRepository<Table3, Integer> {
}
