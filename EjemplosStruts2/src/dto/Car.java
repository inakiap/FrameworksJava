package dto;

public class Car {
	
	private String model;
	private String plate;
	private int year;	

	public Car(){
		
	}
	
	public Car(String model, String plate, int year) {
		super();
		this.model = model;
		this.plate = plate;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", plate=" + plate + ", year=" + year
				+ "]";
	}
	
	
}
