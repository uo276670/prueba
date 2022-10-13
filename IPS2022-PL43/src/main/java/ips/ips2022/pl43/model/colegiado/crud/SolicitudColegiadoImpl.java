package ips.ips2022.pl43.model.colegiado.crud;

import ips.ips2022.pl43.model.colegiado.ColegiadoEntity;
import ips.ips2022.pl43.model.colegiado.ColegiadoService;
import ips.ips2022.util.AppCheckedException;
import ips.ips2022.util.Arguments;
import ips.ips2022.util.DbUtil;

public class SolicitudColegiadoImpl implements ColegiadoService {

	private DbUtil db;
	
	public SolicitudColegiadoImpl(DbUtil database) {
		Arguments.checkParameterNotNull(database);
		this.db = database;
	}
	
	@Override
	public void createSolicitud(ColegiadoEntity dto) throws AppCheckedException {
		CreateColegiado cs = new CreateColegiado(dto, db);
		cs.execute();
	}

}
