package com.movieTicketBooking.ticketBooking.Admin;

import com.movieTicketBooking.ticketBooking.Movie.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/get")
    public List<Movie> getAllMovies(){
        return adminService.getAllMovies();
    }

    @PostMapping("/add")
    public void addMovies(@RequestBody Movie movie){

        adminService.addMovie(movie);
    }

    @PutMapping("/update/{movieId}")
    public void updateMovies(
            @PathVariable("movieId") Integer movieId,
            @RequestParam(required = false) String movieName,
            @RequestParam(required = false) String movieGenre){
        adminService.updateMovie(movieId,movieName,movieGenre);
    }

    @DeleteMapping("/delete/{movieId}")
    public void deleteMovies(@PathVariable("movieId") Integer movieId){
        adminService.deleteMovie(movieId);
    }


}
