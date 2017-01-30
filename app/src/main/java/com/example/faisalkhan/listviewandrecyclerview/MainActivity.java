package com.example.faisalkhan.listviewandrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Activity Class to display list of Topics
 *
 * @author Faisal Khan
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list of data
        ArrayList<String> listData=new ArrayList<>();
        listData.add("List View With ArrayAdapter");
        listData.add("List View with Custom Adapter");
        listData.add("Recycler View and its related things");

        // initializing instance of list view from xml
        ListView listView=(ListView)findViewById(R.id.lv_item);

        //setting adapter in listList View With ArrayAdapter
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData));

        //setting on item click listener on list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){

                    case 0: //View
                        //start intent to reach activity where you can see how to use List View With ArrayAdapter
                        startActivity(new Intent(MainActivity.this,ListViewWithArrayAdapter.class));
                        break;

                    case 1: //TextView
                        //start intent to reach activity where you can see how to use List View with Custom Adapter
                        startActivity(new Intent(MainActivity.this,ListViewWithCustomAdapter.class));
                        break;

                    case 2: //Button
                        //start intent to reach activity where you can see how to use Recycler View and its related things
                        startActivity(new Intent(MainActivity.this,RecyclerViewExample.class));
                        break;
                }
            }
        });
    }
}
