package Interfaz;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import Actividades.Hotel;

import java.awt.Panel;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class CrudHotel extends JFrame {
	
	private JPanel contentPane; //panel principal
	
	private Hotel hotel=new Hotel();
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextField textCodigoR;
	private JTextField textFechaIngreso;
	private JTextField textFechaSalida;
	private JTextField textPersonas;
	private JTextField textEmailRecp;
	private JTextField textPassword;
	
	
	private boolean inicio=false;
		
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudHotel frame = new CrudHotel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrudHotel() {
		setBackground(new Color(169, 169, 169));
		setTitle("HOSTELS COCORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{799, 0};
		gbl_contentPane.rowHeights = new int[]{479, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(169, 169, 169));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		
		
		
		
		JPanel panelReporte = new JPanel();
		panelReporte.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Reportes", null, panelReporte, null);
		panelReporte.setLayout(null);
		
		JLabel lblNewLabel_28 = new JLabel("Habitaciones sencillas disponibles");
		lblNewLabel_28.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_28.setBounds(301, 114, 197, 14);
		panelReporte.add(lblNewLabel_28);
		
		JButton btnReporteHabSencillas = new JButton("Reporte");
		btnReporteHabSencillas.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteHabSencillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				JOptionPane.showMessageDialog(null, hotel.ReporteHabitacionesSencillasDisp());
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
			}
		});
		btnReporteHabSencillas.setBounds(311, 139, 178, 23);
		panelReporte.add(btnReporteHabSencillas);
		
		JLabel lblNewLabel_29 = new JLabel("Habitaciones dobles disponibles");
		lblNewLabel_29.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_29.setBounds(315, 192, 183, 14);
		panelReporte.add(lblNewLabel_29);
		
		JButton btnReporteHabDobles = new JButton("Reporte");
		btnReporteHabDobles.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteHabDobles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				JOptionPane.showMessageDialog(null, hotel.ReporteHabitacionesDoblesDisp());
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
				}
		});
		btnReporteHabDobles.setBounds(311, 221, 178, 23);
		panelReporte.add(btnReporteHabDobles);
		
		JLabel lblNewLabel_30 = new JLabel("Camas individuales disponibles");
		lblNewLabel_30.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_30.setBounds(539, 114, 189, 14);
		panelReporte.add(lblNewLabel_30);
		
		JButton btnReporteCamasIndv = new JButton("Reporte");
		btnReporteCamasIndv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteCamasIndv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				JOptionPane.showMessageDialog(null, hotel.ReporteCamasIndivDisp());
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
				}
		});
		btnReporteCamasIndv.setBounds(549, 139, 173, 23);
		panelReporte.add(btnReporteCamasIndv);
		
		JLabel lblNewLabel_31 = new JLabel("Camas dobles disponibles");
		lblNewLabel_31.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_31.setBounds(539, 192, 163, 14);
		panelReporte.add(lblNewLabel_31);
		
		JButton btnReporteCamasDoblesDisp = new JButton("Reporte");
		btnReporteCamasDoblesDisp.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteCamasDoblesDisp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				JOptionPane.showMessageDialog(null, hotel.ReporteCamasDoblesDisp());
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
				}
		});
		btnReporteCamasDoblesDisp.setBounds(549, 221, 173, 23);
		panelReporte.add(btnReporteCamasDoblesDisp);
		
		JLabel lblNewLabel_32 = new JLabel("Registros del hotel");
		lblNewLabel_32.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_32.setBounds(459, 267, 178, 14);
		panelReporte.add(lblNewLabel_32);
		
		JButton btnRegistrosDispn = new JButton("Reporte");
		btnRegistrosDispn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnRegistrosDispn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				JOptionPane.showMessageDialog(null, hotel.RegistrosDelHotel());
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
				}
		});
		btnRegistrosDispn.setBounds(445, 300, 152, 23);
		panelReporte.add(btnRegistrosDispn);
		
		JLabel lblNewLabel_33 = new JLabel("Login");
		lblNewLabel_33.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_33.setBounds(22, 130, 72, 14);
		panelReporte.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Email");
		lblNewLabel_34.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_34.setBounds(19, 171, 46, 14);
		panelReporte.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("Password");
		lblNewLabel_35.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_35.setBounds(19, 225, 75, 14);
		panelReporte.add(lblNewLabel_35);
		
		textEmailRecp = new JTextField();
		textEmailRecp.setBounds(103, 168, 167, 20);
		panelReporte.add(textEmailRecp);
		textEmailRecp.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(103, 222, 167, 20);
		panelReporte.add(textPassword);
		textPassword.setColumns(10);
		
		JButton btnInicioSesion = new JButton("Inicio");
		btnInicioSesion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textEmailRecp.getText().equals("admin") && textPassword.getText().equals("admin") ) {
					inicio = true;
					JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
				}else {
					JOptionPane.showMessageDialog(null, "Credenciales incorrectas, pruebe con [email: admin, password: admin]");
				}
			}
		});
		btnInicioSesion.setBounds(113, 263, 89, 23);
		panelReporte.add(btnInicioSesion);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(0, 94, 796, 222);
		panelReporte.add(separator_3_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(0, 334, 796, 222);
		panelReporte.add(separator_3_2);
		
		JLabel lblNewLabel_37_1 = new JLabel("Gestion de habitaciones");
		lblNewLabel_37_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_37_1.setBounds(17, 22, 185, 14);
		panelReporte.add(lblNewLabel_37_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Hostels Cocora");
		lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7_1_1.setBounds(22, 52, 85, 14);
		panelReporte.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Recepcionist");
		lblNewLabel_8_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8_1_1.setBounds(665, 22, 94, 14);
		panelReporte.add(lblNewLabel_8_1_1);
		
		
		JPanel panelReserva = new JPanel();
		panelReserva.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Reserva", null, panelReserva, null);
		panelReserva.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("Nombre");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_18.setBounds(10, 134, 46, 14);
		panelReserva.add(lblNewLabel_18);
		
		textNombre = new JTextField();
		textNombre.setBounds(84, 131, 122, 20);
		panelReserva.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Cedula");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_19.setBounds(10, 165, 46, 14);
		panelReserva.add(lblNewLabel_19);
		
		textCedula = new JTextField();
		textCedula.setBounds(84, 162, 122, 20);
		panelReserva.add(textCedula);
		textCedula.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Telefono");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_20.setBounds(10, 196, 64, 14);
		panelReserva.add(lblNewLabel_20);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(84, 193, 122, 20);
		panelReserva.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Emaill");
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_21.setBounds(10, 233, 46, 14);
		panelReserva.add(lblNewLabel_21);
		
		textEmail = new JTextField();
		textEmail.setBounds(84, 230, 122, 20);
		panelReserva.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Codigo reserva");
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_22.setBounds(242, 134, 86, 14);
		panelReserva.add(lblNewLabel_22);
		
		textCodigoR = new JTextField();
		textCodigoR.setBounds(338, 131, 137, 20);
		panelReserva.add(textCodigoR);
		textCodigoR.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("Fecha ingreso");
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_23.setBounds(242, 165, 86, 14);
		panelReserva.add(lblNewLabel_23);
		
		textFechaIngreso = new JTextField();
		textFechaIngreso.setBounds(338, 162, 137, 20);
		panelReserva.add(textFechaIngreso);
		textFechaIngreso.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Fecha salida");
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_24.setBounds(242, 196, 75, 14);
		panelReserva.add(lblNewLabel_24);
		
		textFechaSalida = new JTextField();
		textFechaSalida.setBounds(338, 193, 137, 20);
		panelReserva.add(textFechaSalida);
		textFechaSalida.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("# personas");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_25.setBounds(242, 233, 75, 14);
		panelReserva.add(lblNewLabel_25);
		
		textPersonas = new JTextField();
		textPersonas.setBounds(338, 230, 137, 20);
		panelReserva.add(textPersonas);
		textPersonas.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Habitacion");
		lblNewLabel_26.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_26.setBounds(507, 165, 68, 14);
		panelReserva.add(lblNewLabel_26);
		
		JComboBox comboTipoHabitacion = new JComboBox();
		comboTipoHabitacion.setModel(new DefaultComboBoxModel(new String[] {"Sencilla", "Doble"}));
		comboTipoHabitacion.setBounds(573, 161, 61, 22);
		panelReserva.add(comboTipoHabitacion);
		
		JComboBox comboHabSenc2 = new JComboBox();
		comboHabSenc2.setModel(new DefaultComboBoxModel(new String[] {"Hab 1 - Sencilla", "Hab 2 - Sencilla", "Hab 3 - Sencilla", "Hab 4 - Sencilla", "Hab 5 - Sencilla", "Hab 6 - Sencilla", "Hab 7 - Sencilla", "Hab 8 - Sencilla", "Hab 9 - Sencilla", "Hab 10 - Sencilla"}));
		comboHabSenc2.setBounds(662, 130, 105, 22);
		panelReserva.add(comboHabSenc2);
		
		JComboBox comboHabDoble2 = new JComboBox();
		comboHabDoble2.setModel(new DefaultComboBoxModel(new String[] {"Hab 1 - Doble", "Hab 2 - Doble", "Hab 3 - Doble", "Hab 4 - Doble", "Hab 5 - Doble", "Hab 6 - Doble", "Hab 7 - Doble", "Hab 8 - Doble", "Hab 9 - Doble", "Hab 10 - Doble"}));
		comboHabDoble2.setBounds(661, 161, 106, 22);
		panelReserva.add(comboHabDoble2);
		
		JLabel lblNewLabel_27 = new JLabel("Cama");
		lblNewLabel_27.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_27.setBounds(507, 216, 46, 14);
		panelReserva.add(lblNewLabel_27);
		
		JComboBox comboTipoCama = new JComboBox();
		comboTipoCama.setModel(new DefaultComboBoxModel(new String[] {"Individual", "Doble"}));
		comboTipoCama.setBounds(573, 212, 61, 22);
		panelReserva.add(comboTipoCama);
		
		JComboBox comboCamIndiv2 = new JComboBox();
		comboCamIndiv2.setModel(new DefaultComboBoxModel(new String[] {"Cam 1 - individual", "Cam 2 - individual", "Cam 3 - individual", "Cam 4 - individual", "Cam 5 - individual", "Cam 6 - individual", "Cam 7 - individual", "Cam 8 - individual", "Cam 9 - individual", "Cam 10 - individual", "Cam 11 - individual", "Cam 12 - individual", "Cam 13 - individual", "Cam 14 - individual", "Cam 15 - individual", "Cam 16 - individual", "Cam 17 - individual", "Cam 18 - individual", "Cam 19 - individual", "Cam 20 - individual", "Cam 21 - individual", "Cam 22 - individual", "Cam 23 - individual", "Cam 24 - individual", "Cam 25 - individual", "Cam 26 - individual", "Cam 27 - individual", "Cam 28 - individual", "Cam 29 - individual", "Cam 30 - individual", "Cam 31 - individual", "Cam 32 - individual", "Cam 33 - individual", "Cam 34 - individual", "Cam 35 - individual", "Cam 36 - individual", "Cam 37 - individual", "Cam 38 - individual", "Cam 39 - individual", "Cam 40 - individual"}));
		comboCamIndiv2.setBounds(662, 192, 105, 22);
		panelReserva.add(comboCamIndiv2);
		
		JComboBox comboCamDoble2 = new JComboBox();
		comboCamDoble2.setModel(new DefaultComboBoxModel(new String[] {"Cam 1 - doble", "Cam 2 - doble", "Cam 3 - doble", "Cam 4 - doble", "Cam 5 - doble"}));
		comboCamDoble2.setBounds(662, 229, 105, 22);
		panelReserva.add(comboCamDoble2);
		
		JButton btnReservar = new JButton("Reservar cliente");
		btnReservar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(inicio) {
				int tipoH= comboTipoHabitacion.getSelectedIndex();
				int tipoC = comboTipoCama.getSelectedIndex();
				String registro="";
				boolean validado=true;
				
				if(tipoH==0) {
					if(tipoC==0) {
						if(hotel.habitacionSencillaDisponible(comboHabSenc2.getSelectedIndex()) && hotel.camaSencillaDisponible(comboCamIndiv2.getSelectedIndex())) {
						registro=hotel.registrarCliente(textNombre.getText(), textCedula.getText(), textTelefono.getText(), textEmail.getText(), textCodigoR.getText(),
								textFechaIngreso.getText(), textFechaSalida.getText(), Integer.parseInt(textPersonas.getText()), "sencilla", "Sencilla", comboHabSenc2.getSelectedIndex(), comboCamIndiv2.getSelectedIndex());
								JOptionPane.showMessageDialog(null, registro);
						}
						
						}else {
						if(hotel.habitacionSencillaDisponible(comboHabSenc2.getSelectedIndex()) && hotel.camaDobleDisponible(comboCamDoble2.getSelectedIndex())) {	
						registro=hotel.registrarCliente(textNombre.getText(), textCedula.getText(), textTelefono.getText(), textEmail.getText(), textCodigoR.getText(),
								textFechaIngreso.getText(), textFechaSalida.getText(), Integer.parseInt(textPersonas.getText()), "sencilla", "Doble", comboHabSenc2.getSelectedIndex(), comboCamDoble2.getSelectedIndex());
								JOptionPane.showMessageDialog(null, registro);
						}
						}
					
				}else {
					if(tipoC==0) {
						if(hotel.habitacionDobleDisponible(comboHabDoble2.getSelectedIndex()) && hotel.camaSencillaDisponible(comboCamIndiv2.getSelectedIndex())) {
						registro=hotel.registrarCliente(textNombre.getText(), textCedula.getText(), textTelefono.getText(), textEmail.getText(), textCodigoR.getText(),
								textFechaIngreso.getText(), textFechaSalida.getText(), Integer.parseInt(textPersonas.getText()), "Doble", "Sencilla", comboHabDoble2.getSelectedIndex(), comboCamIndiv2.getSelectedIndex());
						JOptionPane.showMessageDialog(null, registro);
						}
						}else {
						if(hotel.habitacionDobleDisponible(comboHabDoble2.getSelectedIndex()) && hotel.camaDobleDisponible(comboCamDoble2.getSelectedIndex())) {	
						registro=hotel.registrarCliente(textNombre.getText(), textCedula.getText(), textTelefono.getText(), textEmail.getText(), textCodigoR.getText(),
								textFechaIngreso.getText(), textFechaSalida.getText(), Integer.parseInt(textPersonas.getText()), "Doble", "Doble", comboHabDoble2.getSelectedIndex(), comboCamDoble2.getSelectedIndex());
						JOptionPane.showMessageDialog(null, registro);
						}
						}
				}
				
				

			}else {
				JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
			}
				}
			
		});
		btnReservar.setBounds(338, 291, 172, 23);
		panelReserva.add(btnReservar);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 104, 796, 222);
		panelReserva.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 326, 796, 222);
		panelReserva.add(separator_4);
		
		JLabel lblNewLabel_37 = new JLabel("Gestion de habitaciones");
		lblNewLabel_37.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_37.setBounds(10, 23, 185, 14);
		panelReserva.add(lblNewLabel_37);
		
		JLabel lblNewLabel_7_1 = new JLabel("Hostels Cocora");
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7_1.setBounds(10, 48, 85, 14);
		panelReserva.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Recepcionist");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8_1.setBounds(645, 23, 94, 14);
		panelReserva.add(lblNewLabel_8_1);
		
		JPanel panelHabitacion = new JPanel();
		panelHabitacion.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Habitacion", null, panelHabitacion, null);
		panelHabitacion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion de habitaciones");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 21, 185, 14);
		panelHabitacion.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Habitacion sencilla");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 207, 108, 14);
		panelHabitacion.add(lblNewLabel_1);
		
		JComboBox comboHabSencilla = new JComboBox();
		comboHabSencilla.setModel(new DefaultComboBoxModel(new String[] {"Hab 0 - Sencilla", "Hab 1 - Sencilla", "Hab 2 - Sencilla", "Hab 3 - Sencilla", "Hab 4 - Sencilla", "Hab 5 - Sencilla", "Hab 6 - Sencilla", "Hab 7 - Sencilla", "Hab 8 - Sencilla", "Hab 9 - Sencilla"}));
		comboHabSencilla.setBounds(168, 203, 139, 22);
		panelHabitacion.add(comboHabSencilla);
		
		JLabel lblNewLabel_2 = new JLabel("Habitacion doble ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(450, 207, 101, 14);
		panelHabitacion.add(lblNewLabel_2);
		
		JComboBox comboHabDoble = new JComboBox();
		comboHabDoble.setModel(new DefaultComboBoxModel(new String[] {"Hab 0 - Doble", "Hab 1 - Doble", "Hab 2 - Doble", "Hab 3 - Doble", "Hab 4 - Doble", "Hab 5 - Doble", "Hab 6 - Doble", "Hab 7 - Doble", "Hab 8 - Doble", "Hab 9 - Doble"}));
		comboHabDoble.setBounds(596, 203, 136, 22);
		panelHabitacion.add(comboHabDoble);
		
		JButton btnReporteHabSencilla = new JButton("Generar reporte");
		btnReporteHabSencilla.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteHabSencilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				String reporte = hotel.reporteHabSencilla(comboHabSencilla.getSelectedIndex());

				JOptionPane.showMessageDialog(null, reporte);
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
			}
		});
		btnReporteHabSencilla.setBounds(32, 297, 123, 23);
		panelHabitacion.add(btnReporteHabSencilla);
		
		JButton btnreporteHabDoble = new JButton("Generar reporte");
		btnreporteHabDoble.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnreporteHabDoble.setBounds(450, 297, 136, 23);
		
		btnreporteHabDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				String reporte = hotel.reporteHabDoble(comboHabDoble.getSelectedIndex());

				JOptionPane.showMessageDialog(null, reporte);
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
			}
		});
		panelHabitacion.add(btnreporteHabDoble);
		
		JLabel lblNewLabel_3 = new JLabel(" Estados");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setBounds(32, 240, 66, 14);
		panelHabitacion.add(lblNewLabel_3);
		
		JComboBox comboEstadSencilla = new JComboBox();
		comboEstadSencilla.setModel(new DefaultComboBoxModel(new String[] {"Mantenimiento", "Operacion"}));
		comboEstadSencilla.setBounds(168, 236, 139, 22);
		panelHabitacion.add(comboEstadSencilla);
		
		JButton btnModificarHabSencilla = new JButton("Modificar");
		btnModificarHabSencilla.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnModificarHabSencilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(inicio) {	
			int estado= comboEstadSencilla.getSelectedIndex();
			if(estado==0) {
				
				String modificacion = hotel.modificarEstadoHabSencilla("Mantenimiento", comboHabSencilla.getSelectedIndex());
				JOptionPane.showMessageDialog(null, "Estado para habitacion sencilla numero: "+ comboHabSencilla.getSelectedIndex()+" Modificado a Mantenimiento");

			}else {
				String modificacion = hotel.modificarEstadoHabSencilla("Operacion", comboHabSencilla.getSelectedIndex());
				JOptionPane.showMessageDialog(null, "Estado para habitacion sencilla numero: "+ comboHabSencilla.getSelectedIndex()+" Modificado a Operacion");

			}
			}else {
				JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
			}
			}
			
		});
		btnModificarHabSencilla.setBounds(184, 297, 123, 23);
		panelHabitacion.add(btnModificarHabSencilla);
		
		JLabel lblNewLabel_4 = new JLabel("Estados");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(450, 240, 66, 14);
		panelHabitacion.add(lblNewLabel_4);
		
		JComboBox comboEstadosHabDoble = new JComboBox();
		comboEstadosHabDoble.setModel(new DefaultComboBoxModel(new String[] {"Mantenimiento", "Operacion"}));
		comboEstadosHabDoble.setBounds(596, 236, 136, 22);
		panelHabitacion.add(comboEstadosHabDoble);
		
		JButton btnModificarDoble = new JButton("Modificar");
		btnModificarDoble.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnModificarDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(inicio) {
				int estado= comboEstadosHabDoble.getSelectedIndex();
				if(estado==0) {
					
					String modificacion = hotel.modificarEstadoHabDoble  ("Mantenimiento", comboHabDoble.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Estado para habitacion doble numero: "+ comboHabDoble.getSelectedIndex()+" Modificado a Mantenimiento");

				}else {
					String modificacion = hotel.modificarEstadoHabDoble("Operacion", comboHabDoble.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Estado para doble sencilla numero: "+ comboHabDoble.getSelectedIndex()+" Modificado a Operacion");

				}
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
			}
		});
		btnModificarDoble.setBounds(596, 297, 136, 23);
		panelHabitacion.add(btnModificarDoble);
		
		JLabel lblNewLabel_5 = new JLabel("Sencilla");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_5.setBounds(135, 136, 60, 14);
		panelHabitacion.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Doble");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_6.setBounds(561, 136, 46, 14);
		panelHabitacion.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hostels Cocora");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 36, 85, 14);
		panelHabitacion.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Recepcionist");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8.setBounds(653, 21, 94, 14);
		panelHabitacion.add(lblNewLabel_8);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 75, 796, 222);
		panelHabitacion.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 384, 796, 131);
		panelHabitacion.add(separator_1);
		
		JPanel panelCama = new JPanel();
		panelCama.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Cama", null, panelCama, null);
		panelCama.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Gestion de camas");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_9.setBounds(23, 25, 94, 14);
		panelCama.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Hostels Cocora");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_10.setBounds(23, 42, 83, 14);
		panelCama.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Recepcionist");
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_11.setBounds(659, 25, 72, 14);
		panelCama.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Cama Sencilla");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_12.setBounds(56, 186, 81, 14);
		panelCama.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Estados");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_13.setBounds(56, 218, 81, 14);
		panelCama.add(lblNewLabel_13);
		
		JComboBox comboCamSencilla = new JComboBox();
		comboCamSencilla.setBackground(new Color(255, 255, 255));
		comboCamSencilla.setModel(new DefaultComboBoxModel(new String[] {"Cam 0 - individual", "Cam 1 - individual", "Cam 2 - individual", "Cam 3 - individual", "Cam 4 - individual", "Cam 5 - individual", "Cam 6 - individual", "Cam 7 - individual", "Cam 8 - individual", "Cam 9 - individual", "Cam 10 - individual", "Cam 11 - individual", "Cam 12 - individual", "Cam 13 - individual", "Cam 14 - individual", "Cam 15 - individual", "Cam 16 - individual", "Cam 17 - individual", "Cam 18 - individual", "Cam 19 - individual", "Cam 20 - individual", "Cam 21 - individual", "Cam 22 - individual", "Cam 23 - individual", "Cam 24 - individual", "Cam 25 - individual", "Cam 26 - individual", "Cam 27 - individual", "Cam 28 - individual", "Cam 29 - individual", "Cam 30 - individual", "Cam 31 - individual", "Cam 32 - individual", "Cam 33 - individual", "Cam 34 - individual", "Cam 35 - individual", "Cam 36 - individual", "Cam 37 - individual", "Cam 38 - individual", "Cam 39 - individual"}));
		comboCamSencilla.setBounds(150, 182, 120, 22);
		panelCama.add(comboCamSencilla);
		
		JComboBox comboEstadoCama = new JComboBox();
		comboEstadoCama.setBackground(new Color(255, 255, 255));
		comboEstadoCama.setModel(new DefaultComboBoxModel(new String[] {"Mantenimiento", "Operacion"}));
		comboEstadoCama.setBounds(150, 214, 120, 22);
		panelCama.add(comboEstadoCama);
		
		JButton btnReporteCamSencilla = new JButton("Generar reporte");
		btnReporteCamSencilla.setBackground(new Color(255, 255, 255));
		btnReporteCamSencilla.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteCamSencilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				String reporte = hotel.reporteCamSencilla(comboCamSencilla.getSelectedIndex());

				JOptionPane.showMessageDialog(null, reporte);
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
				}
		});
		btnReporteCamSencilla.setBounds(58, 260, 142, 23);
		panelCama.add(btnReporteCamSencilla);
		
		JButton btnModificarCamSencilla = new JButton("Modificar");
		btnModificarCamSencilla.setBackground(new Color(255, 255, 255));
		btnModificarCamSencilla.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnModificarCamSencilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				int estado= comboEstadoCama.getSelectedIndex();
				if(estado==0) {
					
					String modificacion = hotel.modificarEstadoCamaSencilla("Mantenimiento", comboCamSencilla.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Estado para cama sencilla numero: "+ comboCamSencilla.getSelectedIndex()+" Modificado a Mantenimiento");

				}else {
					String modificacion = hotel.modificarEstadoCamaSencilla("Operacion", comboCamSencilla.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Estado para cama sencilla numero: "+ comboCamSencilla.getSelectedIndex()+" Modificado a Operacion");

				}
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
			}
		});
		btnModificarCamSencilla.setBounds(210, 260, 130, 23);
		panelCama.add(btnModificarCamSencilla);
		
		JLabel lblNewLabel_14 = new JLabel("Individual");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_14.setBounds(169, 128, 59, 14);
		panelCama.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Doble");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_15.setBounds(573, 128, 52, 14);
		panelCama.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Cama doble");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_16.setBounds(480, 186, 64, 14);
		panelCama.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Estados");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_17.setBounds(480, 218, 46, 14);
		panelCama.add(lblNewLabel_17);
		
		JComboBox comboCamasDobles = new JComboBox();
		comboCamasDobles.setBackground(new Color(255, 255, 255));
		comboCamasDobles.setModel(new DefaultComboBoxModel(new String[] {"Cam 0 - doble", "Cam 1 - doble", "Cam 2 - doble", "Cam 3 - doble", "Cam 4 - doble"}));
		comboCamasDobles.setBounds(573, 182, 125, 22);
		panelCama.add(comboCamasDobles);
		
		JComboBox comboEstadosDobles = new JComboBox();
		comboEstadosDobles.setBackground(new Color(255, 255, 255));
		comboEstadosDobles.setModel(new DefaultComboBoxModel(new String[] {"Mantenimiento", "Operacion"}));
		comboEstadosDobles.setBounds(573, 214, 125, 22);
		panelCama.add(comboEstadosDobles);
		
		JButton btnReporteDobles = new JButton("Generar reporte");
		btnReporteDobles.setBackground(new Color(255, 255, 255));
		btnReporteDobles.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReporteDobles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				String reporte = hotel.reporteCamDoble(comboCamasDobles.getSelectedIndex());

				JOptionPane.showMessageDialog(null, reporte);
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
				}
		});
		btnReporteDobles.setBounds(480, 260, 145, 23);
		panelCama.add(btnReporteDobles);
		
		JButton btnModificarEstDoble = new JButton("Modificar");
		btnModificarEstDoble.setBackground(new Color(255, 255, 255));
		btnModificarEstDoble.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnModificarEstDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio) {
				int estado= comboEstadosDobles.getSelectedIndex();
				if(estado==0) {
					
					String modificacion = hotel.modificarEstadoCamaDoble("Mantenimiento", comboCamasDobles.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Estado para cama doble numero: "+ comboCamasDobles.getSelectedIndex()+" Modificado a Mantenimiento");

				}else {
					String modificacion = hotel.modificarEstadoCamaDoble("Operacion", comboCamasDobles.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Estado para cama doble numero: "+ comboCamasDobles.getSelectedIndex()+" Modificado a Operacion");

				}
				}else {
					JOptionPane.showMessageDialog(null, "Inicie sesion, accion valida solo para el recepcionista");
				}
			}
		});
		btnModificarEstDoble.setBounds(636, 260, 120, 23);
		panelCama.add(btnModificarEstDoble);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 100, 784, 218);
		panelCama.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(0, 301, 784, 218);
		panelCama.add(separator_2_1);
		
		JLabel lblNewLabel_36 = new JLabel("Ingenieria de Software ll");
		lblNewLabel_36.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_36.setBounds(26, 414, 163, 14);
		panelCama.add(lblNewLabel_36);
		
		
		
	}
}
