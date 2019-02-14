package com.example.arun.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItenClicked {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person>  people;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                people.add(new Person("Suresh","Patil","Plane"));
                myAdapter.notifyDataSetChanged();
            }
        });

    //   layoutManager = new LinearLayoutManager(this);

      //  layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        layoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<Person>();
        people.add(new Person("Arun","Goudar","plane"));
        people.add(new Person("Basavaraj","Patil","bus"));
        people.add(new Person("Sangu","Noli","Plane"));
        people.add(new Person("Arun","Goudar","Plane"));
        people.add(new Person("Basavaraj","Patil","bus"));
        people.add(new Person("Sangu","Noli","Plane"));
        people.add(new Person("Arun","Goudar","Plane"));
        people.add(new Person("Basavaraj","Patil","bus"));
        people.add(new Person("Sangu","Noli","Plane"));
        people.add(new Person("Basavaraj","Patil","bus"));
        people.add(new Person("Sangu","Noli","Plane"));
        people.add(new Person("Arun","Goudar","Plane"));
        people.add(new Person("Basavaraj","Patil","bus"));
        people.add(new Person("Sangu","Noli","Plane"));
        people.add(new Person("Arun","Goudar","Plane"));
        people.add(new Person("Basavaraj","Patil","bus"));
        people.add(new Person("Sangu","Noli","Plane"));
        myAdapter = new PersonAdapter(this,people);

        recyclerView.setAdapter(myAdapter);

    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this,"Name: " +people.get(index).getName(), Toast.LENGTH_SHORT).show();
    }
}
