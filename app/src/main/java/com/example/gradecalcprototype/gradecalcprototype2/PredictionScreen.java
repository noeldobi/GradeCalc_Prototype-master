package com.example.gradecalcprototype.gradecalcprototype2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class PredictionScreen extends AppCompatActivity {

    /*Declare the names of the TextView class objects to be used*/
    TextView tvModule1, tvModule2, tvModule3, tvModule4, tvModule5,
    name1, name2, name3, name4, name5,
    degreescore, degreepercent;

    /*Declare the variables of int type which will store the module results*/
    int num1, num2, num3, num4, num5;

    /*Declare the variable of double type storing the final score calculated*/
    double score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_screen);

        /*Receive the bundle1 and the values it stores*/
        Bundle bundle1 = getIntent().getExtras();

        /*Find the TextView objects, which will display the degree score and percentage values,
         by their android id and assign them the new names*/
        degreescore = (TextView) findViewById(R.id.textView18);
        degreepercent = (TextView) findViewById(R.id.textView19);

        /*Unpackage the bundle and save the result1 to result5 values under the new names*/
        num1 = bundle1.getInt ("result1");
        num2 = bundle1.getInt ("result2");
        num3 = bundle1.getInt ("result3");
        num4 = bundle1.getInt ("result4");
        num5 = bundle1.getInt ("result5");

        /*Calculate the score average and store under the score variable*/
        score = (num1 + num2 + num3 + num4 + num5) / 5.0;

        /*Set text of the degreescore TextView object to the degree class
        by comparing the score value against the set degree class benchmarks*/
        /*Set text of the degreepercent TextView object to the value stored under the score variable*/
        if(score >= 70) {

            degreescore.setText("1st");
            degreepercent.setText(score + "%");

        }

        else if (score < 70 && score > 60) {

            degreescore.setText("2.1");
            degreepercent.setText(score + "%");

        }

        else if (score < 60 && score > 50) {

            degreescore.setText("2.2");
            degreepercent.setText(score + "%");

        }

        else if (score < 50 && score > 40) {

            degreescore.setText("3rd");
            degreepercent.setText(score + "%");

        }

        else {

            degreescore.setText("Fail");
            degreepercent.setText(score + "%");

        }

        /*Find the TextView objects by their android id, which will display the corresponding module
         results, and assign them the new names*/
        tvModule1 = (TextView) findViewById(R.id.textView10);
        tvModule2 = (TextView) findViewById(R.id.textView11);
        tvModule3 = (TextView) findViewById(R.id.textView12);
        tvModule4 = (TextView) findViewById(R.id.textView13);
        tvModule5 = (TextView) findViewById(R.id.textView14);

        /*Find the TextView objects by their android id, which will display the module titles,
         and assign them the new names*/
        name1 = (TextView) findViewById(R.id.textView8);
        name2 = (TextView) findViewById(R.id.textView9);
        name3 = (TextView) findViewById(R.id.textView15);
        name4 = (TextView) findViewById(R.id.textView16);
        name5 = (TextView) findViewById(R.id.textView17);



        /*Declare an integer array called "results"*/
        Integer[] results = new Integer[5];

        /*Assign the results values to the results array items*/
        results[0] = num1;
        results[1] = num2;
        results[2] = num3;
        results[3] = num4;
        results[4] = num5;

        /*Sort the results aaray items in the descending order*/
        Arrays.sort(results, Collections.reverseOrder());

        /*Declare a String called "name"*/
        String[] name = new String[5];

        /*Assign the module titles to the name array items*/
        name[0] = "Module 1";
        name[1] = "Module 2";
        name[2] = "Module 3";
        name[3] = "Module 4";
        name[4] = "Module 5";

        /*Loop through each item of the results array to display
         the module result value to the corresponding module title
         in the tvModule and name sets of TextView objects*/
        for (int i = 0; i < results.length; i++) {
            if (results[i] == num1) {
                tvModule1.setText("" + results[0]);
                name1.setText("" + name[i]);

            }
            else if (results[i] == num2) {
                tvModule2.setText("" + results[1]);
                name2.setText("" + name[i]);
            }
            else if (results[i] == num3) {
                tvModule3.setText("" + results[2]);
                name3.setText("" + name[i]);
            }
            else if (results[i] == num4) {
                tvModule4.setText("" + results[3]);
                name4.setText("" + name[i]);
            }
            else if (results[i] == num5) {
                tvModule5.setText("" + results[4]);
                name5.setText("" + name[i]);

            }

        }

    }

}
