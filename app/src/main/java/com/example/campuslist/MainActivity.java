package com.example.campuslist;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Context;
import android.os.Bundle;

//Created by following youtube tutorial from thenewboston 45-49 and Android WorldClub

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] buildings = {"College of Education (COE)","Innovation and Instruction(II)","Leo Cain Library (LIB)",
            "James l. Welch Hall (WH)", "Student Health Center (SHC)", "Loker Student Union (LSU)", "Social and Behavioral Sciences (SBS)",
            "Lacorte Hall (LCH)", "University Theater (UT)", "Natural Sciences and Mathmatics (NSM)","Science and Innovation (SI)",
            "Gymnasium (Gym)", "Field House (FH)", "Swimming Pool (SP)", "ROTC & Parking Services Modular (RPM)",
            "South Academy Complex 2 (SAC-2)", "South Academy Complex 3 (SAC-3)"
    };
    String[] abriv ={"COE", "II", "LIB","WH", "SHC","LSU","SBS","LCH","UT","NSM","SI","GYM","FH","SP","RPM","SAC-2",
            "SAC-3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, buildings, abriv);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position == 0){
                    Toast.makeText(MainActivity.this, "COE", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "II", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, ":LIB", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "WH", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "SHC", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "LSU", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "SBS", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "LCH", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "UT", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "NSM", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "SI", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "GYM", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "FH", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "SP", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "RPM", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "SAC-2", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "SAC-3", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String buildings[];
        String abriv[];

        MyAdapter (Context c, String[] buildings, String[] abriv){
            super(c, R.layout.row, R.id.textView);
            this.context = c;
            this.buildings = buildings;
            this.abriv = abriv;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView mybuildings = row.findViewById(R.id.textView);
            TextView myabriv = row.findViewById(R.id.textView);

            mybuildings.setText(buildings[position]);
            myabriv.setText(abriv[position]);


            return super.getView(position, convertView, parent);
        }

    }
}
