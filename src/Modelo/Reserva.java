package Modelo;

public class Reserva extends Cliente {

	private String codigo;
	private String fecha_ingreso;
	private String fecha_salida;
	private int cant_personas;
	private String tipo_habitacion;
	private String tipo_cama;



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getFecha_ingreso() {
		return fecha_ingreso;
	}



	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}



	public String getFecha_salida() {
		return fecha_salida;
	}



	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}



	public int getCant_personas() {
		return cant_personas;
	}



	public void setCant_personas(int cant_personas) {
		this.cant_personas = cant_personas;
	}



	public String getTipo_habitacion() {
		return tipo_habitacion;
	}



	public void setTipo_habitacion(String tipo_habitacion) {
		this.tipo_habitacion = tipo_habitacion;
	}



	public String getTipo_cama() {
		return tipo_cama;
	}



	public void setTipo_cama(String tipo_cama) {
		this.tipo_cama = tipo_cama;
	}



	public Reserva(String nombre, String cedula, String telefono, String email, String codigo, String fecha_ingreso,
			String fecha_salida, int cant_personas, String tipo_habitacion, String tipo_cama) {
		super(nombre, cedula, telefono, email);
		this.codigo = codigo;
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_salida = fecha_salida;
		this.cant_personas = cant_personas;
		this.tipo_habitacion = tipo_habitacion;
		this.tipo_cama = tipo_cama;
	}



	public Reserva() {
		throw new UnsupportedOperationException();
	}

}