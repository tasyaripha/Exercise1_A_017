package com.example.exercise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private ArrayList<Model> arrayList;
    LayoutInflater inflater;
    Context mContext;
    
    public Adapter(Context context) {
        this.mContext = context;
        this.inflater = LayoutInflater.from(context);
        ArrayList<Model> arrayList = new ArrayList<>();
        this.arrayList = arrayList;
        arrayList.addAll(data_kontak.classNamaArrayList);
    }
    
    public class ViewHolder {
        TextView name;
        
        public ViewHolder() {
            
        }
    }
    @Override
    public int getCount() {
        return data_kontak.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

//    @Override
//    public Object getItem(int i) {
//        return data_kontak.classNamaArrayList.get(i);
//    }

    @Override
    public long getItemId(int i) {
        return (long) i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        ViewHolder holder;
//    }
    }

