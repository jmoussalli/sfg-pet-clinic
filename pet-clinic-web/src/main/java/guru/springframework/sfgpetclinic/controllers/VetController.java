package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package :  guru.springframework.sfgpetclinic.controllers
 * Created by jerom on 07/12/2020 at 17:46
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
