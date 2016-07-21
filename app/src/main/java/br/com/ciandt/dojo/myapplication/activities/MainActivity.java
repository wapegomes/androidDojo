package br.com.ciandt.dojo.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.ciandt.dojo.myapplication.R;
import br.com.ciandt.dojo.myapplication.adapters.CharacterAdapter;
import br.com.ciandt.dojo.myapplication.mock.Mock;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CharacterAdapter characterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergonagem);

        int collum = getResources().getInteger(R.integer.personagem_collum);

        GridLayoutManager layoutManager =
                new GridLayoutManager(this, collum);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(layoutManager);

        characterAdapter = new CharacterAdapter(this, Mock.getCharacters(),recyclerView);
        recyclerView.setAdapter(characterAdapter);


    }
}
