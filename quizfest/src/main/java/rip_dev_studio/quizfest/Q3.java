package rip_dev_studio.quizfest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by DONalex on 02/04/2017.
 */

public class Q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q3);
    }

    public void nextView(View view) {
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2);
        RadioButton answer3 = (RadioButton) findViewById(R.id.answer3);

        if (answer1.isChecked() || answer2.isChecked() || answer3.isChecked()) {
            if (answer1.isChecked()) {
                quizfest.score += 1;
            }

            Intent intent = new Intent(this, Q4.class);
            startActivity(intent);
            final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.ping);
            catSoundMediaPlayer.start();
        } else {
            Toast.makeText(this, "Please choose an answer", Toast.LENGTH_SHORT).show();
        }

    }
}
