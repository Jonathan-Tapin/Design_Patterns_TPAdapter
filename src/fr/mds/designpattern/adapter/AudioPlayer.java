package fr.mds.designpattern.adapter;

public class AudioPlayer implements MediaPlayer{
  private String mp3 = "Playing mp3 file.";
  private Mp4Player mp4 = new Mp4Player();
  private VlcPlayer vlc = new VlcPlayer();

  @Override
  public void play(String audioType, String fileName) {

    switch (audioType) {
      case "mp3": {
        System.out.println(mp3 + "Name: " + fileName);
        break;
      }
      case "mp4": {
        mp4.play(audioType, fileName);
        break;
      }
      case "vlc": {
        vlc.play(audioType, fileName);
        break;
      }
      default:
        System.out.println("Invalid media. avi format not supported");
    }
  }
}
