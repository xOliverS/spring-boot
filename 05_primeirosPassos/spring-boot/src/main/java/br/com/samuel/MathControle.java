package br.com.samuel;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.exceptions.UnsupportedMathOperationException;
import util.NumberConverter;
import util.MathOperation;

@RestController
public class MathControle {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", 
			method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo 
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Favor, insira um número !");
		}
		return MathOperation.Sum(numberOne, numberTwo);
		
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", 
			method=RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo 
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Favor, insira um número !");
		}
		return MathOperation.Subtract(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", 
			method=RequestMethod.GET)
	public Double mult(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo 
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Favor, insira um número !");
		}
		return MathOperation.Multiply(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", 
			method=RequestMethod.GET)
	public Double div(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo 
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Favor, insira um número !");
		}
		return MathOperation.Divide(numberOne, numberTwo);
	}
	
//	@RequestMapping(value = "/med/{numberOne}/{numberTwo}/{numberThree}/{numberFour}", 
//			method=RequestMethod.GET)
//	public Double med(
//			@PathVariable(value = "numberOne") String numberOne,
//			@PathVariable(value = "numberTwo") String numberTwo, 
//			@PathVariable(value = "numberThree") String numberThree, 
//			@PathVariable(value = "numberFour") String numberFour 
//			) throws Exception {
//		
//		if(!isNumeric(numberOne) || !isNumeric(numberTwo) || !isNumeric(numberThree) || !isNumeric(numberFour)){
//			throw new UnsupportedMathOperationException("Favor, insira um número !");
//		}
//		
//		return ( convertToDouble(numberOne) + convertToDouble(numberTwo) + convertToDouble(numberThree) + convertToDouble(numberFour)) / 4;
//	}
	
	@RequestMapping(value = "/med/{numbers}", method=RequestMethod.GET)
	public Double med(@PathVariable("numbers") List<String> numbers) throws Exception {
	    // Verifica se todos os valores são numéricos
	    for (String num : numbers) {
	        if (!NumberConverter.isNumeric(num)) {
	            throw new UnsupportedMathOperationException("Favor, insira apenas números !");
	        }
	    }

	    // Calcula a média
//	    double sum = 0;
//	    for (String num : numbers) {
//	        sum += NumberConverter.convertToDouble(num);
//	    }
//	    return sum / numbers.size();
	    return MathOperation.Average(numbers);
	}

	
}

