package com.example.gradecalcprototype.gradecalcprototype2;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    private static Button letsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        /*Run the OnClickButtonListener()*/
        OnClickButtonListener();

    }


    public void OnClickButtonListener() {
        /*Find a button by its android id "letsGo"*/
        letsGo = (Button) findViewById(R.id.letsGo);

        /*Determine the response of the program when the button is clicked*/
        letsGo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /*Create a new instance of the Intent class, which,
                        when activated, will move the user from the StartScreen to
                        InputResults class*/
                        Intent intent = new Intent(StartScreen.this, InputResults.class);
                        startActivity(intent);
                    }
                }
        );
    }

}