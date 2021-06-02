package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import fr.feuzme.cinema.models.Salle;
import fr.feuzme.cinema.repositories.SalleRepository;
import fr.feuzme.cinema.services.GenericService;

public class SalleServiceImpl implements GenericService<Salle> {
	private SalleRepository salleRepo;
	@Override
	public List<Salle> getAll() {
		// TODO Auto-generated method stub
		return this.salleRepo.findAll();
	}

	@Override
	public Salle getById(String id) {
		// TODO Auto-generated method stub
		return this.salleRepo.findById(id).get();
	}

	@Override
	public Salle add(Salle entity) {
		// TODO Auto-generated method stub
		return this.salleRepo.save(entity);
	}

	@Override
	public Salle update(@RequestBody Salle entity) {
		// TODO Auto-generated method stub
		return this.salleRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		this.salleRepo.deleteById(id);
	}
	
}
