package fr.feuzme.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.feuzme.cinema.models.Cinema;
import fr.feuzme.cinema.models.Film;
import fr.feuzme.cinema.models.Salle;
import fr.feuzme.cinema.models.Sceance;
import fr.feuzme.cinema.models.Ticket;
import fr.feuzme.cinema.services.FilmService;
import fr.feuzme.cinema.services.GenericService;
import fr.feuzme.cinema.services.TicketService;
import fr.feuzme.cinema.services.serviceimpl.CinemaServiceImpl;
import fr.feuzme.cinema.services.serviceimpl.FilmServiceImpl;
import fr.feuzme.cinema.services.serviceimpl.SalleServiceImpl;
import fr.feuzme.cinema.services.serviceimpl.SceanceServiceImpl;
import fr.feuzme.cinema.services.serviceimpl.TicketServiceImpl;

@Configuration
public class ServicesConfig {
	@Bean
	public FilmService filmService() {
		return new FilmServiceImpl();
	}
	
	@Bean
	public GenericService<Cinema> cinemaService(){
		return new CinemaServiceImpl();
	}
	
	@Bean
	public GenericService<Salle> salleService(){
		return new SalleServiceImpl();
	}
	
	@Bean
	public GenericService<Sceance> sceanceService(){
		return new SceanceServiceImpl();
	}
	
	@Bean
	public TicketService ticketService(){
		return new TicketServiceImpl();
	}
}
