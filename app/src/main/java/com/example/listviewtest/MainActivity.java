package com.example.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();

        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruitList.get(i);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple",R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit Banana = new Fruit("Banana",R.mipmap.ic_launcher);
            fruitList.add(Banana);
            Fruit Orange = new Fruit("Orange",R.mipmap.ic_launcher);
            fruitList.add(Orange);
            Fruit Pear = new Fruit("Pear",R.mipmap.ic_launcher);
            fruitList.add(Pear);
            Fruit Cherry = new Fruit("Cherry",R.mipmap.ic_launcher);
            fruitList.add(Cherry);
            Fruit Mango = new Fruit("Mango",R.mipmap.ic_launcher);
            fruitList.add(Mango);
            Fruit Grape = new Fruit("Grape",R.mipmap.ic_launcher);
            fruitList.add(Grape);
        }
    }
}
