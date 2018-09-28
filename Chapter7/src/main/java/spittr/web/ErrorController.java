package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/error")
@Controller
public class ErrorController {

    @RequestMapping(value = "/duplicate", method = RequestMethod.GET)
    public String handleDuplicate() {
        return "duplicate";
    }
}
