package fr.feuzme.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.feuzme.cinema.models.Salle;
import fr.feuzme.cinema.services.GenericService;

@RestController
@RequestMapping("salles")
public class SalleController {
	@Autowired
	private GenericService<Salle> salleService;
	
	@GetMapping()
	public List<Salle> listAll(){
		return this.salleService.getAll();
	}
	
	@GetMapping("{id}")
	public Salle findById(@PathVariable String id) {
		return this.salleService.getById(id);
	}
	
	@PostMapping()
	public Salle add(@RequestBody Salle salle) {
		return this.salleService.add(salle);
	}
	
	@PutMapping()
	public Salle update(@RequestBody Salle salle) {
		return this.salleService.update(salle);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.salleService.deleteById(id);
	}
}
