package com.wipro.misc;

class Car extends Vehicles {
	private String type;

	public Car() {
	}

	public Car(String model_no, String model_name, String owner_name, String owner_details) {
		super(model_no, model_name, owner_name, owner_details);
		
	}

	public String get_type() {
		return type;
	}

	public void set_type(String type) {
		this.type = type;
	}

	@Override
	public String retrieve() throws TypeException {
		if (super.get_type() == null) {
			throw new TypeException("Vehicle Type Not Set");
		} else {
			return super.getModel_no() + " " + super.getModel_name() + " " + super.getOwner_details() + " "
					+ super.getOwner_name();
		}

	}

}
