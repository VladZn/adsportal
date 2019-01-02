package ru.geekbrains.vlad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.vlad.service.AdService;

/**
 * @author Vladislav Zinchenko
 * 18.12.2018
 */

@Controller
//@RequestMapping("/")
public class HomeController {

    @Autowired
    private AdService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("ads", service.getAll());
        return "ads-list";
    }

}
