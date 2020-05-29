package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Converter {
    @GetMapping("/converter")
    public String convertForm() {
        return "convert";
    }

    @PostMapping("/converter")
    public ModelAndView convert(float usd, float rate) {
        ModelAndView modelAndView = new ModelAndView("convert");
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("result", rate * usd);

        return modelAndView;
    }
}
