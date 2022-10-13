package ips.ips2022.pl43.model.curso.crud;

import ips.ips2022.pl43.model.curso.CursoService;
import ips.ips2022.util.AppCheckedException;
import ips.ips2022.util.Arguments;
import ips.ips2022.util.DbUtil;

public class CursoServiceImpl implements CursoService{

	private DbUtil db;
	
	public CursoServiceImpl(DbUtil db) {
		Arguments.checkParameterNotNull(db);
		this.db = db;
	}

	@Override
	public void createCurso(CursoDTO curso) throws AppCheckedException {
		new CreateCurso(curso, db).execute();
		
	}

}
