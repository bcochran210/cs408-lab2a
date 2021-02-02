package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    private int playersScore;
    private int compsScore;
    private String playersWeapon;
    private String compsWeapon;
    private String gameResult;


    public void onClickRockButton(View view) {
        playersWeapon = "Rock";
        int compChoice = 1 + (int)(Math.random() * ((3 - 1) + 1));

        if (compChoice == 1) {
            compsWeapon = "Rock";
        } else if (compChoice == 2) {
            compsWeapon = "Paper";
        } else {
            compsWeapon = "Scissors";
        }

        if (rockPaperScissorsGo(playersWeapon, compsWeapon) == "Player") {
            playersScore++;
            gameResult = "Player Wins...Rock blunts Scissors!";
        } else if (rockPaperScissorsGo(playersWeapon, compsWeapon) == "Computer") {
            compsScore++;
            gameResult = "Computer Wins...Paper covers Rock!";
        } else {
            gameResult = "It's a tie!";
        }

        TextView playerChoice = (TextView)findViewById(R.id.playerChoice);
        TextView computerChoice = (TextView)findViewById(R.id.computerChoice);
        TextView score = (TextView)findViewById(R.id.score);
        TextView result = (TextView)findViewById(R.id.result);

        computerChoice.setText("Computer's Weapon: " + compsWeapon);
        playerChoice.setText("Player's Weapon: " + playersWeapon);
        score.setText("Player's Score: " + String.valueOf(playersScore) + ", Computer's Score: " + String.valueOf(compsScore));
        result.setText(gameResult);
    }

    public void onClickPaperButton(View view) {
        playersWeapon = "Paper";
        int compChoice = 1 + (int)(Math.random() * ((3 - 1) + 1));

        if (compChoice == 1) {
            compsWeapon = "Rock";
        } else if (compChoice == 2) {
            compsWeapon = "Paper";
        } else {
            compsWeapon = "Scissors";
        }

        if (rockPaperScissorsGo(playersWeapon, compsWeapon) == "Player") {
            playersScore++;
            gameResult = "Player Wins...Paper covers Rock!";
        } else if (rockPaperScissorsGo(playersWeapon, compsWeapon) == "Computer") {
            compsScore++;
            gameResult = "Computer Wins...Scissors cuts through Paper!";
        } else {
            gameResult = "It's a tie!";
        }

        TextView playerChoice = (TextView)findViewById(R.id.playerChoice);
        TextView computerChoice = (TextView)findViewById(R.id.computerChoice);
        TextView score = (TextView)findViewById(R.id.score);
        TextView result = (TextView)findViewById(R.id.result);

        computerChoice.setText("Computer's Weapon: " + compsWeapon);
        playerChoice.setText("Player's Weapon: " + playersWeapon);
        score.setText("Player's Score: " + String.valueOf(playersScore) + ", Computer's Score: " + String.valueOf(compsScore));
        result.setText(gameResult);
    }

    public void onClickScissorsButton(View view) {
        playersWeapon = "Scissors";
        int compChoice = 1 + (int)(Math.random() * ((3 - 1) + 1));

        if (compChoice == 1) {
            compsWeapon = "Rock";
        } else if (compChoice == 2) {
            compsWeapon = "Paper";
        } else {
            compsWeapon = "Scissors";
        }

        if (rockPaperScissorsGo(playersWeapon, compsWeapon) == "Player") {
            playersScore++;
            gameResult = "Player Wins...Scissors cuts through Paper!";
        } else if (rockPaperScissorsGo(playersWeapon, compsWeapon) == "Computer") {
            compsScore++;
            gameResult = "Computer Wins...Rock blunts Scissors!";
        } else {
            gameResult = "It's a tie!";
        }

        TextView playerChoice = (TextView)findViewById(R.id.playerChoice);
        TextView computerChoice = (TextView)findViewById(R.id.computerChoice);
        TextView score = (TextView)findViewById(R.id.score);
        TextView result = (TextView)findViewById(R.id.result);

        computerChoice.setText("Computer's Weapon: " + compsWeapon);
        playerChoice.setText("Player's Weapon: " + playersWeapon);
        score.setText("Player's Score: " + String.valueOf(playersScore) + ", Computer's Score: " + String.valueOf(compsScore));
        result.setText(gameResult);
    }

    public String rockPaperScissorsGo(String playersChoice, String computersChoice) {
        String battleResult = "";

        if (playersChoice == computersChoice) {
            battleResult = "Tie";
        } else if (playersChoice == "Rock" && computersChoice == "Paper") {
            battleResult = "Computer";
        } else if (playersChoice == "Rock" && computersChoice == "Scissors") {
            battleResult = "Player";
        } else if (playersChoice == "Paper" && computersChoice == "Scissors") {
            battleResult = "Computer";
        } else if (playersChoice == "Paper" && computersChoice == "Rock") {
            battleResult = "Player";
        } else if (playersChoice == "Scissors" && computersChoice == "Rock") {
            battleResult = "Computer";
        } else if (playersChoice == "Scissors" && computersChoice == "Paper") {
            battleResult = "Player";
        }

        return battleResult;
    }
}