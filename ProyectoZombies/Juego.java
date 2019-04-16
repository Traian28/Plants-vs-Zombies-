import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Juego extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected int dinero;
	protected int puntaje;
	protected Tablero tablero;
	protected boolean sigueJuego;
	protected ArrayList<Zombie> zombiesEnJuego;
	
	//CONSTRUCTOR
	public Juego(){
		dinero=0;puntaje=0;tablero=new Tablero();
		sigueJuego=true;zombiesEnJuego=new ArrayList<Zombie>();
	}
	
	//COMANDOS
	public void setSigueJuego(boolean s){
		sigueJuego=s;
	}
	
	public void iniciarJuego(){
		generarOlaZombies();
		(new HiloColocacionZombies(tablero,zombiesEnJuego)).start();
	//	GAME();

	}
	private void logica(){
		tablero.avanzarZombies(this);

	}
	
	public void run(){
		generarOlaZombies();
		(new HiloColocacionZombies(tablero,zombiesEnJuego)).start();
	
		while(sigueJuego){
			logica();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}

	}
	
	//CONSULTAS
	private void generarOlaZombies(){
		for(int i=0;i<20;i++)
			zombiesEnJuego.add(generarZombie());
	}
	private Zombie generarZombie(){
		Random r=new Random();Zombie z;
	//	int x=r.nextInt(10)+1;
		int fila=(r.nextInt(5)+1);
	/*	if((x==1)||(x==4)||(x==9))
			z=new Basico(fila,8);
		else if((x==2)||(x==8))
				z=new Soldado(fila,8);
			 else if((x==3)||(x==6))
				 	 z=new Atleta(fila,8);
			 	  else if((x==7)||(x==5))
			 		  	  z=new Resucitador(fila,8);
			 	  	   else z=new Multiplicador(fila,8);*/
		z=new Basico(fila,8);
		return z;		
	}
	public boolean sigueJuego(){
		return sigueJuego;
	}
	public Iterator<Zombie> zombies(){
		return tablero.getZombies();
	}


}
