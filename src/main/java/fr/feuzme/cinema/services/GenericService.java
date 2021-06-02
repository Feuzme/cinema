package fr.feuzme.cinema.services;

import java.util.List;

public interface GenericService<T> {

	public List<T> getAll();

	public T getById(String id);

	public T add(T entity);

	public T update(T entity);

	public void deleteById(String id);
}
