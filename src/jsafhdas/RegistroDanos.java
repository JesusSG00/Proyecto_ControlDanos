package jsafhdas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class RegistroDanos {
	private static String nombreMo;
	private static String Lugar;
	private static String Usuario;
	private static String Descrip;
	private static String Cantidad;
	private static String Status = "pendiente";

	private JFrame frmRegistroDeDanos;
	private JTextField txtDescrip;
	private JTextField txtCantidad;
	private JTextField txtNombreMo;

	public static String getStatus() {
		return Status;
	}

	public static void setStatus(String status) {
		Status = status;
	}

	public static String getCantidad() {
		return Cantidad;
	}

	public static void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public static String getLugar() {
		return Lugar;
	}

	public static void setLugar(String lugar) {
		Lugar = lugar;
	}

	public static String getNombreMo() {
		return nombreMo;
	}

	public static void setNombreMo(String nombreMo) {
		RegistroDanos.nombreMo = nombreMo;
	}

	public static String getUsuario() {
		return Usuario;
	}

	public static void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public static String getDescrip() {
		return Descrip;
	}

	public static void setDescrip(String descrip) {
		Descrip = descrip;
	}

	public JFrame getFrmRegistrodedaos() {
		return frmRegistroDeDanos;
	}

	public void setFrmRegistrodedaos(JFrame frmRegistrodedaos) {
		this.frmRegistroDeDanos = frmRegistrodedaos;
	}

	public JTextField getTxtDescrip() {
		return txtDescrip;
	}

	public void setTxtDescrip(JTextField txtDescrip) {
		this.txtDescrip = txtDescrip;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JTextField getTxtNombreMo() {
		return txtNombreMo;
	}

	public void setTxtNombreMo(JTextField txtNombreMo) {
		this.txtNombreMo = txtNombreMo;
	}

	public JTextField getTxtLugar() {
		return txtLugar;
	}

	public void setTxtLugar(JTextField txtLugar) {
		this.txtLugar = txtLugar;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroDanos window = new RegistroDanos();
					window.frmRegistroDeDanos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistroDanos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeDanos = new JFrame();
		frmRegistroDeDanos.setTitle("RegistroDeDanos");
		frmRegistroDeDanos.setBounds(100, 100, 772, 483);
		frmRegistroDeDanos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeDanos.getContentPane().setLayout(null);

		JLabel lblNombreDelMobiliario = new JLabel("Nombre del mobiliario");
		lblNombreDelMobiliario.setBounds(45, 11, 192, 29);
		lblNombreDelMobiliario.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		frmRegistroDeDanos.getContentPane().add(lblNombreDelMobiliario);

		JLabel lblCantidadSolicitada = new JLabel("Cantidad de objetos solicitados");
		lblCantidadSolicitada.setBounds(330, 11, 265, 29);
		lblCantidadSolicitada.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		frmRegistroDeDanos.getContentPane().add(lblCantidadSolicitada);

		JLabel lblDescripcionDelPorque = new JLabel("Descripcion del porque se da\u00F1o el mobiliario");
		lblDescripcionDelPorque.setBounds(32, 166, 372, 34);
		lblDescripcionDelPorque.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		frmRegistroDeDanos.getContentPane().add(lblDescripcionDelPorque);

		txtDescrip = new JTextField();
		txtDescrip.setBounds(32, 211, 497, 128);
		frmRegistroDeDanos.getContentPane().add(txtDescrip);
		txtDescrip.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(330, 37, 265, 34);
		txtCantidad.setColumns(10);
		frmRegistroDeDanos.getContentPane().add(txtCantidad);

		txtNombreMo = new JTextField();
		txtNombreMo.setToolTipText("");
		txtNombreMo.setBounds(32, 37, 245, 34);
		txtNombreMo.setColumns(10);
		frmRegistroDeDanos.getContentPane().add(txtNombreMo);

		JButton btnAgregarReporte = new JButton("Agregar reporte");
		btnAgregarReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtCantidad.getText().isEmpty() && !txtDescrip.getText().isEmpty()
						&& !txtNombreMo.getText().isEmpty()) {
					guardar();
				} else {
					JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
				}

			}
		});
		btnAgregarReporte.setBounds(539, 211, 172, 34);
		btnAgregarReporte.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		frmRegistroDeDanos.getContentPane().add(btnAgregarReporte);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		btnLimpiar.setBounds(539, 256, 172, 34);
		frmRegistroDeDanos.getContentPane().add(btnLimpiar);

		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaInicio pi = new PantallaInicio();
				frmRegistroDeDanos.setVisible(false);
				pi.getFrmInicio().setVisible(true);
			}
		});
		btnCerrarSesion.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		btnCerrarSesion.setBounds(539, 305, 172, 34);
		frmRegistroDeDanos.getContentPane().add(btnCerrarSesion);

		JLabel lblLugar = new JLabel("Lugar donde se solicita");
		lblLugar.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblLugar.setBounds(87, 82, 265, 29);
		frmRegistroDeDanos.getContentPane().add(lblLugar);

		txtLugar = new JTextField();
		txtLugar.setColumns(10);
		txtLugar.setBounds(26, 121, 326, 34);
		frmRegistroDeDanos.getContentPane().add(txtLugar);

	}

	conection cn = new conection();
	private JTextField txtLugar;

	public void limpiar() {
		txtDescrip.setText(" ");
		txtCantidad.setText(" ");
		txtNombreMo.setText(" ");
		txtLugar.setText(" ");

	}

	public boolean guardar() {
		boolean guardado = false;
		

		setNombreMo(txtNombreMo.getText());
		setCantidad(txtCantidad.getText());
		setUsuario(PantallaInicio.usuario);
		setDescrip(txtDescrip.getText());
		setStatus("Pendiente");
		setLugar(txtLugar.getText());
		guardado = cn.insertarRepote(this);
		if (guardado == true) {
			JOptionPane.showMessageDialog(null, "Reporte enviado");
		}
		return guardado;

	}
	
	
}
