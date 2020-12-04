package iratxe.accesodatos;

public interface UsuarioDao<T> extends Dao<T> {

	T buscarPorEmail(String email);

	T buscarPorCliente(String nombre);

}
