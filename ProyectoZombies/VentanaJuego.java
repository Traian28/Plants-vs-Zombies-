import javax.swing.JFrame;

public class VentanaJuego extends JFrame{
	//ATRIBUTOS DE INSTANCIA
	protected Juego juego;
	protected PanelConFondo fondo;
	
	//CONSTRUCTOR
	public VentanaJuego(){
		juego=new Juego();
		initGUI();
	}
	
	//COMANDOS
	public void initGUI(){
		
		setSize(800,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		fondo=new PanelConFondo();
		fondo.setBounds(0,0,800,600);
		fondo.setLayout(null);
		
	/*	
		zombie=new Basico(1,8);
		JLabel l=zombie.getGrafica();
		l.setBounds(800,100,100,100);
		fondo.add(l);*/
		
		getContentPane().add(fondo);

		juego.start();
		
		(new HiloGrafica(juego,fondo)).start();

		
		
	}/*
	public void run(){
		Iterator<Zombie> zombies;;Zombie z;JLabel grafica;

		while(juego.sigueJuego()){
			zombies=juego.zombies();
			while((zombies.hasNext())&&(juego.sigueJuego())){				
				z=zombies.next();
				grafica=z.getGrafica();
				grafica.setBounds(z.getPosX(),z.getPosY(),100,100);
				fondo.add(grafica);}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			}
			
		}*/
	
	
	/*
	public void run(){
		HiloZombie h=new HiloZombie(zombie);
		h.start();
		while(true){
			JLabel l=zombie.getGrafica();
			l.setBounds(zombie.getPosX(),zombie.getPosY(),100,100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	
	public static void main(String args[]){
		VentanaJuego ventana=new VentanaJuego();
	}
	

}
