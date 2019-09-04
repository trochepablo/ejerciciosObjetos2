package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packegeTpEjerciciosObjetos2.Counter;

public class CounterTestCaseTest {
	
	private static Counter counter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/

	@BeforeEach
	void setUp() throws Exception {
	counter = new Counter(new ArrayList <Integer> ());
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	
	
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testCantidadNumerosImpares() {
		int amount = counter.getCantImpares();
		assertEquals(amount, 9);
	}

}