package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesCaculadora.CalculdoraIMC;

public class CalculadoraImcTeste {
	//atributos para apoio ao teste
	double pesoInput;
	double alturaInput;
	double imcEsperado;
	double imcRealCalculado;
	
	@Test
	public void testeImcPeso1000kgAltura2m() {
	pesoInput = 100;
	alturaInput = 2;
	imcEsperado = 25;
	
	CalculdoraIMC calc = new CalculdoraIMC();
	imcRealCalculado = calc.calculaImc(pesoInput, alturaInput);
	
	assertEquals(imcEsperado, imcRealCalculado, 0);
	}

}
