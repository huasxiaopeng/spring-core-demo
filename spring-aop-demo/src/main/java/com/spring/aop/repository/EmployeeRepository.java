package com.spring.aop.repository;

import com.spring.aop.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/27
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
