package com.wipro.misc;

class Vehicles {
	private String type;
	private String model_no;
	private String model_name;
	private String owner_name;
	private String owner_details;

	public Vehicles() {

	}

	public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
		this.model_no = model_no;
		this.model_name = model_name;
		this.owner_name = owner_name;
		this.owner_details = owner_details;
	}

	public String get_type() {
		return type;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getOwner_details() {
		return owner_details;
	}

	public void setOwner_details(String owner_details) {
		this.owner_details = owner_details;
	}

	public String retrieve() throws TypeException {
		return null;
	}
}