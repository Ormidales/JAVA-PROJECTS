import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MoneySimulationTest {
	
  @Test
  public void testEarningMoney() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.earnMoney(100);
    assertEquals(1100, simulation.getMoney());
  }
  
  @Test
  public void testCreateEvent() {
	  MoneySimulation simulation = new MoneySimulation();
	  simulation.createEvent("Company meeting", 15, 5, 2022, "Monthly meeting to discuss company progress");
	  assertEquals(1, simulation.getEvents().size());
	  assertEquals("Company meeting", simulation.getEvents().get(0).getName());
	  assertEquals(15, simulation.getEvents().get(0).getDay());
	  assertEquals(5, simulation.getEvents().get(0).getMonth());
	  assertEquals(2022, simulation.getEvents().get(0).getYear());
	  assertEquals("Monthly meeting to discuss company progress", simulation.getEvents().get(0).getDescription());
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

  @Test
  public void testGetMoney() {
    MoneySimulation simulation = new MoneySimulation();
    assertEquals(1000, simulation.getMoney());
  }

  @Test
  public void testSpendMoney() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.spendMoney(100);
    assertEquals(900, simulation.getMoney());
  }

  @Test
  public void testSetDay() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.setDay(5);
    assertEquals(5, simulation.getDay());
  }

  @Test
  public void testRenameCompany() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.renameCompany("Acme Corp");
    assertEquals("Acme Corp", simulation.getCompanyName());
  }

  @Test
  public void testEarnAndSpendMoney() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.earnMoney(500);
    assertEquals(1500, simulation.getMoney()); // money should be 1500 after earning 500
    simulation.spendMoney(200);
    assertEquals(1300, simulation.getMoney()); // money should be 1300 after spending 200
  }

  @Test
  public void testIncrementDay() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.setDay(30);
    simulation.setMonth(12);
    simulation.setYear(1);
    simulation.incrementDay();
    assertEquals(1, simulation.getDay()); // day should be 1 after incrementing
    assertEquals(1, simulation.getMonth()); // month should be 1 after incrementing
    assertEquals(2, simulation.getYear()); // year should be 2 after incrementing
  }

  @Test
  public void testCreateEventAndGame() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.createEvent("event1", 1, 1, 1, "event1 description");
    simulation.createGame("game1", 1, 1, 1, 100);
    assertEquals(1, simulation.getEvents().size()); // events list should have 1 event
    assertEquals(1, simulation.getGames().size()); // games list should have 1 game
  }

  @Test
  public void testGettersAndSetters() {
    MoneySimulation simulation = new MoneySimulation();
    simulation.setDay(15);
    simulation.setMonth(5);
    simulation.setYear(3);
    List<Event> events = new ArrayList<>();
    events.add(new Event("event1", 1, 1, 1, "event1 description"));
    simulation.setEvents(events);
    List<Game> games = new ArrayList<>();
    games.add(new Game("game1", 1, 1, 1, 100));
    simulation.setGames(games);
    assertEquals(15, simulation.getDay()); // day should be 15
    assertEquals(5, simulation.getMonth()); // month should be 5
    assertEquals(3, simulation.getYear()); // year should be 3
    assertEquals(1, simulation.getEvents().size()); // events list should have 1 event
    assertEquals(1, simulation.getGames().size()); // games list should have 1 game
  }
  
  @Test
  public void testConstructor() {
    Game game = new Game("My Game", 1, 2, 2021, 10);
    assertEquals("My Game", game.getName());
    assertEquals(1, game.getDay());
    assertEquals(2, game.getMonth());
    assertEquals(2021, game.getYear());
    assertEquals(10, game.getPrice());
  }

  @Test
  public void testSetters() {
    Game game = new Game("My Game", 1, 2, 2021, 10);

    game.setName("New Name");
    game.setDay(2);
    game.setMonth(3);
    game.setYear(2022);
    game.setPrice(20);

    assertEquals("New Name", game.getName());
    assertEquals(2, game.getDay());
    assertEquals(3, game.getMonth());
    assertEquals(2022, game.getYear());
    assertEquals(20, game.getPrice());
  }
}
