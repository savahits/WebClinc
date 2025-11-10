package ru.shmelev.webbclinic.webclinc.service;

import org.springframework.stereotype.Component;
import ru.shmelev.webbclinic.webclinc.model.entity.Appointment;
import ru.shmelev.webbclinic.webclinc.repository.AppointmentRepository;

import java.util.List;

@Component
public class AppointmentService{
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }
}
