public class Game {
  private String name;
  private int day;
  private int month;
  private int year;
  private int price;
  
  public Game(String name, int day, int month, int year, int price) {
    this.setName(name);
    this.setDay(day);
    this.setMonth(month);
    this.setYear(year);
    this.setPrice(price);
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
}
