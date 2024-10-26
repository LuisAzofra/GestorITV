
import java.util.Scanner;

public class Camion extends Vehiculo {
	
	public Camion(String matricula) {
		super(matricula);
	}

	public boolean pasaInspeccion(double NivelGases){
		 return NivelGases<4;
		
	}
	public static void main (String[] args) {
		Camion Camiones[]=new Camion[5];
		Camion T1= new Camion("6438-KLV");
		Camion T2= new Camion("3794-HDI");
		Camion T3= new Camion("9203-DJE");
		Camion T4= new Camion("3023-SKO");
		Camion T5= new Camion("4203-DEW");
		
		for(int i=0; i<Camiones.length; i++) {
			if(Camiones[i].equals(Camiones[4].getMatricula())) {
				System.out.println("Vehiculos: " + Camiones[i] + " y " + Camiones[4]
						+ " son iguales");
			}
			
			else if(!Camiones[i].equals(Camiones[4].getMatricula())) {
				System.out.println("Vehiculos: " + Camiones[i] + " y " + Camiones[4]
						+ " son distintos");
			}
		}
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Matricula del coche que quiere localizar: ");
		String matricula = scan.nextLine();
		scan.close();	
		
		boolean localizado = true;
		for(int i=0; i<Camiones.length && localizado; i++){
			localizado = Camiones[i].equals(matricula);
		
		System.out.println((localizado?"Si":"No")
				+ "localizado el Camion con matricula " + matricula);
	
}
}
	}


	
	



	
	


