package fr.feuzme.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Ticket {
	@Id
	private String id;
	@DBRef
	private Sceance sceance;
	
}
