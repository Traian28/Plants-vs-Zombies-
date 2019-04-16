import javax.swing.JLabel;


public abstract class Humano extends JLabel implements Runnable{
	//ATRIBUTOS DE INSTANCIA
	protected int daño;
	protected int velocidadDisparo;
	protected int disponibilidad;
	protected int costo;
	protected int puntaje;
	protected boolean puedeAtacar;
	protected int x,y;
	
	//CONSTRUCTOR
	public Humano(int da,int vD,int d,int c,int p, int X, int Y){
		daño=da;velocidadDisparo=vD;disponibilidad=d;
		costo=c;puntaje=p;puedeAtacar=true; x=X; y=Y;
	}
	
	//COMANDOS
	public void atacar(Zombie z){
		z.atacado(daño);
	}
	public void infectado(){
		daño-=daño*0.3;
		velocidadDisparo+=2;
	}
	public void setPuedeAtacar(boolean p){
		puedeAtacar=p;
	}
	public void run(){
		
		
	}
	
	//CONSULTAS
	public int getVelocidadDisparo(){
		return velocidadDisparo;
	}
	public int getDisponibilidad(){
		return disponibilidad;
	}
	public int getCosto(){
		return costo;
	}
	public int getPuntaje(){
		return puntaje;
	}
	public boolean getPuedeAtacar(){
		return puedeAtacar;
	}
}
