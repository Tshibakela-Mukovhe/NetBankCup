package com.tshibakela.netbankcup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button teamA, teamB , detailsbtn,off1btn, off2btn, btn10;
    /*for declaring button*/
Button mat;
    private TextView goalA, goalB;
    /* for declaring text*/
    private TextView Team1, Team2;
    private int countScrA=0;
    private int countScrB;
    private  int countSc1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = (Button) findViewById(R.id.teamA);
        teamB = (Button) findViewById(R.id.teamB);

        Team1 = (TextView) findViewById(R.id.Team1);
        Team2 = (TextView) findViewById(R.id.Team2);

        goalA = (TextView) findViewById(R.id.goalA);
        goalB = (TextView) findViewById(R.id.goalB);

        off1btn = (Button) findViewById(R.id.off1btn);
        off2btn = (Button) findViewById(R.id.off2btn);

     btn10= (Button) findViewById(R.id.btn10);


      btn10.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              countScrB=countScrA=0;
              String team1=String.valueOf(countScrA);
              goalA.setText(team1);
              String team2=String.valueOf(countScrB);
              goalB.setText(team2);
          }
      });




        teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //what i want it to do;

                countScrA++;
                String team1 = String.valueOf(countScrA);
                goalA.setText(team1);
            }
        });

        detailsbtn = (Button) findViewById(R.id.detailsbtn);
        detailsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });


        teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countScrB++;
                String team2 = String.valueOf(countScrB);
                goalB.setText(team2);
            }
        });

        off1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // countSc1 = countScrA; we can use different value by first assuming that A=B
                countScrA--;
                String team1 = String.valueOf(countScrA);
                goalA.setText(team1);
            }
        });


        off2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                --countScrB;
                String team2 = String.valueOf(countScrB);
                goalB.setText(team2);
            }
        });


    }

}


