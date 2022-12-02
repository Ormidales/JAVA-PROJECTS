import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneySimulationTest {
	  @Test
	  public void testEarningMoney() {
	    MoneySimulation simulation = new MoneySimulation();
	    simulation.earnMoney(100);
	    assertEquals(1100, simulation.getMoney());
	  }

	  @Test
	  public void testSpendingMoney() {
	    MoneySimulation simulation = new MoneySimulation();
	    simulation.spendMoney(100);
	    assertEquals(900, simulation.getMoney());
	  }

	  @Test
	  public void testPayingTaxes() {
	    MoneySimulation simulation = new MoneySimulation();
	    simulation.earnMoney(1000);
	    simulation.payTaxes();
	    assertEquals(1800, simulation.getMoney());
	  }

	  @Test
	  public void testIncrementingDay() {
	    MoneySimulation simulation = new MoneySimulation();
	    simulation.incrementDay();
	    assertEquals(2, simulation.getDay());
	  }

	  @Test
	  public void testIncrementingMonth() {
	    MoneySimulation simulation = new MoneySimulation();
	    simulation.setDay(30);
	    simulation.incrementDay();
	    assertEquals(1, simulation.getDay());
	    assertEquals(2, simulation.getMonth());
	  }

	  @Test
	  public void testIncrementingYear() {
	    MoneySimulation simulation = new MoneySimulation();
	    simulation.setDay(30);
	    simulation.setMonth(12);
	    simulation.incrementDay();
	    assertEquals(1, simulation.getDay());
	    assertEquals(1, simulation.getMonth());
	    assertEquals(2, simulation.getYear());
	  }
	}

