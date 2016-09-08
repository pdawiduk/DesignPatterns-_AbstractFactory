package classes;

import adapters.MediaPlayerAdapter;
import intefaces.MediaPlayer;

/**
 * Created by Pawełek on 08.09.2016.
 */
public class AudioPlayer implements MediaPlayer {

  MediaPlayerAdapter mediaPlayerAdapter;


  public void play(String audioType, String fileName) {

    if (audioType.equalsIgnoreCase("mp3")) {

      System.out.println("Now listening mp3 file " + fileName);

    } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
      mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
      mediaPlayerAdapter.play(audioType, fileName);
    } else {
      System.out.println("Imcompatibile type of file , please downloads more codecs.... Sorry REaly sorry :(");
    }
  }

}
