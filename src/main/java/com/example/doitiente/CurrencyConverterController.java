package com.example.doitiente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyConverterController {
@GetMapping("/Converter")
    public String Converter(){
    return "converter";
    }
@PostMapping("/usd")
    public ModelAndView result(@RequestParam double tiGia,
                               @RequestParam double usd){
    double vnd = tiGia * usd;
    ModelAndView modelAndView= new ModelAndView("result");
    modelAndView.addObject("vnd",vnd);
    modelAndView.addObject("tiGia",tiGia);
    modelAndView.addObject("usd",usd);
    return modelAndView;
}

}
