package com.example.gradecalcprototype.gradecalcprototype2;

import android.content.Intent;
import android.gesture.Prediction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputResults extends AppCompatActivity {

    /*Declare the button class object called button*/
    Button predict;
    /*Declare the names of the EditText class text field objects*/
    EditText input1, input2, input3, input4, input5;
    /*Create an instance of the Bundle class and name it bundle1*/
    Bundle bundle1 = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_results);

        /*Run the OnClickButtonListener2() method*/
        OnClickButtonListener2();

    }


    public void OnClickButtonListener2() {
        /*Find the button by its android id "button2"*/
        predict = (Button) findViewById(R.id.button2);

        /*Determine the response of the program when the button is clicked*/
        predict.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*Find the EditText objects by their android id and assign them the new names*/
                        input1 = (EditText) findViewById(R.id.editText1);
                        input2 = (EditText) findViewById(R.id.editText2);
                        input3 = (EditText) findViewById(R.id.editText3);
                        input4 = (EditText) findViewById(R.id.editText4);
                        input5 = (EditText) findViewById(R.id.editText5);

                        /*Read and save the user's input integer type values of modules results,
                         typed into the input1 to input5 EditText fields, under
                         result1 to result5 variables*/
                        final int result1 = Integer.parseInt(input1.getText().toString());
                        final int result2 = Integer.parseInt(input2.getText().toString());
                        final int result3 = Integer.parseInt(input3.getText().toString());
                        final int result4 = Integer.parseInt(input4.getText().toString());
                        final int result5 = Integer.parseInt(input5.getText().toString());

                        /*Create a new instance of the Intent class, which,
                        when activated, will move the user from the InputResults to
                        PredictionScreen class*/
                        Intent intent1 = new Intent(InputResults.this, PredictionScreen.class);

                       /*Insert the values of module results result1 to result5 into the bundle1*/
                        bundle1.putInt("result1", result1);
                        bundle1.putInt("result2", result2);
                        bundle1.putInt("result3", result3);
                        bundle1.putInt("result4", result4);
                        bundle1.putInt("result5", result5);

                        /*Include bundle1 in the intent1, which will transfer the values in the bundle into
                        the ensuing activity*/
                        intent1.putExtras(bundle1);
                        startActivity(intent1);
                    }
                }
        );
    }
}
