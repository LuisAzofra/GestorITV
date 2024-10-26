
	import java.time.LocalDate;
	

	public class Informe {
		private boolean TensionCinturones;
		private Vehiculo vehiculo;
		private double NivelGases;
		private enum Estado {PROCESO,COMPLETADO};
		private Estado EstadoTramitacion;
		private int id;
		private static int NumInforme=0;
		private LocalDate fecha;
		public Informe(Vehiculo vehic) {
			NumInforme++;
			id = NumInforme; 
			vehiculo = vehic;
			EstadoTramitacion = Estado.PROCESO;
			fecha =LocalDate.now();
		}

		public int getIdentificador() {
			return id;
		}
		public void rellenar(double NivelGases, boolean TensionCinturones) {
			this.NivelGases = NivelGases;
			this.TensionCinturones = TensionCinturones;
			EstadoTramitacion = Estado.COMPLETADO;
		}
		public boolean equals(Informe i) {
			return i != null && id == i.getIdentificador();
		}
		
		public boolean pasaInspeccion() {
			return  vehiculo.pasaInspeccion(NivelGases) && TensionCinturones;
		}

		public String toString() {
			return "Informe=[" + vehiculo + ", nivel de gases: " + NivelGases + 
					", pasa tension cinturones: " + ((TensionCinturones)?"si":"no")
					+ ", estado tramitacion: " + EstadoTramitacion 
					+ ", fecha apertura: " + fecha + "]";
		}
		
		public static void main(String[] args) {
			Vehiculo v1 = new Turismo("6438-KLV");
			Vehiculo v2 = new Camion("3748-DYH");
			Informe informes[] =new Informe[4];
			Informe i1 = new Informe(v1);
			Informe i2 = new Informe(v1);
			Informe i3 = new Informe(v2); 
			Informe i4 = new Informe(v2);
			
			System.out.println("INFORMES SIN DATOS ");
			for(Informe i: informes) 
				System.out.println(i);
			
			System.out.println("VEHICULOS PASANDO LA INSPECCION ");
			i1.rellenar(1.6, true);
			System.out.println("El vehiculo " + (i1.pasaInspeccion()?"si":"no") 
					+ " supera inspeccion.");
			i2.rellenar(2.8, true);
			System.out.println("El vehiculo " + (i2.pasaInspeccion()?"si":"no")
					+ " supera inspeccion.");
			i3.rellenar(3.2, true);
			System.out.println("El vehiculo " + (i3.pasaInspeccion()?"si":"no")
					+ " supera inspeccion.");
			i4.rellenar(4.1, true);
			System.out.println("El vehiculo " + (i4.pasaInspeccion()?"si":"no")
					+ " supera inspeccion.");
			
			System.out.println("INFORMES CON DATOS ");
			for(Informe i: informes) 
				System.out.println(i);
			
		}
		
	}



