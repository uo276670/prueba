package ips.ips2022.pl43.controller.altacolegiado.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ips.ips2022.pl43.model.colegiado.ColegiadoEntity;
import ips.ips2022.pl43.model.colegiado.ColegiadoService;
import ips.ips2022.pl43.view.colegiado.SolicitudColegiadoView;
import ips.ips2022.util.AppCheckedException;
import ips.ips2022.util.Arguments;

public class CrearColegiadoAction implements ActionListener {
	
	private SolicitudColegiadoView vista = null;
	private ColegiadoService modelo = null;
	
	public CrearColegiadoAction(SolicitudColegiadoView vista, ColegiadoService modelo) {
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
			modelo.createSolicitud(createDto());
			vista.showMessage("Solicitud enviada");
		} catch (AppCheckedException ex) {
			vista.showMessage(ex.getMessage());
		} 
	}
	
	private ColegiadoEntity createDto() {
		ColegiadoEntity dto = new ColegiadoEntity();
		
		dto.setDni(vista.getDni());
		dto.setName(vista.getName());
		dto.setSurname(vista.getSurname());
		dto.setCity(vista.getCity());
		dto.setTfno(vista.getTfno());
		dto.setDegree(vista.getDegree());
		dto.setCenter(vista.getCenter());
		dto.setYear(vista.getYear());
		dto.setAccountNumber(vista.getAccountNumber());
		
		return dto;
	}
	
	private void checkFields() throws AppCheckedException {
		Arguments.checkFieldNotEmpty(vista.getDni());
		Arguments.checkFieldNotEmpty(vista.getName());
		Arguments.checkFieldNotEmpty(vista.getSurname());
		Arguments.checkFieldNotEmpty(vista.getCity());
		Arguments.checkFieldNotEmpty(vista.getTfno());
		Arguments.checkFieldNotEmpty(vista.getDegree());
		Arguments.checkFieldNotEmpty(vista.getCenter());
		Arguments.checkFieldNotEmpty(vista.getAccountNumber());
	}
	

}
