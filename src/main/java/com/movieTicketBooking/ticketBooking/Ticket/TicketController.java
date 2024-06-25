package com.movieTicketBooking.ticketBooking.Ticket;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/ticket")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/show")
    public Optional<Ticket> findTicket(@RequestParam Integer movie_id){
        return  ticketService.findTicket(movie_id);
    }

    @GetMapping("/get")
    public List<Ticket> showALlTicket(){
        return ticketService.showAll();
    }

    @PostMapping("/book")
    public void bookTicket(@RequestParam Integer movie_Id,@RequestParam Integer ticket_id,@RequestParam String seat_name,@RequestParam String seat_type){
        ticketService.bookTicket(movie_Id,ticket_id,seat_name,seat_type);
    }


}
