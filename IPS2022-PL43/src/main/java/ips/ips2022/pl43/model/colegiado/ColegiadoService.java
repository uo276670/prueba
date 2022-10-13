package ips.ips2022.pl43.model.colegiado;

import ips.ips2022.util.AppCheckedException;

public interface ColegiadoService {
	
	public void createSolicitud(ColegiadoEntity dto) throws AppCheckedException;
	
}