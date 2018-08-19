
public class Student {
	
	protected String name;
	protected char gender;
	protected Date birthDay;
	protected Preference pref;
	protected boolean matched = false;
	
	public Student(String name, char gender, Date birthDay, Preference pref) {
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.pref = pref;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public Preference getPref() {
		return pref;
	}
	
	public void setPref(Preference pref) {
		this.pref = pref;
	}
	
	public boolean getMatched() {
		return matched;
	}
	
	public void setMatched(boolean matched) {
		this.matched = matched;
	}
	
	public int compare(Student st) {
		int score = 0;
		if (this.gender == st.getGender()) {
		//	score = 40 - Math.abs(this.pref.compare(this.pref) - st.getPref().compare(st.pref));
			score = (40 - this.pref.compare(st.getPref()))
					+ (60 - this.birthDay.compare(st.getBirthDay()));
			return score;
		}
		else {
			return score;
		}
	}

}
