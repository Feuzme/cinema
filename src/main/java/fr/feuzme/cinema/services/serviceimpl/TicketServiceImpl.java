package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.feuzme.cinema.models.Ticket;
import fr.feuzme.cinema.repositories.TicketRepository;
import fr.feuzme.cinema.services.GenericService;
import fr.feuzme.cinema.services.TicketService;

public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepository ticketRepo;
	
	@Override
	public List<Ticket> getAll() {
		// TODO Auto-generated method stub
		return this.ticketRepo.findAll();
	}

	@Override
	public Ticket getById(String id) {
		// TODO Auto-generated method stub
		return this.ticketRepo.findById(id).get();
	}

	@Override
	public Ticket add(Ticket entity) {
		// TODO Auto-generated method stub
		return this.ticketRepo.save(entity);
	}

	@Override
	public Ticket update(Ticket entity) {
		// TODO Auto-generated method stub
		return this.ticketRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		this.ticketRepo.deleteById(id);
	}
	
	public String generateTicket(String id) {
		Ticket ticket = this.ticketRepo.findById(id).get();
		String impTicket = "Commande : " + ticket.getSceance().getId()+
				"\nFilm : " + ticket.getSceance().getFilm().getNom() + 
				"\nDebut : " + ticket.getSceance().getDateDebut() +
				"\nFin : " + (ticket.getSceance().getDateDebut().plusMinutes(ticket.getSceance().getFilm().getDuree()));
		return impTicket;
	}
	
}
