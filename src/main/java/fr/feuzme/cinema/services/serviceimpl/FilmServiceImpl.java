package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.feuzme.cinema.models.Film;
import fr.feuzme.cinema.repositories.FilmRepository;
import fr.feuzme.cinema.services.GenericService;

public class FilmServiceImpl implements GenericService<Film> {

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
		return this.filmRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		this.filmRepo.deleteById(id);
	}

}
