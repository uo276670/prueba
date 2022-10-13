package ips.ips2022.pl43.controller.curso;

import ips.ips2022.pl43.controller.altacolegiado.action.CrearColegiadoAction;
import ips.ips2022.pl43.controller.altacolegiado.action.ReturnToMenuAction;
import ips.ips2022.pl43.model.colegiado.ColegiadoService;
import ips.ips2022.pl43.model.curso.CursoService;
import ips.ips2022.pl43.view.colegiado.SolicitudColegiadoView;
import ips.ips2022.pl43.view.curso.CreateCursoView;
import ips.ips2022.util.Arguments;
import ips.ips2022.util.SwingMain;

public class CursoController {
	private CreateCursoView view;
	private CursoService model;
	
	public CursoController(CursoService model, CreateCursoView view) {
		Arguments.checkParameterNotNull(view);
		Arguments.checkParameterNotNull(model);
		this.view = view;
		this.model = model;
	}

	public void initController(SwingMain mainView) {
		
		//Los action listeners que hemos creado en las otras clases las añadimos aqui a los bontones que necesitemos
		
//		view.getBtnSend().addActionListener(new CrearColegiadoAction(view, model));
//		view.getBtnCancel().addActionListener(new ReturnToMenuAction(mainView, "main"));
//		mainView.getFrame().getContentPane().add(view, "solicitudSocio");
//		mainView.showPannel("solicitudSocio");
		
	}
	
	
	
}
