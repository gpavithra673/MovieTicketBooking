package com.movieTicketBooking.ticketBooking.Booked;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.movieTicketBooking.ticketBooking.Movie.Movie;
import com.movieTicketBooking.ticketBooking.Ticket.Ticket;
import jakarta.persistence.*;

@Entity
@Table
public class Booked {
    @Id
    @SequenceGenerator(
            name="booked_sequence",
            sequenceName = "booked_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "booked_sequence"
    )

    private Integer movie_id;
    private Integer ticket_id;
    private String movie_name;
    private String seat_name;
    private String seat_type;
    private String movie_time;

    public Booked(Integer movie_id, Integer ticket_id, String movie_name, String seat_name, String seat_type, String movie_time) {
        this.movie_id = movie_id;
        this.ticket_id = ticket_id;
        this.movie_name = movie_name;
        this.seat_name = seat_name;
        this.seat_type = seat_type;
        this.movie_time = movie_time;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getSeat_name() {
        return seat_name;
    }

    public void setSeat_name(String seat_name) {
        this.seat_name = seat_name;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    @Override
    public String toString() {
        return "Booked{" +
                "movie_id=" + movie_id +
                ", ticket_id=" + ticket_id +
                ", movie_name='" + movie_name + '\'' +
                ", seat_name='" + seat_name + '\'' +
                ", seat_type='" + seat_type + '\'' +
                ", movie_time='" + movie_time + '\'' +
                '}';
    }

    public Booked() {
    }

}
