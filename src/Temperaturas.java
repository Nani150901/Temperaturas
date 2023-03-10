import static java.awt.Font.PLAIN;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Temperaturas extends JFrame{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
	JLabel txtResultado;
	public Temperaturas() {
		getContentPane().setLayout(gbl); 
        setTitle("Calculadora"); 
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setBackground(Color.BLACK); 
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
	public void estiloBtn(JButton c) {
		c.setFont(new Font("MONOSPACED",PLAIN,30));
		c.setOpaque(true); 
        c.setForeground(Color.BLACK); 
        add(c);
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
