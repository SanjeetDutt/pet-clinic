package in.sanjeetdutt.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    @RequestMapping({"","/index"})
    public String index(){
        return "vet/index";
    }
}
