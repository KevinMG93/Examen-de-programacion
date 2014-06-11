import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaPrincipal extends JFrame {

	//Componentes visuales
	private JPanel contentPane;
	private JTextField matriculaTxt;
	private JTextField horaEntradaTxt;
	private JTextField horaSalidaTxt;
	private JTextField precioPagarTxt;
	private Coche coche;
	private JComboBox <Coche> coches;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Control de Parking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		coches = new JComboBox();
		coches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				coche=coches.getItemAt(coches.getSelectedIndex());
				if(coche!=null)
				{
					
					// Muestre los datos
					matriculaTxt.setText(coche.getcoche());
					horaEntradaTxt.setText(String.valueOf(coche.gethoraentrada()));
					horaSalidaTxt.setText(String.valueOf(coche.gethorasalida()));
					precioPagarTxt.setText(String.valueOf(coche.getprecio()));
					
					}
				
			}
		});
		coches.setBounds(10, 29, 414, 20);
		contentPane.add(coches);
		
		JLabel lblListadoDeCoches = new JLabel("Listado de coches");
		lblListadoDeCoches.setBounds(10, 4, 151, 14);
		contentPane.add(lblListadoDeCoches);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
		lblMatrcula.setBounds(10, 67, 89, 14);
		contentPane.add(lblMatrcula);
		
		JLabel lblHoraDeEntrada = new JLabel("Hora de entrada");
		lblHoraDeEntrada.setBounds(10, 100, 101, 14);
		contentPane.add(lblHoraDeEntrada);
		
		JLabel lblHoraDeSalida = new JLabel("Hora de salida");
		lblHoraDeSalida.setBounds(10, 136, 101, 14);
		contentPane.add(lblHoraDeSalida);
		
		JLabel lblPrecioAPagar = new JLabel("Precio a pagar");
		lblPrecioAPagar.setBounds(10, 172, 101, 14);
		contentPane.add(lblPrecioAPagar);
		
		matriculaTxt = new JTextField();
		matriculaTxt.setBounds(119, 60, 86, 20);
		contentPane.add(matriculaTxt);
		matriculaTxt.setColumns(10);
		
		horaEntradaTxt = new JTextField();
		horaEntradaTxt.setColumns(10);
		horaEntradaTxt.setBounds(119, 97, 86, 20);
		contentPane.add(horaEntradaTxt);
		
		horaSalidaTxt = new JTextField();
		horaSalidaTxt.setColumns(10);
		horaSalidaTxt.setBounds(119, 133, 86, 20);
		contentPane.add(horaSalidaTxt);
		
		precioPagarTxt = new JTextField();
		precioPagarTxt.setEditable(false);
		precioPagarTxt.setColumns(10);
		precioPagarTxt.setBounds(119, 169, 86, 20);
		contentPane.add(precioPagarTxt);
		
		JButton btnNewButton = new JButton("A PAGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(matriculaTxt.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Error");
				}
				else if	(horaEntradaTxt.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Debe ser un numero entre 0 y 23");
				}
				else if	(horaSalidaTxt.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Debe ser un numero entre 0 y 23");
				}
				else if	(precioPagarTxt.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Error");
				}
				
				else {
				
				Coche D =new Coche();	
				
				D.setcoche(matriculaTxt.getText());
				D.sethoraentrada(Integer.parseInt(horaEntradaTxt.getText()));
				D.sethorasalida(Integer.parseInt(horaSalidaTxt.getText()));
				D.setprecio(Integer.parseInt(precioPagarTxt.getText()));
			
				coches.addItem(D);
				}
				
			}
		});
		btnNewButton.setBounds(230, 58, 194, 128);
		contentPane.add(btnNewButton);
		
		
	}
}
