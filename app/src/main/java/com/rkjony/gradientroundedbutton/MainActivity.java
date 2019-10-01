package com.rkjony.gradientroundedbutton;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.CpuUsageInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rkjony.gradientroundedconrnerbutton.CustomButton;

import java.time.format.TextStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomButton customButton = findViewById(R.id.custom_btn);

        TextView textView = customButton.getButton();
        Typeface font = Typeface.defaultFromStyle(Typeface.ITALIC);
        textView.setTypeface(font);
        customButton.setButtonRadius(20);
        customButton.setShadowRadius(10);
//        customButton.setShadowColor(Color.RED);
        customButton.setButtonStartColor(Color.parseColor("#000000"));
        customButton.setButtonEndColor(Color.parseColor("#0000FF"));
        customButton.setButtonPressStartColor(Color.BLACK);
        customButton.setButtonPressEndColor(Color.BLACK);
        customButton.setButtonGradientOrientation(CustomButton.LEFT_RIGHT);
        customButton.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "onClick", Toast.LENGTH_LONG).show();
            }
        });
    }
}
