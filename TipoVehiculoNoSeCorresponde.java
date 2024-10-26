public class TipoVehiculoNoSeCorresponde extends Exception {
	
	public TipoVehiculoNoSeCorresponde() { }
	
	public TipoVehiculoNoSeCorresponde(String msg) {
		super(msg);
	}

	public String getMessage() {
		return "El tipo de vehiculo no se corresponde";
	}
}
