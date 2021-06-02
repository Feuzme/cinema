package fr.feuzme.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.feuzme.cinema.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String> {

}
