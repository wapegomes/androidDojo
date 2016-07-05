package br.com.ciandt.dojo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView img = (ImageView) findViewById(R.id.img_splah);
        Picasso.with(this).load(R.mipmap.ic_launcher).into(img);


    }
}
