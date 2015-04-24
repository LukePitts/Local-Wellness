package com.example.gerad.localhealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

/**
 * Created by gerad on 4/9/2015.
 */
public class Disclaimer extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer);
        OnClickListener Listener = new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), Ailments.class);
                startActivity(i);
            }
        };
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox1.setOnClickListener(Listener);
        checkBox2.setOnClickListener(Listener);


    }
}










