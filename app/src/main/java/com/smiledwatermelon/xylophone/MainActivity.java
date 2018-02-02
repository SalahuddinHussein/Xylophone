package com.smiledwatermelon.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  final  int NO_OF_SIM_TONE=7;
    private final float LEFT_VOL=1.0f;
    private final   float RIGHT_VOL=1.0f;
    private  final int NO_LOOP=0;
    private  final int PRIORITY=0;
    private final float NORMAL_PLAY_RATE=1.0f;

    private  int mASoundID,mBSoundID,mCSoundID,mDSoundID,mESoundID,mFSoundID,mGSoundID;
    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool=new SoundPool(NO_OF_SIM_TONE, AudioManager.STREAM_MUSIC,0);

    }
}
