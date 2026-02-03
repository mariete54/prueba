package practica1examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.TextArea;
import javax.swing.JScrollPane;


public class Traductor {
	
	private JFrame frame;
	private JTextField txtPalabra;
	private JTextField txtTraduccion;
HashMap<String,String> traductorDePalabas=new HashMap<>();
String palabra;
String traduccion;
private JLabel lblPalabra_1;
private JTextField txtBuscarPalabra;
private JButton btnBuscar;
private JLabel lblLaPalabraEs;
private JLabel lblTraduccionPalabra;
private JLabel lblPalabraParaEliminiar;
private JTextField txtEliminar;
private JButton btnEliminar;
private JTextArea textArea;






	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor window = new Traductor();
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
	public Traductor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(294, 12, 165, 186);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	
		lblLaPalabraEs = new JLabel("La Palabra es :");
		lblLaPalabraEs.setBounds(23, 319, 92, 17);
		frame.getContentPane().add(lblLaPalabraEs);
		
		lblTraduccionPalabra = new JLabel("");
		lblTraduccionPalabra.setBounds(127, 319, 81, 17);
		frame.getContentPane().add(lblTraduccionPalabra);
		
		lblPalabra_1 = new JLabel("Palabra :");
		lblPalabra_1.setBounds(23, 232, 60, 17);
		frame.getContentPane().add(lblPalabra_1);
		
		txtBuscarPalabra = new JTextField();
		txtBuscarPalabra.setBounds(94, 230, 114, 21);
		frame.getContentPane().add(txtBuscarPalabra);
		txtBuscarPalabra.setColumns(10);
		
		JLabel lblPalabra = new JLabel("Palabra");
		lblPalabra.setBounds(23, 31, 60, 17);
		frame.getContentPane().add(lblPalabra);
		
		JLabel lblTraduccin = new JLabel("Traducción");
		lblTraduccin.setBounds(23, 64, 72, 17);
		frame.getContentPane().add(lblTraduccin);
		
		txtPalabra = new JTextField();
		txtPalabra.setBounds(94, 29, 114, 21);
		frame.getContentPane().add(txtPalabra);
		txtPalabra.setColumns(10);
		
		txtEliminar = new JTextField();
		txtEliminar.setBounds(409, 230, 114, 21);
		frame.getContentPane().add(txtEliminar);
		txtEliminar.setColumns(10);
		
		lblPalabraParaEliminiar = new JLabel("Palabra para eliminiar");
		lblPalabraParaEliminiar.setBounds(268, 232, 152, 17);
		frame.getContentPane().add(lblPalabraParaEliminiar);
		
		txtTraduccion = new JTextField();
		txtTraduccion.setBounds(94, 62, 114, 21);
		frame.getContentPane().add(txtTraduccion);
		txtTraduccion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String palabra;
			String traduccion;
				
				palabra=txtPalabra.getText();
				traduccion=txtTraduccion.getText();
				traductorDePalabas.put(palabra, traduccion);
				txtPalabra.setText("");
				txtTraduccion.setText("");
			
				textArea.setText("");
				for(String s: traductorDePalabas.keySet()) {
			
					
				}
				
			}
		});
		btnGuardar.setBounds(52, 120, 105, 27);
		frame.getContentPane().add(btnGuardar);
		
	
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblTraduccionPalabra.setText(traductorDePalabas.get(txtBuscarPalabra.getText()));
			
				
				
			}
		});
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(52, 268, 105, 27);
		frame.getContentPane().add(btnBuscar);
		
	
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			traductorDePalabas.remove(txtEliminar.getText());

				
			}
		});
		btnEliminar.setBounds(354, 268, 105, 27);
		frame.getContentPane().add(btnEliminar);
		
		
	
		
		
		
		
		
		
		
	}
}
