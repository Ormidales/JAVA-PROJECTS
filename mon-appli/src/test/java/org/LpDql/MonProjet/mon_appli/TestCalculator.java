package org.LpDql.MonProjet.mon_appli;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	
	Calculator c = null;
	
	Calculator service = Mockito.mock(Calculator.class);
	
	@Before
	public void setUp() {
		c = new Calculator();
	}

	@Test
	public void testAdd1() {
		assertEquals(5, c.add(4, 1));
		when(service.add(4, 8)).thenReturn(5);
		assertEquals(service.add(4, 8), 5);
		verify(service).add(4, 8);
	}
	
	@Test
    public void testAdd2() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.substract(10, 5));
    }

}
