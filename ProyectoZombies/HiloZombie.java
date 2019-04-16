
public class HiloZombie extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected Zombie zombie;
	
	//CONSTRUCTOR
	public HiloZombie(Zombie z){
		zombie=z;
	}
	
	//COMANDOS
	public void run(){
		int ancho=0;
		zombie.bloquearZombie();
		while(ancho<=100){
			ancho+=zombie.getVelocidad();
			zombie.setX(zombie.getPosX()-zombie.getVelocidad());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		zombie.desbloquearZombie();
	}

}
