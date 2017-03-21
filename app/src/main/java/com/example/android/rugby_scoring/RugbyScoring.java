package com.example.android.rugby_scoring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RugbyScoring extends AppCompatActivity {

    int homeScore = 0;
    int visitorScore = 0;
    int indicator = 0;
    int undoValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rugby_scoring);
    }

    /**
     * Displays Home score.
     */
    public void displayHomeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds points to Home score.
     */
    public void add5Home(View view) {
        homeScore = homeScore + 5;
        indicator = 1;
        undoValue = 5;
        displayHomeScore(homeScore);
    }

    public void add2Home(View view) {
        homeScore = homeScore + 2;
        indicator = 1;
        undoValue = 2;
        displayHomeScore(homeScore);
    }

    public void add3Home(View view) {
        homeScore = homeScore + 3;
        indicator = 1;
        undoValue = 3;
        displayHomeScore(homeScore);
    }

    /**
     * Displays Visitor score.
     */
    public void displayVisitorScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds points to Visitor score.
     */
    public void add5Visitor(View view) {
        visitorScore = visitorScore + 5;
        indicator = 2;
        undoValue = 5;
        displayVisitorScore(visitorScore);
    }

    public void add2Visitor(View view) {
        visitorScore = visitorScore + 2;
        indicator = 2;
        undoValue = 2;
        displayVisitorScore(visitorScore);
    }

    public void add3Visitor(View view) {
        visitorScore = visitorScore + 3;
        indicator = 2;
        undoValue = 3;
        displayVisitorScore(visitorScore);
    }

    /**
     * Reset Scores.
     */
    public void resetScore(View view) {
        homeScore = 0;
        visitorScore = 0;
        undoValue = 0;
        indicator = 0;
        displayHomeScore(homeScore);
        displayVisitorScore(visitorScore);
    }

    /**
     * Undo for last score entry at any team.
     */
    public void undoScore(View view) {
        if (indicator == 1) {
            homeScore = homeScore - undoValue;
            indicator = 0;
            displayHomeScore(homeScore);
        } else if (indicator == 2) {
            visitorScore = visitorScore - undoValue;
            indicator = 0;
            displayVisitorScore(visitorScore);
        } else indicator = 0;
    }

}
