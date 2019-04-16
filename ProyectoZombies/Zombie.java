import javax.swing.JLabel;


public abstract class Zombie{
	//ATRIBUTOS DE INSTANCIA
	protected int vida;
	protected int recompensa;
	protected int velocidad;
	protected int x,y;
	protected int columna, fila;
	protected boolean bloqueado;
	protected JLabel grafica;
	
	//CONSTRUCTOR
	public Zombie(int v,int vel, int r,int f,int c){
		vida=v;velocidad=vel;recompensa=r;fila=f;columna=c;
		y=fila*100;x=columna*100;bloqueado=false;
		grafica=new JLabel();
	}
	
	//COMANDOS
	public void setVida(int v){
		vida=v;
	}
	public void atacado(int daño){
		if(vida>=daño)
			vida-=daño;
		else vida=0;
	}
	public void infectar(Humano h){
		h.infectado();
	}
	public void avanzar(){
		columna-=1;
	}
	public void bloquearZombie(){
		bloqueado=true;
	}
	public void desbloquearZombie(){
		bloqueado=false;
	}
	public void setX(int x){
		this.x=x;
	}
	
	//CONSULTAS
	public int getVida(){
		return vida;
	}
	public int getRecompensa(){
		return recompensa;
	}
	public int getVelocidad(){
		return velocidad;
	}
	public int getPosX(){
		return x;
	}
	public int getPosY(){
		return y;
	}
	public int getFila(){
		return fila;
	}
	public int getColumna(){
		return columna;
	}
	public boolean estaBloqueado(){
		return bloqueado;
	}
	public JLabel getGrafica(){
		return grafica;
	}
}
