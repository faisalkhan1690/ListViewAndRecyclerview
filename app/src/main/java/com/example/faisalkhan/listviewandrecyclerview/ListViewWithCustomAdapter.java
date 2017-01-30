package com.example.faisalkhan.listviewandrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.faisalkhan.listviewandrecyclerview.adapters.ListAdapter;

import java.util.ArrayList;

/**
 * Activity class for demonstrating how to use Custom Array adapter with list view
 *
 * for more details :- https://developer.android.com/guide/topics/ui/layout/listview.html
 * for more details :- https://developer.android.com/reference/android/widget/ArrayAdapter.html
 *
 * @author faisal.khan
 */
public class ListViewWithCustomAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_custom_adapter);

        //list of data
        ArrayList<String> listData=new ArrayList<>();
        listData.add("Android");
        listData.add("Google");
        listData.add("Firebase");
        listData.add("Fabric");

        // initializing instance of list view from xml
        ListView listView=(ListView)findViewById(R.id.lv_item);

        //setting adapter in listList View With ArrayAdapter
        listView.setAdapter(new ListAdapter(this,android.R.layout.simple_list_item_1,listData));
    }
}
