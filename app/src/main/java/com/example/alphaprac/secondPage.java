package com.example.alphaprac;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {

    TextView character,lbl,vowel,sky;
    ImageView img;
    MediaPlayer mediaPlayer;
    Button btn;
    ScaleAnimation scale;
    TranslateAnimation trans;
    RotateAnimation rotate;
    AlphaAnimation al;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        character=(TextView) findViewById(R.id.letter);
        lbl=(TextView) findViewById(R.id.label);
        img=(ImageView) findViewById(R.id.image);
        btn=(Button)findViewById(R.id.playButton);
        vowel=(TextView)findViewById(R.id.vowel);
        sky=(TextView)findViewById(R.id.sky);
        placeData();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=btn.getText().toString();
                if(name=="Play Apple")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.apple1);
                    mediaPlayer.start();
                }
                else if (name=="Play Bat")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.bat);
                    mediaPlayer.start();
                }
                else if (name=="Play Cat")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.cat);
                    mediaPlayer.start();
                }
                else if (name=="Play Dog")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.dog);
                    mediaPlayer.start();
                }
                else if (name=="Play Elephant")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.elephant);
                    mediaPlayer.start();
                }
                else if (name=="Play Frog")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.frog);
                    mediaPlayer.start();
                }
                else if (name=="Play Goat")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.goat);
                    mediaPlayer.start();
                }
                else if (name=="Play Hat")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.hat);
                    mediaPlayer.start();
                }
                else if (name=="Play Ink")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.ink);
                    mediaPlayer.start();
                }
                else if (name=="Play Juice")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.juice);
                    mediaPlayer.start();
                }
                else if (name=="Play Kite")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.kite);
                    mediaPlayer.start();
                }
                else if (name=="Play Lamb")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.lamb);
                    mediaPlayer.start();
                }
                else if (name=="Play Monkey")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.monkey);
                    mediaPlayer.start();
                }
                else if (name=="Play Nose")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.nose);
                    mediaPlayer.start();
                }
                else if (name=="Play Ocean")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.ocean);
                    mediaPlayer.start();
                }
                else if (name=="Play Parrot")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.parrot);
                    mediaPlayer.start();
                }
                else if (name=="Play Quail")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.quail);
                    mediaPlayer.start();
                }
                else if (name=="Play Rat")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.rat);
                    mediaPlayer.start();
                }
                else if (name=="Play Sun")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.sun);
                    mediaPlayer.start();
                }
                else if (name=="Play Tap")
                {
                    mediaPlayer= MediaPlayer.create(secondPage.this,R.raw.tap);
                    mediaPlayer.start();
                }
                else if (name=="Play Umbrella") {
                    mediaPlayer = MediaPlayer.create(secondPage.this, R.raw.umbrella);
                    mediaPlayer.start();
                }
                else if (name=="Play Violin") {
                    mediaPlayer = MediaPlayer.create(secondPage.this, R.raw.violin);
                    mediaPlayer.start();
                }
                else if (name=="Play Well") {
                    mediaPlayer = MediaPlayer.create(secondPage.this, R.raw.well);
                    mediaPlayer.start();
                }
                else if (name=="Play Xylophone") {
                    mediaPlayer = MediaPlayer.create(secondPage.this, R.raw.xylophone);
                    mediaPlayer.start();
                }
                else if (name=="Play Yacht") {
                    mediaPlayer = MediaPlayer.create(secondPage.this, R.raw.yacht);
                    mediaPlayer.start();
                }
                else if (name=="Play Zebra") {
                    mediaPlayer = MediaPlayer.create(secondPage.this, R.raw.zebra);
                    mediaPlayer.start();
                }
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void placeData() {

        String alpha = getIntent().getStringExtra("alphabet");
        Log.d(alpha, alpha);
        if (alpha.equals("A")) {
            scale = new ScaleAnimation(0, 2, 0, 2);
            scale.setDuration(2500);
            img.startAnimation(scale);
            img.setImageResource(R.drawable.apple);
            lbl.setText("Apple");
            character.setText("Aa");
            btn.setText("Play Apple");
            vowel.setText("Vowel");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("B")) {
            img.setImageResource(R.drawable.bat);
            lbl.setText("Bat");
            character.setText("Bb");
            btn.setText("Play Bat");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
            trans = new TranslateAnimation(0, 100, 0, 100);
            trans.setDuration(500);
            img.startAnimation(trans);
        } else if (alpha.equals("C")) {
            img.setImageResource(R.drawable.cat);
            lbl.setText("Cat");
            character.setText("Cc");
            btn.setText("Play Cat");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
            rotate = new RotateAnimation(0, 150);
            rotate.setDuration(1500);
            img.startAnimation(rotate);
        } else if (alpha.equals("D")) {
            img.setImageResource(R.drawable.dog);
            lbl.setText("Dog");
            character.setText("Dd");
            btn.setText("Play Dog");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
            al = new AlphaAnimation(0, 100);
            al.setDuration(500);
            img.startAnimation(al);
        } else if (alpha.equals("E")) {
            img.setImageResource(R.drawable.elephant);
            lbl.setText("Elephant");
            character.setText("Ee");
            btn.setText("Play Elephant");
            vowel.setText("Vowel");
            sky.setText("Grass Alphabet");
            img.animate().rotation(360).alpha(0).translationX(1200).scaleX(10).scaleY(10).setDuration(8000);
        } else if (alpha.equals("F")) {
            img.setImageResource(R.drawable.frog);
            lbl.setText("Frog");
            character.setText("Ff");
            btn.setText("Play Frog");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
        } else if (alpha.equals("G")) {
            img.setImageResource(R.drawable.goat);
            lbl.setText("Goat");
            character.setText("Gg");
            btn.setText("Play Goat");
            vowel.setText("Consonant");
            sky.setText("Root Alphabet");
        } else if (alpha.equals("H")) {
            img.setImageResource(R.drawable.hat);
            lbl.setText("Hat");
            character.setText("Hh");
            btn.setText("Play Hat");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
        } else if (alpha.equals("I")) {
            img.setImageResource(R.drawable.ink);
            lbl.setText("Inl");
            character.setText("Ii");
            btn.setText("Play Ink");
            vowel.setText("Vowel");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("J")) {
            img.setImageResource(R.drawable.juice);
            lbl.setText("Juice");
            character.setText("Jj");
            btn.setText("Play Juice");
            vowel.setText("Consonant");
            sky.setText("Root Alphabet");
        } else if (alpha.equals("K")) {
            img.setImageResource(R.drawable.kite);
            lbl.setText("Kite");
            character.setText("Kk");
            btn.setText("Play Kite");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
        } else if (alpha.equals("L")) {
            img.setImageResource(R.drawable.lamb);
            lbl.setText("Lamb");
            character.setText("Ll");
            btn.setText("Play Lamb");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
        } else if (alpha.equals("M")) {
            img.setImageResource(R.drawable.monkey);
            lbl.setText("Monkey");
            character.setText("Mm");
            btn.setText("Play Monkey");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("N")) {
            img.setImageResource(R.drawable.nose);
            lbl.setText("Nose");
            character.setText("Nn");
            btn.setText("Play Nose");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("O")) {
            img.setImageResource(R.drawable.ocean);
            lbl.setText("Ocean");
            character.setText("Oo");
            btn.setText("Play Ocean");
            vowel.setText("Vowel");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("P")) {
            img.setImageResource(R.drawable.parrot);
            lbl.setText("Parrot");
            character.setText("Pp");
            btn.setText("Play Parrot");
            vowel.setText("Consonant");
            sky.setText("Root Alphabet");
        } else if (alpha.equals("Q")) {
            img.setImageResource(R.drawable.quail);
            lbl.setText("Quail");
            character.setText("Qq");
            btn.setText("Play Quail");
            vowel.setText("Consonant");
            sky.setText("Root Alphabet");
        } else if (alpha.equals("R")) {
            img.setImageResource(R.drawable.rat);
            lbl.setText("Rat");
            character.setText("Rr");
            btn.setText("Play Rat");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("S")) {
            img.setImageResource(R.drawable.sun);
            lbl.setText("Sun");
            character.setText("Ss");
            btn.setText("Play Sun");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("T")) {
            img.setImageResource(R.drawable.tap);
            lbl.setText("Tap");
            character.setText("Tt");
            btn.setText("Play Tap");
            vowel.setText("Consonant");
            sky.setText("Sky Alphabet");
        } else if (alpha.equals("U")) {
            img.setImageResource(R.drawable.umbrella);
            lbl.setText("Umbrella");
            character.setText("Uu");
            btn.setText("Play Umbrella");
            vowel.setText("Vowel");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("V")) {
            img.setImageResource(R.drawable.violin);
            lbl.setText("Violin");
            character.setText("Vv");
            btn.setText("Play Violin");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        } else if (alpha.equals("W")) {
            img.setImageResource(R.drawable.well);
            lbl.setText("Well");
            character.setText("Ww");
            btn.setText("Play Well");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        }
        else if(alpha.equals("X"))
        {
            img.setImageResource(R.drawable.xylophone);
            lbl.setText("Xylophone");
            character.setText("Xx");
            btn.setText("Play Xylophone");
            vowel.setText("Consonant");
            sky.setText("Root Alphabet");
        }else if(alpha.equals("Y"))
        {
            img.setImageResource(R.drawable.yacht);
            lbl.setText("Yacht");
            character.setText("Yy");
            btn.setText("Play Yacht");
            vowel.setText("Consonant");
            sky.setText("Root Alphabet");
        }else if(alpha.equals("Z"))
        {
            img.setImageResource(R.drawable.zebra);
            lbl.setText("Zebra");
            character.setText("Zz");
            btn.setText("Play Zebra");
            vowel.setText("Consonant");
            sky.setText("Grass Alphabet");
        }
    }
}