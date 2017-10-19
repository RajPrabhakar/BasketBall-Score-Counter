package com.example.rajprabhakar.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0, scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneA(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void addTwoA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void addThreeA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    private void displayForTeamA(int scoreA){
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void addOneB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    public void addTwoB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void addThreeB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    private void displayForTeamB(int scoreB){
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void reset(View view){
        scoreA=0;scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
