import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class HiloGrafica extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected Juego juego;
	protected JPanel panel;
	
	//CONSTRUCTOR
	public HiloGrafica(Juego j,JPanel p){
		juego=j;panel=p;
		
	}
	
	//COMANDOS
	public void run(){
		Zombie z;JLabel grafica;Iterator<Zombie> zombies;
		while(juego.sigueJuego()){
			zombies=juego.zombies();
			while((juego.sigueJuego())&&(zombies.hasNext())){
				z=zombies.next();
				grafica=z.getGrafica();
				grafica.setBounds(z.getPosX(),z.getPosY(),100,100);
				panel.add(grafica);}}
		
	}

}
