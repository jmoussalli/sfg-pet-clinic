package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package :  guru.springframework.sfgpetclinic.controllers
 * Created by jerom on 07/12/2020 at 13:57
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/","index","index.html"})
    public String index() {

        return "Index";
    }
}
