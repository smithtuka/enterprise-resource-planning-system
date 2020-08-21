package com.galbern.requisitionservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/property")
@RequestMapping
public class PropertyController {
    @Autowired
    Configuration configuration;

    @GetMapping
    String ppty(){

//        return new Property(configuration.getMaximum(), configuration.getMinimum());
        return "new Property(34, 56)";
    }

}
