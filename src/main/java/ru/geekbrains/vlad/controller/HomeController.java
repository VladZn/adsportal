package ru.geekbrains.vlad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vladislav Zinchenko
 * 18.12.2018
 */

@Controller
@RequestMapping("/hello")
public class HomeController {

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public String hello(Model model, @PathVariable(value = "user") String user) {
        model.addAttribute("user", user);
        return "home";
    }
}
