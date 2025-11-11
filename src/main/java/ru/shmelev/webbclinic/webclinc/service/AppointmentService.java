package ru.shmelev.webbclinic.webclinc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.shmelev.webbclinic.webclinc.model.entity.Appointment;
import ru.shmelev.webbclinic.webclinc.repository.AppointmentRepository;

import java.util.List;

@Service
public class AppointmentService{
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }
}
