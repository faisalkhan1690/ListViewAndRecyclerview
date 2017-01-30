package com.example.faisalkhan.listviewandrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Activity class
 */
public class ListViewWithArrayAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_array_adapter);

        //list of data
        ArrayList<String> listData=new ArrayList<>();
        listData.add("Android");
        listData.add("Google");
        listData.add("Firebase");
        listData.add("Fabric");

        // initializing instance of list view from xml
        ListView listView=(ListView)findViewById(R.id.lv_item);

        //setting adapter in listList View With ArrayAdapter
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData));
    }
}
