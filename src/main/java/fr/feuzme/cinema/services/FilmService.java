package fr.feuzme.cinema.services;

import java.util.List;

import fr.feuzme.cinema.models.Film;

public interface FilmService extends GenericService<Film> {
	public List<Film> findByNom(String nom);
}
