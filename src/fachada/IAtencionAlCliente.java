package fachada;

import java.util.List;

public interface IAtencionAlCliente {
	public double ConsultaDeSaldo(String a);
	public double ConsultaTarjetaCredito(String d);
	public List<Productos> GetCatalogoProductos();

}
