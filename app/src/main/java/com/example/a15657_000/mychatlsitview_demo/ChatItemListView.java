package com.example.a15657_000.mychatlsitview_demo;

import android.graphics.Bitmap;

/**
 * Created by 15657_000 on 2017/9/16 0016.
 */

public class ChatItemListView {
    private int type;
    private String text;
    private Bitmap icon;

    public ChatItemListView(){

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}
