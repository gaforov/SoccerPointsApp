package com.example.android.soccerpointsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccerpointsapp.R;

public class MainActivity extends AppCompatActivity {

    int pointsBarcelona = 0;
    int pointsChelsea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase score for Team Barcelona by 1 points
     */
    public void goalForBarcelona(View view) {
        pointsBarcelona = pointsBarcelona + 1;
        displayForTeamBarcelona(pointsBarcelona);
    }

    /**
     * Decrease score for Team Barcelona by 1 points
     */
    public void goalAgainstBarcelona(View view) {
        pointsBarcelona = pointsBarcelona - 1;
        displayForTeamBarcelona(pointsBarcelona);
    }

    /**
     * Increase score for Team Barcelona by 1 points
     */
    public void winForBarcelona(View view) {
        pointsBarcelona = pointsBarcelona + 1;
        displayForTeamBarcelona(pointsBarcelona);
    }

    /**
     * Neutral score for Team Barcelona, do nothing.
     */
    public void drawForBarcelona(View view) {
        pointsBarcelona = pointsBarcelona + 0;
        displayForTeamBarcelona(pointsBarcelona);
    }

    /**
     * Decrease score for Team Barcelona by 1 points
     */
    public void lossForBarcelona(View view) {
        pointsBarcelona = pointsBarcelona - 1;
        displayForTeamBarcelona(pointsBarcelona);
    }

    /**
     * Increase score for Team Chelsea by 1 points
     */
    public void goalForChelsea(View view) {
        pointsChelsea = pointsChelsea + 1;
        displayForTeamChelsea(pointsChelsea);
    }

    /**
     * Decrease score for Team Chelsea by 1 points
     */
    public void goalAgainstChelsea(View view) {
        pointsChelsea = pointsChelsea - 1;
        displayForTeamChelsea(pointsChelsea);
    }

    /**
     * Increase win-score for Team Chelsea by 1 points
     */
    public void winChelsea(View view) {
        pointsChelsea = pointsChelsea + 1;
        displayForTeamChelsea(pointsChelsea);
    }

    /**
     * Neutral, do nothing, draw for Team Chelsea
     */
    public void drawForChelsea(View view) {
        pointsChelsea = pointsChelsea + 0;
        displayForTeamChelsea(pointsChelsea);
    }

    /**
     * Decrease loss-score for Team Chelsea by 1 points
     */
    public void lossForChelsea(View view) {
        pointsChelsea = pointsChelsea - 1;
        displayForTeamChelsea(pointsChelsea);
    }

    public void resetButton(View view) {
        pointsBarcelona = 0;
        pointsChelsea = 0;
        displayForTeamBarcelona(pointsBarcelona);
        displayForTeamChelsea(pointsChelsea);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_barcelona_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamChelsea(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_chelsea_score);
        scoreView.setText(String.valueOf(score));
    }

}
