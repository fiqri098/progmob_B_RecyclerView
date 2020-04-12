package com.example.fiqrirecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

            ListItem fiqri = new ListItem(
                    "Fiqrireplay",
                    "Maen Teros"
            );
            ListItem alfian = new ListItem(
                "Alfian The gentleman",
                "Sangat Gentleman"
            );
            ListItem dede = new ListItem(
                "PHADHUKHA",
                "Sang Pengendali Tak terkendali"
            );
            ListItem esa = new ListItem(
                "Esa Si Imajinasi Liar",
                "Imajinasinya Sangat Liar"
            );
            ListItem martadi = new ListItem(
                "Mr. Gepeng",
                "Tak Ada yang Serata Mukanya"
            );
            ListItem derwin = new ListItem(
                "Deril",
                "Ke Jogja Nyari Anak Kecil"
            );
            ListItem nicko = new ListItem(
                "Kakek Kita Terchintjah",
                "Menghilang Entah Kemana"
            );
            ListItem oka = new ListItem(
                "Budi Awan",
                "Bukan Budi yang di Awan"
            );
            listItems.add(fiqri);
            listItems.add(alfian);
            listItems.add(dede);
            listItems.add(esa);
            listItems.add(martadi);
            listItems.add(derwin);
            listItems.add(nicko);
            listItems.add(oka);

        adapter = new MyAdapter(listItems, this);

        recyclerView.setAdapter(adapter);

    }
}
