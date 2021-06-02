package fr.feuzme.cinema.services;

import fr.feuzme.cinema.models.Ticket;

public interface TicketService extends GenericService<Ticket> {
	public String generateTicket(String id);
}
