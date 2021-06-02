package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import fr.feuzme.cinema.models.Salle;
import fr.feuzme.cinema.repositories.SalleRepository;
import fr.feuzme.cinema.services.GenericService;

public class SalleServiceImpl implements GenericService<Salle> {
	@Autowired
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
		Salle salleBdd = this.salleRepo.findById(entity.getId()).get();

		entity.setNumero(entity.getNumero() == null ? salleBdd.getNumero() : entity.getNumero());
		entity.setPlaces(entity.getPlaces() == null ? salleBdd.getNumero() : entity.getNumero());
		entity.setCinema(entity.getCinema() == null ? salleBdd.getCinema() : entity.getCinema());

		return this.salleRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		this.salleRepo.deleteById(id);
	}
}
