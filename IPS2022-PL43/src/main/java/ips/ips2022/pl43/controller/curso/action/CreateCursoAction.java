package ips.ips2022.pl43.controller.curso.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ips.ips2022.pl43.model.curso.CursoService;
import ips.ips2022.pl43.model.curso.CursoService.CursoDTO;
import ips.ips2022.pl43.view.curso.CreateCursoView;
import ips.ips2022.util.AppCheckedException;
import ips.ips2022.util.Arguments;

public class CreateCursoAction implements ActionListener{
	
	private CreateCursoView vista = null;
	private CursoService modelo = null;
	
	public CreateCursoAction(CreateCursoView vista, CursoService modelo) {
		super();
		if (vista == null || modelo == null) {
			throw new IllegalArgumentException(
					"La vista y el modelo no pueden ser nulos");
		}
		this.vista = vista;
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			checkFields();
			modelo.createCurso(createDTO());
//			vista.showMessage("Solicitud enviada");
		} catch (AppCheckedException ex) {
//			vista.showMessage(ex.getMessage());
		} 
	}
	
	private CursoDTO createDTO() {
		CursoDTO curso = new CursoDTO();

		curso.curso_pk = generateCursoPK();
		curso.titulo = vista.getTitulo();
		curso.numeroPlazas = vista.getNumeroPlazas();
		curso.precioColegiados = vista.getPrecioColegiados();
		curso.precioPreolegiados = vista.getPrecioPrecolegiados();
		curso.precioOtros = vista.getPrecioOtros();
		curso.fechaInicio = vista.getFechaInicio();
		curso.fechaFin = vista.getFechaFin();
		curso.estado = "abierto";
		
		return curso;
	}
	
	private String generateCursoPK() {
		return vista.getTitulo() + vista.getFechaInicio();
	}

	private void checkFields() throws AppCheckedException {
//		Arguments.checkFieldNotEmpty(vista.getDni());
//		Arguments.checkFieldNotEmpty(vista.getName());
//		Arguments.checkFieldNotEmpty(vista.getSurname());
//		Arguments.checkFieldNotEmpty(vista.getCity());
//		Arguments.checkFieldNotEmpty(vista.getTfno());
//		Arguments.checkFieldNotEmpty(vista.getDegree());
//		Arguments.checkFieldNotEmpty(vista.getCenter());
//		Arguments.checkFieldNotEmpty(vista.getAccountNumber());
	}
}
