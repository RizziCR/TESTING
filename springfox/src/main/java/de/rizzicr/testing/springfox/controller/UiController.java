package de.rizzicr.testing.springfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rizzi on 27.05.15.
 */
@Controller
public class UiController {

    @RequestMapping(value = "/")
    public String root() { return "redirect:/swagger-ui.html"; }

//    @RequestMapping(value = "/swagger-ui.html")
//    public String home() { return "swagger-ui.html"; }

//    @RequestMapping(value = "/error")
//    public String error() { return "error.html"; }

}
