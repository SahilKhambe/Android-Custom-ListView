package com.example.androidcustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    int[] images;
    String[] city;
    String[] name;
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, int[] images, String[] city, String[] name) {
        this.context = context;
        this.images = images;
        this.city = city;
        this.name = name;
        layoutInflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return city.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.img1);
        TextView textView = (TextView) convertView.findViewById(R.id.txt1);
        TextView textView1 = (TextView) convertView.findViewById(R.id.txt2);

        imageView.setImageResource(images[position]);
        textView.setText(city[position]);
        textView1.setText(name[position]);

        return convertView;

    }
}
