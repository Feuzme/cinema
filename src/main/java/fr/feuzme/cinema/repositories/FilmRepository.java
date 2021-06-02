package fr.feuzme.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.feuzme.cinema.models.Film;

public interface FilmRepository extends MongoRepository<Film, String> {

}
