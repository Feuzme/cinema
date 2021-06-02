package fr.feuzme.cinema.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Sceance {
	@Id
	private String id;
	private LocalDateTime dateDebut;
	@DBRef
	private Salle salle;
	@DBRef
	private Film film;
}
