package estudo_interface;

public class MusicBox implements  MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("A caixa de musica está tocando a música");
		
	}

	@Override
	public void pauseMusic() {
		System.out.println("A caixa de musica está pausando a música");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("A caixa de musica está parando a música");
		
	}


}
