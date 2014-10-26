package theramin;
import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class WavPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File kick = new File("/Users/danushachenchik/Downloads/VDE1_Vengeance_Dirty_Electro_vol1_Vengeance-Sound/VDE1 128BPM Sunday Kit.wav");
		PlaySound(kick);

	}
	
	static void PlaySound(File Sound){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
			
		}
		catch(Exception e){
	}

}
}
