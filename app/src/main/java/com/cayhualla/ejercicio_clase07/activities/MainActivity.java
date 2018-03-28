package com.cayhualla.ejercicio_clase07.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cayhualla.ejercicio_clase07.R;
import com.cayhualla.ejercicio_clase07.adapters.FoodAdapter;
import com.cayhualla.ejercicio_clase07.repositories.FoodRepository;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  //de que manera se van a alinear los item de forma lineal

        FoodAdapter personAdapter = new FoodAdapter();
        personAdapter.setComida(FoodRepository.getList());

        recyclerView.setAdapter(personAdapter);
    }
}
