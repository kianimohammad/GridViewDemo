package com.f19.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class IconAdapter extends BaseAdapter {

    Context context;
    int[] imageIcons;
    String[] numbers;

    public IconAdapter(Context context, int[] imageIcons, String[] numbers) {
        this.context = context;
        this.imageIcons = imageIcons;
        this.numbers = numbers;
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public String getItem(int position) {
        return numbers[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.cell_item, null);
        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView textView = convertView.findViewById(R.id.icon_text);
        imageView.setImageResource(imageIcons[position]);
        textView.setText(numbers[position]);
        return convertView;
    }
}
