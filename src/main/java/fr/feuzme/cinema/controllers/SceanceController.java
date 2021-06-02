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

import fr.feuzme.cinema.models.Sceance;
import fr.feuzme.cinema.services.GenericService;

@RestController
@RequestMapping("sceances")
public class SceanceController {
	@Autowired
	private GenericService<Sceance> sceanceService;
	
	@GetMapping()
	public List<Sceance> listAll(){
		return this.sceanceService.getAll();
	}
	
	@GetMapping("{id}")
	public Sceance listById(@PathVariable String id) {
		return this.sceanceService.getById(id);
	}
	
	@PostMapping()
	public Sceance add(@RequestBody Sceance sceance) {
		return this.sceanceService.add(sceance);
	}
	
	@PutMapping("{id}")
	public Sceance update(@PathVariable String id, @RequestBody Sceance sceance) {
		return this.sceanceService.update(sceance);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.sceanceService.deleteById(id);
	}
}
