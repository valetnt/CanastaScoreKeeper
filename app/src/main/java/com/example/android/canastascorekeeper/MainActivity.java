package com.example.android.canastascorekeeper;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SCORE_PLAYER1 = "SCORE_PLAYER1";
    private static final String SCORE_PLAYER2 = "SCORE_PLAYER2";
    private int score_Player1;
    private int score_Player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView score_1_txt = (TextView) findViewById(R.id.player1_score);
        TextView score_2_txt = (TextView) findViewById(R.id.player2_score);

        if (savedInstanceState == null) {
            score_Player1 = 0;
            score_Player2 = 0;
            displayScore1(score_Player1);
            displayScore2(score_Player2);

        } else {
            score_Player1 = savedInstanceState.getInt(SCORE_PLAYER1);
            score_Player2 = savedInstanceState.getInt(SCORE_PLAYER2);
            displayScore1(score_Player1);
            displayScore2(score_Player2);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_PLAYER1, score_Player1);
        outState.putInt(SCORE_PLAYER2, score_Player2);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.putInt(SCORE_PLAYER1, score_Player1);
        savedInstanceState.putInt(SCORE_PLAYER2, score_Player2);
    }

    public void onClickPura(View view) {

        if (view.getId() == R.id.pura_1) {

            score_Player1 += 500;
            displayScore1(score_Player1);

        } else if (view.getId() == R.id.pura_2) {

            score_Player2 += 500;
            displayScore2(score_Player2);
        }
    }

    public void onClickImpura(View view) {

        if (view.getId() == R.id.impura_1) {

            score_Player1 += 100;
            displayScore1(score_Player1);

        } else if (view.getId() == R.id.impura_2) {

            score_Player2 += 100;
            displayScore2(score_Player2);
        }
    }

    public void onClick50(View view) {

        if (view.getId() == R.id.add50_1) {

            score_Player1 += 50;
            displayScore1(score_Player1);

        } else if (view.getId() == R.id.add50_2) {

            score_Player2 += 50;
            displayScore2(score_Player2);
        }
    }

    public void onClick10(View view) {

        if (view.getId() == R.id.add10_1) {

            score_Player1 += 10;
            displayScore1(score_Player1);

        } else if (view.getId() == R.id.add10_2) {

            score_Player2 += 10;
            displayScore2(score_Player2);
        }
    }

    public void onClick5(View view) {

        if (view.getId() == R.id.add5_1) {

            score_Player1 += 5;
            displayScore1(score_Player1);

        } else if (view.getId() == R.id.add5_2) {

            score_Player2 += 5;
            displayScore2(score_Player2);
        }
    }

    public void onClickReset(View view) {

        score_Player1 = 0;
        score_Player2 = 0;
        displayScore1(0);
        displayScore2(0);

    }

    public void displayScore1(int score) {

        TextView score_1_txt = (TextView) findViewById(R.id.player1_score);
        score_1_txt.setText(String.valueOf(score));
    }

    public void displayScore2(int score) {

        TextView score_2_txt = (TextView) findViewById(R.id.player2_score);
        score_2_txt.setText(String.valueOf(score));
    }
}
