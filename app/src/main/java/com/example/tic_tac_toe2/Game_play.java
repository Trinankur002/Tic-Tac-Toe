package com.example.tic_tac_toe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game_play extends AppCompatActivity {

    private TicTacToeBoard ticTacToeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        Button playAgainButton = findViewById(R.id.playAgain);
        Button homeButton = findViewById(R.id.homeButton);
        TextView playerTurn = findViewById(R.id.playerTurn);

        playAgainButton.setVisibility(View.GONE);
        homeButton.setVisibility(View.GONE);

        String[] playerNames = getIntent().getStringArrayExtra("Player_Names");

        if (playerNames != null){
            playerTurn.setText((playerNames[0] + "'s turn , Go ahead ! "));
        }

        ticTacToeBoard = findViewById(R.id.ticTacToeBoard);

        ticTacToeBoard.setUpGame(playAgainButton, homeButton,playerTurn , playerNames);
    }
    public void playAgainClick(View view){
        ticTacToeBoard.resetGame();
        ticTacToeBoard.invalidate();
    }

    public void home(View view){
        Intent homeIntent = new Intent(this,MainActivity.class);
        startActivity(homeIntent);
    }
}