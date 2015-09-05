package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

import dto.Car;

public class ShowCarAction extends ActionSupport{

	private Car car;
	
	
	public Car getCar() {
		return car;
	}

	@TypeConversion(converter="convers.ConversorCar")
	public void setCar(Car car) {
		this.car = car;
	}


	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
}
