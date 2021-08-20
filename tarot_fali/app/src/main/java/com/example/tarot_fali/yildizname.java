package com.example.tarot_fali;

import androidx.appcompat.app.ActionBar;
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
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;

public class yildizname extends AppCompatActivity {
    TextView tv11;
    Button bt, bt2, bt3;
    RadioButton rb, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16,
            rb17, rb18, rb19, rb20, rb21, rb22, rb23, rb24, rb25, rb26;
    veritabani vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yildizname);

//BAŞLIĞIN YAZILI OLDUĞU YERİN RENGİNİ DEĞİŞTİRDİK (ÜST)
        //GEREKEN TANIMLAMALARI YAPIP XML KISIMLA EŞLEŞTİRDİK (ALT)

        vt=new veritabani(this);
        tv11= findViewById(R.id.tv11);
        bt= findViewById(R.id.bt);
        bt2= findViewById(R.id.bt2);
        bt3= findViewById(R.id.bt3);
        rb= findViewById(R.id.rb);
        rb2= findViewById(R.id.rb2);
        rb3= findViewById(R.id.rb3);
        rb4= findViewById(R.id.rb4);
        rb5= findViewById(R.id.rb5);
        rb6= findViewById(R.id.rb6);
        rb7= findViewById(R.id.rb7);
        rb8= findViewById(R.id.rb8);
        rb9= findViewById(R.id.rb9);
        rb10= findViewById(R.id.rb10);
        rb11= findViewById(R.id.rb11);
        rb12= findViewById(R.id.rb12);
        rb13= findViewById(R.id.rb13);
        rb14= findViewById(R.id.rb14);
        rb15= findViewById(R.id.rb15);
        rb16= findViewById(R.id.rb16);
        rb17= findViewById(R.id.rb17);
        rb18= findViewById(R.id.rb18);
        rb19= findViewById(R.id.rb19);
        rb20= findViewById(R.id.rb20);
        rb21= findViewById(R.id.rb21);
        rb22= findViewById(R.id.rb22);
        rb23= findViewById(R.id.rb23);
        rb24= findViewById(R.id.rb24);
        rb25= findViewById(R.id.rb25);
        rb26= findViewById(R.id.rb26);

        //BUTONA BASINCA FAL MESAJI VERME İŞLEMİNİN ÇALIŞMASI İÇİN SETONCLİCK


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bt2.setVisibility(View.VISIBLE); //DEFAULT OLARAK INVISIBLE GELEN BT2'NİN FAL SONUCU VERİLİNCE GÖRÜNÜR OLMASINI SAĞLADIK.
                bt3.setVisibility(View.VISIBLE); //DEFAULT OLARAK INVISIBLE GELEN BT2'ÜN FAL SONUCU VERİLİNCE GÖRÜNÜR OLMASINI SAĞLADIK.
                tv11.setVisibility(View.VISIBLE); //DEFAULT OLARAK INVISIBLE GELEN TV11'İN FAL SONUCU VERİLİNCE GÖRÜNÜR OLMASINI SAĞLADIK.

                //ÇEŞİTLİ SEÇENEKLERLE MESAJ VERSİN DİYE İF, ELSE İF, ELSE KULLANDIK.
                //SON 2 TANESİ DİĞER BELİRTİLEN SEÇENEKLERİN SEÇİLİ OLMADIĞI HER DURUMDA VERİLECEK OLAN MESAJ.
                //ERKEK VE KADINDAN BİRİ HER DURUMDA SEÇİLİ OLMAK ZORUNDA SONUÇTA :)

                if (rb10.isChecked() && rb.isChecked())   //ERKEK VE YALNIZ KALDIĞIMI GÖRÜRÜM SEÇİLİYSE
                    tv11.setText("ŞEMS BU ER KİŞİYE KUVVET VERMİŞ!                                                "
                            +
                            "Bu er kişi hayırlı bir evlat olur. Tahsilli olursa yönetici olur. Gezmesi, evde oturmasından daha hayırlıcadır. Birden fazla hatunu olur. Beyaz hatunlardan kaçınmalıdır. Kıskananı boldur. Büyü yapılır, nazara karşı korunmalıdır. Bol bol çocukları olur. Bereketlidir. Yıldızı kolay kolay düşmez.Safra iltihabı yaşar, atlatırsa 80 yaşına kadar yaşar.");
                else if (rb10.isChecked() && rb2.isChecked())    //KADIN VE YALNIZ KALDIĞIMI GÖRÜRÜM SEÇİLİYSE
                    tv11.setText("ŞEMS BU HATUNA                    KUVVET VERMİŞ!                                                      " +
                            "Bu hatun kişi hayırlı evlattır. Tahsil yaparsa vatana millete hayırlı bir insan olur. Kıskananı boldur. Büyü yapılır. Büyülerden ve nazardan dua ile korunması lazım gelir. Komşularının her işine koşturur. Gezmesi, evde oturmasından daha hayırlıcadır. Geçimsiz olur lakin her işe de koşturur. Küslük bilmez, çabuk barışır. Kısmeti çok açıktır. İki evlilik yapar. Boğulma korkusu yaşar. Esmer erkeklerden kaçınmalıdır. Çocukları hayırlı evlatlar olur.");
                else if (rb11.isChecked() && rb.isChecked())        //ERKEK VE BOĞULDUĞUMU GÖRÜRÜM SEÇİLİYSE
                    tv11.setText("ZÜHRE YILDIZI BU ER KİŞİNİN KISMETİNİ AÇMIŞ!                             " +
                            "Zühre yıldızının seçtiği er kişinin kısmeti hep açık olur. Fakat diğer erkekler onu kıskanırlar. Onu kıskanan erkeklerin avratları ve anaları bu er kişiye büyü yapabilir, düğümlere üfleyebilirler. Bu er kişinin korunması gerekir. Yumuşak başlı olur. Evlendiğinde kız çocukları olur. Ömrü uzun, bedeni sağlıklı olur.");
                else if (rb11.isChecked() && rb2.isChecked())       //KADIN VE BOĞULDUĞUMU GÖRÜRÜM SEÇİLİYSE
                    tv11.setText("ZÜHRE YILDIZI BU HATUNA İYİ AHLAK VERMİŞ!                              " +
                            "Zühre yıldızının seçtiği hatunun kısmeti hep açık olur. Gezmesi, evde oturmasından daha hayırlıcadır. Doğurgan olur. Safra kesesi hastalıkları olsa da uzun ömürlü olur. Bir kere ya da üç kere evlenir. Suratında Zühre yıldızının mührü olur, güzel olur. Yaptığı yemek bereketli olur. Kıskanılır. Esmer kadınlar ona büyü yapabilir. Sirkeli suyla evini bol bol temizlemesi hayırlıcadır.");
                else if (rb25.isChecked() && rb.isChecked())       //ERKEK VE MERAKTAN ÇÖZÜYORUM SEÇİLİYSE
                    tv11.setText("UTARİD YILDIZI BU ER KİŞİYE DİL VERMİŞ!                                                       " +
                            "Bu er kişi çok beceriklidir. Tüccar olması hayırlıcadır. Zengin olur, 35 yaşından sonra para kaybeder lakin yeniden kazanır. Komşularıyla arası iyidir. Gezmesi, evde oturmasından daha hayırlıcadır. Düşman edinir lakin dostları onu korur. Hayırlı bir evlat olmaz lakin babasıyla arası iyidir.");
                else if (rb25.isChecked() && rb2.isChecked())         //KADIN VE MERAKTAN ÇÖZÜYORUM SEÇİLİYSE
                    tv11.setText("UTARİD YILDIZI BU HATUNA BİLGELİK VERMİŞ!                              " +
                            "Bu hatun tatlı dillidir. Kaynanasıyla ve komşularıyla iyi anlaşır. Eli bereketlidir. Elinden her iş gelir. Evde oturmazsa zengin olur. Eşini de zengin eder. Dikiş nakış becerir, tüccarlık etmesi ve tüccarla evlenmesi hayırlıcadır. 2 kere evlenir. Başına bolca dert gelir. Dostları onu korur.");
                else if (rb26.isChecked() && rb.isChecked())      //ERKEK VE KENDİM HAKKINDA BİRŞEY ÖĞRENMEK İSTİYORUM SEÇİLİYSE
                    tv11.setText("KAMER BU ER KİŞİYE BEREKET VERMİŞ!                                                  " +
                            "Bu er kişi en hayırlı evlattır. Anasını çok sever. Köyünü, memleketini korumak için askerlik yapar. Hayvanlarla arası iyidir, çiftçilik yapması hayırlıcadır. Bir kere evlenir. Çocuklarına şefkatli baba olur. Küskündür. Evde oturması, gezmesinden daha hayırlıcadır. Ciğerlerini sık sık üşütür. Sıhhatline dikkat etmesi lazım gelir. Ömrü uzun olur. Bol bol çocuğu olur. Torunlarını görür.");
                else if (rb26.isChecked() && rb2.isChecked())      //KADIN VE KENDİM HAKKINDA BİRŞEY ÖĞRENMEK İSTİYORUM SEÇİLİYSE
                    tv11.setText("KAMER BU HATUNA GÜZELLİK VERMİŞ!                                                         " +
                            "Bu hatun gelin geldiği eve bereket getirir. Rüyaları çıkar. Uzun yaşar, çiftçilik yaparsa tarlası bereketli olur. Hayırlı evlattır, komşularla arası iyidir. Öğrenebilirse iyi ebe olur. Bol bol çocuğu olur. Sadece bir kez evlenir. Evde oturması, gezmesinden daha hayırlıcadır. Her kazadan beladan dua ile korunabilir. Hayırsız günleri pazartesi ve cumadır. Eli lezzetlidir, mutfağından şifa gelir. Lakin çok kilo alır. Küskündür.");
                else if (rb.isChecked())       //SADECE ERKEK SEÇİLİYSE (ÜSTTEKİ KOŞULLAR SAĞLANMADIYSA)
                    tv11.setText("ERENDİZ YILDIZI BU ER KİŞİYE YİĞİTLİK VERMİŞ!                                     " +
                            "Bu er kişi pek kısmetlidir. Hatunlarla arası iyidir. Gezmesi hayırlıca olur. Tahsilini bitirirse pek zengin olur. Hatununu zengin eder. Ailesine hayırlı evlattır. İncik kemikleri ağrır. Uzun ömürlü olur. Çocukları bol bol olur. Kıskananı, çekemeyeni boldur. Yardımseverdir, hayır duası alarak büyüden, nazardan korunur. Başı sıkışsa da başarıya nail olur. İştahı açık olur lakin kilo almaz. Başından 3 evlilik geçer.");
                else          //ERKEK SEÇİLİ DEĞİLSE KADIN SEÇİLİDİR. DOLAYISIYLA SADECE KADIN SEÇİLİYSE (ÜSTTEKİ KOŞULLAR SAĞLANMADIYSA)
                    tv11.setText("MERİH YILDIZI BU HATUNA DİRLİK VERMİŞ!                                                     " +
                            "Bu hatun atik olur, çalışkan olur. Hayırlı evlattır. Erkek çocuğu olur. Tatlı dil bilmez. Lakin kısmeti açıktır. Bir kere evlenir. Ömrü uzun olur, sıhhatlidir ama baş ağrısı yaşar. Kaynanasıyla geçinemez. Gezmesi, evde oturmasından daha hayırlıcadır.");




                bt2.setOnClickListener(V -> {


                    StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); // HATA TESPİTİ İÇİN
                    StrictMode.setVmPolicy(builder.build());

                    Intent paylas = new Intent();
                    paylas.setAction(Intent.ACTION_SEND);
                    paylas.setType("text/plain"); // METİN OLDUĞU İÇİN TEXT
                    paylas.putExtra(Intent.EXTRA_TEXT,"YILDIZNAME FAL SONUCUM: " + tv11.getText()); // YILDIZNAME FAL SONUCUM YAZISININ DEFAULT OLARAK
                    // GELMESİNİ SAĞLAYIP TV11'DEKİ METNİ ÇEKEREK PAYLAŞILMAK İSTENEN YERE YAZDIRILMASINI VE PAYLAŞILMASINI SAĞLADIK. (BUTONA BASILINCA)
                    startActivity(Intent.createChooser(paylas, "Fal sonucunu şurada paylaşın:"));


                });

                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i= new Intent(yildizname.this,ana_sayfa.class);  //INTENT OLUŞTURARAK BUTONA BASILINCA ANASAYFA AKTİVİTESİNE YÖNLENDİRME YAPTIK
                        startActivity(i);
                    }
                });


            }


        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId();



        if(id==R.id.paylas){
            share();
        }
        if(id==R.id.sonucu_kaydet){
            Intent i= new Intent(yildizname.this, kullanici_girsi.class);
            i.putExtra("fal",tv11.getText().toString());
            SQLiteDatabase db= vt.getWritableDatabase();
            ContentValues cv=new ContentValues();
            db.insert("personel",null,cv);
            tv11.setText("");
            startActivity(i);
        }




        return super.onOptionsItemSelected(item);
    }

    private void share(){ //fal sonucunun paylaşılması için oluşturulan class

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); // HATA TESPİTİ İÇİN
        StrictMode.setVmPolicy(builder.build());

        Intent paylas = new Intent();
        paylas.setAction(Intent.ACTION_SEND);
        paylas.setType("text/plain"); // METİN OLDUĞU İÇİN TEXT
        paylas.putExtra(Intent.EXTRA_TEXT,"YILDIZNAME FAL SONUCUM: " + tv11.getText()); // YILDIZNAME FAL SONUCUM YAZISININ DEFAULT OLARAK
        // GELMESİNİ SAĞLAYIP TV11'DEKİ METNİ ÇEKEREK PAYLAŞILMAK İSTENEN YERE YAZDIRILMASINI VE PAYLAŞILMASINI SAĞLADIK. (BUTONA BASILINCA)
        startActivity(Intent.createChooser(paylas, "Fal sonucunu şurada paylaşın:"));

    }


}