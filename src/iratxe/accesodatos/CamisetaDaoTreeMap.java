package iratxe.accesodatos;

import java.math.BigDecimal;
import java.util.TreeMap;

import iratxe.modelo.Camiseta;

public class CamisetaDaoTreeMap implements Dao<Camiseta> {

	// creo la coleccion
	private static TreeMap<Long, Camiseta> camisetas = new TreeMap<>();
	// creo unos productos de ejemplo para mostrar
	static {
		camisetas.put(1L, new Camiseta(1L, "Camiseta m/corta", "Marilyn", "Negro", "L", "img/camisetas/13.jpg",
				new BigDecimal("20.95"), 20, 1));
		camisetas.put(2L, new Camiseta(2L, "Camiseta m/corta", "Cleo", "Negro", "M", "img/camisetas/11.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(3L, new Camiseta(3L, "Camiseta m/corta", "Sammy Gatete", "Negro", "M", "img/camisetas/10.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(4L, new Camiseta(4L, "Camiseta m/corta", "Elvira", "Negro", "M", "img/camisetas/9.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(5L, new Camiseta(5L, "Camiseta m/corta", "Pata", "Blanco", "M", "img/camisetas/8.jpg",
				new BigDecimal("19.95"), 10, 1));
		camisetas.put(6L, new Camiseta(6L, "Camiseta m/corta", "Motorista", "Blanco", "M", "img/camisetas/7.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(7L, new Camiseta(7L, "Camiseta m/corta", "Por la horda!", "Negro", "XL", "img/camisetas/6.jpg",
				new BigDecimal("18.95"), 10, 1));
		camisetas.put(8L, new Camiseta(8L, "Camiseta m/corta", "Alianza", "Azul", "XL", "img/camisetas/5.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(9L, new Camiseta(8L, "Camiseta m/corta", "Pennywise", "Verde Militar", "S", "img/camisetas/4.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(10L, new Camiseta(8L, "Camiseta m/corta", "Morticia", "Negro", "M", "img/camisetas/3.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(11L, new Camiseta(8L, "Camiseta m/corta", "Buho", "Negro", "M", "img/camisetas/2.jpg",
				new BigDecimal("12.95"), 10, 1));
		camisetas.put(12L, new Camiseta(8L, "Camiseta m/corta", "Marilyn Catrina", "Negro", "M", "img/camisetas/1.jpg",
				new BigDecimal("19.95"), 10, 1));
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
