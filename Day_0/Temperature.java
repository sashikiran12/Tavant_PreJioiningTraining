package day0;

public class Temperature {
	
	public Double convertToFarenheit(Double celsius) {
		Double Farenheit = (9*(celsius)/5)+32;
		return Farenheit;
	}
	
	public Double convertToCelsius (Double farenheit) {
		Double celsius = (farenheit-32)*5/9;
		return celsius;
	}

}
