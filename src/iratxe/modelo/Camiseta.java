package iratxe.modelo;

import java.math.BigDecimal;

public class Camiseta {

	private Long id;
	private String modelo;
	private String diseno;
	private String color;
	private String talla;
	private String imgDiseno;
	private BigDecimal precio;
	private Integer descuento;
	private Integer cantidad;

	public Camiseta() {
		super();
		this.id = 0L;
	}

	public Camiseta(Long id, String modelo, String diseno, String color, String talla, String imgDiseno,
			BigDecimal precio, Integer descuento, Integer cantidad) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.diseno = diseno;
		this.color = color;
		this.talla = talla;
		this.imgDiseno = imgDiseno;
		this.precio = precio;
		this.descuento = descuento;
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDiseno() {
		return diseno;
	}

	public void setDiseno(String diseno) {
		this.diseno = diseno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getImgDiseno() {
		return imgDiseno;
	}

	public void setImgDiseno(String imgDiseno) {
		this.imgDiseno = imgDiseno;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((descuento == null) ? 0 : descuento.hashCode());
		result = prime * result + ((diseno == null) ? 0 : diseno.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imgDiseno == null) ? 0 : imgDiseno.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((talla == null) ? 0 : talla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camiseta other = (Camiseta) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (descuento == null) {
			if (other.descuento != null)
				return false;
		} else if (!descuento.equals(other.descuento))
			return false;
		if (diseno == null) {
			if (other.diseno != null)
				return false;
		} else if (!diseno.equals(other.diseno))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imgDiseno == null) {
			if (other.imgDiseno != null)
				return false;
		} else if (!imgDiseno.equals(other.imgDiseno))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (talla == null) {
			if (other.talla != null)
				return false;
		} else if (!talla.equals(other.talla))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "camiseta [id=" + id + ", modelo=" + modelo + ", diseno=" + diseno + ", color=" + color + ", talla="
				+ talla + ", imgDiseno=" + imgDiseno + ", precio=" + precio + ", descuento=" + descuento + ", cantidad="
				+ cantidad + "]";
	}

}
