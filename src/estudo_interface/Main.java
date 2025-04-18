package estudo_interface;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		//VideoPlayer videoPlayer = new Computer();
		
		runMusica(computer);
		runVideo(computer);
		

	}
	
	
	public static void runVideo(VideoPlayer videoPlayer) {
		videoPlayer.playVideo();
	}
	
	public static void runMusica(MusicPlayer musicPlayer) {
		musicPlayer.playMusic();
	}

}
