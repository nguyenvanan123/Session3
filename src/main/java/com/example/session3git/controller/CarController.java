package com.example.session3git.controller;

import com.example.session3git.model.Car;
import com.example.session3git.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    public CarService carService;


    @GetMapping()
    public String showhome ( Model model ) {
        List<Car> listcar = carService.getCarList ( );
        model.addAttribute ( "listcar", listcar );
        return "/home";
    }

    @GetMapping("/add")
    public String add ( Model model ) {
        Car car = new Car ( );
        model.addAttribute ( "car", car );
        return "/createcar";

    }

    @PostMapping("/create")
    public String create ( @ModelAttribute("car") Car car, RedirectAttributes redirectAttributes ) {

        carService.createCar ( car );
        return "redirect:/car";


    }

}
