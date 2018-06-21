package dome;

public class CD extends Item{
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime,
			String comment) {
		super(title, playingTime, false, comment);
//		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}
	
	@Override //¸²¸ÇµÄ×÷ÓÃ
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}

	public void print() {
		System.out.println("CD:");
		super.print();
		System.out.print("-"+artist);
		System.out.println("-"+numofTracks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("12","12",6,23,"...");
		CD cd1 = new CD("12","12",6,23,"...");
		String s = "aa"+cd;
		System.out.println(s);
		System.out.println(cd.equals(cd1));
	}
	
	

}
