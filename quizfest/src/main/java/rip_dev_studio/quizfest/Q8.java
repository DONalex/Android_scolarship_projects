package rip_dev_studio.quizfest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by DONalex on 02/04/2017.
 */

public class Q8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q8);
    }

    public void nextView(View view) {
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.ping);
        catSoundMediaPlayer.start();
    }
}
