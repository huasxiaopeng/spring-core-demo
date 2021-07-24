package com.in.action.repository;

import com.in.action.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/24
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}