package rip_dev_studio.quizfest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by DONalex on 02/04/2017.
 */

public class quizfest extends AppCompatActivity {

    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizfest);
        MediaPlayer mediaPlayer = MediaPlayer.create(quizfest.this, R.raw.angelic);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }


    public void nextView(View view) {
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);

        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.ping);
        catSoundMediaPlayer.start();
    }

    public void mute(View v) {

    }
}
