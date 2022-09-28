package com.example.tic_tac_toe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class player_setup extends AppCompatActivity {
    private EditText player1;
    private EditText player2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);

        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
    }
    public void submit(View view){
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent intent = new Intent(this,Game_play.class);
        intent.putExtra("Player_Names" ,new String[]{player1Name,player2Name});
        startActivity(intent);
    }
}