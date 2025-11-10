package ru.shmelev.webbclinic.webclinc.model.entity;
import jakarta.persistence.*;
import ru.shmelev.webbclinic.webclinc.model.enums.AppointmentStatus;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appointment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @Column(name = "patient_name", nullable = false, length = 100)
    private String patientName;

    @Column(name = "patient_surname", nullable = false, length = 100)
    private String patientSurname;

    @Column(name = "patient_patronymic", length = 100)
    private String patientPatronymic;

    @Column(name = "patient_phone", nullable = false, length = 20)
    private String patientPhone;

    @Column(name = "is_existing_patient")
    private Boolean isExistingPatient = false;

    @Column(name = "appointment_date", nullable = false)
    private LocalDate appointmentDate;

    @Column(name = "appointment_time", nullable = false)
    private LocalTime appointmentTime;

    @Column(name = "type_service", nullable = false, length = 200)
    private String typeService;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AppointmentStatus status = AppointmentStatus.WAITING;

    @Column(name = "comments", length = 255)
    private String comments;

    public Appointment() {}

    public Appointment(Doctor doctor, String patientName, String patientSurname,
                       String patientPhone, LocalDate appointmentDate,
                       LocalTime appointmentTime, String typeService) {
        this.doctor = doctor;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientPhone = patientPhone;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.typeService = typeService;
    }
    
}