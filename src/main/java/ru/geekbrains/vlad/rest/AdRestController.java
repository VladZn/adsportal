package ru.geekbrains.vlad.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.vlad.dto.AdDTO;
import ru.geekbrains.vlad.dto.ResultDTO;
import ru.geekbrains.vlad.model.Ad;
import ru.geekbrains.vlad.service.AdService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Vladislav Zinchenko
 * 27.12.2018
 */

@RestController
@RequestMapping("/api/ads")
public class AdRestController {

    @Autowired
    private AdService adService;

    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdDTO> getAll() {
        List<Ad> ads = adService.getAll();
        return ads.stream().map(AdDTO::new).collect(Collectors.toList());
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdDTO findById(@PathVariable("id") String id){
        Optional<Ad> ad = adService.findById(id);
        return ad.map(AdDTO::new).orElse(null);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO post(final AdDTO adDTO) {
        adService.save(adDTO);
        return new ResultDTO();
    }
}
