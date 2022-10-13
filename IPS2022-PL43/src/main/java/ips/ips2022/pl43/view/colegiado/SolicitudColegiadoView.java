package ips.ips2022.pl43.view.colegiado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SolicitudColegiadoView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5865644915085820552L;
	private JPanel pnPersonalData;
	private JPanel pnEast;
	private JPanel pnDegree;
	private JPanel pnCreditCard;
	private JPanel pnSend;
	private JButton btnSend;
	private JPanel pnName;
	private JLabel lblName;
	private JTextField txtName;
	private JPanel pnSurname;
	private JLabel lblSurname;
	private JTextField txtSurname;
	private JPanel pnDNI;
	private JPanel pnCity;
	private JTextField txtDNI;
	private JLabel lblDNI;
	private JTextField txtCity;
	private JLabel lblNCity;
	private JPanel pnTfno;
	private JTextField txtTfno;
	private JLabel lblTfno;
	private JPanel pnTitulo;
	private JTextField txtTitulo;
	private JLabel lblTitulo;
	private JPanel pnCentro;
	private JTextField txtCentro;
	private JLabel lblCentro;
	private JPanel pnYear;
	private JLabel lblYear;
	private JComboBox<Integer> cmbYear;
	private JPanel pnNumCuenta;
	private JTextField txtCuenta;
	private JLabel lblCuenta;
	private JPanel pnForm;
	private JButton btnCancel;

	/**
	 * Create the panel.
	 */
	public SolicitudColegiadoView() {
		setLayout(new BorderLayout(0, 0));
		add(getPnSend(), BorderLayout.SOUTH);
		add(getPnForm(), BorderLayout.CENTER);
	}

	private JPanel getPnPersonalData() {
		if (pnPersonalData == null) {
			pnPersonalData = new JPanel();
			pnPersonalData.setBorder(new TitledBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new EmptyBorder(20, 10, 10, 10)), "Informaci\u00F3n personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnPersonalData.setLayout(new BoxLayout(pnPersonalData, BoxLayout.Y_AXIS));
			pnPersonalData.add(getPnDNI());
			pnPersonalData.add(getPnName());
			pnPersonalData.add(getPnSurname());
			pnPersonalData.add(getPnCity());
			pnPersonalData.add(getPnTfno());
		}
		return pnPersonalData;
	}
	private JPanel getPnEast() {
		if (pnEast == null) {
			pnEast = new JPanel();
			GridBagLayout gbl_pnEast = new GridBagLayout();
			gbl_pnEast.columnWidths = new int[]{225, 0};
			gbl_pnEast.rowHeights = new int[] {300, 100};
			gbl_pnEast.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_pnEast.rowWeights = new double[]{0.0, 0.0};
			pnEast.setLayout(gbl_pnEast);
			GridBagConstraints gbc_pnDegree = new GridBagConstraints();
			gbc_pnDegree.fill = GridBagConstraints.BOTH;
			gbc_pnDegree.insets = new Insets(0, 0, 5, 0);
			gbc_pnDegree.gridx = 0;
			gbc_pnDegree.gridy = 0;
			pnEast.add(getPnDegree(), gbc_pnDegree);
			GridBagConstraints gbc_pnCreditCard = new GridBagConstraints();
			gbc_pnCreditCard.fill = GridBagConstraints.BOTH;
			gbc_pnCreditCard.gridx = 0;
			gbc_pnCreditCard.gridy = 1;
			pnEast.add(getPnCreditCard(), gbc_pnCreditCard);
		}
		return pnEast;
	}
	private JPanel getPnDegree() {
		if (pnDegree == null) {
			pnDegree = new JPanel();
			pnDegree.setBorder(new TitledBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new EmptyBorder(20, 10, 10, 10)), "Grado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnDegree.setLayout(new BoxLayout(pnDegree, BoxLayout.Y_AXIS));
			pnDegree.add(getPnTitulo());
			pnDegree.add(getPnCentro());
			pnDegree.add(getPnYear());
		}
		return pnDegree;
	}
	private JPanel getPnCreditCard() {
		if (pnCreditCard == null) {
			pnCreditCard = new JPanel();
			pnCreditCard.setBorder(new TitledBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new EmptyBorder(20, 10, 10, 10)), "Informaci\u00F3n bancaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnCreditCard.setLayout(new BoxLayout(pnCreditCard, BoxLayout.Y_AXIS));
			pnCreditCard.add(getPnNumCuenta());
		}
		return pnCreditCard;
	}
	private JPanel getPnSend() {
		if (pnSend == null) {
			pnSend = new JPanel();
			pnSend.setBorder(new EmptyBorder(0, 0, 20, 20));
			pnSend.setMinimumSize(new Dimension(10, 50));
			FlowLayout flowLayout = (FlowLayout) pnSend.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			pnSend.add(getBtnSend());
			pnSend.add(getBtnCancel());
		}
		return pnSend;
	}
	public JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton("Aceptar");
			btnSend.setBackground(new Color(34, 139, 34));
			btnSend.setForeground(new Color(255, 255, 255));
		}
		return btnSend;
	}
	private JPanel getPnName() {
		if (pnName == null) {
			pnName = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnName.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnName.add(getLblName());
			pnName.add(getTxtName());
		}
		return pnName;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Nombre: ");
		}
		return lblName;
	}
	private JTextField getTxtName() {
		if (txtName == null) {
			txtName = new TextFieldLimitedLength(20);
			txtName.setColumns(10);
		}
		return txtName;
	}
	private JPanel getPnSurname() {
		if (pnSurname == null) {
			pnSurname = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnSurname.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnSurname.add(getLblSurname());
			pnSurname.add(getTxtSurname());
		}
		return pnSurname;
	}
	private JLabel getLblSurname() {
		if (lblSurname == null) {
			lblSurname = new JLabel("Apellidos: ");
			lblSurname.setLabelFor(getTxtSurname());
		}
		return lblSurname;
	}
	private JTextField getTxtSurname() {
		if (txtSurname == null) {
			txtSurname = new TextFieldLimitedLength(30);
			txtSurname.setColumns(10);
		}
		return txtSurname;
	}
	private JPanel getPnDNI() {
		if (pnDNI == null) {
			pnDNI = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnDNI.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnDNI.add(getLblDNI());
			pnDNI.add(getTxtDNI());
		}
		return pnDNI;
	}
	private JPanel getPnCity() {
		if (pnCity == null) {
			pnCity = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnCity.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnCity.add(getLblNCity());
			pnCity.add(getTxtCity());
		}
		return pnCity;
	}
	private JTextField getTxtDNI() {
		if (txtDNI == null) {
			txtDNI = new TextFieldLimitedLength(9);
			txtDNI.setColumns(9);
		}
		return txtDNI;
	}
	private JLabel getLblDNI() {
		if (lblDNI == null) {
			lblDNI = new JLabel("DNI: ");
			lblDNI.setLabelFor(getTxtDNI());
		}
		return lblDNI;
	}
	private JTextField getTxtCity() {
		if (txtCity == null) {
			txtCity = new TextFieldLimitedLength(15);
			txtCity.setColumns(10);
		}
		return txtCity;
	}
	private JLabel getLblNCity() {
		if (lblNCity == null) {
			lblNCity = new JLabel("Población: ");
			lblNCity.setLabelFor(getTxtCity());
		}
		return lblNCity;
	}
	private JPanel getPnTfno() {
		if (pnTfno == null) {
			pnTfno = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnTfno.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnTfno.add(getLblTfno());
			pnTfno.add(getTxtTfno());
		}
		return pnTfno;
	}
	private JTextField getTxtTfno() {
		if (txtTfno == null) {
			txtTfno = new TextFieldLimitedLength(9);
			txtTfno.setColumns(10);
		}
		return txtTfno;
	}
	private JLabel getLblTfno() {
		if (lblTfno == null) {
			lblTfno = new JLabel("Teléfono: ");
			lblTfno.setLabelFor(getTxtTfno());
		}
		return lblTfno;
	}
	private JPanel getPnTitulo() {
		if (pnTitulo == null) {
			pnTitulo = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnTitulo.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnTitulo.add(getLblTitulo());
			pnTitulo.add(getTxtTitulo());
		}
		return pnTitulo;
	}
	private JTextField getTxtTitulo() {
		if (txtTitulo == null) {
			txtTitulo = new TextFieldLimitedLength(30);
			txtTitulo.setColumns(10);
		}
		return txtTitulo;
	}
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Título: ");
			lblTitulo.setLabelFor(getTxtTitulo());
		}
		return lblTitulo;
	}
	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnCentro.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnCentro.add(getLblCentro());
			pnCentro.add(getTxtCentro());
		}
		return pnCentro;
	}
	private JTextField getTxtCentro() {
		if (txtCentro == null) {
			txtCentro = new TextFieldLimitedLength(30);
			txtCentro.setColumns(10);
		}
		return txtCentro;
	}
	private JLabel getLblCentro() {
		if (lblCentro == null) {
			lblCentro = new JLabel("Centro: ");
			lblCentro.setLabelFor(getTxtCentro());
		}
		return lblCentro;
	}
	private JPanel getPnYear() {
		if (pnYear == null) {
			pnYear = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnYear.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnYear.add(getLblYear());
			pnYear.add(getCmbYear());
		}
		return pnYear;
	}

	private JLabel getLblYear() {
		if (lblYear == null) {
			lblYear = new JLabel("Año: ");
			lblYear.setLabelFor(getCmbYear());
		}
		return lblYear;
	}
	private JComboBox<Integer> getCmbYear() {
		if (cmbYear == null) {
			cmbYear = new JComboBox<Integer>();
			cmbYear.setModel(getCmbYearModel());
			cmbYear.setSelectedIndex(1);
		}
		return cmbYear;
	}
	private ComboBoxModel<Integer> getCmbYearModel() {
		Integer[] values = new Integer[100];
		
		for (int i = 0; i < 100; i++) {
			values[i] = 2022-i;
		}
		return new DefaultComboBoxModel<Integer>(values);
	}
	private JPanel getPnNumCuenta() {
		if (pnNumCuenta == null) {
			pnNumCuenta = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnNumCuenta.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			pnNumCuenta.add(getLblCuenta());
			pnNumCuenta.add(getTxtCuenta());
		}
		return pnNumCuenta;
	}
	private JTextField getTxtCuenta() {
		if (txtCuenta == null) {
			txtCuenta =  new TextFieldLimitedLength(30);
			txtCuenta.setColumns(10);
		}
		return txtCuenta;
	}
	private JLabel getLblCuenta() {
		if (lblCuenta == null) {
			lblCuenta = new JLabel("Número de cuenta: ");
			lblCuenta.setLabelFor(getTxtCuenta());
		}
		return lblCuenta;
	}
	
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
	
	public String getDni() {
		return getTxtDNI().getText();
	}
	public String getName() {
		return getTxtName().getText();
	}
	public String getSurname() {
		return getTxtSurname().getText();
	}
	public String getCity() {
		return getTxtCity().getText();
	}
	public String getTfno() {
		return getTxtTfno().getText();
	}
	public String getDegree() {
		return getTxtTitulo().getText();
	}
	public String getCenter() {
		return getTxtCentro().getText();
	}
	public int getYear() {
		return (int) getCmbYear().getSelectedItem();
	}
	public String getAccountNumber() {
		return getTxtCuenta().getText();
	}

	private JPanel getPnForm() {
		if (pnForm == null) {
			pnForm = new JPanel();
			GridBagLayout gbl_pnForm = new GridBagLayout();
			gbl_pnForm.columnWidths = new int[] {225, 225};
			gbl_pnForm.rowHeights = new int[] {0, 400, 0};
			gbl_pnForm.columnWeights = new double[]{0.0, 0.0};
			gbl_pnForm.rowWeights = new double[]{0.5, 0.0, 0.5};
			pnForm.setLayout(gbl_pnForm);
			GridBagConstraints gbc_pnPersonalData = new GridBagConstraints();
			gbc_pnPersonalData.fill = GridBagConstraints.BOTH;
			gbc_pnPersonalData.insets = new Insets(0, 0, 0, 5);
			gbc_pnPersonalData.gridx = 0;
			gbc_pnPersonalData.gridy = 1;
			pnForm.add(getPnPersonalData(), gbc_pnPersonalData);
			GridBagConstraints gbc_pnEast = new GridBagConstraints();
			gbc_pnEast.fill = GridBagConstraints.BOTH;
			gbc_pnEast.gridx = 1;
			gbc_pnEast.gridy = 1;
			pnForm.add(getPnEast(), gbc_pnEast);
		}
		return pnForm;
	}
	public JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancelar");
			btnCancel.setBackground(new Color(204, 0, 0));
			btnCancel.setForeground(Color.WHITE);
		}
		return btnCancel;
	}
}
