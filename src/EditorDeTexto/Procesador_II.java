package EditorDeTexto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class Procesador_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador_II mimarco=new MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}

class MenuProcesador_II extends JFrame{
	
	public MenuProcesador_II() {
		
		setBounds (500,300,550,450);
		
		LaminaProcesador_II milamina=new LaminaProcesador_II();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaProcesador_II extends JPanel{
	
	public LaminaProcesador_II() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		JMenuBar mibarra=new JMenuBar();
		
		fuente=new JMenu("Fuente");
		
		 estilo=new JMenu("Estilo");
		
		 tamagno=new JMenu("Tamaño");
		 
		 configura_menu("Arial","fuente","Arial",9,10,"");
		 configura_menu("Courier","fuente","Courier",9,10,"");
		 configura_menu("Verdana","fuente","Verdana",9,10,"");
		//________________________________________________//
		 
		 configura_menu("Negrita","estilo","",Font.BOLD,1,"bin/EditorDeTexto/graficos/cortar.gif");
		 configura_menu("Cursiva","estilo","",Font.ITALIC,1,"bin/EditorDeTexto/graficos/copiar.gif");
		 
		 /**JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita",new ImageIcon("bin/EditorDeTexto/graficos/cortar.gif"));
		 JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva",new ImageIcon("bin/EditorDeTexto/graficos/pegar.gif"));
		 negrita.addActionListener(new StyledEditorKit.BoldAction());
		 cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		 
		 estilo.add(negrita);
		 estilo.add(cursiva);**/
		 //_______________________________________________//
		/** configura_menu("12","tamaño","",9,12,"");
		 configura_menu("16","tamaño","",9,16,"");
		 configura_menu("20","tamaño","",9,20,"");
		 configura_menu("24","tamaño","",9,24,"");**/
		 
		 ButtonGroup tamagno_letra=new ButtonGroup();
		 
		 JRadioButtonMenuItem doce=new JRadioButtonMenuItem("12");
		 JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
		 JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
		 JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
		 
		 tamagno_letra.add(doce);
		 tamagno_letra.add(dieciseis);
		 tamagno_letra.add(veinte);
		 tamagno_letra.add(veinticuatro);
		 
		 doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 12));
		 dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 16));
		 veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 20));
		 veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 24));
		 
		 tamagno.add(doce);
		 tamagno.add(dieciseis);
		 tamagno.add(veinte);
		 tamagno.add(veinticuatro);
		 
		 //____________________________________________//
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		miarea=new JTextPane();
		add(miarea,BorderLayout.CENTER);
		add(laminamenu,BorderLayout.NORTH);
		
JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem negritae=new JMenuItem("Negrita");
		JMenuItem cursivae=new JMenuItem("Cursiva");
		
		negritae.addActionListener(new StyledEditorKit.BoldAction());
		cursivae.addActionListener(new StyledEditorKit.ItalicAction());
		
		
		emergente.add(negritae);
		emergente.add(cursivae);
		
		
		miarea.setComponentPopupMenu(emergente);
		
		//----------------------------------------------------------//
		
		/**JToolBar barra=new JToolBar();
		
		JButton negritaBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/pegar.gif"));
		JButton cursivaBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/cortar.gif"));
		JButton subraBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/copiar.gif"));
		JButton redBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/red_opt.png"));
		JButton blueBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/blue_opt.png"));
		JButton amarilloBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/amarillo_opt.png"));
		JButton justifyBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/justify.png"));
		JButton leftBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/left.png"));
		JButton rightBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/right.png"));
		JButton centerBarra=new JButton(new ImageIcon("bin/EditorDeTexto/graficos/center.png"));
		
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		redBarra.addActionListener(new StyledEditorKit.ForegroundAction("", Color.RED));
		blueBarra.addActionListener(new StyledEditorKit.ForegroundAction("", Color.BLUE));
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("", Color.YELLOW));
		justifyBarra.addActionListener(new StyledEditorKit.AlignmentAction("", 3));
		leftBarra.addActionListener(new StyledEditorKit.AlignmentAction("", 0));
		rightBarra.addActionListener(new StyledEditorKit.AlignmentAction("", 2));
		centerBarra.addActionListener(new StyledEditorKit.AlignmentAction("", 1));
		
		
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subraBarra);
		barra.add(redBarra);
		barra.add(blueBarra);
		barra.add(amarilloBarra);
		barra.add(justifyBarra);
		barra.add(leftBarra);
		barra.add(rightBarra);
		barra.add(centerBarra);
		**/
		
		barra=new JToolBar();
		configura_barra("bin/EditorDeTexto/graficos/pegar.gif").addActionListener(new StyledEditorKit.BoldAction());
		configura_barra("bin/EditorDeTexto/graficos/cortar.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configura_barra("bin/EditorDeTexto/graficos/copiar.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		barra.addSeparator();
		
		configura_barra("bin/EditorDeTexto/graficos/red_opt.png").addActionListener(new StyledEditorKit.ForegroundAction("",Color.RED));
		configura_barra("bin/EditorDeTexto/graficos/blue_opt.png").addActionListener(new StyledEditorKit.ForegroundAction("",Color.BLUE));
		configura_barra("bin/EditorDeTexto/graficos/amarillo_opt.png").addActionListener(new StyledEditorKit.ForegroundAction("",Color.YELLOW));
		barra.addSeparator();
		
		configura_barra("bin/EditorDeTexto/graficos/justify.png").addActionListener(new StyledEditorKit.AlignmentAction("",3));
		configura_barra("bin/EditorDeTexto/graficos/left.png").addActionListener(new StyledEditorKit.AlignmentAction("",0));
		configura_barra("bin/EditorDeTexto/graficos/right.png").addActionListener(new StyledEditorKit.AlignmentAction("",1));
		configura_barra("bin/EditorDeTexto/graficos/center.png").addActionListener(new StyledEditorKit.AlignmentAction("",2));

		
		


		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
		
		
		
		//----------------------------------------------------------------------//
	}
	
	public JButton configura_barra(String ruta) {
		JButton boton=new JButton(new ImageIcon(ruta));
		barra.add(boton);
		return boton;}
	
	
	
	public void configura_menu(String rotulo,String menu,String tipo_letra, int estilos,int tam,String ruta_icono) {
		
		JMenuItem elem_menu=new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
		if(menu=="fuente") {
			fuente.add(elem_menu);
			
			if(tipo_letra=="Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Arial"));
			}else if(tipo_letra=="Courier") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Courier"));
			}else if (tipo_letra=="Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Verdana"));
			}
			
		}else if (menu=="estilo") {
			estilo.add(elem_menu);
			if(estilos==Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
			
		}else if(menu=="tamaño") {
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", tam));
	}
		
		
		
		
		

		
	}
	
	JTextPane miarea;
		
	Font letra;
	JMenu fuente,estilo,tamagno;
	JButton negritaBarra,cursivaBarra,subraBarra,blueBarra,redBarra,amarilloBarra,justifyBarra,leftBarra,rightBarra,centerBarra;
	
	JToolBar barra;
	
	
}
