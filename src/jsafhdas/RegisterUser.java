package jsafhdas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class RegisterUser {
	public static String usuario;
	public static String contrasena;

	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		RegisterUser.usuario = usuario;
	}

	public static String getContrasena() {
		return contrasena;
	}

	public static void setContrasena(String contrasena) {
		RegisterUser.contrasena = contrasena;
	}

	public JFrame getFrame() {
		return frmRegistroDeUsuario;
	}

	public void setFrame(JFrame frame) {
		this.frmRegistroDeUsuario = frame;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtContrasena() {
		return txtContrase;
	}

	public void setTxtContrasena(JTextField txtContrasena) {
		this.txtContrase = (JPasswordField) txtContrasena;
	}

	JFrame frmRegistroDeUsuario;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUser window = new RegisterUser();
					window.frmRegistroDeUsuario.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterUser() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeUsuario = new JFrame();
		frmRegistroDeUsuario.setTitle("Registro de Usuario");
		frmRegistroDeUsuario.setBounds(100, 100, 590, 282);
		frmRegistroDeUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeUsuario.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtUsuario.getText().isEmpty() && !txtContrase.getText().isEmpty()) {
					registrar();
					frmRegistroDeUsuario.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Debes llenas todos los campos");
				}

			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmRegistroDeUsuario.setVisible(false);
			}
		});
		btnNewButton.setBounds(70, 142, 123, 29);
		frmRegistroDeUsuario.getContentPane().add(btnNewButton);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(236, 11, 215, 29);
		frmRegistroDeUsuario.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegistroDeUsuario.setVisible(false);
				PantallaInicio pi = new PantallaInicio();
				pi.frmInicio.setVisible(true);
			}
		});
		btnCerrar.setBackground(Color.MAGENTA);
		btnCerrar.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 16));
		btnCerrar.setBounds(285, 144, 123, 29);
		frmRegistroDeUsuario.getContentPane().add(btnCerrar);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(70, 11, 123, 29);
		frmRegistroDeUsuario.getContentPane().add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 16));
		lblContrasea.setBounds(70, 61, 123, 29);
		frmRegistroDeUsuario.getContentPane().add(lblContrasea);

		txtContrase = new JPasswordField();
		txtContrase.setBounds(236, 67, 215, 23);
		frmRegistroDeUsuario.getContentPane().add(txtContrase);

	}

	conection conec = new conection();
	private JPasswordField txtContrase;

	public boolean registrar() {
		boolean registrado = false;

		setUsuario(txtUsuario.getText());
		setContrasena(txtContrase.getText());
		conec.registrarUsuario(this);

		if (registrado == true) {
			JOptionPane.showMessageDialog(null, "OK");
		}

		return registrado;
	}

}
