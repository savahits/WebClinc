package ru.shmelev.webbclinic.webclinc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shmelev.webbclinic.webclinc.model.entity.Doctor;
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

    public void save(Doctor doctor) {
         doctorRepository.save(doctor);
    }

    public Doctor findById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Доктор не найден"));
    }
    public void update(Long id, Doctor doctor) {
        Doctor updateDoctor =  doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Доктор не найден"));

        updateDoctor.setName(doctor.getName());
        updateDoctor.setSurname(doctor.getSurname());
        updateDoctor.setPatronymic(doctor.getPatronymic());
        updateDoctor.setSpecialization(doctor.getSpecialization());

        doctorRepository.save(updateDoctor);
    }

    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }
}
