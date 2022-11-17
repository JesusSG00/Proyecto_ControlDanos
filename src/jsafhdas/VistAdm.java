package jsafhdas;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

public class VistAdm {
	private static String ID;
	private static String Nombre;
	private static String Cantidad;
	private static String Usuario;
	private static String Descripcion;
	private static String Fecha;
	private static String Estatus;
	private static String Luga;

	public static String getID() {
		return ID;
	}

	public static void setID(String iD) {
		ID = iD;
	}

	public static String getNombre() {
		return Nombre;
	}

	public static void setNombre(String nombre) {
		Nombre = nombre;
	}

	public static String getCantidad() {
		return Cantidad;
	}

	public static void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public static String getUsuario() {
		return Usuario;
	}

	public static void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public static String getDescripcion() {
		return Descripcion;
	}

	public static void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public static String getFecha() {
		return Fecha;
	}

	public static void setFecha(String fecha) {
		Fecha = fecha;
	}

	public static String getEstatus() {
		return Estatus;
	}

	public static void setEstatus(String estatus) {
		Estatus = estatus;
	}

	public static String getLuga() {
		return Luga;
	}

	public static void setLuga(String luga) {
		Luga = luga;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistAdm window = new VistAdm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		conection cn = new conection();
		frame = new JFrame();
		frame.setBounds(100, 100, 764, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(612, 33, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(627, 210, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 548, 509);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Registros", null, layeredPane, null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("New tab", null, layeredPane_1, null);
		cn.ad();
		

	}
}
