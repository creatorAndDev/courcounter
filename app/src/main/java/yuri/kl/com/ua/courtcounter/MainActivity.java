package yuri.kl.com.ua.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * fields global
     * */
    int scoreTeamA = 0;

    int scoreTeamB = 0;

    /**
     *Display the score on click three
     * submit Three
     * team A
     * */
    public void addThreeForTeamA(View view) {
        final int POINTS_FOR_THREE_THROW = 3;
        scoreTeamA = scoreTeamA + POINTS_FOR_THREE_THROW;

        displayForTeamA(scoreTeamA);
    }

    /**
     *Display the score on click two
     * submit Two
     * team A
     * */
    public void addTwoForTeamA(View view) {
        final int POINTS_FOR_TWO_THROW = 2;
        scoreTeamA = scoreTeamA + POINTS_FOR_TWO_THROW;

        displayForTeamA(scoreTeamA);
    }

    /**
     *Display the score on click free
     * submit Free
     * team A
     * */
    public void addFreeForTeamA(View view) {
        final int POINTS_FOR_FREE_THROW = 1;
        scoreTeamA = scoreTeamA + POINTS_FOR_FREE_THROW;

        displayForTeamA(scoreTeamA);
    }
//----------
    /**
     *Display the score on click three
     * submit Three
     * team B
     * */
    public void addThreeForTeamB(View view) {
        final int POINTS_FOR_THREE_THROW = 3;
        scoreTeamB = scoreTeamB + POINTS_FOR_THREE_THROW;

        displayForTeamB(scoreTeamB);
    }

    /**
     *Display the score on click two
     * submit Two
     * team B
     * */
    public void addTwoForTeamB(View view) {
        final int POINTS_FOR_TWO_THROW = 2;
        scoreTeamB = scoreTeamB + POINTS_FOR_TWO_THROW;

        displayForTeamB(scoreTeamB);
    }

    /**
     *Display the score on click free
     * submit Free
     * team B
     * */
    public void addFreeForTeamB(View view) {
        final int POINTS_FOR_FREE_THROW = 1;
        scoreTeamB = scoreTeamB + POINTS_FOR_FREE_THROW;

        displayForTeamB(scoreTeamB);
    }
//-------
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
