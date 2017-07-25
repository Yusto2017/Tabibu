package com.example.swee.tabibu;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Swee on 7/24/2017.
 */

public class Custom_listview  extends ArrayAdapter<String>{

private String[] Doctype;
    private Activity context;


    public Custom_listview( Activity context, String[] Doctype) {
        super(context, R.layout.activity_doctors,Doctype);
        this.context=context;
        this.Doctype=Doctype;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    class ViewHolder{

        public TextView lst;
        ViewHolder(View v){

            lst= (TextView) v.findViewById(R.id.Listview);


        }
    }
}

