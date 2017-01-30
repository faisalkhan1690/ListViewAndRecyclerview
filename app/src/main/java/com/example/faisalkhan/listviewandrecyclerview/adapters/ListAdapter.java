package com.example.faisalkhan.listviewandrecyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.faisalkhan.listviewandrecyclerview.R;

import java.util.ArrayList;

/**
 * Custom Array adapter class
 *
 * Using this class you can customized  array adapter in android
 *
 * @author faisal.khan
 */
public class ListAdapter extends ArrayAdapter<String> {

    private ArrayList<String> dataList;

    public ListAdapter(Context context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);
        this.dataList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder;

        if (convertView == null) { // thre is no view to recycler
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R.layout.list_row, parent, false); // view that need to inflater
            holder = new ViewHolder();
            holder.imageView = (ImageView) view.findViewById(R.id.thumbnail);
            holder.textView = (TextView) view.findViewById(R.id.title);
            view.setTag(holder);
        } else { //view available to recycle
            holder = (ViewHolder) view.getTag();
        }
        String feedItem = dataList.get(position);
        holder.textView.setText(feedItem); //setting text  in view
        return view;
    }


    /**
     * View holder class for array adapter
     */
    private static class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
