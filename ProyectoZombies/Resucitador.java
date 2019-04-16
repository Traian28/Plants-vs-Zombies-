
public class Resucitador extends Zombie{
	//ATRIBUTOS DE INSTANCIA
	protected boolean resucito;
	
	//CONSTRUCTOR
	public Resucitador(int X,int Y){
		super(100,15,50,X,Y);
		resucito=false;
	}
	
	//COMANDOS
	public void resucitar(){
		
		
		
		resucito=true;
	}
	
	//CONSULTAS
	public boolean getResucito(){
		return resucito;
	}

}
