package isi.died.tp.interfaces;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//Esta clase no se usa para nada, es un testeo.

public class PantallaPrincipalPrueba implements ActionListener{
	JPanel panel;
	//final static String MENU = "Menu";
    final static String INSUMOS = "Insumos";
    final static String PLANTAS = "Plantas";
    final static String STOCK = "Stock de Insumos";
    final static String CAMINOS = "Caminos";
    final static String CAMIONES = "Camiones";
    final static String INFORMACION = "Informacion";
    //final static String CREAR = "Crear";
    //final static String BUSCAR = "Buscar";
    //final static String EDITAR = "Editar";
    //final static String BORRAR = "Borrar";
    
    public void agregarComponentePane(Container pane) {
    	panel = new JPanel(new CardLayout());
    	
    	JPanel panelMenu = new JPanel();
    	JButton insumos = new JButton(INSUMOS);
    	JButton plantas = new JButton(PLANTAS);
    	insumos.addActionListener(this);
    	plantas.addActionListener(this);
    	
    	panelMenu.add(insumos);
    	panelMenu.add(plantas);
    	panelMenu.add(new JButton(STOCK));
    	panelMenu.add(new JButton(CAMINOS));
    	panelMenu.add(new JButton(CAMIONES));
    	panelMenu.add(new JButton(INFORMACION));
    	
    	JPanel panelInsumos = new JPanel();
    	//JButton menu1 = new JButton(MENU);
    	//menu1.addActionListener(this);
    	
    	//panelInsumos.add(menu1);
    	//panelInsumos.add(new JButton(CREAR));
    	//panelInsumos.add(new JButton(BUSCAR));
    	//panelInsumos.add(new JButton(EDITAR));
    	//panelInsumos.add(new JButton(BORRAR));
    	
    	//JPanel panelPlantas = new JPanel();
    	//JButton menu2 = new JButton(MENU);
    	//menu2.addActionListener(this);
    	
    	//panelPlantas.add(menu2);
    	//panelPlantas.add(new JButton(CREAR));
    	//panelPlantas.add(new JButton(BUSCAR));
    	//panelPlantas.add(new JButton(EDITAR));
    	//panelPlantas.add(new JButton(BORRAR));
    	//panel.add(panelMenu, MENU);
    	//panel.add(panelInsumos, INSUMOS);
    	//panel.add(panelPlantas, PLANTAS);
    	
    	pane.add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
		String button = ((JButton) e.getSource()).getText();
		
		CardLayout cl = (CardLayout)(panel.getLayout());
		cl.show(panel, button);
	}
    
    private static void crearYmostrarUI() {
        JFrame frame = new JFrame("Prueba");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         
        PantallaPrincipalPrueba demo = new PantallaPrincipalPrueba();
        demo.agregarComponentePane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	PantallaPrincipalPrueba.crearYmostrarUI();
    }
     
}