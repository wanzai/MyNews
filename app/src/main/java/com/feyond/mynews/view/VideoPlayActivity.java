package com.feyond.mynews.view;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.WindowManager;

import com.feyond.mynews.R;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class VideoPlayActivity extends AppCompatActivity{

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)){
            return;
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video_play);
        getSupportActionBar().hide();
        if(Vitamio.initialize(this)){
            initView();
        }
    }

    private void initView(){
        mVideoView = (VideoView) findViewById(R.id.videoView);
        String url = getIntent().getStringExtra("url");
        if(TextUtils.isEmpty(url)){
            return;
        }
        mVideoView.setVideoURI(Uri.parse(url));
        MediaController mController = new MediaController(this);
        mController.show(5000);
        mVideoView.setMediaController(mController);
        mVideoView.setVideoQuality(MediaPlayer.VIDEOQUALITY_MEDIUM);
        mVideoView.requestFocus();
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mp){
                mVideoView.start();
            }
        });
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mVideoView.stopPlayback();
    }
}
