package ips.ips2022.pl43.model;

import ips.ips2022.pl43.model.colegiado.ColegiadoService;
import ips.ips2022.pl43.model.colegiado.crud.SolicitudColegiadoImpl;
import ips.ips2022.pl43.model.curso.CursoService;
import ips.ips2022.pl43.model.curso.crud.CursoServiceImpl;
import ips.ips2022.util.DbUtil;

public class ModelFactory {
	public static ColegiadoService forColegiado(DbUtil db) {
		return new SolicitudColegiadoImpl(db);
	}
	
	public static CursoService forCurso(DbUtil db) {
		return new CursoServiceImpl(db);
	}
	
}
