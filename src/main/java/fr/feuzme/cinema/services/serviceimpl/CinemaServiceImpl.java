package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.feuzme.cinema.models.Cinema;
import fr.feuzme.cinema.repositories.CinemaRepository;
import fr.feuzme.cinema.services.GenericService;

public class CinemaServiceImpl implements GenericService<Cinema> {

	@Autowired
	private CinemaRepository cinemaRepo;
	@Override
	public List<Cinema> getAll() {
		// TODO Auto-generated method stub
		return this.cinemaRepo.findAll();
	}

	@Override
	public Cinema getById(String id) {
		// TODO Auto-generated method stub
		return this.cinemaRepo.findById(id).get();
	}

	@Override
	public Cinema add(Cinema entity) {
		// TODO Auto-generated method stub
		return this.cinemaRepo.save(entity);
	}

	@Override
	public Cinema update(Cinema entity) {
		// TODO Auto-generated method stub
		return this.cinemaRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		this.cinemaRepo.deleteById(id);
	}

}
