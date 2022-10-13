package ips.ips2022.pl43.controller.altacolegiado;

import ips.ips2022.pl43.controller.altacolegiado.action.CrearColegiadoAction;
import ips.ips2022.pl43.controller.altacolegiado.action.ReturnToMenuAction;
import ips.ips2022.pl43.model.colegiado.ColegiadoService;
import ips.ips2022.pl43.view.colegiado.SolicitudColegiadoView;
import ips.ips2022.util.Arguments;
import ips.ips2022.util.SwingMain;

public class SolicitudColegiadoController {
	private SolicitudColegiadoView view;
	private ColegiadoService model;
	
	public SolicitudColegiadoController(ColegiadoService model, SolicitudColegiadoView view) {
		Arguments.checkParameterNotNull(view);
		Arguments.checkParameterNotNull(model);
		this.view = view;
		this.model = model;
	}

	public void initController(SwingMain mainView) {
		view.getBtnSend().addActionListener(new CrearColegiadoAction(view, model));
		view.getBtnCancel().addActionListener(new ReturnToMenuAction(mainView, "main"));
		mainView.getFrame().getContentPane().add(view, "solicitudSocio");
		mainView.showPannel("solicitudSocio");
		
	}
}
