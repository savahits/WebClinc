package ru.shmelev.webbclinic.webclinc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shmelev.webbclinic.webclinc.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
