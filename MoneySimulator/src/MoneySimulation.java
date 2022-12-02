public class MoneySimulation {
	
	private int money;
	private int day;
	private int month;
	private int year;
		
	public MoneySimulation() {
	    this.money = 1000;
	    this.day = 1;
	    this.month = 1;
	    this.year = 1;
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
}