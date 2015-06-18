package de.rizzicr.testing.springfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by rizzi on 27.05.15.
 */
@Controller
@ApiIgnore
public class UiController {

    @RequestMapping(value = "/")
    public String root() { return "redirect:/swagger-ui.html"; }

//    @RequestMapping(value = "/swagger-ui.html")
//    public String home() { return "swagger-ui.html"; }

//    @RequestMapping(value = "/error")
//    public String error() { return "error.html"; }

}
