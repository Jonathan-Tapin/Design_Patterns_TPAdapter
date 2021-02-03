package fr.mds.designpattern.adapter;

public class Mp4Player implements MediaPlayer {

    public void play(String audioType, String fileName) {
            System.out.println("Playing mp4 file. Name: " + fileName);

    }
}



