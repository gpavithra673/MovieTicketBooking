package com.movieTicketBooking.ticketBooking.Movie;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table
public class Movie {
    public Movie() {
    }

    @Id
    @SequenceGenerator(
            name="movie_sequence",
            sequenceName = "moviedb_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private Integer id;
    private String movie_name;
    private String movie_genre;
    private LocalDateTime movie_time;

    public Movie(Integer id, String movie_name, String movie_genre, LocalDateTime movie_time) {
        this.id = id;
        this.movie_name = movie_name;
        this.movie_genre = movie_genre;
        this.movie_time = movie_time;
    }

    public Integer getId() {
        return id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public String getMovie_genre() {
        return movie_genre;
    }

    public LocalDateTime getMovie_time() {
        return movie_time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public void setMovie_genre(String movie_genre) {
        this.movie_genre = movie_genre;
    }

    public void setMovie_time(LocalDateTime movie_time) {
        this.movie_time = movie_time;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movie_name='" + movie_name + '\'' +
                ", movie_genre='" + movie_genre + '\'' +
                ", movie_time=" + movie_time +
                '}';
    }
}