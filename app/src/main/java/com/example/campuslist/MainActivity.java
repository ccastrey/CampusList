package com.example.campuslist;

import android.app.Activity;
import android.os.Bundle;
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

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Created by following youtube tutorial from thenewboston 45-49
        String[] buildings = {"College of Education (COE)","Innovation and Instruction(II)","Leo Cain Library (LIB)",
        "James l. Welch Hall (WH)", "Student Health Center (SHC)", "Loker Student Union (LSU)", "Social and Behavioral Sciences (SBS)",
                "Lacorte Hall (LCH)", "University Theater (UT)", "Natural Sciences and Mathmatics (NSM)","Science and Innovation (SI)",
                "Gymnasium (Gym)", "Field House (FH)", "Swimming Pool (SP)", "ROTC & Parking Services Modular (RPM)",
                "South Academy Complex 2 (SAC-2)", "South Academy Complex 3 (SAC-3)"
        };
        ListAdapter camAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildings);
        ListView camView = (ListView)findViewById(R.id.camView);
        camView.setAdapter(camAdapt);

        /*camView.setOnItemClickListener(
                new AdapterView.OnClickListener(){
                    @Override
                    public void OnItemClick(AdapterView<?> parent, View view, int position, long id){
                        String buildings = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, buildings, Toast.LENGTH_LONG).show();
                    }
                }
        );*/
    }
}
