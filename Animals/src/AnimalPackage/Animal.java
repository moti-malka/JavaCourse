package AnimalPackage;

public class Animal {

	private String voice;

	public void seysamteing() {
		System.out.println(getVoice());
	}

	public String getVoice() {
	return this.voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	private void ToString() {
		String voice = getVoice();
		System.out.println(voice);

	}

}
