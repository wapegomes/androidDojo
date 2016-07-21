package br.com.ciandt.dojo.myapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Timer;
import java.util.TimerTask;

import br.com.ciandt.dojo.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView img = (ImageView) findViewById(R.id.img_splah);
        Picasso.with(this).load(R.mipmap.ic_launcher).into(img);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(MainActivity.this, PergonagemActivity.class);
                startActivity(intent);

            }
        }, 3000);


    }
}
