package com.example.gerad.localhealth;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by gerad on 4/21/2015.
 */

public class Ailments extends Activity {

    CheckBox checkBox;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ailments);


            View.OnClickListener listener1 = new View.OnClickListener() {
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), Allergies.class);
                    startActivity(intent);
                    finish();

                }
            };

            View.OnClickListener listener2 = new OnClickListener() {
            OnClickListener listener2 = new OnClickListener() {
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), Allergies.class);
                    startActivity(intent);
                    finish();
                }
            };

            View.OnClickListener listener3 = new OnClickListener() {
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), Allergies.class);
                    startActivity(intent);
                    finish();
                }
            };

            button1.setOnClickListener(listener1);
            button2.setOnClickListener(listener2);
            button3.setOnClickListener(listener3);


        }
    }




