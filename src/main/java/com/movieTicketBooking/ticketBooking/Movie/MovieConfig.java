package com.movieTicketBooking.ticketBooking.Movie;

import com.movieTicketBooking.ticketBooking.Ticket.Ticket;
import com.movieTicketBooking.ticketBooking.Ticket.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class MovieConfig {
    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository, TicketRepository ticketRepository){
        return args -> {
            Movie movie1= new Movie(
                    1,
                    "Elemental",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie2= new Movie(
                    2,
                    "Ratatouille",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie3= new Movie(
                    3,
                    "Home Alone",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie4= new Movie(
                    4,
                    "Home Alone 2",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie5= new Movie(
                    5,
                    "Home Alone 3",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie6= new Movie(
                    6,
                    "Haunted Mansion",
                    "Family,Horror",
                    LocalDateTime.now()
            );
            Movie movie7= new Movie(
                    7,
                    "CoCo",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie8= new Movie(
                    8,
                    "Alladin",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie9= new Movie(
                    9,
                    "Turning into Red",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie10= new Movie(
                    10,
                    "Luca",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie11= new Movie(
                    11,
                    "Enchanto",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie12= new Movie(
                    12,
                    "Zootopia",
                    "Family,Culinary",
                    LocalDateTime.now()
            );Movie movie13= new Movie(
                    13,
                    "Inside out",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie14= new Movie(
                    14,
                    "Soul",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie15= new Movie(
                    15,
                    "Brave",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie16= new Movie(
                    16,
                    "Up",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie17= new Movie(
                    17,
                    "Big Hero 6",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie18= new Movie(
                    18,
                    "Raya and the last Dragon",
                    "Family,Culinary",
                    LocalDateTime.now()
            );
            Movie movie19= new Movie(
                    19,
                    "Moana",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie20= new Movie(
                    20,
                    "Onward",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie21= new Movie(
                    21,
                    "Epic",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie22= new Movie(
                    22,
                    "Rio",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie23= new Movie(
                    23,
                    "Rio 2",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie24= new Movie(
                    24,
                    "Strange world",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie25= new Movie(
                    25,
                    "Tangled",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie26= new Movie(
                    26,
                    "Finding Nemo",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie27= new Movie(
                    27,
                    "Journey to the centre of the earth",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie28= new Movie(
                    28,
                    "Journey to the mysterious Island",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie29= new Movie(
                    29,
                    "Mulan",
                    "Family",
                    LocalDateTime.now()
            );
            Movie movie30= new Movie(
                    30,
                    "The Good Dinosaur",
                    "Family",
                    LocalDateTime.now()
            );

            movieRepository.saveAll(
                    List.of(movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15,
                            movie16,movie17,movie18,movie19,movie20,movie21,movie22,movie23,movie24,movie25,movie26,movie27,movie28,movie29,movie30)
            );
            Ticket ticket1p= new Ticket(
                    1,
                    "1P",
                    "Premium",
                    0
            );
            Ticket ticket1c= new Ticket(
                    2,
                    "1C",
                    "Common",
                    0
            );
            Ticket ticket2p= new Ticket(
                    3,
                    "2P",
                    "Premium",
                    0
            );
            Ticket ticket2c= new Ticket(
                    4,
                    "2C",
                    "Common",
                    0
            );
            Ticket ticket3p= new Ticket(
                    5,
                    "3P",
                    "Premium",
                    0
            );
            Ticket ticket3c= new Ticket(
                    6,
                    "3C",
                    "Common",
                    0
            );
            Ticket ticket4p= new Ticket(
                    7,
                    "4P",
                    "Premium",
                    0
            );
            Ticket ticket4c= new Ticket(
                    8,
                    "4C",
                    "Common",
                    0
            );
            Ticket ticket5p= new Ticket(
                    9,
                    "5P",
                    "Premium",
                    0
            );
            Ticket ticket5c= new Ticket(
                    10,
                    "5C",
                    "Common",
                    0
            );
            Ticket ticket6p= new Ticket(
                    11,
                    "6P",
                    "Premium",
                    0
            );
            Ticket ticket6c= new Ticket(
                    12,
                    "6C",
                    "Common",
                    0
            );
            Ticket ticket7p= new Ticket(
                    13,
                    "7P",
                    "Premium",
                    0
            );
            Ticket ticket7c= new Ticket(
                    14,
                    "7C",
                    "Common",
                    0
            );
            Ticket ticket8p= new Ticket(
                    15,
                    "8P",
                    "Premium",
                    0
            );
            Ticket ticket8c= new Ticket(
                    16,
                    "8C",
                    "Common",
                    0
            );
            Ticket ticket9p= new Ticket(
                    17,
                    "9P",
                    "Premium",
                    0
            );
            Ticket ticket9c= new Ticket(
                    18,
                    "9C",
                    "Common",
                    0
            );
            Ticket ticket10p= new Ticket(
                    19,
                    "10P",
                    "Premium",
                    0
            );
            Ticket ticket10c= new Ticket(
                    20,
                    "10C",
                    "Common",
                    0
            );
            Ticket ticket11p= new Ticket(
                    21,
                    "11P",
                    "Premium",
                    0
            );
            Ticket ticket11c= new Ticket(
                    22,
                    "11C",
                    "Common",
                    0
            );
            Ticket ticket12p= new Ticket(
                    23,
                    "12P",
                    "Premium",
                    0
            );
            Ticket ticket12c= new Ticket(
                    24,
                    "12C",
                    "Common",
                    0
            );
            Ticket ticket13p= new Ticket(
                    25,
                    "13P",
                    "Premium",
                    0
            );
            Ticket ticket13c= new Ticket(
                    26,
                    "13C",
                    "Common",
                    0
            );
            Ticket ticket14p= new Ticket(
                    27,
                    "14P",
                    "Premium",
                    0
            );
            Ticket ticket14c= new Ticket(
                    28,
                    "14C",
                    "Common",
                    0
            );
            Ticket ticket15p= new Ticket(
                    29,
                    "15P",
                    "Premium",
                    0
            );
            Ticket ticket15c= new Ticket(
                    30,
                    "15C",
                    "Common",
                    0
            );
            Ticket ticket16p= new Ticket(
                    31,
                    "16P",
                    "Premium",
                    0
            );
            Ticket ticket16c= new Ticket(
                    32,
                    "16C",
                    "Common",
                    0
            );
            Ticket ticket17p= new Ticket(
                    33,
                    "17P",
                    "Premium",
                    0
            );
            Ticket ticket17c= new Ticket(
                    34,
                    "17C",
                    "Common",
                    0
            );
            Ticket ticket18p= new Ticket(
                    35,
                    "18P",
                    "Premium",
                    0
            );
            Ticket ticket18c= new Ticket(
                    36,
                    "18C",
                    "Common",
                    0
            );
            Ticket ticket19p= new Ticket(
                    37,
                    "19P",
                    "Premium",
                    0
            );
            Ticket ticket19c= new Ticket(
                    38,
                    "19C",
                    "Common",
                    0
            );
            Ticket ticket20p= new Ticket(
                    39,
                    "20P",
                    "Premium",
                    0
            );
            Ticket ticket20c= new Ticket(
                    40,
                    "20C",
                    "Common",
                    0
            );
            ticketRepository.saveAll(List.of(ticket1p,ticket1c,ticket2p,ticket2c,ticket3p,ticket3c,ticket4p,ticket4c,ticket5p,ticket5c,
                    ticket6p, ticket6c,ticket7p,ticket7c,ticket8p,ticket8c,ticket9p,ticket9c,ticket10p,ticket10c,ticket11p,ticket11c,
                    ticket12p,ticket12c,ticket13p,ticket13c,ticket14p,ticket14c,ticket15p,ticket15c, ticket16p,ticket16c,ticket17p,
                    ticket17c,ticket18p,ticket18c,ticket19p,ticket19c,ticket20p,ticket20c));
        };
    }
}
