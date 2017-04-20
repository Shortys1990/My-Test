package com.example.lepra.iainteractive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lcardenas on 20/04/17.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> datos;

    public MyAdapter(Context context, int layout, List<String> datos) {
        this.context = context;
        this.layout = layout;
        this.datos = datos;
    }

    @Override
    public int getCount() {
        return this.datos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.datos.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder holder;

        if (convertView == null) {

            LayoutInflater layoutInflater = LayoutInflater.from(this.context);

            convertView = layoutInflater.inflate(layout, null);

            holder = new MyViewHolder();

            holder.nameTextView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);

        } else {
            holder = (MyViewHolder) convertView.getTag();
        }


        String currentDate = datos.get(position);

        holder.nameTextView.setText(currentDate);

        return convertView;
    }

    static class MyViewHolder {
        private TextView nameTextView;
    }
}
