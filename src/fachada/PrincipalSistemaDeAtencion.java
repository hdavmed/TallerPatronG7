package fachada;

import java.util.ArrayList;
import java.util.List;

public class PrincipalSistemaDeAtencion implements IAtencionAlCliente {

	
	public double ConsultaDeSaldo(String a) {
		return 0;
				
	}
	
	public double ConsultaTarjetaCredito(String d) {
		return 0;
	}
	
	public List<Productos> GetCatalogoProductos(){
		List<Productos> k= new ArrayList<Productos>();
		return k;
	}
}
