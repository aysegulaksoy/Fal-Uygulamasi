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

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class zar_fali extends AppCompatActivity {

    Button bt,gizle,gösterbt,gösterbt2;
    int i;
    ImageView zar1;
    Random a;
    TextView tv,göster,gizle2;
    veritabani vt; // veritabanı değişkeni oluşturulur
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zar_fali);

        vt=new veritabani(this); //vt değişkeni tanımlanır

        bt=(Button) findViewById(R.id.button);
        zar1=(ImageView) findViewById(R.id.imageView5);
        tv=(TextView) findViewById(R.id.textView);
        göster=(TextView) findViewById(R.id.textView2);
        gizle=(Button) findViewById(R.id.button);
        gösterbt=(Button) findViewById(R.id.button6);
        gösterbt2=(Button) findViewById(R.id.button7);
        gizle2=(TextView) findViewById(R.id.textView);
        a=new Random(); //random sayı üretiyor

// butona basıldığında yapılcak işlemler

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i=1+a.nextInt(11); // butona basıldığında a 1 den 11 e random sayı üretiyor
                // üretilen random sayı i ye esitleniyor
                //gelen sayısa göre zar resimleri ve fal sonucu geliyor


                if (i==1){
                    zar1.setImageResource(R.drawable.a);

                    tv.setText("Tuttuğun dilek gerçekleşecek\n\nEvet, dileğini o kadar içten " +
                            "dilemişsin ki attığın zar bunu gösteriyor. Belki gerçekleşmesi sana şu anda çok zor " +
                            "geliyor fakat er ya da geç bu dileğin gerçekleşecek. Biraz zor olacak ama istediğin şey " +
                            "ayaklarına kadar gelecek. Bunca zamandır olmasını istediğin şey hiç beklemediğin anda " +
                            "gerçekleşecek.Bazen isteğimizin hemen gerçekleşmesini " +
                            "isteriz ama evrenin bir bildiği vardır. En doğru zamanda karşına çıkarmayı bekler." +
                            " İçinde yaşadığımız durumlar ne kadar umutsuzluğa sürüklese de dileğinden veya hayalinden " +
                            "sakın vazgeçme çünkü doğru günün gelmesini bekliyor...\n");
                }
                else if (i==2){
                    zar1.setImageResource(R.drawable.b);

                    tv.setText("Dileğinin gerçekleşmesi biraz zaman alacak!\n\nEnerjini o kadar iyi " +
                            "hissediyoruz ki gelen zara bile yansımış. Uzun zamandır olmasını istediğin bir " +
                            "dileğin var, onu dilemişsin. Bu kısa vadede gerçekleşmesi zor gibi ama uzun vadede " +
                            "gerçekleşecek. İçinde olduğumuz süreç zaten çoğumuzun isteklerinin önünü kesti." +
                            " Buna rağmen umudumuzu kesmemeliyiz. Dileğinin gerçekleşmesi için belki 5 belki de " +
                            "7 ay kadar bir süre vardır.Bardağın dolu tarafından bakmak gerekir. " +
                            "Tertemiz bir kalbe sahipsin ve bu dileğin inan gerçekleşecek...\n");
                }
                else if (i==3){
                    zar1.setImageResource(R.drawable.c);

                    tv.setText("Dileğinin gerçekleşecek ama 3 - 5 senesi var gibi...\n\nEvet, dileğinin " +
                            "gerçekleşmesi için 3 - 5 senen daha var. Biraz uzun gibi geliyor ama her şeyin bir zamanı vardır. " +
                            "O yüzden asla umudunu kaybetme ve elinden geleni yapmaya çalış. Çünkü evrenin kendine göre bir düzeni " +
                            "vardır. Başka isteklerin için çabala ve devam et. Yolunda ilerlerken bu dileğin karşına birden çıkacak ve" +
                            " çok şaşıracaksın...\n");
                }
                else if (i==4){
                    zar1.setImageResource(R.drawable.d);

                    tv.setText("Dileğinin gerçekleşmesine 1 sene var...\n\nO kadar güzel bir " +
                            "enerjin var ki, bunu buradan hissedebiliyoruz. Tuttuğun dileğin gerçekleşmesini her " +
                            "şeyden çok istediğin belli zaten. Bu dileğinin hemen gerçekleşmesini istiyorsan sanki " +
                            "biraz zamanı var gibi. Öyle bir zamanda gerçekleşecek ki, buna sen bile inanamayacaksın. " +
                            "Belki de ümidini kestiğin o anda karşına çıkacak ve şaşıracaksın. " +
                            "Bazen artık gerçekleşmeyeceğini düşündüğün anda sürprizler karşına çıkar. " +
                            "Biraz daha sabret...\n");
                }
                else if (i==5){
                    zar1.setImageResource(R.drawable.e);

                    tv.setText("Birinin yardımıyla dileğin gerçekleşecek!\n\nDileğinle ilgili birinden büyük bir yardım göreceksin " +
                            "ve dileğin nihayetinde gerçekleşecek..." +
                            "Her şeyin bir zamanı vardır ve sen sabrınla yolun çoğunu kat etmişsin! Sen, sen ol, asla umudunu ve sabrını yitirme! Güzel şeyler olacak...\n");
                }
                else if (i==6){
                    zar1.setImageResource(R.drawable.f);

                    tv.setText("Kendin ol, gerisi gelecek!\n\nhayatında çok sevdiğin birileri " +
                            "sayesinde kalbinden geçen şey gerçekleşecek! Baş koyduğun yolun sonunda mutluluk var! " +
                            "Sen, sen ol, asla umudunu yitirme! Kısmetinde olan, sana tıpış tıpış gelecek! :)\n");
                }
                else if(i==7){
                    zar1.setImageResource(R.drawable.g);

                    tv.setText("Şöyle söyleyelim, senin için hayırlısı olan bir olay gerçekleşecek." +
                            " Bu dilediğin dileğin başka bir dileğe dönüşmesi gibi olacak. Bazen istediğimiz şeyler gerçekleşmez, " +
                            "üzülürüz ama daha güzelleri karşımıza çıkar. " +
                            "O yüzden sakın yüzünü asma ve yoluna devam et...\n");
                }
                else if(i==8){
                    zar1.setImageResource(R.drawable.h);

                    tv.setText("Dileğinin gerçekleşmesi biraz imkansız gibi gözüküyor ama…\n\n"
                            + "Sen imkansızlıkları, imkân haline getirebilen birisin. Hatta birisi 'o işin oluru yok!' diyorsa, bu işi " +
                            "imkanlı hale getirmek için, " +
                            "daha yüksek bir motivasyona ulaşıyorsun. İnatçı ve kararlısın çünkü. Ama tek başına bunlar da yeterli " +
                            "değil tabii ki, yetenek de lazım, ki o da sende var. Geleceğine ise senden başka kimse karar veremez, " +
                            "çünkü sen kendi göbek bağını kesebilen azınlıktaki bireylerden birisin. Sadece şunu diyebiliriz, " +
                            "o aklındaki yürürlüğe koyacaksın bay/bayan kararlı :)\n" );
                }
                else if(i==9){
                    zar1.setImageResource(R.drawable.i);
                    tv.setText("Dileğin er geç gerçekleşecek!\n\nİnandığın yolda durmadan çalışmaya devam etmelisin. " +
                            "Bazı şeyleri kafaya çok takıyorsun ve bu da seni oldukça olumusuz etkiliyor. Sana şöyle söyleyeyim, 5 sene " +
                            "sonra önem arz etemeyecek bir şey için 5 dakika düşünme. " +
                            "Dileğine gelecek olursak, öyle içten bir dilek dilemişssin ki gerçekleşmemesi imkansız gibi gözüküyor." +
                            " Ama senin de elinden geldiğince çabalaman lazım... ");
                }
                else if(i==10){
                    zar1.setImageResource(R.drawable.j);

                    tv.setText("Dileğin hakkında biraz endişelerim var...\n\nŞu anda, seni korkutan ve savunmasız bırakan karışık duyguların var." +
                            "Alacağın bazı kararlar var. Sonucu bilmek istiyorsun çünkü nasıl hissettiğinden çok emin değilsin." +
                            "Sezgini seni aldatmadan uzaklaştırmak için kullan ve bundan kurtul. Sonunda her şey yoluna girecektir. " +
                            "Eğer kendineden emin olursan dileğin gerçekleşecek...");
                }
                else if(i==11){
                    zar1.setImageResource(R.drawable.k);
                    tv.setText("Dileğin gerçekleşecek...\n\nHayatında uyum ve dengeye ihtiyaç duyuyorsun ve gerçekten de biraz huzurun geri geldiğini " +
                            "hissetmeye başlıyorsun. Dileğin gerçekeleşcek ama bir ilişkinin sona ermesi veya mali sorunlar gibi bazı zor zamanlardan " +
                            "geçeceksin, fakat bu olumsuz olaylar senin hayatında daha iyi olaylara vesile olacak. Biraz sabretmen gerekecek...");
                }

                göster.setVisibility(View.VISIBLE); // tekrar fal bakmak istermisiniz yazısını aktif ediyor
                gizle.setVisibility(View.INVISIBLE);// ilk başta aktif gelen fal bak butonunu gizliyor
                gösterbt.setVisibility(View.VISIBLE);//  tekrar fal bakmak istermisiniz sorusunun evet butonunu aktif ediyor
                gösterbt2.setVisibility(View.VISIBLE); //tekrar fal bakmak istermisiniz sorusunun hayır butonunu aktif ediyor
                gizle2.setVisibility(View.VISIBLE);    // fal sonucunu aktifleştiriyor



            }
        });
        gösterbt.setOnClickListener(new View.OnClickListener() { // tekrar fal bakmak istermisiniz sorusunun evet butonuna basılınca
            //yapılan işlemler
            @Override
            public void onClick(View v) {
                gösterbt.setVisibility(View.INVISIBLE);  //tekrar fal bakmak istermisiniz sorusunun evet butonunu gizliyor
                göster.setVisibility(View.INVISIBLE);   // tekrar fal bakmak istermisiniz sorusunu gizliyor
                gizle.setVisibility(View.VISIBLE);     // fal bakmak için basılan butonu aktifleştiriyor
                gösterbt2.setVisibility(View.INVISIBLE); // tekrar fal bakmak istermisiniz sorusunun hayır butonunu gizliyor
                gizle2.setVisibility(View.INVISIBLE);   // fal sonucunu gizliyor
            }
        });





        gösterbt2.setOnClickListener(new View.OnClickListener() {    // tekrar fal bakmak istermisiniz sorusunun hayır butonuna basılınca
            // anasayfaya yönlendiriyor.
            @Override
            public void onClick(View v) {

                Intent i= new Intent(zar_fali.this, ana_sayfa.class);
                startActivity(i);

            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu); //menu klasöründeki xml dosyasına erişim
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId(); // menü itemlerinin idlerini tanımlamak için oluşturuldu

 if(id==R.id.paylas){ // kullnaıcı paylaş ikonuna basmışsa(paylas id'li item) çalışır
     share(); // share classı çağırılır
 }
 if(id==R.id.sonucu_kaydet){ // kullnaıcı sonuc kaydet ikonuna basmışsa(sonuc_kaydet id'li item) çalışır
     Intent i= new Intent(zar_fali.this, kullanici_girsi.class); // kullanıcı_girisi sayfasına yönlendirilir
     i.putExtra("fal",tv.getText().toString()); // ayrıca fal adındaki tx(fal sonucu burada yazar) değişkeni de göderilir
     SQLiteDatabase db= vt.getWritableDatabase(); // sqlite türünde db adında değişken oluşturulur
     ContentValues cv=new ContentValues(); // içerilerin veritabanına gönderilebilmesi için cv adında contentvalues oluşturulur
     db.insert("personel",null,cv); // yukarıdaki veri(tx) personel tablosundaki boşluklara eklenir
     tv.setText("");
     startActivity(i);
 }
        return super.onOptionsItemSelected(item);
    }



    private void share(){ //fal sonucunun paylaşılması için oluşturulan class

        StrictMode.VmPolicy.Builder builder= new StrictMode.VmPolicy.Builder(); // hata tesbiti için
        StrictMode.setVmPolicy(builder.build());

        BitmapDrawable drawable=(BitmapDrawable) zar1.getDrawable();// fal sonucundaki resmin tanımlanması

        Bitmap bitmap=drawable.getBitmap();

        File f=new File(getExternalCacheDir()+"/"+getResources().getString(R.string.app_name)+".png");//dosyanın yazılacağı klasör

        Intent paylas;// fal sonucunun paylaşılması için intent oluşturulması

        try{ //yapılması istenenler

            FileOutputStream outputStream= new FileOutputStream(f);//oluşturulan resim dosyasının dışa aktarılması

            bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);//resmin formatı ve boyutlandırılması

            paylas=new Intent(Intent.ACTION_SEND);
            paylas.setType("image/*");
            paylas.putExtra(Intent.EXTRA_TEXT, tv.getText());// fal metninin alınması
            paylas.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));//resmin alınması

        } catch (Exception e){ //bir hata ile karşılaşılırsa

            throw  new RuntimeException(e);//çalışma zamanı istisnası oluşturma

        }
        startActivity(Intent.createChooser(paylas,"fal sonucunu şurada paylaşın")) ;

    }
}