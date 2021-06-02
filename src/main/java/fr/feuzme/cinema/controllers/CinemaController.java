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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.feuzme.cinema.models.Cinema;
import fr.feuzme.cinema.services.GenericService;

@RestController
@RequestMapping("cinemas")
public class CinemaController {
	@Autowired
	private GenericService<Cinema> cinemaService;
	
	@GetMapping()
	public List<Cinema> listAll(){
		return this.cinemaService.getAll();
	}
	
	@GetMapping("{id}")
	public Cinema listById(@PathVariable String id) {
		return this.cinemaService.getById(id);
	}
	
	@PostMapping()
	public Cinema add(@RequestBody Cinema cinema) {
		return this.cinemaService.add(cinema);
	}
	
	@PutMapping("{id}")
	public Cinema update(@PathVariable String id, @RequestBody Cinema cinema) {
		return this.cinemaService.update(cinema);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.cinemaService.deleteById(id);
	}
}
