package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tarot_kartlar extends AppCompatActivity {
ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15,ib16,ib17,ib18,ib19,ib20,ib21,ib22,ib23,ib24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarot_kartlar);

        ib1=(ImageButton) findViewById(R.id.ib1);
        ib2=(ImageButton) findViewById(R.id.ib2);
        ib3=(ImageButton) findViewById(R.id.ib3);
        ib4=(ImageButton) findViewById(R.id.ib4);
        ib5=(ImageButton) findViewById(R.id.ib5);
        ib6=(ImageButton) findViewById(R.id.ib6);
        ib7=(ImageButton) findViewById(R.id.ib7);
        ib8=(ImageButton) findViewById(R.id.ib8);
        ib9=(ImageButton) findViewById(R.id.ib9);
        ib10=(ImageButton) findViewById(R.id.ib10);
        ib11=(ImageButton) findViewById(R.id.ib11);
        ib12=(ImageButton) findViewById(R.id.ib12);
        ib13=(ImageButton) findViewById(R.id.ib13);
        ib14=(ImageButton) findViewById(R.id.ib14);
        ib15=(ImageButton) findViewById(R.id.ib15);
        ib16=(ImageButton) findViewById(R.id.ib16);
        ib17=(ImageButton) findViewById(R.id.ib17);
        ib18=(ImageButton) findViewById(R.id.ib18);
        ib19=(ImageButton) findViewById(R.id.ib19);
        ib20=(ImageButton) findViewById(R.id.ib20);
        ib21=(ImageButton) findViewById(R.id.ib21);
        ib22=(ImageButton) findViewById(R.id.ib22);
        ib23=(ImageButton) findViewById(R.id.ib23);
        ib24=(ImageButton) findViewById(R.id.ib24);


        //tüm butonlar ters_duz sayfasına geçiş yapmak için kullanılır

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(tarot_kartlar.this, ters_duz.class); //ters_duz sayfasına geçmek için

                startActivity(i);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);  //ters_duz sayfasına geçmek için
                startActivity(i);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });

        ib19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });
        ib20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });
        ib22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });
        ib23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });
        ib24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });
        ib21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), ters_duz.class);
                startActivity(i);
            }
        });



    }
}