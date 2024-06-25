package com.movieTicketBooking.ticketBooking.Booked;

import com.movieTicketBooking.ticketBooking.Movie.Movie;
import com.movieTicketBooking.ticketBooking.Movie.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookedService {
    private final BookedRepository bookedRepository;
    private final MovieRepository movieRepository;

    public BookedService(BookedRepository bookedRepository, MovieRepository movieRepository) {
        this.bookedRepository = bookedRepository;
        this.movieRepository = movieRepository;
    }

    public void addBookedTicket(Integer movie_Id,Integer ticket_id,String seat_name, String seat_type){
        boolean checkTicket= bookedRepository.existsById(ticket_id);
        if(checkTicket){
            throw new IllegalStateException("Ticket Already Booked");
        }
        Optional<Movie> movie = movieRepository.findById(movie_Id);
        if (movie.isEmpty()){
            throw new IllegalStateException("No movie Found by given ID!!");
        }
        Movie movieGotByID= movie.get();
        Booked bookTicket= new Booked( movie_Id, ticket_id,movieGotByID.getMovie_name(),seat_name,seat_type,"7:00 pm");
        bookedRepository.save(bookTicket);
    }

    public List<Booked> findAll() {
        return bookedRepository.findAll();
    }
}
