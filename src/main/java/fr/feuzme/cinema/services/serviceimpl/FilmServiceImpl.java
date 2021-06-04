package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.feuzme.cinema.models.Film;
import fr.feuzme.cinema.repositories.FilmRepository;
import fr.feuzme.cinema.services.FilmService;
import fr.feuzme.cinema.services.GenericService;

public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepo;
	
	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return this.filmRepo.findAll();
	}

	@Override
	public Film getById(String id) {
		return this.filmRepo.findById(id).get();
	}

	@Override
	public Film add(Film entity) {
		return this.filmRepo.save(entity);
	}

	@Override
	public Film update(Film entity) {
		Film filmBdd = this.filmRepo.findById(entity.getId()).get();
		
		entity.setNom(entity.getNom() == null ? filmBdd.getNom() : entity.getNom());
		entity.setDuree(entity.getDuree() == null ? filmBdd.getDuree() : entity.getDuree());
		
		return this.filmRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		this.filmRepo.deleteById(id);
	}

	@Override
	public List<Film> findByNom(String nom) {
		// TODO Auto-generated method stub
		return this.filmRepo.findByNomLike(nom);
	}

}
