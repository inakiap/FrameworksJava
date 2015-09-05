package convers;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import dto.Car;

public class ConversorCar extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		return new Car(arg1[0],arg1[1], Integer.parseInt(arg1[2]));
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		Car car = (Car)arg1;
		return car.toString();
	}

}
