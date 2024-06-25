package com.movieTicketBooking.ticketBooking.Booked;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/booked")
public class BookedController {
    private final BookedService bookedService;

    public BookedController(BookedService bookedService) {
        this.bookedService = bookedService;
    }

    @GetMapping("/get")
    public List<Booked> getAll(){
        return bookedService.findAll();

    }
}
