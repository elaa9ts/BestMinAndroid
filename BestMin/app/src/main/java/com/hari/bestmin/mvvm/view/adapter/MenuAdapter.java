package com.hari.bestmin.mvvm.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hari.bestmin.R;

import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class MenuAdapter extends BaseAdapter {

    private List<String> list;
    private Context context;
    private LayoutInflater layoutInflater;
    private int selectedPosition;

    public MenuAdapter(Context context, List<String> list) {
        this.list = list;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewHolder viewHolder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.adapter_menu_list, parent, false);
            viewHolder = new ListViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ListViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(list.get(position));

        if(selectedPosition == position){
            viewHolder.relativeLayout.setBackgroundColor(context.getResources().getColor(R.color.green));
        }else {
            viewHolder.relativeLayout.setBackgroundColor(context.getResources().getColor(R.color.menu_item_background));
        }
        return convertView;
    }

    public void setSelectedState(int position){
        selectedPosition = position;
        notifyDataSetChanged();
    }
    private class ListViewHolder {

        public TextView textView;
        public LinearLayout relativeLayout;

        public ListViewHolder(View item) {
            textView = (TextView) item.findViewById(R.id.menu_title);
            relativeLayout = (LinearLayout) item.findViewById(R.id.menu_item_layout);
        }
    }
}
