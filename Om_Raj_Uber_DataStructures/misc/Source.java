package com.wipro.misc;

public class Source {
	public static void main(String[] args) throws TypeException {
		Vehicles v= new Vehicles("12", "audi", "om", "dbskfh");
		System.out.println(v.retrieve());
		Car c= new Car("12", "audi", "om", "asfsdgs");
		c.set_type(null);
		System.out.println(c.retrieve());
	}

}
