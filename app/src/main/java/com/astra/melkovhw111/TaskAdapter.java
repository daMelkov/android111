package com.astra.melkovhw111;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends BaseAdapter {
    private List<Task> tasks;
    private Context context;
    private LayoutInflater inflater;

    public TaskAdapter(Context context, List<Task> tasks) {
        if(tasks == null) {
            tasks = new ArrayList<>();
        }

        this.tasks = tasks;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Task getItem(int position) {
        return tasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_tem, parent, false);
        }

        TextView txtHeader = convertView.findViewById(R.id.header);
        txtHeader.setText(getItem(position).getTitle());

        TextView txtContent = convertView.findViewById(R.id.content);
        txtContent.setText(getItem(position).getContent());

        return convertView;
    }
}
