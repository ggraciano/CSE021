
public class Preference {
	
	protected int quietTime;
	protected int music;
	protected int reading;
	protected int chatting;
	
//	public Preference(int quietTime, int music, int reading , int chatting) {
	public Preference() {
		this.quietTime = 0;
		this.music = 0;
		this.reading = 0;
		this.chatting= 0;
	}
	
	public int getQuietTime() {
		return quietTime;
	}
	
	public void setQuietTime(int quietTime) {
		this.quietTime = quietTime;
	}
	
	public int getMusic() {
		return music;
	}
	
	public void setMusic(int music) {
		this.music = music;
	}
	
	public int getReading() {
		return reading;
	}
	
	public void setReading(int reading) {
		this.reading = reading;
	}
	
	public int getChatting() {
		return chatting;
	}
	
	public void setChatting(int chatting) {
		this.chatting = chatting;
	}
	
	public int compare(Preference pref) {
		int score = Math.abs(this.quietTime - pref.getQuietTime())
				+ Math.abs(this.music - pref.getMusic())
				+ Math.abs(this.reading - pref.getReading())
				+ Math.abs(this.chatting - pref.getChatting());
		return score;
	}

}
