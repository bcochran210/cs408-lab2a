package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int playersScore;
    private int compsScore;
    private Enum playersWeapon;
    private Enum compsWeapon;
    private String gameResult;
    private Enum computersWeapon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playersScore = 0;
        compsScore = 0;
        gameResult = "";
    }

    public void onClickRockButton(View view) {
        playersWeapon = Weapon.ROCK;

        compsWeapon = getCompsWeapon();

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

        computerChoice.setText("Computer's Weapon: " + compsWeapon.toString());
        playerChoice.setText("Player's Weapon: " + playersWeapon.toString());
        score.setText("Player's Score: " + String.valueOf(playersScore) + ", Computer's Score: " + String.valueOf(compsScore));
        result.setText(gameResult);
    }

    public void onClickPaperButton(View view) {
        playersWeapon = Weapon.PAPER;

        compsWeapon = getCompsWeapon();

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

        computerChoice.setText("Computer's Weapon: " + compsWeapon.toString());
        playerChoice.setText("Player's Weapon: " + playersWeapon.toString());
        score.setText("Player's Score: " + String.valueOf(playersScore) + ", Computer's Score: " + String.valueOf(compsScore));
        result.setText(gameResult);
    }

    public void onClickScissorsButton(View view) {
        playersWeapon = Weapon.SCISSORS;

        compsWeapon = getCompsWeapon();

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

        computerChoice.setText("Computer's Weapon: " + compsWeapon.toString());
        playerChoice.setText("Player's Weapon: " + playersWeapon.toString());
        score.setText("Player's Score: " + String.valueOf(playersScore) + ", Computer's Score: " + String.valueOf(compsScore));
        result.setText(gameResult);
    }

    public Enum getCompsWeapon() {
        int compChoice = 1 + (int)(Math.random() * ((3 - 1) + 1));

        if (compChoice == 1) {
            computersWeapon = Weapon.ROCK;
        } else if (compChoice == 2) {
            computersWeapon = Weapon.PAPER;
        } else {
            computersWeapon = Weapon.SCISSORS;
        }

        return computersWeapon;
    }

    public String rockPaperScissorsGo(Enum playersChoice, Enum computersChoice) {
        String battleResult = "";

        if (playersChoice == computersChoice) {
            battleResult = "Tie";
        } else if (playersChoice == Weapon.ROCK && computersChoice == Weapon.PAPER) {
            battleResult = "Computer";
        } else if (playersChoice == Weapon.ROCK && computersChoice == Weapon.SCISSORS) {
            battleResult = "Player";
        } else if (playersChoice == Weapon.PAPER && computersChoice == Weapon.SCISSORS) {
            battleResult = "Computer";
        } else if (playersChoice == Weapon.PAPER && computersChoice == Weapon.ROCK) {
            battleResult = "Player";
        } else if (playersChoice == Weapon.SCISSORS && computersChoice == Weapon.ROCK) {
            battleResult = "Computer";
        } else if (playersChoice == Weapon.SCISSORS && computersChoice == Weapon.PAPER) {
            battleResult = "Player";
        }

        return battleResult;
    }
}