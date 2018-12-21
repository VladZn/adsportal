package ru.geekbrains.vlad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.service.AdService;

import java.util.Optional;

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

    @GetMapping("/add")
    public String createAd(final Model model) {
        Ad ad = new Ad();
        ad.setName("New ad");
        ad.setContent("The content of the new ad");
        service.save(ad);
        model.addAttribute("ad", ad);
        return "ad-edit";
    }

    @GetMapping("/edit/{id}")
    public String editAd(final Model model, @PathVariable("id") final String id) {
        Optional<Ad> ad = service.findById(id);
        ad.ifPresent(a -> model.addAttribute("ad", a));
        return "ad-edit";
    }

    @GetMapping("/view/{id}")
    public String viewAd(final Model model, @PathVariable("id") final String id) {
        Optional<Ad> ad = service.findById(id);
        ad.ifPresent(a->model.addAttribute("ad", a));
        return "ad-view";
    }

    @PostMapping("/save")
    public String saveAd(@ModelAttribute("ad") final Ad ad, final BindingResult result) {
        if (!result.hasErrors()){
            service.save(ad);
        }
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteAd(@PathVariable("id") final String id) {
        service.delete(id);
        return "redirect:/list";
    }
}
