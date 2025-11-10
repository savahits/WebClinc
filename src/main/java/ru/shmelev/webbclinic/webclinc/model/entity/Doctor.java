package ru.shmelev.webbclinic.webclinc.model.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.Size;
import lombok.NonNull;
import ru.shmelev.webbclinic.webclinc.model.enums.Specialization;
import java.lang.Long;

@Entity
@Table(name = "doctor")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    @NonNull
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    @Size(min = 2, max = 100, message = "Длина имени должна быть не меньше 2 и не больше 100")
    private String name;

    @Column(name = "surname", nullable = false, length = 100)
    @Size(min = 2, max = 100, message = "Длина фамилии должна быть не меньше 2 и не больше 100")
    private String surname;

    @Column(name = "patronymic", length = 100)
    private String patronymic;

    @Enumerated(EnumType.STRING)
    @Column(name = "specialization")
    private Specialization specialization;

    // Конструкторы
    public Doctor() {
    }

    public Doctor(String name, String surname, String patronymic, Specialization specialization) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.specialization = specialization;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}