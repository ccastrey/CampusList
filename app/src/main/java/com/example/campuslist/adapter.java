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
import android.content.Context;

 class adapter extends ArrayAdapter<String> {
     adapter(Context context, String[] buildings){
         super(context, R.layout.row, buildings);
     }

    /* @Override
     public View getView(int position, View convertView, ViewGroup parent){
         LayoutInflater inflate = LayoutInflater.from(getContext());
         View customview = inflate.inflate(R.layout.row, parent, false);

         String singlebuilding = getItem(position);
         //TextView building_text = (TextView) customview.findViewById(R.id.building_text);
     }*/
}

