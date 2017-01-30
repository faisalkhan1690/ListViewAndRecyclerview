package com.example.faisalkhan.listviewandrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.faisalkhan.listviewandrecyclerview.adapters.MyRecyclerAdapter;

import java.util.ArrayList;

/**
 * Activity class for demonstrating how to use recycler view in android
 *
 * for more details :-https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html
 *
 * @author faisal.khan
 */
public class RecyclerViewExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_example);

        //initializing view of recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // setting layout manager.
        // Layout manager is required to show recycler view. You can customised it if you want.
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // setting DividerItemDecoration
        // this item is optional.
        // If you want divider like list view or you want ot customised item of recycler view then you can use it.
        DividerItemDecoration itemDecoration=new DividerItemDecoration(RecyclerViewExample.this,layoutManager.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        ArrayList<String> feedsList = new ArrayList<>();

        for(int i=0;i<10;i++){
            feedsList.add("demo name "+i);
        }

        //setting adapter
        recyclerView.setAdapter(new MyRecyclerAdapter(feedsList));
    }
}
