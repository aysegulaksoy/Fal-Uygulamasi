package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class guncelle extends AppCompatActivity {

    veritabani vt; // veri tabanı türünde değişken oluşturulur
    Button bul,sil,kaydet;
    EditText yeniad,yenisoyad,yenid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guncelle);

        vt= new veritabani(this); // vt değişkeninin veritabanına atanması
        bul=(Button)findViewById(R.id.bul);
        sil=(Button)findViewById(R.id.sil);
        kaydet=(Button)findViewById(R.id.kaydet);
        yeniad=(EditText) findViewById(R.id.yeniad);
        yenisoyad=(EditText) findViewById(R.id.yenisoyad);
        yenid=(EditText) findViewById(R.id.yenid);

        yeniad.setEnabled(false); // yeniad etkin değil, kullanıcı veri giremez
        yenisoyad.setEnabled(false); // yenisoyad etkin değil, kullanıcı veri giremez

        bul.setOnClickListener(new View.OnClickListener() { //aranan ıd bulunması için oluştutulan buton
            @Override
            public void onClick(View v) {



                String[] aranan={yenid.getText().toString()}; //aranan adında oluşturulan diziye yeniad(kullnaıcı girecek) atanır

                String[] stunlar={"id","ad","soyad","fal"};// veri tabanındaki sütunlarda bulunanlar
                SQLiteDatabase db=vt.getReadableDatabase(); // okunababilir modda sqlite veritabanı oluşturulur
                Cursor c= db.query("personel",stunlar,"id=?",aranan,null,null,null); //db adlı veritabanında id aranır


                if(c.moveToNext()){ // eğer c(aranan id) bulunursa

                    yeniad.setEnabled(true); //yeniad etkinleştirilir
                    yenisoyad.setEnabled(true); // yenisoyad etkinleştirilir

                    yenid.setText(c.getString(0)); // c'ye yani veri tabnına yeni id eklenir
                    yeniad.setText(c.getString(1));  // c'ye yani veri tabnına yeni ad eklenir
                    yenisoyad.setText(c.getString(2)); // c'ye yani veri tabnına yeni soyad eklenir
                }
                else {
                    Toast.makeText(guncelle.this,"böyle bir ıd bulunmamaktadır",Toast.LENGTH_LONG).show(); //eğer id bulunamazsa hata mesajı gösterir
                }

            }
        });
        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] kayıt={yenid.getText().toString()}; // kayıt adındaki diziye yenid değişkeni atanır


                SQLiteDatabase db=vt.getReadableDatabase(); // db adında okunabilir veri tabanı oluşturulur
                ContentValues cv=new ContentValues(); // veri tabanına içerik atabilmek için cv adında contetcalues oluşturulur
                cv.put("ad",yeniad.getText().toString()); // cv' de ad stununa yeniad atanır
                cv.put("soyad",yenisoyad.getText().toString()); // cv' de ad stununa yenisoyad atanır
                int sonuc= db.update("personel",cv,"id=?",kayıt); // atamayı kontrol etmek için sonuc adında int oluşturulur
               //Listelerin bulunduğu tablonun adı personel. personel tablosuna cv ve kayıt değışkenleri yüklenir(update)
                if(sonuc>-1){//eğer sonuc -1'den büyükse yükleme gerçekleşmiştir
                    Toast.makeText(guncelle.this,"güncellendi",Toast.LENGTH_LONG).show(); //ekranda güncellendi mesajı görünür
                    Intent i= new Intent(guncelle.this,Listele.class); // listele(verilerin kaydedildiği yer) ekranına gidilir
                    startActivity(i);
                }

            }
        });

        sil.setOnClickListener(new View.OnClickListener() { //aranan veri bulunduktan sonra silme işlemi için oluşturuldu
            @Override
            public void onClick(View v) {
                String[] sil={yenid.getText().toString()};  //sil adında dizi oluşturulup içine yenid atanır


                SQLiteDatabase db=vt.getReadableDatabase(); // db adında sqlite oluşturulur ve vt(veritabanı değişkeni) atanır

                Integer s=db.delete("personel","id=?",sil); // silme işleminin gerçekleşmesi için s adında ınteger oluşturulur
               //personel tablosunda id'si yenid olan veri silinir

                if(s>-1){ // silme işleminin kontrolü için koşul oluşturulur. s -1den büyükse silme gerçekleşmiştir
                    Toast.makeText(guncelle.this,"silme başarılı",Toast.LENGTH_LONG).show(); //ekrana silme işlemi başarlı yazılır
                    Intent i= new Intent(guncelle.this,Listele.class); // listele(verilerin kaydedildiği yer) ekranına gidilir
                    startActivity(i);
                }
            }
        });

    }
}