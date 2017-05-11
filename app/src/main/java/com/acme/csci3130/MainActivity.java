package com.acme.csci3130;

import android.app.Activity;
import android.icu.text.MessageFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnCLick(View v){
        TextView a = (TextView)findViewById(R.id.helloText);
        TextView b = (TextView)findViewById(R.id.editText);
        a.setText(b.getText());
    }
}
