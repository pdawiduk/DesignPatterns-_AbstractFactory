package classes;

import intefaces.AdvancedMediaPlayer;

/**
 * Created by Pawełek on 08.09.2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

  public void playVlc(String fileName) {
    System.out.println("Playing vlc file " + fileName);
  }

  public void playMp4(String fileName) {

  }
}
