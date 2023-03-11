import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Temperaturas extends JFrame{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
	JLabel a,txtResultado,Convertir;
	JTextArea txtGrados;
	JComboBox<String> combTemp,combTemp2;
	String temps[] = {"ºC", "ºF", "ºK", "ºR"};
	 String g,g2;
	public Temperaturas() {
		getContentPane().setLayout(gbl); 
        setTitle("Conversoor temperaturas"); 
        setSize(800,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setBackground(Color.WHITE);
       
		JLabel1(Convertir,"convetir: ",0,0,1,1);
		txtGrados = new JTextArea("0.0"); //Inicio JLabel
		txtGrados.setOpaque(true); //Para poder darle un color de fondo
		txtGrados.setBackground(Color.WHITE); //Color de fondo
		txtGrados.setForeground(Color.BLUE); //Color de fuente
		txtGrados.setBorder(new LineBorder(Color.DARK_GRAY)); //Borde
		txtGrados.setFont(new Font("MONOSPACED", PLAIN, 40)); //Fuente
		metodoMagico(txtGrados,1,0,1,1);
       add(txtGrados); //Añado el JLabel al JFrame
       
        combTemp =new JComboBox<>();
		combTemp.addItem("selesciona una opc.");
		combTemp.addItem("ºC");
		combTemp.addItem("ºF");
		combTemp.addItem("ºK");
		combTemp.addItem("ºR");
		metodoMagico(combTemp,2,0,1,1);
		add(combTemp); //Añado el JLabel al JFrame

		
		JLabel1(a,"A: ",0,2,1,1);
		combTemp2 =new JComboBox<>();
		combTemp2.addItem("selesciona una opc.");
		combTemp2.addItem("ºC");
		combTemp2.addItem("ºF");
		combTemp2.addItem("ºK");
		combTemp2.addItem("ºR");
		metodoMagico(combTemp2,1,2,1,1);
        add(combTemp2); //Añado el JLabel al JFrame
        
        txtResultado = new JLabel("= "); //Inicio JLabel
		txtResultado.setOpaque(true); //Para poder darle un color de fondo
		txtResultado.setBackground(Color.WHITE); //Color de fondo
		txtResultado.setForeground(Color.BLUE); //Color de fuente
		txtResultado.setFont(new Font("MONOSPACED", PLAIN, 40)); //Fuente
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT); //Alineamiento horizontal derecha
		metodoMagico(txtResultado,2,2,1,1);
       add(txtResultado); //Añado el JLabel al JFrame
		eventoOperacion();
		
		setVisible(true);
	}//constructor
	
	public void metodoMagico(Component c,int x, int y, int w, int h) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
	}
	public void JLabel1(JLabel c,String txt,int x, int y, int w, int h) {
		c = new JLabel(txt); //Inicio JLabel
		 c.setOpaque(true); //Para poder darle un color de fondo
		c.setBackground(Color.WHITE); //Color de fondo
		c.setForeground(Color.BLUE); //Color de fuente
		c.setFont(new Font("MONOSPACED", PLAIN, 40)); //Fuente
		c.setHorizontalAlignment(SwingConstants.RIGHT); //Alineamiento horizontal derecha
		metodoMagico(c,x,y,w,h);
        add(c); //Añado el JLabel al JFrame
	}
	
	
	 public void eventoOperacion(){
		
		 combTemp.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					g=combTemp.getSelectedItem().toString();
					try {
						llamadas(g,g2);
					} catch (Exception e2) {
						System.out.println("SOLO NUMEROS !!!!");
					}
				}
			});
		 combTemp2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					g2=combTemp2.getSelectedItem().toString();
					try {
						llamadas(g,g2);
					} catch (Exception e2) {
						System.out.println("SOLO NUMEROS !!!!");
					}
					
				}
			});
	    }
	 public void llamadas(String g,String g2) {
		 if(g=="ºC") {
			 if(g2=="ºC") {
					txtResultado.setText(txtGrados.getText());
				}
			if(g2=="ºF") {
				txtResultado.setText(""+ConvertirTemp.convTemCAF(txtGrados.getText() ));
			}
			if(g2=="ºK") {
				txtResultado.setText(""+ConvertirTemp.convTemCAK(txtGrados.getText() ));
			}
			if(g2=="ºR") {
				txtResultado.setText(""+ConvertirTemp.convTemCAR(txtGrados.getText() ));
			}
		 }
		 if(g=="ºF") {
			 if(g2=="ºC") {
				 	txtResultado.setText(""+ConvertirTemp.convTemFAC(txtGrados.getText() ));
				}
				if(g2=="ºF") {
					txtResultado.setText(txtGrados.getText());
				}
				if(g2=="ºK") {
					txtResultado.setText(""+ConvertirTemp.convTemFAK(txtGrados.getText() ));
				}
				if(g2=="ºR") {
					txtResultado.setText(""+ConvertirTemp.convTemFAR(txtGrados.getText() ));
				}
			 }
		 if(g=="ºK") {
			 if(g2=="ºC") {
					txtResultado.setText(""+ConvertirTemp.convTemKAC(txtGrados.getText() ));
				}
				if(g2=="ºF") {
					txtResultado.setText(""+ConvertirTemp.convTemKAF(txtGrados.getText() ));
				}
				if(g2=="ºK") {
					txtResultado.setText(txtGrados.getText());
				}
				if(g2=="ºR") {
					txtResultado.setText(""+ConvertirTemp.convTemKAR(txtGrados.getText() ));
				}
			 }
		 if(g=="ºR") {
			 if(g2=="ºC") {
				 txtResultado.setText(""+ConvertirTemp.convTemRAC(txtGrados.getText() ));
				}
				if(g2=="ºF") {
					txtResultado.setText(""+ConvertirTemp.convTemRAF(txtGrados.getText() ));
				}
				if(g2=="ºK") {
					txtResultado.setText(""+ConvertirTemp.convTemRAK(txtGrados.getText() ));
				}
				if(g2=="ºR") {
					txtResultado.setText(txtGrados.getText());
				}
			 }
	 }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Temperaturas();
			}
		});

	}

}
