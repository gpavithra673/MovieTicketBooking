package com.movieTicketBooking.ticketBooking.Movie;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){

        return movieRepository.findAll();
    }
    //    public Optional<Movie> findByName(String movie_name){
//        return movieRepository.findByMovieName(movie_name);
//    }
//
    public void addMovie(Movie movie) {
        Optional<Movie> movieByName= movieRepository.findMovieByName(movie.getMovie_name());
        if (movieByName.isPresent()){
            throw new IllegalStateException("Movie found");
        }
        movieRepository.save(movie);
    }

    public void deleteMovie(Integer movieId) {
        boolean exists= movieRepository.existsById(movieId);
        if(!exists) {
            throw new IllegalStateException((
                    "Movie with ID " + movieId + "not found"
            ));
        }
        movieRepository.deleteById(movieId);
    }
    @Transactional
    public  void updateMovie(Integer id, String movieName, String movieGenre){
        Movie movie = movieRepository.findById(id)
                .orElseThrow(()-> new IllegalStateException("Movie with id "+ id + " does not exists"));
        if (movieName!= null && movieName.length()>0 && !Objects.equals(movie.getMovie_name(),movieName)){
            movie.setMovie_name(movieName);
        }
        if (movieGenre!= null && movieGenre.length()>0 && !Objects.equals(movie.getMovie_genre(),movieGenre)){
            movie.setMovie_genre(movieGenre);
        }
    }

}