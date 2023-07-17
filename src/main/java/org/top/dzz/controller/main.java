package org.top.dzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class main {

    @GetMapping("index")
    public String index(){
        return "index";
    }
    @GetMapping("dz")
    public String from(){
       return "form";
    }
    @PostMapping("dz")
    public String fopmPost(@RequestParam Double killometr,
                           @RequestParam Double metr,
                           @RequestParam Double mile,
                           RedirectAttributes ra){

        Double MetorKillometr= metr/1000;
        Double KillometrMetor= killometr*1000;
        Double MilleKillometr=mile*1.609;

        ra.addFlashAttribute("KillometrMetor",MetorKillometr);
        ra.addFlashAttribute("MetorKillometr",KillometrMetor);
        ra.addFlashAttribute("MilleKillometr",MilleKillometr);
        return "redirect:dz";
    }
}
