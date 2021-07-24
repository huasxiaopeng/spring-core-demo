package com.in.action.controller;

import com.in.action.entity.Employee;
import com.in.action.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description controller
 * @Author lktbz
 * @Date 2021/07/24
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    /**
     * 因为分页的原因，现在需要注释掉
     */
//    @GetMapping("/emp")
//    public String viewHomePage(Model model) {
//        model.addAttribute("listEmployees", employeeService.getAllEmployees());
//        return "index";
//    }

    /**
     * add
     * 路径跳转
     * @param model
     * @return
     */
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    /**
     *  表单提交
     *  @ModelAttribute通过此注解拿到与表单相应的数据，解析成对象类
     * @param employee
     * @return
     */
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        employeeService.saveEmployee(employee);
        /**
         *  重定向
         */
//        return "redirect:/emp"; 因为使用分页，所以去掉
        return "redirect:/";
    }

    /**
     *   根据传入的id查询对象
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
        Employee employee = employeeService.getEmployeeById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    /**
     *  删除
     * @param id
     * @return
     */
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (value = "id") long id) {

        // call delete employee method
        this.employeeService.deleteEmployeeById(id);
//        return "redirect:/emp"; 因为使用分页，所以去掉
        return "redirect:/";
    }

    /**
     *  分页操作
     * @param pageNo
     * @param model
     * @return
     */
//    @GetMapping("/page/{pageNo}")
//    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
//        int pageSize = 2;
//
//        Page< Employee > page = employeeService.findPaginated(pageNo, pageSize);
//        List< Employee > listEmployees = page.getContent();
//
//        model.addAttribute("currentPage", pageNo);
//        model.addAttribute("totalPages", page.getTotalPages());
//        model.addAttribute("totalItems", page.getTotalElements());
//        model.addAttribute("listEmployees", listEmployees);
////        return "index"; 不使用分页
//        return "index-page";
//    }
    /**
     *  带 排序的分页使用
     */
    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page < Employee > page = employeeService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List < Employee > listEmployees = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listEmployees", listEmployees);
        return "index-page-sort";
    }
    /**
     *  分页替换主页面url
     * @param model
     * @return
     */
    @GetMapping("/")
    public String viewHomePage(Model model) {
//        return findPaginated(1, model);
        return findPaginated(1, "firstName", "asc", model);
    }
}
