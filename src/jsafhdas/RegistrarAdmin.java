package jsafhdas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegistrarAdmin {
	public static String usuario;
	public static String contrasena;
	public static String correo;
	public static String noMatricula;

	public static String getUsuario() {
		return usuario;
	}

	public JTextField getTxtCodigoAcceso() {
		return txtCodigoAcceso;
	}

	public void setTxtCodigoAcceso(JTextField txtCodigoAcceso) {
		this.txtCodigoAcceso = txtCodigoAcceso;
	}

	public static void setUsuario(String usuario) {
		RegistrarAdmin.usuario = usuario;
	}

	public static String getContrasena() {
		return contrasena;
	}

	public static void setContrasena(String contrasena) {
		RegistrarAdmin.contrasena = contrasena;
	}

	public static String getCorreo() {
		return correo;
	}

	public static void setCorreo(String correo) {
		RegistrarAdmin.correo = correo;
	}

	public static String getNoMatricula() {
		return noMatricula;
	}

	public static void setNoMatricula(String noMatricula) {
		RegistrarAdmin.noMatricula = noMatricula;
	}

	public JFrame getFrame() {
		return frmRegistroDeAdmin;
	}

	public void setFrame(JFrame frame) {
		this.frmRegistroDeAdmin = frame;
	}

	public JFrame frmRegistroDeAdmin;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JTextField txtCorreo;
	private JTextField txtNoMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarAdmin window = new RegistrarAdmin();
					window.frmRegistroDeAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrarAdmin() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeAdmin = new JFrame();
		frmRegistroDeAdmin.setAlwaysOnTop(true);
		frmRegistroDeAdmin.setTitle("Registro de Admin");
		frmRegistroDeAdmin.setBounds(100, 100, 576, 323);
		frmRegistroDeAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeAdmin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(51, 11, 123, 29);
		frmRegistroDeAdmin.getContentPane().add(lblNewLabel);

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(51, 34, 215, 23);
		frmRegistroDeAdmin.getContentPane().add(txtUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblContrasea.setBounds(320, 11, 123, 29);
		frmRegistroDeAdmin.getContentPane().add(lblContrasea);

		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(311, 34, 215, 23);
		frmRegistroDeAdmin.getContentPane().add(txtContrasena);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblCorreo.setBounds(51, 68, 123, 29);
		frmRegistroDeAdmin.getContentPane().add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(51, 108, 215, 23);
		frmRegistroDeAdmin.getContentPane().add(txtCorreo);

		JLabel lblNomatricula = new JLabel("NoMatricula");
		lblNomatricula.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblNomatricula.setBounds(320, 68, 123, 29);
		frmRegistroDeAdmin.getContentPane().add(lblNomatricula);

		txtNoMatricula = new JTextField();
		txtNoMatricula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNoMatricula.getText().length() >= 14) {
					e.consume();
				}
			}

		});
		txtNoMatricula.setColumns(10);
		txtNoMatricula.setBounds(311, 108, 215, 23);
		frmRegistroDeAdmin.getContentPane().add(txtNoMatricula);

		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {

				if (!txtCodigoAcceso.getText().isEmpty() && !txtContrasena.getText().isEmpty()
						&& !txtCorreo.getText().isEmpty() && !txtNoMatricula.getText().isEmpty()
						&& !txtUsuario.getText().isEmpty()) {
					if (txtCodigoAcceso.getText().equals("153907")) {
						registrar();
					} else {
						JOptionPane.showMessageDialog(null, "El codigo de acceso no es el indicado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben de estar llenos");
				}

			}
		});
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(320, 168, 161, 29);
		frmRegistroDeAdmin.getContentPane().add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaInicio pi = new PantallaInicio();
				frmRegistroDeAdmin.setVisible(false);
				pi.frmInicio.setVisible(true);
				
			}
		});
		btnCerrar.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 16));
		btnCerrar.setBackground(Color.CYAN);
		btnCerrar.setBounds(320, 208, 161, 29);
		frmRegistroDeAdmin.getContentPane().add(btnCerrar);

		JLabel lblCodigoDeAcceso = new JLabel("Codigo de acceso");
		lblCodigoDeAcceso.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblCodigoDeAcceso.setBounds(51, 152, 190, 29);
		frmRegistroDeAdmin.getContentPane().add(lblCodigoDeAcceso);

		txtCodigoAcceso = new JTextField();
		txtCodigoAcceso.setColumns(10);
		txtCodigoAcceso.setBounds(51, 192, 215, 23);
		frmRegistroDeAdmin.getContentPane().add(txtCodigoAcceso);
	}

	conection conec = new conection();
	private JTextField txtCodigoAcceso;

	public boolean registrar() {
		boolean registrado = false;

		setUsuario(txtUsuario.getText());
		setContrasena(txtContrasena.getText());
		setCorreo(txtCorreo.getText());
		setNoMatricula(txtNoMatricula.getText());
		registrado = conec.registrarAdministrador(this);

		if (registrado == true) {

			JOptionPane.showMessageDialog(null, "OK");
		}

		return registrado;
	}

}
