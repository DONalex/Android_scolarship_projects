package rip_dev_studio.footballscoreskeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class fsk extends AppCompatActivity {
    int goalsTeamA = 0;
    int penaltyTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamA = 0;

    int goalsTeamB = 0;
    int penaltyTeamB = 0;
    int redCardTeamB = 0;
    int yellowCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsk);
    }

    /**
     * Displays the given score for Team A.
     */
    public void addGoalPointsTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalPointsTeamA(goalsTeamA);
    }

    public void addPenaltyPointsTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayPenaltyPointsTeamA(penaltyTeamA);
    }

    public void addRedCardTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardTeamA(redCardTeamA);
    }

    public void addYellowCardTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardTeamA(yellowCardTeamA);
    }


    /**
     * Displays the given score for Score2A.
     */
    public void displayGoalPointsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score2A);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Penalty2A.
     */
    public void displayPenaltyPointsTeamA(int penalty) {
        TextView scoreView = (TextView) findViewById(R.id.Penalty2A);
        scoreView.setText(String.valueOf(penalty));
    }

    /**
     * Displays the given score for Red2A.
     */
    public void displayRedCardTeamA(int red) {
        TextView scoreView = (TextView) findViewById(R.id.Red2A);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given score for Yellow2A.
     */
    public void displayYellowCardTeamA(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.Yellow2A);
        scoreView.setText(String.valueOf(yellow));
    }


    /**
     * Displays the given score for Team B.
     */
    public void addGoalPointsTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalPointsTeamB(goalsTeamB);
    }

    public void addPenaltyPointsTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltyPointsTeamB(penaltyTeamB);
    }

    public void addRedCardTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardTeamB(redCardTeamB);
    }

    public void addYellowCardTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given score for Score2B.
     */
    public void displayGoalPointsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score2B);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Penalty2B.
     */
    public void displayPenaltyPointsTeamB(int penalty) {
        TextView scoreView = (TextView) findViewById(R.id.Penalty2B);
        scoreView.setText(String.valueOf(penalty));
    }

    /**
     * Displays the given score for Red2B.
     */
    public void displayRedCardTeamB(int red) {
        TextView scoreView = (TextView) findViewById(R.id.Red2B);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given score for Yellow2A.
     */
    public void displayYellowCardTeamB(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.Yellow2B);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Reset the score.
     */
    public void ResetScore(View v) {
        goalsTeamA = 0;
        penaltyTeamA = 0;
        redCardTeamA = 0;
        yellowCardTeamA = 0;

        goalsTeamB = 0;
        penaltyTeamB = 0;
        redCardTeamB = 0;
        yellowCardTeamB = 0;

        displayGoalPointsTeamA(goalsTeamA);
        displayPenaltyPointsTeamA(penaltyTeamA);
        displayRedCardTeamA(redCardTeamA);
        displayYellowCardTeamA(yellowCardTeamA);

        displayGoalPointsTeamB(goalsTeamB);
        displayPenaltyPointsTeamB(penaltyTeamB);
        displayRedCardTeamB(redCardTeamB);
        displayYellowCardTeamB(yellowCardTeamB);
    }

}



