import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Interface extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textFieldEntrada;
	private JTextField textResultado;
	
	
	
	//******************************************

	private JTextField textComentarios;
	private JMenuItem mntmDOLAR;
	private JTextField textFieldMonedaActual;
	private JMenuItem mntmEURO;
	private JMenuItem mntmLibrasEsterlinas;
	private JMenuItem mntmYenJaponés;
	private JMenuItem mntmWonSurCoreano;
	private JTextField textFieldingresoDeMonedaSeleccionada;
	private JTextField textFieldCampoConversióApesoChileno;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 361);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldEntrada = new JTextField();
		textFieldEntrada.setBounds(321, 114, 96, 19);
		
		contentPane.add(textFieldEntrada);
		textFieldEntrada.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setColumns(10);
		textResultado.setBounds(321, 144, 96, 19);
		contentPane.add(textResultado);
		
		JLabel lblMontoPesos = new JLabel("Ingrese AQUI Monto en Pesos >>");
		lblMontoPesos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMontoPesos.setBounds(10, 108, 214, 28);
		contentPane.add(lblMontoPesos);
		
		JLabel lblConversion = new JLabel("Conversion a Moneda foránea");
		lblConversion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConversion.setBounds(10, 138, 227, 28);
		contentPane.add(lblConversion);
		
		textComentarios = new JTextField();
		textComentarios.setColumns(10);
		textComentarios.setBounds(334, 261, 205, 31);
		contentPane.add(textComentarios);
		
		JLabel lblComentarios = new JLabel("Detalle de conversión de peso a moneda externa");
		lblComentarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComentarios.setBounds(10, 261, 301, 28);
		contentPane.add(lblComentarios);
		
		JLabel lblMonedaActual = new JLabel("Moneda seleccionada");
		lblMonedaActual.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMonedaActual.setBounds(10, 196, 146, 28);
		contentPane.add(lblMonedaActual);
		
		textFieldMonedaActual = new JTextField();
		textFieldMonedaActual.setEditable(false);
		textFieldMonedaActual.setColumns(10);
		textFieldMonedaActual.setBounds(10, 232, 129, 19);
		contentPane.add(textFieldMonedaActual);
		
		JLabel lblMontoEnMonedaSeleccionada = new JLabel("Ingrese AQUI Monto en moneda foránea>>");
		lblMontoEnMonedaSeleccionada.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMontoEnMonedaSeleccionada.setBounds(10, 43, 301, 28);
		contentPane.add(lblMontoEnMonedaSeleccionada);
		
		textFieldingresoDeMonedaSeleccionada = new JTextField();
		textFieldingresoDeMonedaSeleccionada.setColumns(10);
		textFieldingresoDeMonedaSeleccionada.setBounds(321, 49, 96, 19);
		contentPane.add(textFieldingresoDeMonedaSeleccionada);
		
		JLabel lblConversionAPeso = new JLabel("Conversion A PesosChilenos");
		lblConversionAPeso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConversionAPeso.setBounds(10, 70, 188, 28);
		contentPane.add(lblConversionAPeso);
		
		textFieldCampoConversióApesoChileno = new JTextField();
		textFieldCampoConversióApesoChileno.setColumns(10);
		textFieldCampoConversióApesoChileno.setBounds(321, 78, 96, 19);
		contentPane.add(textFieldCampoConversióApesoChileno);
		
		JLabel lblTituloPrincipal = new JLabel("Conversor de monedas");
		lblTituloPrincipal.setBounds(176, -6, 214, 39);
		contentPane.add(lblTituloPrincipal);
		lblTituloPrincipal.setIcon(null);
		lblTituloPrincipal.setBackground(new Color(128, 255, 255));
		lblTituloPrincipal.setFont(new Font("Swis721 Ex BT", Font.BOLD, 14));
		lblTituloPrincipal.setForeground(new Color(0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 166, 562, 27);
		contentPane.add(menuBar);
		
		JMenu Moneda = new JMenu("Seleccione moneda AQUI después de colocar monto  ");
		Moneda.setBackground(new Color(255, 128, 64));
		Moneda.setForeground(new Color(128, 0, 0));
		menuBar.add(Moneda);
		Moneda.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		
		mntmDOLAR = new JMenuItem("DOLAR");
		mntmDOLAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Moneda.add(mntmDOLAR);
		mntmDOLAR.addActionListener(this);
		
		
		mntmEURO = new JMenuItem("EURO");
		mntmEURO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Moneda.add(mntmEURO);
		mntmEURO.addActionListener(this);
		
		
		mntmLibrasEsterlinas = new JMenuItem("Libras Esterlinas");
		mntmLibrasEsterlinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Moneda.add(mntmLibrasEsterlinas);
		mntmLibrasEsterlinas.addActionListener(this);
		
		mntmYenJaponés = new JMenuItem("Yen Japonés");
		mntmYenJaponés.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Moneda.add(mntmYenJaponés);
		mntmYenJaponés.addActionListener(this);
		
		mntmWonSurCoreano = new JMenuItem("Won SurCoreano");
		mntmWonSurCoreano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Moneda.add(mntmWonSurCoreano);
		mntmWonSurCoreano.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==mntmDOLAR) {
			Double MontoDolar=Double.parseDouble(textFieldingresoDeMonedaSeleccionada.getText());
			textFieldMonedaActual.setText("Dolar");
			Monedas Dolar = new Monedas();
			Dolar.setDolar(MontoDolar);
			textFieldCampoConversióApesoChileno.setText(Dolar.getDeDolarApeso()+"");//simple
	
			Double monto1= Double.parseDouble(textFieldEntrada.getText());//!!1
			textFieldMonedaActual.setText("Dolar");
			Monedas PesoChileno = new Monedas();//!!2
			PesoChileno.setPesoChileno(monto1);//!!3
			textComentarios.setText( PesoChileno.getdepesoAdolar()+"");
			textResultado.setText(Math.round(((PesoChileno.getdepesoAdolar())*100.0)/100.0)+"");//!!4
		}
		
		
		
		else if(e.getSource()==mntmEURO) {
			Double MontoEuro=Double.parseDouble(textFieldingresoDeMonedaSeleccionada.getText());
			textFieldMonedaActual.setText("EURO");
			Monedas Euro = new Monedas();
			Euro.setEuro(MontoEuro);
			textFieldCampoConversióApesoChileno.setText(Euro.getDeEuroApeso()+"");// simple
			
			Double monto2= Double.parseDouble(textFieldEntrada.getText());
			textFieldMonedaActual.setText("EURO");
			Monedas PesoChileno2 = new Monedas();
			PesoChileno2.setPesoChileno(monto2);
			textComentarios.setText( PesoChileno2.getdepesoAEuro()+"");
			textResultado.setText(Math.round(((PesoChileno2.getdepesoAEuro())*100.0)/100.0)+"");}
		
		
	
		
		else if(e.getSource()==mntmLibrasEsterlinas) {
			Double MontoLibrasEsterlinas=Double.parseDouble(textFieldingresoDeMonedaSeleccionada.getText());
			textFieldMonedaActual.setText("Libras Esterlinas");
			Monedas LibrasEsterlinas = new Monedas();
			LibrasEsterlinas.setLibrasEsterlinas(MontoLibrasEsterlinas);
			textFieldCampoConversióApesoChileno.setText(LibrasEsterlinas.getdeLibrasEsterlinasAPeso()+"");//simple
			
			Double monto3= Double.parseDouble(textFieldEntrada.getText());
			textFieldMonedaActual.setText("Libras Esterlinas");
			Monedas PesoChileno3 = new Monedas();
			PesoChileno3.setPesoChileno(monto3);
			textComentarios.setText( PesoChileno3.getdepesoALibrasEsterlinas()+"");
			textResultado.setText(Math.round(((PesoChileno3.getdepesoALibrasEsterlinas())*100.0)/100.0)+"");}
		
		
		
		
		else if(e.getSource()==mntmYenJaponés) {
			Double MontoYenJaponés=Double.parseDouble(textFieldingresoDeMonedaSeleccionada.getText());
			textFieldMonedaActual.setText("Yen Japonés");
			Monedas YenJaponés = new Monedas();
			YenJaponés.setYenJaponés(MontoYenJaponés);
			textFieldCampoConversióApesoChileno.setText(YenJaponés.getdeYenJaponésapeso()+"");//simple	
				
			Double monto4= Double.parseDouble(textFieldEntrada.getText());
			textFieldMonedaActual.setText("Yen Japonés");
			Monedas PesoChileno4 = new Monedas();
			PesoChileno4.setPesoChileno(monto4);
			textComentarios.setText( PesoChileno4.getdepesoAYenJaponés()+"");
			textResultado.setText(Math.round(((PesoChileno4.getdepesoAYenJaponés())*100.0)/100.0)+"");}
		
		
	
		else if(e.getSource()==mntmWonSurCoreano) {
			Double MontoWonSurCoreano=Double.parseDouble(textFieldingresoDeMonedaSeleccionada.getText());
			textFieldMonedaActual.setText("Won Sul-Coreano");
			Monedas WonSurCoreano = new Monedas();
			WonSurCoreano.setWonSurCoreano(MontoWonSurCoreano);
			textFieldCampoConversióApesoChileno.setText(WonSurCoreano.getdeWonSurCoreanoAPeso()+"");//simple
			
			Double monto5= Double.parseDouble(textFieldEntrada.getText());
			textFieldMonedaActual.setText("Won SurCoreano");
			Monedas PesoChileno5 = new Monedas();
			PesoChileno5.setPesoChileno(monto5);
			textComentarios.setText( PesoChileno5.getdePesoAWonSurCoreano()+"");
			textResultado.setText(Math.round(((PesoChileno5.getdePesoAWonSurCoreano())*100.0)/100.0)+"");}
	//***************************************************************************************
		

	
}
}
	
	





	
	
	

