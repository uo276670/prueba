package ips.ips2022.pl43.model.curso.crud;

import ips.ips2022.pl43.model.curso.CursoService.CursoDTO;
import ips.ips2022.util.AppCheckedException;
import ips.ips2022.util.Arguments;
import ips.ips2022.util.DbUtil;

public class CreateCurso {
	
	private CursoDTO curso = null;
	private DbUtil db = null;
	private static final String SQL = "insert into "
			+ "Curso(curso_pk, titulo, numeroPlazas, precioColegiado, precioPrecolegiado, "
			+ "precioOtros, fechaInicio, fechaFin, estado) "
			+ "values(null,?,?,?,?,?,?,?,?);";

	
	public CreateCurso(CursoDTO dto, DbUtil db) {
		Arguments.checkParameterNotNull(dto);
		Arguments.checkParameterNotNull(db);
		this.curso = dto;
		this.db = db;
	}
	
	public void execute() throws AppCheckedException {
//		if (db.isKeyRepeated("curso", "dni", curso.getDni())) {
//			throw new AppCheckedException("");
//		}
		db.executeUpdate(SQL,
			curso.titulo,
			curso.numeroPlazas,
			curso.precioColegiados,
			curso.precioPreolegiados,
			curso.precioOtros,
			curso.fechaInicio,
			curso.fechaFin,
			curso.estado
		);	
	}
	
}
