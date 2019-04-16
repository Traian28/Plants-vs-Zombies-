import java.awt.*;

import javax.swing.*;


public class PanelConFondo extends JPanel{
	//ATRIBUTOS DE INSTANCIA
	protected Image imagen;
	
	//CONSTRUCTOR
	public PanelConFondo(){
		imagen=new ImageIcon("C:/Users/Traian/Downloads/image.jpg").getImage();
	}

	 public void paint(Graphics g) {
		 g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		 setOpaque(false);
		 super.paint(g);
	 }

}
