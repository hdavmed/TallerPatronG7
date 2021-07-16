package factory;

public class CreadorVIP extends CreadorTarjeta {

	@Override
	public Tarjeta crearTarjeta() {
		return new TarjetaVIP();
	}

}
