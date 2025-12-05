package ru.shmelev.webbclinic.webclinc.model.enums;

public enum Role {
    ROLE_SUPER_ADMIN,  // Супер-админ: всё + управление ролями
    ROLE_ADMIN,        // Админ: CRUD операции
    ROLE_USER          // Обычный пользователь (если нужно)
}