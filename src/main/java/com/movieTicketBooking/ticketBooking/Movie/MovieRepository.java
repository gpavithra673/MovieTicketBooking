package com.movieTicketBooking.ticketBooking.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("SELECT mb FROM Movie mb WHERE mb.movie_name =?1")
    Optional<Movie> findMovieByName(String movieName);

    @Query("SELECT mb FROM Movie mb WHERE mb.movie_name =?1")
    Optional<Movie> searchMovieByName(String movie_name);

}
