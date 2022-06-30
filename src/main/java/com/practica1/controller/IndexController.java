package com.practica1.controller;

import com.practica1.dao.CapitalDao;
import com.practica1.domain.Capital;
import com.practica1.service.CapitalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private CapitalService capitalService;

    @GetMapping("/")
    public String inicio(Model model) {       
        var capital = capitalService.getCapital();
        model.addAttribute("capital",capital);
        return "index";
    }
    
    @GetMapping("/nuevaCapital")
    public String nuevoCliente(Capital capital){
        return "modificarCapital";
    }
    
    @PostMapping("/guardarCapital")
    public String guardarCapital(Capital capital){
        capitalService.save(capital);
        return "redirect:/";
    }
    
    @GetMapping("/modificarCapital/{idCapital}")
    public String modificarCapital(Capital capital, Model model){
        capital = capitalService.getCapital(capital);
        model.addAttribute("capital", capital);
        return "modificarCapital";
    }
    
    @GetMapping("/eliminarCapital/{idCapital}")
    public String eliminarCapital(Capital capital){
        capitalService.delete(capital);
        return "redirect:/";
    }
    
}
