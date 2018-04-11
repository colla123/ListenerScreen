package com.example.android.listenerscreen;

/**
 * Created by mac on 4/11/2018 AD.
 */

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by mac on 4/11/2018 AD.
 */

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view){
        //Log.d("Dicee", "The Button has been pressed");
        Toast.makeText(view.getContext(), "The Screen has been touched", Toast.LENGTH_SHORT).show();

    }
}
