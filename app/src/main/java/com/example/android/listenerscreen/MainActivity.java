package com.example.android.listenerscreen;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumbersClickListener clickListener = new NumbersClickListener();

        RelativeLayout numbers = (RelativeLayout) findViewById(R.id.screen);

        numbers.setOnClickListener(clickListener);
    }


}
