package ejercicio1;

import java.lang.Math;

public class EjemploThread extends Thread{
	/*
	 * Clase que genera un nuevo hilo
	 * Cuando se ejecuta el hilo se:
	 * 		- Imprime en pantalla el numero del hilo
	 * 		- Pide que espere el hilo un tiempo aleatorio
	 * Nunca finaliza
	 */
	
	int numero;		
	
	public void run() {
		try {
			while (true){
				System.out.println(this.getName());
				sleep((long)(10000*Math.random()));
					/*
					 * El Sistema espera un tiempo aleatorio de 0 a 10000 milisegundos
					 * para continuar con el resto de código
					 */
			}
		} catch (InterruptedException ex) {
			return;
		}				
	}
	
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			EjemploThread hilos = new EjemploThread();
			/*
			 * Genera un nuevo hilo EjemploThread cada vez que entra en el bucle
			 * y lo inicia
			 */
			hilos.start();
		} //
	}
}
