package ie.cit.adf.dao;

import java.util.List;

import ie.cit.adf.domain.Todo;

public interface TodoRepository {
	
	void insert(Todo todo);
	
	List<Todo> getAll();

	void delete(String id);

	Todo findById(String id);
	
	void update(Todo todo);

}
