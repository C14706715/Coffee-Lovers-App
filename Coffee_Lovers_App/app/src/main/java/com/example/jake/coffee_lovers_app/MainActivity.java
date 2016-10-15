package com.example.jake.coffee_lovers_app;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout =(LinearLayout) findViewById(R.id.GalleryLayoutID);
        for(int i=0; i<5; i++){
            ImageView iv = new ImageView(this);
            iv.setId(i);
            iv.setPadding(2, 2, 2, 2);
            iv.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), R.drawable.ic_launcher));
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(iv);
        }
    }
}
