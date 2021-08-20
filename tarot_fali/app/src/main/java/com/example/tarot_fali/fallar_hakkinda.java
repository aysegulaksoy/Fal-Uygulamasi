package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class fallar_hakkinda extends AppCompatActivity {
    Button next, previous;
    private ViewFlipper viewFlipper;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallar_hakkinda);

        viewFlipper = findViewById(R.id.view_fipper);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();//önceki sayfayı göster
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();//sonraki sayfayı göster
            }
        });


    }
}