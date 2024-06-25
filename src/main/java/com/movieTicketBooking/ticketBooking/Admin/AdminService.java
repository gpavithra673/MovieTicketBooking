package com.movieTicketBooking.ticketBooking.Admin;

import com.movieTicketBooking.ticketBooking.Movie.Movie;
import com.movieTicketBooking.ticketBooking.Movie.MovieRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AdminService {
    private final MovieRepository movieRepository;

    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovieByName(String movie_name){
        return movieRepository.findMovieByName(movie_name);
    }
    public void addMovie(Movie movie){
        Optional<Movie> moviePresent = movieRepository.findMovieByName(movie.getMovie_name());
        if (moviePresent.isPresent()){
            throw new IllegalStateException("Movie Already Exists");
        }
        movieRepository.save(movie);
    }
    @Transactional
    public void updateMovie(Integer movie_id, String movie_name, String movie_genre){
        Movie movie = movieRepository.findById(movie_id)
                .orElseThrow(()-> new IllegalStateException("Movie Not found"));
        if (movie_name!= null && movie_name.length()>0 && !Objects.equals(movie.getMovie_name(),movie_name)){
            movie.setMovie_name(movie_name);
        }
        if (movie_genre!= null && movie_genre.length()>0 && !Objects.equals(movie.getMovie_genre(),movie_genre)){
            movie.setMovie_genre(movie_genre);
        }
    }
    public void deleteMovie(Integer movie_id){
        Movie movie = movieRepository.findById(movie_id)
                .orElseThrow(()-> new IllegalStateException("Movie Not found"));
        movieRepository.deleteById(movie_id);
    }
}
