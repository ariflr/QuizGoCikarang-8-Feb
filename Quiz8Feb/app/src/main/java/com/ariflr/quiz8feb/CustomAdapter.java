package com.ariflr.quiz8feb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ariflr on 2/8/18.
 */

class CustomAdapter {
    String [] result1;
    String [] result2;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater = null;

    //declare osName List, osImages, mainActivity
    public CustomAdapter(MainActivity mainActivity, String[] namamakanan, int[] gambar, String[] jenis) {
// TODO Auto-generated constructor stub
        result1 = namamakanan;
        result2 = jenis;
        context = mainActivity;
        imageId = gambar;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount(){
//To Count The Sum
// TODO Auto-generated method stub
        return result1.length;
    }
    @Override
    public Object getItem(int pos) {
// TODO Auto-generated method stub
        return pos;
    }
    @Override
    public long getItemId(int pos){
// TODO Auto-generated method stub
        return pos;
    }

    public class Holder
    {
        TextView text;
        TextView text2;
        ImageView img;
    }
    @Override
    public View getView(final int pos, View convertView, ViewGroup parent){
// TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.sample_grid_layout, null);
        holder.text = (TextView)rowView.findViewById(R.id.textView);
        holder.text2 = (TextView)rowView.findViewById(R.id.textView2);
        holder.img =(ImageView) rowView.findViewById(R.id.imageView);

        holder.text.setText(result1[pos]);
        holder.text2.setText(result2[pos]);
        holder.img.setImageResource(imageId[pos]);
/*
rowView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
// TODO Auto-generated method stub
Toast.makeText(context, "You Clicked " +result1[pos], Toast.LENGTH_LONG).show();
}
});
*/
        return rowView;
    }
}
