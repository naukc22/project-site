package com.example.projectsite.controllers;

import com.example.projectsite.models.Reservation;
import com.example.projectsite.services.ReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping()
    public String index (@ModelAttribute("reservation") Reservation reservation) {
        return "test";
    }

    @PostMapping("")
    public String create(@ModelAttribute("reservation") @Valid Reservation reservation,
                         BindingResult bindingResult) {
        System.out.println(reservation.getId());
        System.out.println(reservation.getName());
        System.out.println(reservation.getSurname());
        System.out.println(reservation.getDate());
        System.out.println(reservation.getPhoneNumber());
        System.out.println(reservation.getService());
        if (bindingResult.hasErrors())
            return "reservation";

        reservationService.save(reservation);
        return "redirect:/index";
    }

}
