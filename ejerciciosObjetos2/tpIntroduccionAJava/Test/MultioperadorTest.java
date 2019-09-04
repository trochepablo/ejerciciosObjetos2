package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packageLaCajaMercadoCentral.*;
import packegeTpEjerciciosObjetos2.Multioperador;

class MultioperadorTest {
	
	public  Multioperador multioperador; 

	@BeforeEach
	void setUp() throws Exception {
		
		multioperador = new Multioperador(new ArrayList <Integer>());
		
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		multioperador.addNumber(7);
		multioperador.addNumber(9);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(4);
	}

	@Test
	void sumaTotalTestMultioperador() {
		assertEquals(33, multioperador.getSumaTotal());
	}

	@Test
	void restaTotalTestMultioperador() {
		assertEquals(-33, multioperador.getRestaTotal());
	}
	
	@Test
	void multiplicacionTotalMultioperador() {
		assertEquals(3780,multioperador.getMultiplicacionTotal());
	}
}
