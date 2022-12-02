package org.LpDql.MonProjet.mon_appli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals; // Importe la méthode assertEquals de la classe Assert

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testHelloWorld() {
        App app = new App();
        String expected = "oui bonjour";
        String actual = app.helloWorld();
        assertEquals(expected, actual);
    }
	
	@Test
	public void testHelloWorld2(){
	    App mock = Mockito.mock(App.class);
	    Mockito.when(mock.helloWorld()).thenReturn("oui bonjour");
	    assertEquals("oui bonjour", mock.helloWorld());
	}
}
