package Modelo;

public class Habitacion {

	private int numero;
	private String caracteristicas;
	private String estado;
	private String tipo;
	private float precio;

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", caracteristicas=" + caracteristicas + ", estado=" + estado
				+ ", tipo=" + tipo + ", precio=" + precio + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Habitacion(int numero, String caracteristicas, String estado, String tipo, float precio) {
		super();
		this.numero = numero;
		this.caracteristicas = caracteristicas;
		this.estado = estado;
		this.tipo = tipo;
		this.precio = precio;
	}

	public Habitacion() {
		throw new UnsupportedOperationException();
	}

}