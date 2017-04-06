package rip_dev_studio.quizfest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static rip_dev_studio.quizfest.R.layout.results;

/**
 * Created by DONalex on 02/04/2017.
 */

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(results);

        TextView commentText = (TextView) findViewById(R.id.comment);
        TextView scoreText = (TextView) findViewById(R.id.score);
        TextView descriptionText = (TextView) findViewById(R.id.description);

        String score = "" + quizfest.score + "/7";
        scoreText.setText(score);

        if (quizfest.score == 7) {
            commentText.setText(getString(R.string.excellent));
            descriptionText.setText(getString(R.string.excellent_text));
        } else if (quizfest.score > 5) {
            commentText.setText(getString(R.string.good));
            descriptionText.setText(getString(R.string.good_text));
        } else if (quizfest.score > 2) {
            commentText.setText(getString(R.string.average));
            descriptionText.setText(getString(R.string.average_text));
        } else {
            commentText.setText(getString(R.string.bad));
            descriptionText.setText(getString(R.string.bad_text));
        }
    }


    public void nextView(View view) {
        quizfest.score = 0;
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);
        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.ping);
        catSoundMediaPlayer.start();
    }
}
