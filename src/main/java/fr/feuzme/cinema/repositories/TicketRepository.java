package fr.feuzme.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.feuzme.cinema.models.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}
