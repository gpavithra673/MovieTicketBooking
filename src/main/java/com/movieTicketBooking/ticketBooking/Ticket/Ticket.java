package com.movieTicketBooking.ticketBooking.Ticket;

import com.movieTicketBooking.ticketBooking.Booked.Booked;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Ticket {
    @Id
    @SequenceGenerator(
            name="ticket_sequence",
            sequenceName = "ticket_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ticket_sequence"
    )
    private Integer ticket_num;
    private String seat_name;
    private String seat_type;
    private Integer is_available;

    public Ticket(Integer ticket_num, String seat_name, String seat_type, Integer is_available) {
        this.ticket_num = ticket_num;
        this.seat_name = seat_name;
        this.seat_type = seat_type;
        this.is_available = is_available;
    }

    public Integer getTicket_num() {
        return ticket_num;
    }

    public void setTicket_num(Integer ticket_num) {
        this.ticket_num = ticket_num;
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

    public Integer getIs_available() {
        return is_available;
    }

    public void setIs_available(Integer is_available) {
        this.is_available = is_available;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket_num=" + ticket_num +
                ", seat_name='" + seat_name + '\'' +
                ", seat_type='" + seat_type + '\'' +
                ", is_available=" + is_available +
                '}';
    }
    public Ticket(){

    }
}

