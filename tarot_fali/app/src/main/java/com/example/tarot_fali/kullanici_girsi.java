package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kullanici_girsi extends AppCompatActivity {
Button  kaydet;
EditText ad,soyad;
TextView text;
private veritabani vt;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_girsi);

        vt=new veritabani(this);
        kaydet=(Button) findViewById(R.id.kaydet);

        ad=(EditText) findViewById(R.id.ad);
        soyad=(EditText) findViewById(R.id.soyad);
        text=(TextView)findViewById(R.id.text);

        Intent i=getIntent();
        String fal=i.getStringExtra("fal"); //sayfa1'dekifal1 anahtar kelimeli metnin çağırılmaası.
        text.setText(fal);//tx adındaki textview'a string türündeki fal adındaki verinin aktarılması.

        kaydet.setOnClickListener(new View.OnClickListener() { // kişinin kaydedilebilmesi için oluşturuldu
            @Override
            public void onClick(View v) {
                Intent i=new Intent(kullanici_girsi.this,Listele.class); // listle(verilerin olduğu ekran) yönlendirilir
                SQLiteDatabase db= vt.getWritableDatabase(); // db adında sqlite veri tabanı oluşturulur ve vt adındaki veri tabanı değiştkeni atanır
                ContentValues cv=new ContentValues(); // içerilerin veritabanına gönderilebilmesi için cv adında contentvalues oluşturulur
                cv.put("ad",ad.getText().toString()); // cv'deki ad sütununa ad(kullnaıcıdan alındı) eklenir
                cv.put("soyad",soyad.getText().toString()); // cv'deki ad sütununa soyad(kullnaıcıdan alındı) eklenir
                cv.put("fal",text.getText().toString()); // cv'deki ad sütununa text(bir önceki sayfadan alınan fal sonucu) eklenir
                db.insert("personel",null,cv); // yukarıdaki veriler personel tablosundaki boşluklara eklenir
                ad.setText("");
                soyad.setText("");
                text.setText("");


                startActivity(i);

            }
        });



    }







}