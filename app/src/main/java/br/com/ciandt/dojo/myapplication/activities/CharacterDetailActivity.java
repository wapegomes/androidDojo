package br.com.ciandt.dojo.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.ciandt.dojo.myapplication.R;
import br.com.ciandt.dojo.myapplication.model.Character;

/**
 * Created by wgomes on 21/07/16.
 */
public class CharacterDetailActivity extends AppCompatActivity {

    TextView title;
    ImageView imgCharacter;
    TextView description;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = (TextView) findViewById(R.id.title);
        imgCharacter = (ImageView) findViewById(R.id.img);
        description = (TextView) findViewById(R.id.description);

        Character character = (Character) getIntent().getSerializableExtra("character");

        title.setText(character.getName());
        description.setText(character.getDescription());
        Picasso.with(this).load(character.getThumbnailUrl()).into(imgCharacter);

    }
}
