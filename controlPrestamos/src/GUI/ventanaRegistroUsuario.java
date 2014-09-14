package GUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Administradores.administradorAplicacion;
import Estructuras.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class ventanaRegistroUsuario extends JInternalFrame 
{
	private JTextField fieldNombre;
	private JTextField fieldNombreUsuario;
	private JPasswordField fieldcontrasena;
	private static ventanaRegistroUsuario miVentanaRegistroUsuario;


	public static ventanaRegistroUsuario getInstance()
	{
		if(miVentanaRegistroUsuario == null)
		{
			miVentanaRegistroUsuario = new ventanaRegistroUsuario();
		}
		return miVentanaRegistroUsuario;
	}
	
	/**
	 * Create the frame.
	 */
	private ventanaRegistroUsuario() 
	{
		setTitle("Mea Providere - Registro Usuario");
		setFrameIcon(new ImageIcon(ventanaRegistroUsuario.class.getResource("/Recursos/ImagenesGUI/Logo Adrian.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setIconifiable(true);
		setBounds(100, 100, 351, 232);
		getContentPane().setLayout(null);
		
		fieldNombre = new JTextField();
		fieldNombre.setBounds(171, 11, 150, 20);
		getContentPane().add(fieldNombre);
		fieldNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 14, 122, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setBounds(10, 68, 94, 14);
		getContentPane().add(lblNombreUsuario);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(10, 116, 86, 14);
		getContentPane().add(lblContrasena);
		
		fieldNombreUsuario = new JTextField();
		fieldNombreUsuario.setBounds(171, 65, 150, 20);
		getContentPane().add(fieldNombreUsuario);
		fieldNombreUsuario.setColumns(10);
		
		fieldcontrasena = new JPasswordField();
		fieldcontrasena.setBounds(171, 113, 150, 20);
		getContentPane().add(fieldcontrasena);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(!fieldNombre.getText().isEmpty() && !fieldNombreUsuario.getText().isEmpty() && !fieldcontrasena.getText().isEmpty())
				{
					administradorAplicacion.getInstance().setUsuario(new Usuario(fieldNombre.getText(), fieldNombreUsuario.getText(), fieldcontrasena.getText()));
					fieldNombre.setText("");
					fieldNombreUsuario.setText("");
					fieldcontrasena.setText("");
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Usuario agregado con �xito");
					//System.out.println("Usuario agregado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos del formulario");
				}
			}
			
		});
		btnAceptar.setBounds(43, 169, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				fieldNombre.setText("");
				fieldNombreUsuario.setText("");
				fieldcontrasena.setText("");
				setVisible(false);
			}
		});
		btnCancelar.setBounds(183, 169, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
