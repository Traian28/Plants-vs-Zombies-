
public abstract class Dinero{
	//ATRIBUTOS DE INSTANCIA
	protected int valor;
	
	//CONSTRUCTOR
	public Dinero(int v){
		valor=v;
	}
	
	//COMANDOS
	public abstract void pintar();
	
	//CONSULTAS
	public int getValor(){
		return valor;
	}
}
