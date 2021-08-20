package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Listele extends AppCompatActivity {
    veritabani vt; // veritabanı değişkeni oluşturulur
    ListView lv; // listelemek için listview değişkeni oluşturulur
    ImageButton arama;
    EditText ara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listele);

        vt= new veritabani(this); // veritabanı değişkeni atanır
        arama=(ImageButton)findViewById(R.id.arama);
        ara=(EditText)findViewById(R.id.ara);
        lv=(ListView) findViewById(R.id.list);

        listele(); // listele classı çağırılır
        aranan_isim(); // aranan_isim classı çağırılır



    }
    private void listele(){ // listele classı oluşturulur

        String[] stunlar={"id","ad","soyad","fal"}; // sutunlar adına string dizisi oluşturulur ve dzinin stunalrına tırnak içindeki isimler verilir
        SQLiteDatabase db=vt.getReadableDatabase(); //db adına okunabilir veritabanı oluşturulur ve vt veritabanı değişkeni atanır
        Cursor cursor=db.query("personel",stunlar,null,null,null,null,null); //cursor adındaki Cursor değişkeni(veri tabanındaki boşlukları gösterir) oluşturulur
       // cursor değişkenine oluşturulan db veritabanı atanır.
        // personel veri tabanı tablosunun adı ve stunlar da oluşturulan dizideki adlar
        cursor.getColumnIndex("id"); //cursordan adı id olan stunu al
        cursor.getColumnIndex("ad"); //cursordan adı ad olan stunu al
        cursor.getColumnIndex("soyad"); //cursordan soyad id olan stunu al
        cursor.getColumnIndex("fal"); //cursordan fal id olan stunu al

        ArrayList<String> liste= new ArrayList<String>(); //liste adında arraylist(eleman eklendiğinde büyür,çıkarıldığında küçülür) değişkeni oluşturulur.

        while(cursor.moveToNext()){ //cursor değişkeni çalışırken şunlar yapılır
            liste.add( cursor.getString(0)+" "+cursor.getString(1)+" "+cursor.getString(2)+" "+cursor.getString(3)); //liste değişkenine cursor'un 0. 1. 2. 3. indexteki verisi string türünde atanır
            ArrayAdapter<String> adapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,liste); // adapter adında dizi oluşturulur
            //arrrayadapter verilerin görüntülenmesini sağlar
            //görüntülenecek veriler simple_list_item_1 tipinde görüntülenir
            lv.setAdapter(adapter); // lv(başta oluştulan listview)'ye adapter atanır. böylece ekranda veriler göürntülenebilir
        }
    }

    private void aranan_isim(){ // aranan isim adında bir class oluşturulur

        arama.setOnClickListener(new View.OnClickListener() { // arama eyleminin gerçekleşmesi için yazılır
            @Override
            public void onClick(View v) {


                String[] aranan={ara.getText().toString()}; // araan dizisine ara(kullanıcıdan alınan edittext) atanır

                String[] stunlar={"id","ad","soyad","fal"}; // stunlar dizisi veri tabanındaki stunlara verilen adları gösterir
                SQLiteDatabase db=vt.getReadableDatabase();//db adında okunabilir sql database oluşturulur
                Cursor cursor=db.query("personel",stunlar,"ad=?",aranan,null,null,null); //personel tablosundaki ad stununda aranan kelimesi aranır

                ArrayList<String> liste= new ArrayList<String>(); //liste adında arraylist(eleman eklendiğinde büyür,çıkarıldığında küçülür) değişkeni oluşturulur.

                while(cursor.moveToNext()){ // cursor çalışırken aşağıdakiler olur
                    liste.add( cursor.getString(0)+" "+cursor.getString(1)+" "+cursor.getString(2)+" "+cursor.getString(3)); //liste değişkenine cursor'un 0. 1. 2. 3. indexteki verisi string türünde atanır
                    ArrayAdapter<String> adapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,liste); // adapter adında dizi oluşturulur
                    //arrrayadapter verilerin görüntülenmesini sağlar
                    //görüntülenecek veriler simple_list_item_1 tipinde görüntülenir
                    lv.setAdapter(adapter); // lv(başta oluştulan listview)'ye adapter atanır. böylece ekranda veriler göürntülenebilir
                    ara.setText(""); // ekranda ara değişkeninin soucu görünür
                }

            }
        });




    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.veritabani,menu); //menu klasöründeki xml dosyasına erişim
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId();

        id=R.id.veritabani; //menu.xml'deki id'si veritabani olan item

       Intent i=new Intent(Listele.this,guncelle.class); // guncelle sayfasına yönlendirilir
       startActivity(i);
        return super.onOptionsItemSelected(item);
    }



    }

