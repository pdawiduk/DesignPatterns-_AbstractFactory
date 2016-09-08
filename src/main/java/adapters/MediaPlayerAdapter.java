package adapters;

import classes.Mp4Player;
import classes.VlcPlayer;
import intefaces.AdvancedMediaPlayer;
import intefaces.MediaPlayer;

/**
 * Created by Pawełek on 08.09.2016.
 */
public class MediaPlayerAdapter implements MediaPlayer {
  AdvancedMediaPlayer advancedMediaPlayer;

  public MediaPlayerAdapter(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer = new Mp4Player();
    }
  }

  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer.playVlc(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer.playMp4(fileName);
    }


  }
}
