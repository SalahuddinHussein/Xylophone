package com.smiledwatermelon.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

        mCSoundID=mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mASoundID=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundID=mSoundPool.load(getApplicationContext(), R.raw.note7_b,1);
        mDSoundID=mSoundPool.load(getApplicationContext(), R.raw.note2_d,1);
        mESoundID=mSoundPool.load(getApplicationContext(), R.raw.note3_e,1);
        mFSoundID=mSoundPool.load(getApplicationContext(), R.raw.note4_f,1);
        mGSoundID=mSoundPool.load(getApplicationContext(), R.raw.note5_g,1);



    }

    public void playC(View view) {
    mSoundPool.play(mCSoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playD(View view) {
        mSoundPool.play(mDSoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        mSoundPool.play(mESoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        mSoundPool.play(mFSoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        mSoundPool.play(mGSoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        mSoundPool.play(mASoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        mSoundPool.play(mBSoundID,LEFT_VOL,RIGHT_VOL,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}
