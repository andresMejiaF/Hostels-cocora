package Modelo;

public class Registro {

	private String codigo;
	private int cant_personas;
	private String tipo_habitacion;
	private String tipo_cama;
	private String fecha_llegada;
	private String fecha_salida;
	
	private Reserva reserva;
	private Habitacion habitacion;
	private Cama cama;
	
	
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public Cama getCama() {
		return cama;
	}
	public void setCama(Cama cama) {
		this.cama = cama;
	}
	public Registro(Reserva reserva, Habitacion habitacion, Cama cama) {
		super();
		this.reserva = reserva;
		this.habitacion = habitacion;
		this.cama = cama;
	}
	public Registro() {
		throw new UnsupportedOperationException();
	}

}