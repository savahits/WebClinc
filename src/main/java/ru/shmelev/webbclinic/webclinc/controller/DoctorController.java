package ru.shmelev.webbclinic.webclinc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shmelev.webbclinic.webclinc.model.entity.Doctor;
import ru.shmelev.webbclinic.webclinc.model.enums.Specialization;
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

    @GetMapping("show/{id}")
    public String showDoctor(@PathVariable long id, Model model) {
        model.addAttribute("doctor", doctorService.findById(id));
        return "doctors/show";
    }

    @GetMapping("edit/{id}")
    public String editDoctor(@PathVariable long id, Model model) {
        model.addAttribute("doctor", doctorService.findById(id));
        model.addAttribute("specializations",  Specialization.values());
        return "doctors/edit";
    }

    @PatchMapping("{id}")
    public String editDoctor(@PathVariable long id, @ModelAttribute Doctor doctor) {
        doctorService.update(id, doctor);
        return "redirect:/doctors";
    }

    @PostMapping("{id}/delete")
    public String deleteDoctor(@PathVariable Long id) {
        doctorService.deleteById(id);
        return "redirect:/doctors";
    }
}
