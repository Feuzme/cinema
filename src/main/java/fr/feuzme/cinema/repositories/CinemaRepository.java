package fr.feuzme.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.feuzme.cinema.models.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String> {

}
