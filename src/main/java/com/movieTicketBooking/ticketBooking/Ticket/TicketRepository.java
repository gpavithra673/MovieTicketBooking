package com.movieTicketBooking.ticketBooking.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    @Query("SELECT mb FROM Movie mb WHERE mb.movie_name =?1")
    Optional<Ticket> findByName(String movie_name);
    @Query("SELECT t from Ticket t WHERE t.is_available = 0")
    Optional<Ticket> findByAvailability();
}
