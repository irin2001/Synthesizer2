package com.example.irin2001.synthesizer2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
//step 1.2.4-   Question: 24

public class SynthesizerActivity extends ActionBarActivity {

private Button button1;
private Button button2;
private Button button3;

//mp3 part
private MediaPlayer PutMp3Here;
private MediaPlayer PutMp3Here;
private MediaPlayer PutMp3Here;

protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setConceptView(R.layout.activity_synthesizer);

    button1 = (Button)findViewById(R.id.button1);
    button2 = (Button)findViewById(R.id.button2);
    button3 = (Button)findViewById(R.id.button3);

    PutMp3Here = MediaPlayer.create(this, R.raw.Gnome);
    PutMp3Here = MediaPlayer.create(this, R.raw.Gnome);
    PutMp3Here = MediaPlayer.create(this, R.raw.Gnome);
}

public void onButton1Click(View v) {
    PutMp3Here.seekTo(0);
    Log.e (TAG, "Button 1 Clicked");
    PutMp3Here.start();
}
public void onButton2Click(View v) {
    PutMp3Here.seekTo(0);
    Log.e (TAG, "Button 2 Clicked");
    PutMp3Here.start();
}
public void onButton3Click(View v) {
    PutMp3Here.seekTo(0);
    Log.e (TAG, "Button 3 Clicked");
    PutMp3Here.start();
}

}