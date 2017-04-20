package com.example.lepra.iainteractive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UI();

        MyAdapter myAdapter = new MyAdapter(this, R.layout.item_list, datos);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Haz presionado en: " + datos.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void UI(){
        listView = (ListView) findViewById(R.id.listView);

        datos = new ArrayList<String>();
        datos.add("Luis");
        datos.add("Rogelio");
        datos.add("Gala");
        datos.add("Angie");
        datos.add("Eduardo");
        datos.add("Jessy");

    }
}
