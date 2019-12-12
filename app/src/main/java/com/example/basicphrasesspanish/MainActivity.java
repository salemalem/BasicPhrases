package com.example.basicphrasesspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonTapped(View view) {
//        Log.i("button tapped", Integer.toString(view.getId()));
        int id = view.getId(); // This number is defference from our id that we have set.
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id); // Attempt to get our id using number id
//        Log.i("button tappe", ourId);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.basicphrasesspanish");
        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();
    }
}
