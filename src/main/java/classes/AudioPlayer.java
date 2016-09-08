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

      System.out.printf("Now listening mp3 file " +fileName );
    } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("vlc")) {
      mediaPlayerAdapter = new MediaPlayerAdapter("vlc");
      mediaPlayerAdapter.play("mp3", "slayer-raining_blodd");
    }

    else{
      System.out.println("Imcompatibile type of file , please downloads more codecs.... Sorry REaly sorry :(");
    }
  }

}
