package classes;

import intefaces.AdvancedMediaPlayer;

/**
 * Created by Pawełek on 08.09.2016.
 */

public class Mp4Player implements AdvancedMediaPlayer {
  public void playVlc(String fileName) {

  }

  public void playMp4(String fileName) {
    System.out.println("MP4 playing file now " + fileName);
  }
}
