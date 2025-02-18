package com.example.jungeun.airquality.airquality.controller;

import com.example.jungeun.airquality.airquality.service.AirQualityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class AirQualityController {

    private final AirQualityService airQualityService;

    public AirQualityController(AirQualityService airQualityService) {
        this.airQualityService = airQualityService;
    }

    @GetMapping("/basic")
    public String basic(Model model) throws IOException {
        String result = airQualityService.getAirQualityDataBasic();
        model.addAttribute("airQualityData", result);

        return "airQuality";
    }
}
