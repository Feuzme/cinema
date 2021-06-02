package fr.feuzme.cinema.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.feuzme.cinema.models.Sceance;
import fr.feuzme.cinema.repositories.SceanceRepository;
import fr.feuzme.cinema.services.GenericService;

public class SceanceServiceImpl implements GenericService<Sceance> {

	@Autowired
	private SceanceRepository sceanceRepo;
	
	@Override
	public List<Sceance> getAll() {
		return this.sceanceRepo.findAll();
	}

	@Override
	public Sceance getById(String id) {
		// TODO Auto-generated method stub
		return this.sceanceRepo.findById(id).get();
	}

	@Override
	public Sceance add(Sceance entity) {
		// TODO Auto-generated method stub
		return this.sceanceRepo.save(entity);
	}

	@Override
	public Sceance update(Sceance entity) {
		// TODO Auto-generated method stub
		return this.sceanceRepo.save(entity);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		this.sceanceRepo.deleteById(id);
	}	
}
