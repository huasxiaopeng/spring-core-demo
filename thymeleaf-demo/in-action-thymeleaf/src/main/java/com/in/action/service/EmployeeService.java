package com.in.action.service;

import com.in.action.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Description 服务接口
 * @Author lktbz
 * @Date 2021/07/24
 */
public interface  EmployeeService {
    /**
     * 查询
     * @return
     */
    List<Employee> getAllEmployees();

    /**
     *  add
     * @param employee
     */
    void saveEmployee(Employee employee);

    /**
     *  根据 id查询
     * @param id
     * @return
     */
    Employee getEmployeeById(long id);

    /**
     *  删除
     * @param id
     */
    void deleteEmployeeById(long id);

    /**
     *   分页
     * @param pageNo
     * @param pageSize
     * @return
     */
//    Page< Employee > findPaginated(int pageNo, int pageSize);

    /**
     *   因为使用排序 所以喜欢掉上面的分页
     * @param pageNo
     * @param pageSize
     * @param sortField
     * @param sortDirection
     * @return
     */
    Page < Employee > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
