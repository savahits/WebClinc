package ru.shmelev.webbclinic.webclinc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shmelev.webbclinic.webclinc.model.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
