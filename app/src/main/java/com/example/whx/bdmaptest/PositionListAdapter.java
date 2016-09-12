package com.example.whx.bdmaptest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by whx on 2016/9/12.
 */
public class PositionListAdapter extends BaseAdapter{

    private ArrayList<PositionModel> data;
    private Context context;

    public PositionListAdapter(Context context, ArrayList<PositionModel> data){
        this.context = context;
        this.data = data;
    }

    public void setData(ArrayList<PositionModel> list){
        this.data = list;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.position_list_item,parent,false);
        }

        ViewHolder holder = (ViewHolder)convertView.getTag();

        if(holder == null){
            holder = new ViewHolder();
            holder.nameText = (TextView)convertView.findViewById(R.id.name);
            holder.addressText = (TextView)convertView.findViewById(R.id.address);
        }

        holder.nameText.setText(data.get(position).getName());
        holder.addressText.setText(data.get(position).getAddress());

        convertView.setTag(holder);
        return convertView;
    }

    public class ViewHolder{

        TextView nameText;
        TextView addressText;
    }
}
