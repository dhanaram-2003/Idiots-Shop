package com.idiots.IdiotsShop.controller;

import com.idiots.IdiotsShop.model.Slipper;
import com.idiots.IdiotsShop.service.SlipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/slippers")
public class SlipperController {

    @Autowired
    SlipperService slipperService;

    @GetMapping
    public List<Slipper> getSlippers(){
        return slipperService.getSlippers();
    }
}
