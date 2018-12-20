package ru.geekbrains.vlad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.geekbrains.vlad.service.AdService;

/**
 * @author Vladislav Zinchenko
 * 19.12.2018
 */

@Controller
@RequestMapping("/ads")
public class AdController {

    @Autowired
    private AdService service;

    @GetMapping(value = "/list")
    public ModelAndView getAds() {
        return new ModelAndView("ads-list", "ads", service.getAll());
    }

}
