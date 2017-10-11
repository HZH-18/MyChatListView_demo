package com.example.a15657_000.mychatlsitview_demo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.myList);
        List<ChatItemListView> mData = new ArrayList<>();

        ChatItemListView in1 = new ChatItemListView();
        in1.setIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
        in1.setText("Hello how are you?");
        in1.setType(0);

        ChatItemListView out1 = new ChatItemListView();
        out1.setIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
        out1.setText("Fine thank you,and you?");
        out1.setType(1);

        ChatItemListView in2 = new ChatItemListView();
        in2.setIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
        in2.setText("I am fine too.");
        in2.setType(0);

        ChatItemListView out2 = new ChatItemListView();
        out2.setIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
        out2.setText("Bye bye.");
        out2.setType(1);

        ChatItemListView in3 = new ChatItemListView();
        in3.setIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
        in3.setText("See you.");
        in3.setType(0);

        mData.add(in1);
        mData.add(out1);
        mData.add(in2);
        mData.add(out2);
        mData.add(in3);

        listView.setAdapter(new MyAdapter(this,mData));
    }
}
