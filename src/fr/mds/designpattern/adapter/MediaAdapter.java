package fr.mds.designpattern.adapter;

public class MediaAdapter implements MediaPlayer  {

    private MediaPlayer player;
    private AudioPlayer audioPlayer;

    public MediaAdapter  (String type) {

        switch (type) {
            case "mp3": {
                audioPlayer = new AudioPlayer();
                break;
            }
            case "mp4": {
                player = new Mp4Player();
                break;
            }
            case "vlc": {
                player = new VlcPlayer();
                break;
            }
            default:
                System.out.println("Invalid media. avi format not supported");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        this.player.play(audioType, fileName);
    }


}
