package fr.mds.designpattern.adapter;

public class VlcPlayer implements MediaPlayer {

    public void play(String audioType, String fileName) {

            System.out.println("Playing vlc file. Name: " + fileName);

    }


}

