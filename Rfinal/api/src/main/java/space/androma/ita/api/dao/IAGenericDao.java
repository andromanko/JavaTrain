package space.androma.ita.api.dao;

import java.util.List;

import space.androma.ita.entities.AEntity;

public interface IAGenericDao<T extends AEntity<Integer>> {

	Class<T> getGenericClass();

	T create(T entity);

	T get(int id);

	void update(T entity);

	void delete(T entity);

	List<T> getAll();
}
