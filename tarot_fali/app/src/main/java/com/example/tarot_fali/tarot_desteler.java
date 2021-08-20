package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tarot_desteler extends AppCompatActivity {
    ImageButton deste1,deste2,deste3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarot_desteler);

        deste1=(findViewById(R.id.deste1));
        deste2=(findViewById(R.id.deste2));
        deste3=(findViewById(R.id.deste3));

         //tüm butonlar tarot_desteler sayfasına geçiş yapmak için kullanılır

        deste1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(tarot_desteler.this, tarot_kartlar.class);
                startActivity(i);
            }
        });

        deste2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(tarot_desteler.this, tarot_kartlar.class);
                startActivity(i);
            }
        });

        deste3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(tarot_desteler.this, tarot_kartlar.class);
                startActivity(i);
            }
        });
    }
}