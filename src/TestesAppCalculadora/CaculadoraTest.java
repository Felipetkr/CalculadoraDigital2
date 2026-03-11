package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import FontesCaculadora.Calculadora;

public class CaculadoraTest {
	
	  private static int contador = 0;
	    private double resultadoReal;
	    
	@Rule
	public TestName nomeDoTeste = new TestName();
	    
    @Before
    public void iniciarTeste() {
        contador++;
        System.out.println("Iniciando o teste numero: " + contador);
    }

    @After
    public void finalizarTeste() {
        System.out.println(nomeDoTeste.getMethodName() + " - resultado: " + resultadoReal);
    }
    /**
    * Teste de somar na Calculadora.
    */
   @Test
   public void testeSomar5com5() {      
	   double nro1 = 5;
	   double nro2 = 5;
       Calculadora calc= new Calculadora();
       double resultadoEsperado = 10;
       resultadoReal= calc.somar(nro1, nro2);      
       assertEquals(resultadoEsperado, resultadoReal,0);
   }

   /**
   * Teste de subtrair na  Calculadora.
   */
  @Test
  public void testeSubtrair3de5() {
	  double nro1 = 5;
	  double nro2 = 3;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 2;
      resultadoReal= calc.subtrair(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal,0);  
  }
  
   /**
   * Teste de multiplicar na Calculadora.
   */
   @Test
   public void testeMultiplicar3por3() {
	   double nro1 = 3;
	   double nro2 = 3;
       Calculadora calc = new Calculadora();
       double resultadoEsperado = 9;
       resultadoReal = calc.multiplicar(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal, 0);
   }

   /**
   * Teste de dividir na Calculadora.
   */
  @Test
  public void testeDividir3por2() {
	  double nro1 = 3;
	  double nro2 = 2;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 1.5;
      resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.0);
  }
  
  @Test
  public void testeDividir3por7() {	  
	  double nro1 = 3;
	  double nro2 = 7;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 0.4285;
      resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.0001);
  }
  
}
