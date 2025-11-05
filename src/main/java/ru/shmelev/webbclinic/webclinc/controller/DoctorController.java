package ru.shmelev.webbclinic.webclinc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shmelev.webbclinic.webclinc.repository.DoctorRepository;
import ru.shmelev.webbclinic.webclinc.service.DoctorService;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping()
    public String doctors(Model model) {
        model.addAttribute("doctors", doctorService.findAll());
        return "doctors/index";
    }
}
