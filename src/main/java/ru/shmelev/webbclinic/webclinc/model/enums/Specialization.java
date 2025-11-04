package ru.shmelev.webbclinic.webclinc.model.enums;

public enum Specialization {
    UNIVERSAL("Универсал"),
    THERAPIST("Терапист"),
    ORTHOPEDIST("Ортопед"),
    SURGEON("Хирург");

    private final String displayName;

    Specialization(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
