
public class Atleta extends Zombie{
	//ATRIBUTOS DE INSTANCIA
	protected boolean salto;
	
	//CONSTRUCTOR
	public Atleta(int X, int Y){
		super(150,15,50,X,Y);
		salto=false;
	}
	
	//COMANDOS

	public void saltar(){
		
		
		salto=true;
	}
	
	//CONSULTAS
	public boolean getSalto(){
		return salto;
	}
}
