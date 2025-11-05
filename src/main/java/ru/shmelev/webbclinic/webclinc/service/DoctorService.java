package ru.shmelev.webbclinic.webclinc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shmelev.webbclinic.webclinc.model.Doctor;
import ru.shmelev.webbclinic.webclinc.repository.DoctorRepository;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
