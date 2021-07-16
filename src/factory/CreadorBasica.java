package factory;

public class CreadorBasica extends CreadorTarjeta {

	@Override
	public Tarjeta crearTarjeta() {
		return new TarjetaBasica();
	}

}
