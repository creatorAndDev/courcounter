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
     *Display the score on click three
     * submitThree
     * */
    public void submitThree(View view) {
        final int POINTS_FOR_THREE_THROW = 3;

        displayForTeamA(POINTS_FOR_THREE_THROW);
    }

    /**
     *Display the score on click two
     * submitThree
     * */
    public void submitTwo(View view) {
        final int POINTS_FOR_TWO_THROW = 2;

        displayForTeamA(POINTS_FOR_TWO_THROW);
    }

    /**
     *Display the score on click free
     * submitThree
     * */
    public void submitFree(View view) {
        final int POINTS_FOR_FREE_THROW = 1;

        displayForTeamA(POINTS_FOR_FREE_THROW);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
