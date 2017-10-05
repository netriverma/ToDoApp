package com.example.netri.todo2;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Netri on 02-04-2017.
 */

public class todoAdapter extends ArrayAdapter<Todo_Content> {

    Context context;
    ArrayList<Todo_Content> todo_contentArrayAdapter;

    public todoAdapter(@NonNull Context context, @NonNull ArrayList<Todo_Content> objects) {
        super(context,0, objects);
        this.context=context;
        todo_contentArrayAdapter=objects;
    }
    static class TodoViewHolder
    {
        TextView titleView;
        TextView listView;
        TextView dateView;

        TodoViewHolder(TextView titleView, TextView listView, TextView dateView)
        {
            this.titleView=titleView;
            this.listView=listView;
            this.dateView=dateView;
        }

    }
}
