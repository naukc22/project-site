package com.example.projectsite.repositories;

import com.example.projectsite.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {



}
