
public class GestorITV {
	
	private static Informe[] informes = new Informe[10]; 	
	private static Vehiculo[] vehiculos = new Vehiculo[10];
	private int numInforme = 0;
	
	
	public int iniciarProceso(String matricula, Vehiculo.Tipo tipo) {
		
		
		Vehiculo v = new Vehiculo(matricula, tipo);
		int pos = buscarVehiculo(v);
		
		
		if(pos == -1) {  
			boolean insertado = false;
			for(int i=0; i<10 && !insertado; i++) {
				if(vehiculos[i] == null) {
					vehiculos[i] = v;
					insertado = true;
				}
			}
		}
		
		 
		int posInforme = numInforme;
		numInforme++;
		
		informes[posInforme] = new Informe(v, numInforme);
		
		return numInforme;
	}
	
	
	private int buscarVehiculo(Vehiculo v) {
		
		int pos = -1; 
		
		for(int i=0; i<10 && pos==-1; i++) {
			if(v.equals(vehiculos[i])) 
				pos = i;
		}
		
		return pos;
	}
	
	
	public void cerrarInforme(int id, double gases, boolean cinturones) {
		
		
		boolean encontrado = false;
		boolean hayElementos = true;
		
		for(int i=0; i<10 && !encontrado && hayElementos; i++) {
			
			if(informes[i] != null && informes[i].getId() == id) {
				encontrado = true;
				informes[i].setInforme(gases,cinturones);
			}	
			
			if(informes[i] == null)
				hayElementos = false;
		}
	}
	
	
	public static void main(String[] args) {
		
		GestorITV itv = new GestorITV();
		
		Vehiculo v1 = new Vehiculo("3451-GTS", Vehiculo.Tipo.TURISMO);
		Vehiculo v2 = new Vehiculo("5558-HYT", Vehiculo.Tipo.CAMION);
		
		vehiculos[0] = v1;
		vehiculos[1] = v2;
		
		itv.iniciarProceso("9992-DHT", Vehiculo.Tipo.FURGONETA);
		
		int idTurismo = itv.iniciarProceso("3451-GTS", Vehiculo.Tipo.TURISMO);
		
		int idCamion = itv.iniciarProceso("8811-KRS", Vehiculo.Tipo.CAMION);
		
		itv.cerrarInforme(idTurismo, 3,true);
		
		itv.cerrarInforme(idCamion, 3.1, true);
		
		System.out.println("\n--- VEHICULOS ---\n");
		for(int i=0; i<10; i++) {
			if(vehiculos[i] != null)
				System.out.println(vehiculos[i]);
		}
		
		System.out.println("\n--- INFORMES ---\n");
		for(int i=0; i<10; i++) {
			if(informes[i] != null)
				System.out.println(informes[i]);
		}
		
		System.out.println("\n--- INFORMES NO FAVORABLES ---\n");
		for(int i=0; i<10; i++) {
			if(informes[i] != null && !informes[i].pasaInspeccion())
				System.out.println(informes[i]);
		}
	}

}
