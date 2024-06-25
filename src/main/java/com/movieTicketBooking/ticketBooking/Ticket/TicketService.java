package com.movieTicketBooking.ticketBooking.Ticket;

import com.movieTicketBooking.ticketBooking.Booked.BookedRepository;
import com.movieTicketBooking.ticketBooking.Booked.BookedService;
import com.movieTicketBooking.ticketBooking.Movie.Movie;
import com.movieTicketBooking.ticketBooking.Movie.MovieRepository;
import com.movieTicketBooking.ticketBooking.Movie.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final MovieRepository movieRepository;
    private final BookedRepository bookedRepository;
    private final BookedService bookedService;
    public TicketService(TicketRepository ticketRepository, MovieRepository movieRepository, BookedRepository bookedRepository, MovieService movieService, BookedService bookedService) {
        this.ticketRepository = ticketRepository;
        this.movieRepository = movieRepository;
        this.bookedRepository = bookedRepository;
        this.bookedService = bookedService;
    }


    public Optional<Ticket> findTicket(Integer movieId) {
        boolean exists= movieRepository.existsById(movieId);
        if (!exists){
            throw new IllegalStateException("Invalid Movie Id");
        }
        Optional<Ticket> available = ticketRepository.findByAvailability();
        if (available.isEmpty()){
            throw new IllegalStateException("No seats Available");
        }
        return available;
    }

    public List<Ticket> showAll(){

        return ticketRepository.findAll();
    }

    public void bookTicket(Integer movie_Id,Integer ticket_id,String seat_name, String seat_type){
        Ticket ticket= ticketRepository.findById(ticket_id)
                .orElseThrow(() -> new IllegalStateException("Invalid Ticket Id"));
        Movie movie=movieRepository.findById(movie_Id)
                .orElseThrow(()-> new IllegalStateException("Invalid Movie Id"));
        Integer ticket_to_book_is_available= ticket.getIs_available();

        if (ticket_to_book_is_available==1){
            throw new IllegalStateException("Ticket is booked");
        }
        ticket.setIs_available(1);
        ticketRepository.save(ticket);
        bookedService.addBookedTicket(movie_Id,ticket_id,seat_name,seat_type);

    }
}
