package iratxe.accesodatos;

import java.util.TreeMap;

import iratxe.modelo.Usuario;

public class UsuarioDaoTreeMap implements UsuarioDao<Usuario> {

	private static TreeMap<Long, Usuario> usuarios = new TreeMap<>();

	static {
		usuarios.put(1L, new Usuario(1L, "iratxe@ira.com", "iratxe", "Iratxe"));
		usuarios.put(2L, new Usuario(2L, "pepe@perez.com", "perez", "Pepe Perez"));
		usuarios.put(3L, new Usuario(3L, "juan@juan.com", "juan", "Juan Lopez"));
	}

	private UsuarioDaoTreeMap() {
	}

	public static UsuarioDaoTreeMap INSTANCIA = new UsuarioDaoTreeMap();

	public static UsuarioDaoTreeMap getInstancia() {
		return INSTANCIA;
	}

	@Override
	public Iterable<Usuario> listarTodos() {
		return usuarios.values();
	}

	@Override
	public Usuario buscarPorId(Long id) {
		return usuarios.get(id);
	}

	@Override
	public void modificar(Usuario usuario) {
		usuarios.put(usuario.getId(), usuario);

	}

	@Override
	public void crear(Usuario usuario) {
		Long id = usuarios.size() == 0 ? 1L : usuarios.lastKey() + 1L;
		usuario.setId(id);
		usuarios.put(id, usuario);

	}

	@Override
	public void borrar(Long id) {
		usuarios.remove(id);

	}

	@Override
	public Usuario buscarPorEmail(String email) {
		for (Usuario usuario : usuarios.values()) {
			if (usuario.getEmail().equals(email)) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public Usuario buscarPorCliente(String nombre) {
		for (Usuario usuario : usuarios.values()) {
			if (usuario.getNombre().equalsIgnoreCase(nombre)) {
				return usuario;
			}
		}
		return null;
	}

}
