package ips.ips2022.pl43.model.colegiado.crud;

import ips.ips2022.pl43.model.colegiado.ColegiadoEntity;
import ips.ips2022.util.AppCheckedException;
import ips.ips2022.util.Arguments;
import ips.ips2022.util.DbUtil;

public class CreateColegiado {
	
	private static final String SQL = "insert into "
			+ "Colegiado(numeroColegiado, dni, name, surname, city, tfno, degree, center, year,"
			+	 " accountNumber, dateSolicitud, state) "
			+ "values(null,?,?,?,?,?,?,?,?,?,?,?);";
	private ColegiadoEntity colegiado = null;
	private DbUtil db = null;
	
	public CreateColegiado(ColegiadoEntity dto, DbUtil db) {
		Arguments.checkParameterNotNull(dto);
		Arguments.checkParameterNotNull(db);
		this.colegiado = dto;
		this.db = db;
	}
	
	public void execute() throws AppCheckedException {
		if (db.isKeyRepeated("colegiado", "dni", colegiado.getDni())) {
			throw new AppCheckedException("El DNI introducido ya está registrado");
		}
		db.executeUpdate(SQL,
			colegiado.getDni(),
			colegiado.getName(),
			colegiado.getSurname(),
			colegiado.getCity(),
			colegiado.getTfno(),
			colegiado.getDegree(),
			colegiado.getCenter(),
			colegiado.getYear(),
			colegiado.getAccountNumber(),
			colegiado.getDateSolicitud(),
			colegiado.getState()
		);	
	}
}
