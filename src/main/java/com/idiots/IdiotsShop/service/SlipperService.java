package com.idiots.IdiotsShop.service;

import com.idiots.IdiotsShop.model.Slipper;
import com.idiots.IdiotsShop.repository.SlipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlipperService {

    @Autowired
    SlipperRepository slipperRepository;

    public List<Slipper> getSlippers(){
        return slipperRepository.findAll();
    }
}
