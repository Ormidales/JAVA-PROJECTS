public class Event {
  private String name;
  private int day;
  private int month;
  private int year;
  private String description;
  
  public Event(String name, int day, int month, int year, String description) {
    this.setName(name);
    this.setDay(day);
    this.setMonth(month);
    this.setYear(year);
    this.setDescription(description);
  }

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
}