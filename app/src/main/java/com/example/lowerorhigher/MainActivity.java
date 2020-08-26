package com.example.lowerorhigher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public int getRandomNumber() {
        Random rn = new Random();
        return randomNumber = rn.nextInt(20) + 1;
    }

    public void guessNumber(View view) {

        EditText yourNumber = (EditText) findViewById(R.id.yourNumber);
        Integer yourIntNumber = Integer.valueOf(yourNumber.getText().toString());

        if (randomNumber < yourIntNumber) {
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else if (randomNumber > yourIntNumber) {
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "You got it! Try again!", Toast.LENGTH_LONG).show();
            getRandomNumber();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRandomNumber();
    }
}