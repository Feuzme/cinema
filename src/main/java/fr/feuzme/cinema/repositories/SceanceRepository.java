package fr.feuzme.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.feuzme.cinema.models.Sceance;

public interface SceanceRepository extends MongoRepository<Sceance, String>{

}
