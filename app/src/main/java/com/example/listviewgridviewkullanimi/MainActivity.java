package com.example.listviewgridviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ArrayList<String> olkeler = new ArrayList<>();
    private ArrayAdapter<String> verilenAdapteri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        olkeler.add("Azerbaycan");
        olkeler.add("Italiya");
        olkeler.add("ABS");
        olkeler.add("Ingiltere");
        olkeler.add("Almaniya");
        olkeler.add("Yaponya");
        olkeler.add("Indonezya");
        olkeler.add("Ispaniya");
        olkeler.add("Uganda");
        olkeler.add("Braziliya");

        verilenAdapteri = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1,olkeler);
        gridView.setAdapter(verilenAdapteri);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Kliklediyiniz olke : "+olkeler.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}