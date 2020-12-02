package iratxe.accesodatos;

public interface Dao<T> {

	Iterable<T> listarTodos();

	T buscarPorId(Long id);

	void modificar(T obj);

	void crear(T obj);

	void borrar(Long id);

}
