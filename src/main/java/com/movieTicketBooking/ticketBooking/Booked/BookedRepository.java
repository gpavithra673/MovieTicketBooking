package com.movieTicketBooking.ticketBooking.Booked;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedRepository extends JpaRepository<Booked, Integer> {

}
