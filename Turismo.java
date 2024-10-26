
public class Turismo extends Vehiculo{

	public Turismo(String matricula) {
		super(matricula);
	}

	public boolean pasaInspeccion(double NivelGases){
		 if(NivelGases<2);
		return true;
		 
		
	}
	public static void main (String[] args) {
		Turismo Turismos[]=new Turismo[5];
		Turismo T1= new Turismo("6438-KLV");
		Turismo T2= new Turismo("3794-HDI");
		Turismo T3= new Turismo("9203-DJE");
		Turismo T4= new Turismo("3023-SKO");
		Turismo T5= new Turismo("4203-DEW");
		for(int i=0; i<Turismos.length; i++) {
			if(Turismos[i].equals(Turismos[4].getMatricula())) 
				System.out.println("Vehiculos: " + Turismos[i] + " y " + Turismos[4]
						+ " son iguales");
			
			
			else{
			}
		}
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Matricula del coche que quiere localizar: ");
		String matricula = scan.nextLine();
		scan.close();	
		
		boolean localizado = false;
		for(int i=0; i<Turismos.length && !localizado; i++){
			localizado = Turismos[i].equals(matricula);
			
		System.out.println((localizado?"Si":"No")
				+ "localizado el vehiculo con matricula " + matricula);
	
}
		
	}
}
