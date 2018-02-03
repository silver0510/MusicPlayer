package com.example.sinki.service;

import android.media.MediaPlayer;

/**
 * Created by Sinki on 9/29/2017.
 */

public class MediaPlayerSingleton {
    private static MediaPlayerSingleton instance = null;
    private MediaPlayer mediaPlayer;

    protected MediaPlayerSingleton(){
        mediaPlayer = new MediaPlayer();
    }

    public static MediaPlayerSingleton getInstance(){
        if(instance == null){
            instance = new MediaPlayerSingleton();
        }
        return instance;
    }
    public MediaPlayer getMediaPlayer(){
        return mediaPlayer;
    }
}
