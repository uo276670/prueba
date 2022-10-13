package ips.ips2022.pl43.model.curso;

import java.util.Date;

import ips.ips2022.util.AppCheckedException;

public interface CursoService {
	
	/**
	 * Metodo que dado un DTO con los datos de un curso, hace la correspondiente query
	 * a la base de datos y añade una nueva entrada en la tabla de cursos con los 
	 * corresponientes valores
	 * @param curso
	 * @throws AppCheckedException 
	 */
	public void createCurso(CursoDTO curso) throws AppCheckedException;
	
	
	public class CursoDTO {
		
		public String curso_pk;
		public String titulo;
		public int numeroPlazas;
		public int precioColegiados;
		public int precioPreolegiados;
		public int precioOtros;
		public Date fechaInicio;
		public Date fechaFin;
		public String estado;
		
	}

}
