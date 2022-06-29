package Actividades;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Cama;
import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Registro;
import Modelo.Reserva;

public class Hotel {

	
	
	private ArrayList<Habitacion> habitacionSencilla ;
	private ArrayList<Habitacion> habitacionDoble;
	private ArrayList<Cama> camaSencilla;
	private ArrayList<Cama> camaDoble;
	private ArrayList<Registro> registros;
	
	
	public ArrayList<Habitacion> getHabitacionSencilla() {
		return habitacionSencilla;
	}

	public void setHabitacionSencilla(ArrayList<Habitacion> habitacionSencilla) {
		this.habitacionSencilla = habitacionSencilla;
	}

	public ArrayList<Habitacion> getHabitacionDoble() {
		return habitacionDoble;
	}

	public void setHabitacionDoble(ArrayList<Habitacion> habitacionDoble) {
		this.habitacionDoble = habitacionDoble;
	}

	public Hotel() {
		super();
		habitacionSencilla = new ArrayList<Habitacion>();
		habitacionDoble = new ArrayList<Habitacion>();	
		camaSencilla = new ArrayList<Cama>();
		camaDoble = new ArrayList<Cama>();
		registros = new ArrayList<Registro>();
		habitaciones();
		camas();
	}
	
	public String registrarCliente(String nombre, String cedula, String telefono, String email, 
			String codigo, String fecha_ingreso, String fecha_salida, int cantPersonas, String tipoHabitacion, String tipoCama, int
			numHab, int numCama) {
		
		Reserva reserva = new Reserva(nombre, cedula, telefono, email, codigo, fecha_ingreso, fecha_salida
				,cantPersonas, tipoHabitacion, tipoCama);
		
	
		almacenarRegistro(reserva, numHab, numCama, tipoHabitacion, tipoCama);
				
		return "Cliente "+nombre+"de cedula: "+cedula+" registrado con exito en la habitacion "+tipoHabitacion+" Numero: "+numHab
				+"con cama "+tipoCama+ " numero: "+numCama;
	}


	public boolean habitacionSencillaDisponible(int i) {
		if(habitacionSencilla.get(i).getEstado().equals("Mantenimiento")) {
			return true;
		}else {
			
			JOptionPane.showMessageDialog(null, "La habitacion sencilla "+habitacionSencilla.get(i).getNumero()+" se encuentra ocupada: estado de Operacion");
			return false;
		}	
	}
	public boolean camaSencillaDisponible(int i) {
		if(camaSencilla.get(i).getEstado().equals("Mantenimiento")) {
			return true;
		}else {
		JOptionPane.showMessageDialog(null, "La cama sencilla "+camaSencilla.get(i).getNumero()+" se encuentra ocupada: estado de Operacion");
			return false;
		}	
	}
	
	
	public boolean habitacionDobleDisponible(int i) {
		if(habitacionDoble.get(i).getEstado().equals("Mantenimiento")) {
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "La habitacion doble "+habitacionDoble.get(i).getNumero()+" se encuentra ocupada: estado de Operacion");
			return false;
		}
	}
	public boolean camaDobleDisponible(int i) {
		if(camaDoble.get(i).getEstado().equals("Mantenimiento")) {
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "La cama doble "+camaDoble.get(i).getNumero()+" se encuentra ocupada: estado de Operacion");

			return false;
		}	
	}

	private void almacenarRegistro(Reserva reserva, int numHab, int numCama, String tipoHabitacion, String tipoCama) {
		
		if(tipoHabitacion.equals("sencilla") ) {
			if(tipoCama.equals("Sencilla")) {
				Registro registro = new Registro(reserva, habitacionSencilla.get(numHab) , camaSencilla.get(numCama) );
				habitacionSencilla.get(numHab).setEstado("Operacion");
				camaSencilla.get(numCama).setEstado("Operacion");
				registros.add(registro);
			}else {
				Registro registro = new Registro(reserva, habitacionSencilla.get(numHab) , camaDoble.get(numCama) );
				habitacionSencilla.get(numHab).setEstado("Operacion");
				camaDoble.get(numCama).setEstado("Operacion");
				registros.add(registro);
			}
		}else {
			if(tipoCama.equals("Sencilla")) {
				Registro registro = new Registro(reserva, habitacionDoble.get(numHab) , camaSencilla.get(numCama) );
				habitacionDoble.get(numHab).setEstado("Operacion");
				camaSencilla.get(numCama).setEstado("Operacion");
				registros.add(registro);
			}else {
				Registro registro = new Registro(reserva, habitacionDoble.get(numHab) , camaDoble.get(numCama) );
				habitacionDoble.get(numHab).setEstado("Operacion");
				camaDoble.get(numCama).setEstado("Operacion");
				registros.add(registro);
			}
		}
		
		
		
	}

	private void camas() {
		for(int i =0; i<40; i++) {
			Cama cama= new Cama (i, "Mantenimiento", "Sencilla", 30000);
			camaSencilla.add(cama);
		}
		for(int i =0; i<5; i++) {
			Cama cama= new Cama (i, "Mantenimiento", "Doble", 30000);
			camaDoble.add(cama);
		}
		
	}

	private void habitaciones() {
		for(int i=0; i<10; i++) {
			Habitacion habitacion= new Habitacion(i, "Cama, tv, baño", "Mantenimiento", "Sencilla", (float) 120.000);
			habitacionSencilla.add(habitacion);	
		}
		for(int i=0; i<10; i++) {
			Habitacion habitacion= new Habitacion(i, "Cama, tv, baño doble, servicio habitacion", "Mantenimiento", "doble", (float) 120.000);
			habitacionDoble.add(habitacion);	
		}
	}
	
	public String reporteHabSencilla(int i) {
		
		String reporte= habitacionSencilla.get(i).toString();
		return reporte;
		
	}
	public String reporteHabDoble(int i) {
		
		String reporte= habitacionDoble.get(i).toString();
		return reporte;
		
	}
	public String modificarEstadoHabSencilla(String estado, int i) {
		
		habitacionSencilla.get(i).setEstado(estado);
		
		return "Estado modificado con exito";
	}
	
	public String modificarEstadoHabDoble(String estado, int i) {
		
		habitacionDoble.get(i).setEstado(estado);
		
		return "Estado modificado con exito";
	}

	public String reporteCamSencilla(int i) {
		
		String reporte= camaSencilla.get(i).toString();
		
		
		return reporte;
	}
	
	public String modificarEstadoCamaSencilla(String estado, int i) {
		
		camaSencilla.get(i).setEstado(estado);
		
		return "Estado modificado con exito";
	}
	
	public String reporteCamDoble(int i) {
		
		String reporte= camaDoble.get(i).toString();
	
		return reporte;
	}
	
	public String modificarEstadoCamaDoble(String estado, int i) {
		
		camaDoble.get(i).setEstado(estado);
		
		return "Estado modificado con exito";
	}
	
	
	public String ReporteHabitacionesSencillasDisp() {
		
		String reporte = "HABITACIONES SENCILLAS DISPONIBLES: "+ "\n";
		for(int i=0; i<habitacionSencilla.size(); i++) {
			
			if(habitacionSencilla.get(i).getEstado().equals("Mantenimiento")) {
				reporte+="-Habitcion nro: "+ habitacionSencilla.get(i).getNumero()+"\n";
			}
		}
		
		
		return reporte;
	}
	
	public String ReporteHabitacionesDoblesDisp() {
		
		String reporte = "HABITACIONES DOBLES DISPONIBLES: "+ "\n";
		for(int i=0; i<habitacionDoble.size(); i++) {
			
			if(habitacionDoble.get(i).getEstado().equals("Mantenimiento")) {
				reporte+="-Habitcion nro: "+ habitacionDoble.get(i).getNumero()+"\n";
			}
		}
		
		
		return reporte;
	}
	
		public String ReporteCamasIndivDisp() {
				
				String reporte = "CAMAS INDIVIDUALES DISPONIBLES: "+ "\n";
				for(int i=0; i<camaSencilla.size(); i++) {
					
					if(camaSencilla.get(i).getEstado().equals("Mantenimiento")) {
						reporte+="-Cama nro: "+ camaSencilla.get(i).getNumero()+"\n";
					}
				}						
				return reporte;
			}


		public String ReporteCamasDoblesDisp() {
			
			String reporte = "CAMAS DOBLES DISPONIBLES: "+ "\n";
			for(int i=0; i<camaDoble.size(); i++) {
				
				if(camaDoble.get(i).getEstado().equals("Mantenimiento")) {
					reporte+="-Cama nro: "+ camaDoble.get(i).getNumero()+"\n";
				}
			}						
			return reporte;
		}
		
	public String RegistrosDelHotel() {
		
		String reporte = "REGISTROS GENERALES DE HOTELS COCORA: "+ "\n";
		for(int i=0; i<registros.size(); i++) {
			
			reporte += "-Habitacion nro: "+ registros.get(i).getHabitacion().getNumero()+" de tipo: "+ registros.get(i).getHabitacion().getTipo()+"\n"+
						"Reservada al cliente: "+registros.get(i).getReserva().getNombre()+" con la Cc: "+registros.get(i).getReserva().getCedula()+ "\n"+
						"Deste el dia: "+registros.get(i).getReserva().getFecha_ingreso()+" Hasta el dia: "+registros.get(i).getReserva().getFecha_salida()+"\n"+
						"Con :"+registros.get(i).getReserva().getCant_personas()+" personas en su estancia " + "y un total a pagar de: "+
						registros.get(i).getHabitacion().getPrecio() + " Por habitacion y " +registros.get(i).getCama().getPrecio() + "por cama de tipo "+"\n"+
						registros.get(i).getCama().getTipo()+ "utilizada."+ "\n"+"\n";
		}
		
		return reporte  ;		
	}
		
}
