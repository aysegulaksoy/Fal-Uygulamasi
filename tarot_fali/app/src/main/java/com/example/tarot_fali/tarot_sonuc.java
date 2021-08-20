package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tarot_fali.R;

import java.io.File;
import java.io.FileOutputStream;

public class tarot_sonuc extends AppCompatActivity {
    TextView tx;
    ImageView img;
    Button anasf , tarotfl;
    veritabani vt; // veritabanı değişkei oluşturulur
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarot_sonuc);

        vt=new veritabani(this); // verit abanı değişkeni tanımalanır
        tx=(TextView)findViewById(R.id.textView3);
        img=(ImageView) findViewById(R.id.imageView4);
        anasf=(Button) findViewById(R.id.anasf);
        tarotfl=(Button) findViewById(R.id.tarotfl);



        Intent i=getIntent();//metni bir önceki sayfadan çağırmak için
        Bundle m=getIntent().getExtras();// resmi bir önceki sayfadan çağırmak için

        int resim=m.getInt("resim"); //sayfa1'deki resim anahtar kelimeli resmin çağırılmaası.
        img.setImageResource(resim);//img adındaki imageview'a int türündeki resim adındaki verinin aktarılması.
        String fal=i.getStringExtra("fal1"); //sayfa1'dekifal1 anahtar kelimeli metnin çağırılmaası.
        tx.setText(fal);//tx adındaki textview'a string türündeki fal adındaki verinin aktarılması.


        anasf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(tarot_sonuc.this,ana_sayfa.class); //ana sayfaya yönlendirme
                startActivity(i);

            }
        });
        tarotfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(tarot_sonuc.this, tarot_desteler.class); //tekrar tarot falı baktırmak isterse tarot_destelere yönlendirir.
                startActivity(i);

            }
        });




    }
    //paylaş ve kaydet ikonları oluşturulması
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu); //menu klasöründeki xml dosyasına erişim
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId(); // menü itemlerinin idlerini tanımlamak için oluşturuldu



        if(id==R.id.paylas){ // kullnaıcı paylaş ikonuna basmışsa(paylas id'li item) çalışır
            share();// share classı çağırılır
        }
        if(id==R.id.sonucu_kaydet){ // kullnaıcı sonuc kaydet ikonuna basmışsa(sonuc_kaydet id'li item) çalışır

            Intent i= new Intent(tarot_sonuc.this, kullanici_girsi.class); // kullanıcı_girisi sayfasına yönlendirilir
            i.putExtra("fal",tx.getText().toString()); // ayrıca fal adındaki tx(fal sonucu burada yazar) değişkeni de göderilir
            SQLiteDatabase db= vt.getWritableDatabase(); // sqlite türünde db adında değişken oluşturulur
            ContentValues cv=new ContentValues(); // içerilerin veritabanına gönderilebilmesi için cv adında contentvalues oluşturulur
            db.insert("personel",null,cv); // yukarıdaki veri(tx) personel tablosundaki boşluklara eklenir
            tx.setText("");
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }



    private void share(){ //fal sonucunun paylaşılması için oluşturulan class

        StrictMode.VmPolicy.Builder builder= new StrictMode.VmPolicy.Builder(); // hata tesbiti için
        StrictMode.setVmPolicy(builder.build());

        BitmapDrawable drawable=(BitmapDrawable) img.getDrawable();// fal sonucundaki resmin tanımlanması

        Bitmap bitmap=drawable.getBitmap();// resmin bitmapa dönüştürülmesi

        File f=new File(getExternalCacheDir()+"/"+getResources().getString(R.string.app_name)+".png");//dosyanın yazılacağı klasör

        Intent paylas;// fal sonucunun paylaşılması için intent oluşturulması

        try{ //yapılması istenenler

            FileOutputStream outputStream= new FileOutputStream(f);//oluşturulan resim dosyasının dışa aktarılması

            bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);//resmin formatı ve boyutlandırılması

            paylas=new Intent(Intent.ACTION_SEND);
            paylas.setType("image/*");
            paylas.putExtra(Intent.EXTRA_TEXT, tx.getText());// fal metninin alınması
            paylas.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(f));//resmin alınması

        } catch (Exception e){ //bir hata ile karşılaşılırsa

            throw  new RuntimeException(e);//çalışma zamanı istisnası oluşturma

        }
        startActivity(Intent.createChooser(paylas,"fal sonucunu şurada paylaşın")) ; //paylaşılacak uygulamanın seçilmesi için chooser oluşturulması


    }














}