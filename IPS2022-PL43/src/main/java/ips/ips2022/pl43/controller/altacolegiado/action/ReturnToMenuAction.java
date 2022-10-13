package ips.ips2022.pl43.controller.altacolegiado.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ips.ips2022.util.SwingMain;

public class ReturnToMenuAction implements ActionListener {
	private SwingMain mainView;
	private String menuName;
	
	public ReturnToMenuAction(SwingMain mainView, String pnName) {
		this.mainView = mainView;
		this.menuName = pnName;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mainView.showPannel(menuName);
	}

}
