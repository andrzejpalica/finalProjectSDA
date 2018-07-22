package pl.sdacademy.spring.final_project.car_dealer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping(value = { "/" })
    public String homePage() {
        return "homePage";
    }
}
