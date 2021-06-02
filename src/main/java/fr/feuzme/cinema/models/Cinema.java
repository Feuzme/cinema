package fr.feuzme.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Cinema {
	@Id
	private String id;
	private String nom;
}
