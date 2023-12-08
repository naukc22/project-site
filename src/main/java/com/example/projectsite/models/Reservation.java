package com.example.projectsite.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "reservation")
@Data
public class Reservation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Заполните имя")
        @Size(min = 2, max = 12, message = "Имя должно содержать от 2 до 12 символов")
    @Column(name = "name")
    private String name;

    @Size(min = 2, max = 12, message = "Фамилия должна содержать от 2 до 20 символов")
    @NotEmpty(message = "Заполните фамилию")
    @Column(name = "surname")
    private String surname;

    @Size(min = 11, max = 11, message = "Номер телефона должнен содержать от 11 символов")
    @NotEmpty(message = "Заполните номер телефона")
    @Column(name = "phoneNumber")
    private String phoneNumber;

    @NotEmpty(message = "Укажите услугу")
    @Column(name = "service")
    private String service;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "date")
    private Date date;

}
