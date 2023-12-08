package com.example.projectsite.services;

import com.example.projectsite.models.Reservation;
import com.example.projectsite.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }



    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
