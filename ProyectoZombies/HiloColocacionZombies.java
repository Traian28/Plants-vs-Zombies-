import java.util.ArrayList;


public class HiloColocacionZombies extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected Tablero tablero;
	protected ArrayList<Zombie> zombies;
	
	//CONSTRUCTOR
	public HiloColocacionZombies(Tablero t,ArrayList<Zombie> z){
		tablero=t;zombies=z;
	}
	
	//COMANDOS
	public void run(){
		while(!zombies.isEmpty()){
			tablero.colocarZombie(zombies.remove(0));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}}
	}
}
