package com.example.irin2001.synthesizer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
//step 1.2.4-   Question: 24
public class SynthesizerActivity extends ActionBarActivity {
    private static final String TAG =
SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;


    setContentView(R.layout.activity_synthesizer) {
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
    }
    public void onButtonClick1 Log.i(TAG, "Button 1 Clicked");
}