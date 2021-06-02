package fr.feuzme.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Salle {
	@Id
	private String id;
	private Integer numero;
	private Integer places;
	@DBRef
	private Cinema cinema;
}
