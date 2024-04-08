package com.example.recycleview_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Shaun Campbell", "anthony96@middleton-vega.net", R.drawable.a));
        items.add(new Item("Michelle Hall", "yolandadiaz@gmail.com", R.drawable.b));
        items.add(new Item("Amy Cuevas", "jonesjessica@yahoo.com", R.drawable.c));
        items.add(new Item("Robert Gamble", "shawnsmith@peters-huff.com", R.drawable.d));
        items.add(new Item("Shawna Huffman", "smithjessica@gmail.com", R.drawable.e));
        items.add(new Item("David Reilly", "garciatara@hotmail.com", R.drawable.f));
        items.add(new Item("Stephanie Jones", "tonyherrera@harrison-hines.com", R.drawable.g));
        items.add(new Item("Veronica Ray", "wbaker@hancock-lowery.biz", R.drawable.h));
        items.add(new Item("Chloe Mendez", "walkerchristopher@whitney.net", R.drawable.a));
        items.add(new Item("Scott Mclaughlin", "javier94@mcpherson.net", R.drawable.b));
        items.add(new Item("Jessica Rojas", "zlang@hickman.com", R.drawable.c));
        items.add(new Item("Kevin Scott", "lynnwilliams@yahoo.com", R.drawable.d));
        items.add(new Item("Andrew Allen", "tclark@robbins.com", R.drawable.e));
        items.add(new Item("Zachary Davis", "nrush@yahoo.com", R.drawable.f));
        items.add(new Item("Danielle Williams", "rdelgado@hotmail.com", R.drawable.g));
        items.add(new Item("Lori King", "whitakerjackson@yahoo.com", R.drawable.h));
        items.add(new Item("Beth Franklin", "daviddickson@hotmail.com", R.drawable.a));
        items.add(new Item("Michelle Coleman", "karen44@johnson.biz", R.drawable.b));
        items.add(new Item("Matthew Torres", "laramary@hotmail.com", R.drawable.c));
        items.add(new Item("Timothy Shaw", "ronald79@gmail.com", R.drawable.d));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}