package com.bv.model;

public class MyDate {
	private String dd,mm,yyyy;

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getYyyy() {
		return yyyy;
	}

	public void setYyyy(String yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "DOJ = "+ dd+"/"+ mm + "/" + yyyy ;
	}
	
}
