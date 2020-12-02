package iratxe.accesodatos;

import java.math.BigDecimal;
import java.util.TreeMap;

import iratxe.modelo.Camiseta;

public class CamisetaDaoTreeMap implements Dao<Camiseta> {

	// creo la coleccion
	private static TreeMap<Long, Camiseta> camisetas = new TreeMap<>();
	// creo unos productos de ejemplo para mostrar
	static {
		camisetas.put(1L, new Camiseta(1L, "Camiseta m/corta", "Marilyn", "Negro", "L",
				"http://placeimg.com/640/480/tech?1", new BigDecimal("12.95"), 20, 1));
		camisetas.put(2L, new Camiseta(2L, "Camiseta m/corta", "Elvis", "Negro", "XL",
				"http://placeimg.com/640/480/tech?1", new BigDecimal("12.95"), 10, 1));

		for (Long id = 3L; id <= 12L; id++) {
			camisetas.put(id, new Camiseta(id, "Camiseta" + id, "Diseño" + id, "Color" + id, "Talla",
					"http://placeimg.com/640/480/tech?" + id, new BigDecimal(5 * id), 0, 1));
		}
	}

	// SINGLETON
	private CamisetaDaoTreeMap() {
	}

	private static CamisetaDaoTreeMap INSTANCIA = new CamisetaDaoTreeMap();

	public static CamisetaDaoTreeMap getInstancia() {
		return INSTANCIA;
	}

	// FIN SINGLETON
	@Override
	public Iterable<Camiseta> listarTodos() {
		// devuelve el valor del TreeMap que es el objeto de la clase Camiseta
		return camisetas.values();
	}

	@Override
	public Camiseta buscarPorId(Long id) {

		return camisetas.get(id);
	}

	@Override
	public void modificar(Camiseta camiseta) {

		camisetas.put(camiseta.getId(), camiseta);
	}

	@Override
	public void crear(Camiseta camiseta) {

		Long id = camisetas.size() == 0 ? 1L : camisetas.lastKey() + 1L;
		camiseta.setId(id);
		camisetas.put(id, camiseta);

	}

	@Override
	public void borrar(Long id) {

		camisetas.remove(id);

	}

}
