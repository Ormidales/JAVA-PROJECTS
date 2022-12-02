import java.util.ArrayList;
import java.util.List;

public class MoneySimulation {
	
	private int money;
	  private int day;
	  private int month;
	  private int year;
	  private String companyName;
	  private List<Event> events;
	  private List<Game> games;
			
	  public MoneySimulation() {
	    this.money = 1000;
	    this.day = 1;
	    this.month = 1;
	    this.year = 1;
	    this.setCompanyName("");
	    this.setEvents(new ArrayList<>());
	    this.games = new ArrayList<>();
	  }
	  
	  public void createEvent(String name, int day, int month, int year, String description) {
	    Event event = new Event(name, day, month, year, description);
	    this.getEvents().add(event);
	  }
	  
	  public void createGame(String name, int day, int month, int year, int price) {
	    Game game = new Game(name, day, month, year, price);
	    this.games.add(game);
	  }

	  // other methods...

	  public int getDay() {
	    return this.day;
	  }

	  public int getMonth() {
	    return this.month;
	  }

	  public int getYear() {
	    return this.year;
	  }
	  
	  public void setYear(int year) {
		    this.year = year;
		  }

	  public void setMonth(int month) {
	    this.month = month;
	  }

	  public void payTaxes() {
	    int taxAmount = (int) (this.money * 0.1); // 10% tax
	    this.money -= taxAmount;
	  }
	
	  public void earnMoney(int amount) {
	    this.money += amount;
	  }
	
	  public int getMoney() {
	    return this.money;
	  }
	
	  public void spendMoney(int amount) {
	    this.money -= amount;
	  }
	
	  public void incrementDay() {
	    this.day++;
	    if (this.day > 30) {
	      this.day = 1;
	      this.month++;
	      if (this.month > 12) {
	        this.month = 1;
	        this.year++;
	      }
	    }
	  }
	
	  public void setDay(int day) {
	    this.day = day;
	  }
	  
	  public void renameCompany(String newName) {
	    this.setCompanyName(newName);
	  }

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	public List<Game> getGames() {
		  return this.games;
	}
	
	public void setGames(List<Game> games) {
		  this.games = games;
	}
}