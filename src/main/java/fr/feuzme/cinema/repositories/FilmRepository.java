package fr.feuzme.cinema.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.feuzme.cinema.models.Film;

public interface FilmRepository extends MongoRepository<Film, String> {
	//mongo repo sait que lorsqu'on nomme une méthode :
	//	find = il fait un "select" dans la base et que le 
	// 	By est suivi de "NomDuChampATrouver"
	public List<Film> findByNomLike(String nom);
}
