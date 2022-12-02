package org.LpDql.MonProjet.mon_appli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
}
