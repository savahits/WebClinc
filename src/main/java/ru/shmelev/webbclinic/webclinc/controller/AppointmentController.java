package ru.shmelev.webbclinic.webclinc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shmelev.webbclinic.webclinc.service.AppointmentService;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping()
    public String appointments(Model model) {
        model.addAttribute("appointments", appointmentService.findAll());
        return "appointments/index";
    }
}
