package com.example.siranjeevi.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class custom_Adapter extends ArrayAdapter <String>{
    private final Context context= getContext() ;
    private final String[] names= { "Joe Belfiiore", "ME :)" , "Pragathi Guruprasath"};
    int[] imagee;
    public custom_Adapter(Context context, String[] names,int[] ima) {
        super(context,R.layout.custom_row ,names);
       // this.context = context;
       /// this.names = names;
       // this.imagee=ima;
        imagee = ima;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater siraInflater = LayoutInflater.from(getContext());
        View customview = siraInflater.inflate(R.layout.custom_row,parent,false);


        String singleName = getItem(position);
        TextView contactName = (TextView)customview.findViewById(R.id.contactName);
        ImageView imageView = (ImageView) customview.findViewById(R.id.imageView);

        contactName.setText(singleName);
        imageView.setImageResource(imagee[position]);
        return customview;

    }
}
