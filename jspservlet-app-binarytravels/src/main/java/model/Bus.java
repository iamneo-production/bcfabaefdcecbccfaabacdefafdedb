package model;

import java.time.LocalDate;

public class Bus{
	//Enter code here...	
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	private String busType;

	
	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public String getBerth() {
		return berth;
	}

	public void setBerth(String berth) {
		this.berth = berth;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Bus(int noOfPersons, String berth, int rates, LocalDate date){
		this.noOfPersons = noOfPersons;
		this.rates = rates;
		this.berth = berth;
		this.date = date;
	}
}