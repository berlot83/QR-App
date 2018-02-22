package com.molokotech.model;

import javax.ws.rs.FormParam;

public class Building {

	private String reference;
	private int m2Covered;
	private int m2Uncovered;
	private double price;
	private String status;
	

	public Building(String reference, int m2Covered, int m2Uncovered, double price, String status) {
		super();
		this.reference = reference;
		this.m2Covered = m2Covered;
		this.m2Uncovered = m2Uncovered;
		this.price = price;
		this.status = status;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getM2Covered() {
		return m2Covered;
	}

	public void setM2Covered(int m2Covered) {
		this.m2Covered = m2Covered;
	}

	public int getM2Uncovered() {
		return m2Uncovered;
	}

	public void setM2Uncovered(int m2Uncovered) {
		this.m2Uncovered = m2Uncovered;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
