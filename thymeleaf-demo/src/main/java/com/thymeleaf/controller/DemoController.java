package com.thymeleaf.controller;

import com.thymeleaf.domain.Employee;
import com.thymeleaf.domain.Role;
import com.thymeleaf.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description hello world Thymeleaf
 * @Author lktbz
 * @Date 2021/07/24
 */
@Controller
public class DemoController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World! ");
        return "helloworld";
    }

    /**
     * 添加css 样式
     * @param model
     * @return
     */
    @GetMapping("/css")
    public String css(Model model) {
        return "add-css-js-demo";
    }

    /**
     * 使用提供的bootstrap 样式
     * @param model
     * @return
     */
    @GetMapping("/bootstrap")
    public String bootstrap(Model model) {
        List<Employee>employees=new ArrayList<>();
        Employee e1=new Employee();
        e1.setLastName("Golis");
        e1.setFirstName("GG");
        e1.setEmail("ghg@gmail.com");
        Employee e2=new Employee();
        e2.setLastName("Teids");
        e2.setFirstName("tg");
        e2.setEmail("tgf@gmail.com");
        employees.add(e1);
        employees.add(e2);
        model.addAttribute("employees",employees);
        return "bootstrap";
    }
    @GetMapping("/no")
    public String noNull(Model model) {
        Role role=new Role("经理级别");
        User user = new User("Ramesh", "ramesh@gmail.com", role);
        model.addAttribute("user", user);
        return "nopoint";
    }

    @GetMapping("/iteration")
    public String iteration(Model model) {
        List < Employee > employees = new ArrayList < > ();
        employees.add(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com"));
        employees.add(new Employee("John", "Cena", "john@gmail.com"));
        employees.add(new Employee("Tom", "Cruise", "tom@gmail.com"));
        employees.add(new Employee("Tony", "Stark", "tony@gmail.com"));
        model.addAttribute("employees", employees);
        return "list";
    }

    @GetMapping("/arraysDemo")
    public String arraysDemo(Model model) {
        String[] planets = {
                "MERCURY",
                "VENUS",
                "EARTH",
                "MARS",
                "JUPITER",
                "SATURN",
                "URANUS",
                "NEPTUNE"
        };
        model.addAttribute("planets", planets);
        return "arrays";
    }

    @GetMapping("/if")
    public String switchExample(Model model) {
        Role role=new Role("ADMIN");
        User user = new User("Ramesh", "ramesh@gmail.com",role );
        model.addAttribute("user", user);
        return "if";
    }
}
