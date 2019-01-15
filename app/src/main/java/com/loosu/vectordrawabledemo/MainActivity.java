package com.loosu.vectordrawabledemo;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        if (view instanceof ImageView) {
            if (((ImageView) view).getDrawable() instanceof Animatable) {
                ((Animatable) ((ImageView) view).getDrawable()).start();
            }
        }
    }
}
