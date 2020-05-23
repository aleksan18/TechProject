package com.example.demo.Controller;

import com.example.demo.Model.Apartment;
import com.example.demo.Service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class HomeController {


    @Autowired
    ApartmentService apartmentService;

    @GetMapping("/")
    public String index(Model model){
        List<Apartment> apartmentList = apartmentService.fetchAll();
        model.addAttribute("apartments", apartmentList);
        return "home/index";
    }

    @GetMapping("/create")
    public  String create(){
        return "home/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Apartment apartment){
        apartmentService.addApartment(apartment);
        return "redirect:/";

    }

    @GetMapping("/viewOne/{apID}")
    public String viewOne(@PathVariable("apID") int apID, Model model){
        model.addAttribute("apartment", apartmentService.findApartmentById(apID));
        return "home/viewOne";
    }
}
