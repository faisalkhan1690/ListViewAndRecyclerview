package com.example.faisalkhan.listviewandrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.faisalkhan.listviewandrecyclerview.R;

import java.util.List;

/**
 * RecyclerView.Adapter type adapter to use with recycler view
 *
 * For having recycler view add these dependencies to project.gradle
 *      compile 'com.android.support:recyclerview-v7:+'
 *      compile 'com.android.support:cardview-v7:25.0.+'
 *
 * @author faisal.khan
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.CustomViewHolder> {
    private List<String> feedItemList;

    public MyRecyclerAdapter(List<String> feedItemList) {
        this.feedItemList = feedItemList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        String feedItem = feedItemList.get(i);
        customViewHolder.textView.setText(feedItem);
    }

    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }


    /**
     * View holder class for RecyclerView
     */
    class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        CustomViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.thumbnail);
            this.textView = (TextView) view.findViewById(R.id.title);
        }
    }
}
