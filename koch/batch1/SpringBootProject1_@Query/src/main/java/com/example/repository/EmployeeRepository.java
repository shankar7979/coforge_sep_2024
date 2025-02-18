package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByname(String name);
    List<Employee> findByNameAndSalary(String name, float salary);

    @Query("select e from  Employee e where e.salary=?1")
    List<Employee> searchwithsalary(float salary);

    @Modifying
    @Transactional
    @Query("update Employee e set e.name=?1 where e.id=?2")
    int updateEmployee(String name, int id);


}
