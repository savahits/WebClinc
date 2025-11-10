package ru.shmelev.webbclinic.webclinc.model.enums;

public enum AppointmentStatus {
    WAITING("Ожидаем"),
    ARRIVED("Прибыл");

    private final String displayName;

    AppointmentStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}