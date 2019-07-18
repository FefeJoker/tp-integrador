package isi.died.tp.interfaces;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PantallaMenu implements ActionListener{
	private static PantallaMenu single;
	JPanel panel;
	final static String INSUMOS = "Insumos";
    final static String PLANTAS = "Plantas";
    final static String STOCK = "Stock de Insumos";
    final static String CAMINOS = "Caminos";
    final static String CAMIONES = "Camiones";
    final static String INFORMACION = "Informacion";
    
    private PantallaMenu(){}
    
    public static PantallaMenu crearPantalla(JPanel p){
    	if(single == null) {
    		single = new PantallaMenu();
        	single.agregarPantalla(p);
    	}
    	return single;
    }
    
    public void agregarPantalla(JPanel p) {
    	panel = new JPanel();
    	JButton insumos = new JButton(INSUMOS);
    	JButton plantas = new JButton(PLANTAS);
    	JButton stock = new JButton(STOCK);
    	JButton caminos = new JButton(CAMINOS);
    	JButton camiones = new JButton(CAMIONES);
    	JButton informacion = new JButton(INFORMACION);
    	insumos.addActionListener(this);
    	plantas.addActionListener(this);
    	stock.addActionListener(this);
    	caminos.addActionListener(this);
    	camiones.addActionListener(this);
    	informacion.addActionListener(this);
    	
    	panel.add(insumos);
    	panel.add(plantas);
    	panel.add(stock);
    	panel.add(caminos);
    	panel.add(camiones);
    	panel.add(informacion);
    	
    	p.add(panel, "Menu");
    }
    
    public void actionPerformed(ActionEvent e){
		String button = ((JButton) e.getSource()).getText();
		
		JPanel p = (JPanel)panel.getParent();
		CardLayout pane = (CardLayout)(p.getLayout());
		pane.show(p, button);
	}
}