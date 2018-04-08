package eu.maciejfijalkowski.securityMysqlV1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public String adminIndex(){
        return "adminindex";
    }

    @GetMapping("/user")
    public String userIndex(){
        return "userindex";
    }


}
