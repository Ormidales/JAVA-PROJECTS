package org.LpDql.MonProjet.mon_appli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testHelloWorldBasique() {
        App app = new App();
        String expected = "oui bonjour";
        String actual = app.helloWorld();
        assertEquals(expected, actual);
    }
	
	@Test
	public void testHelloWorldMock(){
	    App mock = Mockito.mock(App.class);
	    Mockito.when(mock.helloWorld()).thenReturn("oui bonjour");
	    assertEquals("oui bonjour", mock.helloWorld());
	}
}
