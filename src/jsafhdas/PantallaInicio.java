package jsafhdas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaInicio {
	public static String usuario;
	public static String contrasena;

	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		PantallaInicio.usuario = usuario;
	}

	public static String getContrasena() {
		return contrasena;
	}

	public static void setContrasena(String contrasena) {
		PantallaInicio.contrasena = contrasena;
	}

	public RegisterUser getRu() {
		return ru;
	}

	public void setRu(RegisterUser ru) {
		this.ru = ru;
	}

	public JFrame getFrmInicio() {
		return frmInicio;
	}

	public void setFrmInicio(JFrame frmInicio) {
		this.frmInicio = frmInicio;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JPasswordField getPsContrasena() {
		return psContrasena;
	}

	public void setPsContrasena(JPasswordField psContrasena) {
		this.psContrasena = psContrasena;
	}

	public JTextField getTxtUsuarioAdmin() {
		return txtUsuarioAdmin;
	}

	public void setTxtUsuarioAdmin(JTextField txtUsuarioAdmin) {
		this.txtUsuarioAdmin = txtUsuarioAdmin;
	}

	public JPasswordField getPsContrasenaAdmin() {
		return psContrasenaAdmin;
	}

	public void setPsContrasenaAdmin(JPasswordField psContrasenaAdmin) {
		this.psContrasenaAdmin = psContrasenaAdmin;
	}

	RegisterUser ru = new RegisterUser();
	public JFrame frmInicio;
	private JTextField txtUsuario;
	private JPasswordField psContrasena;
	private JTextField txtUsuarioAdmin;
	private JPasswordField psContrasenaAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio window = new PantallaInicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaInicio() {
		initialize();
		conection con = new conection();

		con.conectar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setTitle("PANTALLA DE INICIO");
		frmInicio.setBounds(100, 100, 795, 372);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicio.getContentPane().setLayout(null);

		JLabel lblReportarDanos = new JLabel("Reportar da\u00F1os");
		lblReportarDanos.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 24));
		lblReportarDanos.setBounds(49, 38, 241, 42);
		frmInicio.getContentPane().add(lblReportarDanos);

		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 24));
		lblAdministrador.setBounds(515, 38, 241, 42);
		frmInicio.getContentPane().add(lblAdministrador);

		JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.setBackground(Color.ORANGE);
		btnIniciarSesion.setForeground(new Color(0, 0, 0));
		btnIniciarSesion.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnIniciarSesion.setBounds(36, 233, 189, 33);
		frmInicio.getContentPane().add(btnIniciarSesion);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtUsuario.getText().isEmpty() && !psContrasena.getText().isEmpty()) {
					valid();

				} else {
					JOptionPane.showMessageDialog(null, "Debes llenas todos los campos");
				}

			}
		});

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInicio.setVisible(false);
				ru.frmRegistroDeUsuario.setVisible(true);
				
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {		
		});
		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnRegistrar.setBounds(455, 277, 189, 33);
		frmInicio.getContentPane().add(btnRegistrar);

		btnRegistrar.setBackground(Color.GREEN);
		btnRegistrar.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnRegistrar.setBounds(36, 277, 189, 33);
		frmInicio.getContentPane().add(btnRegistrar);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 19));
		lblUsuario.setBounds(10, 107, 88, 42);
		frmInicio.getContentPane().add(lblUsuario);

		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 19));
		lblContrasena.setBounds(10, 160, 122, 42);
		frmInicio.getContentPane().add(lblContrasena);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(138, 116, 213, 20);
		frmInicio.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		psContrasena = new JPasswordField();
		psContrasena.setBounds(139, 169, 212, 20);
		frmInicio.getContentPane().add(psContrasena);

		JLabel lblUsuarioAdmin = new JLabel("Usuario");
		lblUsuarioAdmin.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 19));
		lblUsuarioAdmin.setBounds(455, 107, 88, 42);
		frmInicio.getContentPane().add(lblUsuarioAdmin);

		JLabel lblContrasenaAdmin = new JLabel("Contrase\u00F1a");
		lblContrasenaAdmin.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 19));
		lblContrasenaAdmin.setBounds(455, 160, 122, 42);
		frmInicio.getContentPane().add(lblContrasenaAdmin);

		txtUsuarioAdmin = new JTextField();
		txtUsuarioAdmin.setColumns(10);
		txtUsuarioAdmin.setBounds(590, 116, 179, 20);
		frmInicio.getContentPane().add(txtUsuarioAdmin);

		psContrasenaAdmin = new JPasswordField();
		psContrasenaAdmin.setBounds(590, 169, 179, 20);
		frmInicio.getContentPane().add(psContrasenaAdmin);

		JButton btnIniciarSesionAdmin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesionAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciarSesionAdmin.setForeground(Color.BLACK);
		btnIniciarSesionAdmin.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnIniciarSesionAdmin.setBackground(Color.ORANGE);
		btnIniciarSesionAdmin.setBounds(455, 233, 189, 33);
		frmInicio.getContentPane().add(btnIniciarSesionAdmin);

		JButton btnRegistrarAdmin = new JButton("Registrar");
		btnRegistrarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarAdmin ra = new RegistrarAdmin();
				ra.frmRegistroDeAdmin.setVisible(true);
				frmInicio.setVisible(false);
			}
		});
		btnRegistrarAdmin.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnRegistrarAdmin.setBackground(Color.GREEN);
		btnRegistrarAdmin.setBounds(455, 280, 189, 33);
		frmInicio.getContentPane().add(btnRegistrarAdmin);
	}

	RegisterUser rus = new RegisterUser();
	RegistrarAdmin ra = new RegistrarAdmin();
	conection conec = new conection();

	public boolean encon() {
		boolean si = false;
		setUsuario(txtUsuario.getText());
		setContrasena(psContrasena.getText());

		si = conec.log(usuario, contrasena);
		if (si == true) {
			//JOptionPane.showMessageDialog(null, "encontrado");
			frmInicio.setVisible(false);
		} else {
			si = false;
			JOptionPane.showMessageDialog(null, "Usuario no registrado");
			rus.frmRegistroDeUsuario.setVisible(true);

		}
		return si;
	}

	public boolean valid() {
		boolean validar = false;

		if (encon() == true) {
			validar = true;
			RegistroDanos rd = new RegistroDanos();
			rd.getFrmRegistrodedaos().setVisible(true);
		}

		return validar;
	}
}
