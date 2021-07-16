package factory;

public class CreadorPremium extends CreadorTarjeta {

	@Override
	public Tarjeta crearTarjeta() {
		return new TarjetaPremium();
	}

}
