package com.example.jungeun.airquality.airquality;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class IndexController {

    @GetMapping("/")
    public String basic() throws IOException {

        return "redirect:/basic";
    }
}
