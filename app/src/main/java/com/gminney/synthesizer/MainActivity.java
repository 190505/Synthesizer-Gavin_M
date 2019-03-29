package com.gminney.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = MainActivity.class.getName();
    private final int WHOLE_NOTE = 1000;
    private int delay = 500;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private CheckBox checkBox;
    private Spinner spinner;
    private Spinner spinner2;
    private Spinner spinner3;
    private MediaPlayerThread mpt;

    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpGs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighFs;


    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);

        mpt = new MediaPlayerThread(MainActivity.this);

        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);

        final MediaPlayer [] Challenge3 = {mpE, mpFs, mpGs, mpA, mpB, mpCs, mpDs, mpE};
        final int[] Challenge7 = {R.raw.scalea, R.raw.scalea, R.raw.scalehighe, R.raw.scalehighe, R.raw.scalehighfs, R.raw.scalehighfs, R.raw.scalehighe, R.raw.scaled, R.raw.scaled, R.raw.scalecs, R.raw.scalecs, R.raw.scaleb, R.raw.scaleb, R.raw.scalea};
        final int[] Challenge9 = {R.raw.scalehighe, R.raw.scalehighe, R.raw.scaled, R.raw.scaled, R.raw.scalecs, R.raw.scalecs, R.raw.scaleb};
        final int[] Challenge12 = {R.raw.scaleg, R.raw.scalec, R.raw.scalec, R.raw.scalec, R.raw.scaled, R.raw.scalee, R.raw.scalee, R.raw.scalee, R.raw.scaled, R.raw.scalec, R.raw.scaled, R.raw.scalee, R.raw.scalec, R.raw.scalee, R.raw.scalee, R.raw.scalef, R.raw.scaleg, R.raw.scaleg, R.raw.scalef, R.raw.scalee, R.raw.scalef, R.raw.scaleg, R.raw.scalee, R.raw.scalec, R.raw.scalec, R.raw.scaled, R.raw.scalee, R.raw.scalee, R.raw.scaled, R.raw.scalec, R.raw.scaled, R.raw.scalee, R.raw.scalec, R.raw.scaleg, R.raw.scaleg, R.raw.scalec, R.raw.scalec, R.raw.scalec, R.raw.scaled, R.raw.scalee, R.raw.scalee, R.raw.scalee, R.raw.scaled, R.raw.scalec, R.raw.scaled, R.raw.scalee, R.raw.scalec};
        final int[] Challenge2 = {R.raw.scalea, R.raw.scaleb, R.raw.scalebb, R.raw.scalec, R.raw.scalecs, R.raw.scaled, R.raw.scaleds, R.raw.scalee, R.raw.scalef, R.raw.scalefs, R.raw.scaleg, R.raw.scalegs, R.raw.scalehighe, R.raw.scalehighf, R.raw.scalehighfs, R.raw.scalehighg};

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.notes, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.times, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.times, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);

        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);

////////////////////////// Challenge 1 //////////////////////////////////////////////////// G
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE.start();
                delayPlaying(delay);
                mpFs.start();
                delayPlaying(delay);
                mpGs.start();
                delayPlaying(delay);
                mpA.start();
                delayPlaying(delay);
                mpB.start();
                delayPlaying(delay);
                mpCs.start();
                delayPlaying(delay);
                mpDs.start();
                delayPlaying(delay);
                mpE.start();
            }
        });
///////////////////////////// Challenge 2 //////////////////////////////////////////////
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                for (i = spinner2.getSelectedItemPosition() + 1; i > 0; i--) {
                    mpt.playNote(Challenge2[spinner.getSelectedItemPosition()], WHOLE_NOTE);
                }
            }
        });
///////////////////////////// Challenge 3 //////////////////////////////////////////////
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(MediaPlayer x: Challenge3) {
                    x.start();
                    delayPlaying(delay);
                }
            }
        });
///////////////////////////// Challenge 4 //////////////////////////////////////////////

////////// Did not do ///////////

///////////////////////////// Challenge 5 //////////////////////////////////////////////
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mpA.start();
                delayPlaying(delay);
                mpA.start();
                delayPlaying(delay);
                mpHighE.start();
                delayPlaying(delay);
                mpHighFs.start();
                delayPlaying(delay);
                mpHighFs.start();
                delayPlaying(delay);
                mpHighE.start();
                delayPlaying(delay);
                mpD.start();
                delayPlaying(delay);
                mpD.start();
                delayPlaying(delay);
                mpCs.start();
                delayPlaying(delay);
                mpCs.start();
                delayPlaying(delay);
                mpB.start();
                delayPlaying(delay);
                mpB.start();
                delayPlaying(delay);
                mpA.start();
            }
        });
///////////////////////////// Challenge 6 //////////////////////////////////////////////

///// Not Used - Linburg Code ////

///////////////////////////// Challenge 7 //////////////////////////////////////////////
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                for(i=0; i < Challenge7.length; i++){
                    mpt.playNote(Challenge7[i], WHOLE_NOTE);
                }
            }
        });
///////////////////////////// Challenge 8 //////////////////////////////////////////////
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                for(i=0; i < Challenge7.length; i++){
                    mpt.playNote(Challenge7[i], delay);
                }
            }
        });
///////////////////////////// Challenge 9 //////////////////////////////////////////////
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                for(i=0; i < Challenge7.length; i++){
                    mpt.playNote(Challenge7[i], delay);
                }
                for(i = 0; i < Challenge9.length; i++){
                    mpt.playNote(Challenge9[i], delay);
                }
                for(i=0; i < Challenge7.length; i++){
                    mpt.playNote(Challenge7[i], delay);
                }
            }
        });
///////////////////////////// Challenge 10 and 11 //////////////////////////////////////////////
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()){
                    int i;
                    for(i=0; i < Challenge7.length; i++){
                        mpt.playNote(Challenge7[i], delay);
                    }
                    for(i = spinner3.getSelectedItemPosition() + 1; i > 0; i--) {
                        for (i = 0; i < Challenge9.length; i++) {
                            mpt.playNote(Challenge9[i], delay);
                        }
                    }
                    for(i=0; i < Challenge7.length; i++){
                        mpt.playNote(Challenge7[i], delay);
                    }
                }
                else {
                    int i;
                    for(i=0; i < Challenge7.length; i++){
                        mpt.playNote(Challenge7[i], delay);
                    }
                    for(i=0; i < Challenge7.length; i++){
                        mpt.playNote(Challenge7[i], delay);
                    }
                }
            }
        });
///////////////////////////// Challenge 12 //////////////////////////////////////////////
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                for(i=0; i < Challenge12.length; i++){
                    mpt.playNote(Challenge12[i], delay);
                }
            }
        });
    }

////////////////////////// Remaining Items //////////////////////////////////////////////
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}