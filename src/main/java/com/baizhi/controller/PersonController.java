package com.baizhi.controller;

import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/P")
public class PersonController {
    @Autowired
    private PersonService personService;



    @RequestMapping("/showAll")
    public List<Person> showAll(Model model) {

        System.out.println("in controller");

        List<Person> all = personService.getAll();
        System.out.println();
        return all;
    }


    @RequestMapping("/jjj")
    public String jjj(Model model) {

        String a = "aaa";

        return a;
    }


}
