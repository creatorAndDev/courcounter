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

    /**
     *Display the score on click three
     * submitThree
     * */
    public void addThreeForTeamA(View view) {
        final int POINTS_FOR_THREE_THROW = 3;
        scoreTeamA = scoreTeamA + POINTS_FOR_THREE_THROW;

        displayForTeamA(scoreTeamA);
    }

    /**
     *Display the score on click two
     * submitThree
     * */
    public void addTwoForTeamA(View view) {
        final int POINTS_FOR_TWO_THROW = 2;
        scoreTeamA = scoreTeamA + POINTS_FOR_TWO_THROW;

        displayForTeamA(scoreTeamA);
    }

    /**
     *Display the score on click free
     * submitThree
     * */
    public void addFreeForTeamA(View view) {
        final int POINTS_FOR_FREE_THROW = 1;
        scoreTeamA = scoreTeamA + POINTS_FOR_FREE_THROW;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
