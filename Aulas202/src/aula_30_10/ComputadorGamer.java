package aula_30_10;

public class ComputadorGamer extends Computador {

	private String placaVideo;

	public ComputadorGamer() {
	
		super("Core i7", 16, 1024);
		
	}
	
	public String getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}
	
	
}
