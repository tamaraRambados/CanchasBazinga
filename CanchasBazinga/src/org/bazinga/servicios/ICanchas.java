package org.bazinga.servicios;
import java.util.List;

import org.bazinga.dominio.*;



public interface ICanchas {
	
	public List<Canchas> getCanchas(CriterioBusquedas... criterio);
	public boolean alta(Canchas cancha);
	public boolean baja(Canchas cancha);
	public boolean modificar(Canchas cancha);
	

}
