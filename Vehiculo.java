public abstract class Vehiculo {
	public enum Tipo{
		TURISMO,
		CAMION;
	}
	
	private String matricula; 
	public Vehiculo(String matricula) {
		this.matricula=matricula;  
	}
	public String getMatricula() {
		return matricula;
	}
		public String toString() {
			return "La matricula es:" + matricula; 
		}
	
		public boolean equals(String mat) {
			return mat!=null && mat.equals(matricula);
		}
		
		public abstract boolean pasaInspeccion(double nivelGases);
		
	}
	
	

