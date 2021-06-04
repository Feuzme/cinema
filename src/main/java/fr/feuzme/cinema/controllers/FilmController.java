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

import fr.feuzme.cinema.models.Film;
import fr.feuzme.cinema.services.FilmService;
import fr.feuzme.cinema.services.GenericService;
import fr.feuzme.cinema.services.serviceimpl.FilmServiceImpl;

@RestController
@RequestMapping("films")
public class FilmController {
	@Autowired
	private FilmService filmService;
	
	@GetMapping()
	public List<Film> listAll(){
		return this.filmService.getAll();
	}
	
	@GetMapping("{id}")
	public Film listById(@PathVariable String id) {
		return this.filmService.getById(id);
	}
	
	@GetMapping("nom/{nom}")
	public List<Film> findByNomLike(@PathVariable String nom){
		return this.filmService.findByNom(nom);
	}
	
	@PostMapping()
	public Film add(@RequestBody Film film) {
		return this.filmService.add(film);
	}
	
	@PutMapping()
	public Film update(@RequestBody Film film) {
		return this.filmService.update(film);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.filmService.deleteById(id);
	}
}
