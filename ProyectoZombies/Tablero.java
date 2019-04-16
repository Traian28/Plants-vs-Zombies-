import java.util.ArrayList;
import java.util.Iterator;

import TDADiccionario.*;


public class Tablero{
	//ATRIBUTOS DE INSTANCIA
	protected Dictionary<Integer,Humano> humanos;
	protected Dictionary<Integer,Zombie> zombies;
	protected ArrayList<Dinero> dinero;
	
	//CONSTRUCTOR
	public Tablero(){
		humanos=new HashTableDictionary<Integer,Humano>();
		zombies=new HashTableDictionary<Integer,Zombie>();
		dinero=new ArrayList<Dinero>();
	}
	
	//COMANDOS
	public void colocarZombie(Zombie z){
		try{
			zombies.insert(z.getFila(),z);
		}catch(InvalidKeyException e){};		
	}
/*	public void colocarHumano(Humano h){
		try{
			humanos.insert(h.getFila(),h);
		}catch(InvalidKeyException e){};		
	}*/
	public void colocarDinero(Dinero d){
		dinero.add(d);		
	}
	public void avanzarZombies(Juego j){
		Zombie z;Iterator<Entry<Integer,Zombie>> it=zombies.entries().iterator();
		while((it.hasNext())&&(j.sigueJuego())){
			z=it.next().getValue();
			if(!z.estaBloqueado()){
				z.avanzar();
				if(z.getColumna()==0)
					j.setSigueJuego(false);
				else (new HiloZombie(z)).start();}}			
	}
	
	//CONSULTAS
	public boolean hayZombieFila(int fila){
		boolean hay=false;;
		try{
			if(zombies.find(fila)!=null);
				hay=true;
		}catch(InvalidKeyException e){}
		return hay;
	}
	public boolean hayHumanoFila(int fila){
		boolean hay=false;
		try{
			if(humanos.find(fila)!=null)
				hay=true;
		}catch(InvalidKeyException e){};
		return hay;
	}
	public Iterator<Zombie> getZombies(){
		ArrayList<Zombie> lista=new ArrayList<Zombie>();
		for(Entry<Integer,Zombie> e:zombies.entries())
			lista.add(e.getValue());
		return lista.iterator();
	}
	
	
}
