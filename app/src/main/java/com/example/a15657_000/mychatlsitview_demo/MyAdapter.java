package com.example.a15657_000.mychatlsitview_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 15657_000 on 2017/9/14 0014.
 */

public class MyAdapter extends BaseAdapter{

    private List<ChatItemListView> mlist;
    private LayoutInflater inflater;


    public MyAdapter(Context context, List<ChatItemListView> mList){
        this.mlist = mList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        ChatItemListView item = mlist.get(position);
        return item.getType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler hodler;
        if(convertView == null){
            hodler = new ViewHodler();
            if(getItemViewType(position) == 0){
                convertView = inflater.inflate(R.layout.listview_item,null);
                hodler.img = (ImageView) convertView.findViewById(R.id.in_img);
                hodler.text = (TextView) convertView.findViewById(R.id.in_text);
            }
            else {
                convertView = inflater.inflate(R.layout.listview_item_out,null);
                hodler.img = (ImageView) convertView.findViewById(R.id.out_img);
                hodler.text = (TextView) convertView.findViewById(R.id.out_text);
            }
            convertView.setTag(hodler);
        }
        else {
            hodler = (ViewHodler) convertView.getTag();
        }
        hodler.img.setImageBitmap(mlist.get(position).getIcon());
        hodler.text.setText(mlist.get(position).getText());
        return convertView;
    }

    public final class ViewHodler{
        public ImageView img;
        public TextView text;
    }
}
