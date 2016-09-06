package com.zengny.chronopher;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private Button playButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private MediaPlayer player = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = (Button) findViewById(R.id.playbutton);
        playButton.setOnClickListener(mListerner);
    }

    View.OnClickListener mListerner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("zengny","play  >>>");
                player = MediaPlayer.create(MainActivity.this, R.raw.h1);
//                player.setLooping(true);
                player.start();
            }
    };
    @Override
    protected void onResume() {
        super.onResume();

    }
}
