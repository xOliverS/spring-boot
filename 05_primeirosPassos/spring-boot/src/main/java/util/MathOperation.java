package util;

import java.util.List;

public class MathOperation {

	public static Double Sum(String numberOne, String numberTwo) {
		Double n1 = NumberConverter.convertToDouble(numberOne);
		Double n2 = NumberConverter.convertToDouble(numberTwo);
		return n1 + n2;
	}
	public static Double Subtract(String numberOne, String numberTwo) {
		Double n1 = NumberConverter.convertToDouble(numberOne);
		Double n2 = NumberConverter.convertToDouble(numberTwo);
		return n1 - n2;
	}
	public static Double Divide(String numberOne, String numberTwo) {
		Double n1 = NumberConverter.convertToDouble(numberOne);
		Double n2 = NumberConverter.convertToDouble(numberTwo);
		return n1 / n2;
	}
	public static Double Multiply(String numberOne, String numberTwo) {
		Double n1 = NumberConverter.convertToDouble(numberOne);
		Double n2 = NumberConverter.convertToDouble(numberTwo);
		return n1 * n2;
	}
	
	public static Double Average(List<String> numbers) {
		double sum = 0;
	    for (String num : numbers) {
	        sum += NumberConverter.convertToDouble(num);
	    }
	    return sum / numbers.size();
	}

} 
