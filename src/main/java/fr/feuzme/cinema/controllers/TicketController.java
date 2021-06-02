package fr.feuzme.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.feuzme.cinema.models.Ticket;
import fr.feuzme.cinema.services.GenericService;
import fr.feuzme.cinema.services.TicketService;
import fr.feuzme.cinema.services.serviceimpl.TicketServiceImpl;

@RestController
@RequestMapping("tickets")
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@GetMapping()
	public List<Ticket> listAll(){
		return this.ticketService.getAll();
	}
	
	@GetMapping("{id}")
	public Ticket listById(@PathVariable String id) {
		return this.ticketService.getById(id);
	}
	
	@GetMapping("{id}/ticket")
	public String impTicket(@PathVariable String id) {
		return this.ticketService.generateTicket(id);
	}
	
	@PostMapping()
	public Ticket add(@RequestBody Ticket ticket) {
		return this.ticketService.add(ticket);
	}
	
	@PutMapping()
	public Ticket update(@RequestBody Ticket ticket) {
		return this.ticketService.update(ticket);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.ticketService.deleteById(id);
	}

}
