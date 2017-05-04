package com.hong.web;

import com.hong.domain.City;
import com.hong.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017/5/4.
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/api/city/{id}")
    public City findOneCity(@PathVariable("id") Integer id){
         return  cityService.findOneCity(id);
    }
}
