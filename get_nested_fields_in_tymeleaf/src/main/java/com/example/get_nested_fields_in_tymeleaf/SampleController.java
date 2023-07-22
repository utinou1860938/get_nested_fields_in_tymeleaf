package com.example.get_nested_fields_in_tymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @GetMapping
    public String getTemplate(Model model){
        List<middleware> middlewareList = new ArrayList<>();
        middlewareList.add(new middleware());
        ServerDate serverDate = new ServerDate();
        serverDate.setMiddlewareList(middlewareList);
        List<ServerDate> serverDateList = new ArrayList<>();
        serverDateList.add(serverDate);
        MyForm myForm = new MyForm();
        myForm.setServerDateList(serverDateList);
        System.out.println(serverDateList);
        model.addAttribute("obj", myForm);
        return "sample";
    }

    @PostMapping("/submit")
    public String handlePost(@ModelAttribute("obj") MyForm form) {
        System.out.println(form);
        return "sample";
    }

}
