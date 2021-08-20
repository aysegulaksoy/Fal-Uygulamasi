package com.example.tarot_fali;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class veritabani extends SQLiteOpenHelper { // sqlite ile ilgili işlemleri yapabilmek için veritabani türünde class olşturulur

    public veritabani(Context context){ //veritabanın genel durumunu belirlemek için yine bir class oluturulur

        super( context,"Falinga",null,2);//veritabnının adı falingadır. içi şimdilik boştur.
    }
    @Override
    public void onCreate(SQLiteDatabase db){ //db parametresi sqlite veri tabanı oluşturulur
        db.execSQL("Create table personel(id INTEGER PRIMARY KEY AUTOINCREMENT, ad TEXT, soyad TEXT,fal TEXT);");
        // personel adında tablo oluşturulur
        //personel tablosunun içerisine yer alan birincil anahtarlar oluşturulur, idlerin otomatik artması sağlanır
        //ad, soyad,fal text türündeki değişkenleri oluşturulur


    }@Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){ //uygulamanın güncellenmesi dahilinde harekete geçer
        db.execSQL("Drop table If Exists personel");//personel tablosu varsa çalıştır
        this.onCreate(db);
    }
}
