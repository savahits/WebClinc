package ru.shmelev.webbclinic.webclinc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shmelev.webbclinic.webclinc.model.Doctor;
import ru.shmelev.webbclinic.webclinc.model.enums.Specialization;
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

    @GetMapping("/new")
    public String newDoctor(Model model) {
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("specializations",  Specialization.values());
        return "doctors/new";
    }

    @PostMapping
    public String newDoctor(@ModelAttribute Doctor doctor) {
        doctorService.save(doctor);
        return "redirect:/doctors";
    }
}
