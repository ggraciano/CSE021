
public class Date {
	
	protected int year;
	protected int month;
	protected int day;
	
//	public Date(int year, int month, int day) {
	public Date() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
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
	
	public int dayOfYear(Date dt) {
		int totalDays = 0;
	/*	int monthDiff = 0;
		int dayDiff = 0;
		int yearDiff = 0;
	//	monthDiff = Math.abs(this.month - dt.getMonth());
		dayDiff = Math.abs(this.day - dt.getDay());
		yearDiff = Math.abs(this.year - dt.getYear());
	//	for (int i = 0; i < monthDiff; i++) {
			if (this.month > dt.getMonth()) {
				for (int i = dt.getMonth(); i < this.month; i++) {
					switch (i) {
					case 12: totalDays += 30;
					case 11: totalDays += 30;
					case 10: totalDays += 31;
					case 9 : totalDays += 30;
					case 8 : totalDays += 31;
					case 7 : totalDays += 31;
					case 6 : totalDays += 30;
					case 5 : totalDays += 31;
					case 4 : totalDays += 30;
					case 3 : totalDays += 31;
					case 2 : totalDays += 28;
					case 1 : totalDays += 31;
					}					
				}
			}
			else {
				for (int i = this.month; i < dt.getMonth(); i++) {
					switch (i) {
					case 12: totalDays += 30;
					case 11: totalDays += 30;
					case 10: totalDays += 31;
					case 9 : totalDays += 30;
					case 8 : totalDays += 31;
					case 7 : totalDays += 31;
					case 6 : totalDays += 30;
					case 5 : totalDays += 31;
					case 4 : totalDays += 30;
					case 3 : totalDays += 31;
					case 2 : totalDays += 28;
					case 1 : totalDays += 31;
					}
				}
			}
			monthDiff = ((totalDays - dayDiff) * 365 * yearDiff) / 30;
		//	System.out.println(monthDiff);
			return monthDiff; */
		switch (dt.month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9 : totalDays += 31;
		case 8 : totalDays += 31;
		case 7 : totalDays += 30;
		case 6 : totalDays += 31;
		case 5 : totalDays += 30;
		case 4 : totalDays += 31;
		case 3 : totalDays += 28;
		case 2 : totalDays += 31;
    	}
		totalDays += dt.day;
    	return totalDays;
	}
	
	public int compare(Date dt) {
		int score = 0;
		int home = (dayOfYear(this) + this.year * 365);
		int away = (dayOfYear(dt) + dt.year * 365);
		score = Math.abs(home - away) / 30;
		if (score <= 60) {
			return score;
		}
		else {
			return 60;
		}
	//	return score;
	}
}
