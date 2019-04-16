import java.util.*;
public class Gleen extends Humano{
	//CONSTRUCTOR
	public Gleen(int X,int Y){
		super(300,5,200,300,0,X,Y);
	}
	
	//COMANDOS
	public void pintar(){
		
	}
	public void explotar(ArrayList<Zombie> zombies){
		for(Zombie z:zombies)
			atacar(z);
	}


}
