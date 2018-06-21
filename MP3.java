package dome;

public class MP3 extends Item{
	private String artist;
	private int numofTracks;
	private String Style = "Á÷ÐÐ";
	
	public MP3(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public void print() {
		System.out.print("MP3: ");
		System.out.printf("%02d ",numofTracks);
		super.print();
		System.out.print("-"+artist+"-"+Style);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3 mp3 = new MP3("Super", "Man", 01, 120,"...");
		mp3.print();
		
	}

}
