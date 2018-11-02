package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String getHomepage() {
        return "redirect:/home";
    }

}
