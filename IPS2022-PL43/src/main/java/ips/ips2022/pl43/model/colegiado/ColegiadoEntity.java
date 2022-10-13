package ips.ips2022.pl43.model.colegiado;

import java.sql.Date;

public class ColegiadoEntity {
	public enum State {PENDING, VALIDATED};
	private State state;
	
	private String dni;
	private String name;
	private String surname;
	private String city;
	private String tfno;
	private String numeroColegiado = null;

	private String degree;
	private String center;
	private int year;
	
	private String accountNumber;
	private Date dateSolicitud;
	
	public ColegiadoEntity() {
		dateSolicitud = new Date(System.currentTimeMillis());
		state = State.PENDING;
	}
	
	public Date getDateSolicitud() {
		return dateSolicitud;
	}
	
	public String getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public void setState(String state) {
		this.state = State.valueOf(state);
	}

	public void setDateSolicitud(Date date) {
		this.dateSolicitud = date;
	}
	
	public String getState() {
		return state.name();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}	
	
}
