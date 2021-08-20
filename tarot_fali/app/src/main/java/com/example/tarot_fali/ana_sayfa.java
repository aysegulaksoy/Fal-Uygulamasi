package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ana_sayfa extends AppCompatActivity {

    Button zar_fali, yildizname,tarot_fali,hakkinda,fallarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);
        zar_fali=(Button) findViewById(R.id.zar_fali);
        yildizname=(Button) findViewById(R.id.yildizname);
        tarot_fali=(Button) findViewById(R.id.tarot_fali);
        hakkinda=(Button) findViewById(R.id.hakkinda);
        fallarim=(Button) findViewById(R.id.fallarim);



        zar_fali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(ana_sayfa.this,zar_fali.class); //zar falının olduğu sayfaya gider
                startActivity(i);

            }
        });


        yildizname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(ana_sayfa.this,yildizname.class);//yıldıznamenin olduğu sayfaya gider
                startActivity(i);

            }
        });

        tarot_fali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ana_sayfa.this, tarot_desteler.class); //tarot falının olduğu sayfaya gider
                startActivity(i);
            }
        });

        hakkinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ana_sayfa.this,fallar_hakkinda.class);//hakkında sayfasında gider
                startActivity(i);
            }
        });

        fallarim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(ana_sayfa.this,Listele.class); //veri tabanının listelendiği sayfaya gider
                startActivity(i);

            }
        });






    }

}