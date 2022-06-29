package Modelo;

public class Cama {

	private int numero;
	private String estado;
	private String tipo;
	private float precio;
	
	
	public Cama(int numero, String estado, String tipo, float precio) {
		super();
		this.numero = numero;
		this.estado = estado;
		this.tipo = tipo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cama [numero=" + numero + ", estado=" + estado + ", tipo=" + tipo + ", precio=" + precio + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public Cama() {
		throw new UnsupportedOperationException();
	}

}