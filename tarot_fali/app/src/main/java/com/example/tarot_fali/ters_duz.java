package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import java.util.Random;

public class ters_duz extends AppCompatActivity {

    ImageButton ters,duz;
    int sayi; //random oluşturulan sayıyı atamak için


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ters_duz);


        ters=(ImageButton) findViewById(R.id.ters);
        duz=(ImageButton) findViewById(R.id.duz);

        duz.setOnClickListener(new View.OnClickListener() { // düz butonuna basıldığında aşağıdaki işlemler gerçekleşir
            @Override
            public void onClick(View v) {

                Intent i= new Intent(ters_duz.this, tarot_sonuc.class); //tarot_sonuc sayfasına yönlendirir
                Random m = new Random(); // rastgele fal atanması için rastgele sayı üretir
                sayi = m.nextInt(24) + 1;// rrastgele ürettiği sayılar 0 ile 24 arasıdır.+ 1 eklenerek 1 ile 24 arası sayı üretilmiş olur.

                if (sayi == 1) { //oluşturulan rastgele sayı 1 ise aşağıdaki komut çalışır
                    i.putExtra("resim",R.drawable.kupa_dortlusu); // tarot_sonuc sayfasına drawable klasöründen kupa dörtlüsü resmi gönderir
                    i.putExtra("fal1", ("Kupa dörtlüsü\n" +  //tarot_sonuc sayfasına kupa dörtlüsü falı gönderilir
                            "Hayatını gözden geçirmen gerekiyor. Hayatın boyunca yaşadığın çelişkiler hem seni hem de aileni etkiledi. Bu durum bir çok mutsuzluğa neden oldu. Moralsiz görüntünden kurtulup, hem çevrene hem de kendine zulüm etmeyi bırakmalısın. \n").toString());
                } else if (sayi == 2) {
                    i.putExtra("resim",R.drawable.tilsim_dokuzlusu);// tarot_sonuc sayfasına drawable klasöründen tılsım dokuzlusu resmi gönderir
                    i.putExtra("fal1", ("Tılsım dokuz\n" +//tarot_sonuc sayfasına tılsım dokuzlusu falı gönderilir
                            "Parasal yönden sıkıntı yaşayacağın bir dönemdesin Etrafınızdaki insanları dinlemediğiniz için zor günler geçiriyorsun Hayatınızın düzensiz olması, hem sizin hem de ailenizin sorunlar yaşamasına neden oluyor. B").toString());
                } else if (sayi == 3) {
                    i.putExtra("resim",R.drawable.kilic_beslisi); // tarot_sonuc sayfasına drawable klasöründen kılıç beşlisi resmi gönderir
                    i.putExtra("fal1", ("Kılıç beşlisi\n" + //tarot_sonuc sayfasına kılıç beşlisi falı gönderilir
                            "İş hayatındaki başarılarını kıskanan kişiler ile ufak tefek tartışmalar yaşayabilirsin. Seni kıskanan kişilerin kim olduğunu anlaman zor değil. Fakat tartışmalar sırasında terazinin kantarını kaçırmaman gerekiyor. ").toString());
                } else if (sayi == 4) {
                    i.putExtra("resim",R.drawable.buyucu); // tarot_sonuc sayfasına drawable klasöründen büyücü resmi gönderir
                    i.putExtra("fal1", ("Büyücü\n" + //tarot_sonuc sayfasına büyücü falı gönderilir
                            "Büyücü kartı, hırsı, arzuyu temsil eder. Düşünce gücü önemlidir bunun yanında yetenek de kendini gösterir. Bu kartı seçen erkek, hırslı bir kişiliğe sahiptir. Kendine güveni yüksektir. Bu kartı seçen kadın da kendine güvenir ve karşısındaki erkek kendini ona adar. ").toString());
                } else if (sayi == 5) {
                    i.putExtra("resim",R.drawable.kilic_krali); // tarot_sonuc sayfasına drawable klasöründen kılıç kralı resmi gönderir
                    i.putExtra("fal1", ("Kılıç kralı\n" + //tarot_sonuc sayfasına kılıç kralı falı gönderilir
                            "Yeni arkadaşların, yeni bir ilişki için sana aracı olacaklar. Bu nedenle yeni çevren ile iyi geçinmen gerekiyor. Espri yeteneğin oldukça kuvvetli ve çevrende sevilen birisin. Olumsuz yönlerin arasında da iki yüzlülüğün var. Hayat seni çok kolay ekarte edebiliyor.").toString());
                } else if (sayi == 6) {
                    i.putExtra("resim",R.drawable.yikilan_kule); // tarot_sonuc sayfasına drawable klasöründen yıkılan kule  resmi gönderir
                    i.putExtra("fal1", ("Yıkılan Kule\n" + //tarot_sonuc sayfasına yıkılan kule falı gönderilir
                            "Bu kartı seçen kişi eğer bir şeyin karşısında değilse bu kart güçlüklere işaret eder. Bu kartı seçen kişi için dürüstlüğü simgeler. Yoldan çıkarıcı eğilimler olacak ama doğru yol bulunacaktır. Kişisel bilgiyi arzuluyorsanız bu kart olumlu bir kart olabilir. ").toString());
                } else if (sayi == 7) {
                    i.putExtra("resim",R.drawable.degnek_krali); // tarot_sonuc sayfasına drawable klasöründen değnek kralı  resmi gönderir
                    i.putExtra("fal1", ("Değnek Kralı\n" + //tarot_sonuc sayfasına değnek kralı falı gönderilir
                            "Değnek Kralı onurlandığımız, gururlandığımız ve bir tahta çıkarak toplumun taktirini kazandığımız anlarda belirir. Kartı gören kişi amacında artık zirveye oturmuş ve alkışı hak etmiş kişidir. Bu kart üniversite sınavında istediği bölümü kazanan bir öğrencinin karşısına çıkabileceği gibi hayallerinin mesleğini elde eden bir kişi için de çıkabilir. ").toString());
                } else if (sayi == 8) {
                    i.putExtra("resim",R.drawable.tilsim_beslisi); // tarot_sonuc sayfasına drawable klasöründen tılsım beşlisi resmi gönderir
                    i.putExtra("fal1", ("Tılsım beşlisi\n" + //tarot_sonuc sayfasına değnek tılsım beşlisi gönderilir
                            "Adaletsizlik yaşadığın bir dönemdesin. Sana vaat edilenler bir türlü yapılmıyor. Bu durum senin hayata karşı inancının azalmasına neden oluyor. Fakat senin tavrını değiştirmemen gerekiyor. Biraz daha sabredersen her şeyin rayına oturduğunu göreceksin. İlerleyen süreçlerde aradığın mutluluk ve huzura kavuşacaksın. He").toString());
                } else if (sayi == 9) {
                    i.putExtra("resim",R.drawable.imporotorice); // tarot_sonuc sayfasına drawable klasöründen imporatoriçe resmi gönderir
                    i.putExtra("fal1", ("İmporatoriçe\n" +//tarot_sonuc sayfasına imporatoriçe falı gönderilir
                            "İmporatoriçe kartı, Aşka işaret eder, evlilik kartı olabilir. Duygusallığa, aşka, sevgiye, sevilmeye dikkat çeker. Ayrıca bu kart, anneliği ifade eder. Bu kartı seçen kadın; duygusal, ruhsal, psikolojik, zihinsel ve ekonomik açıdan güçlerine önem verir. Dekorasyon ve yaratıcı işler kendini gösterir.").toString());
                } else if (sayi == 10) {
                    i.putExtra("resim",R.drawable.kilic_ikilisi); // tarot_sonuc sayfasına drawable klasöründen kılıç ikilisi resmi gönderir
                    i.putExtra("fal1", ("Kılıç ikilisi\n" + //tarot_sonuc sayfasına kılıç ikilisi falı gönderilir
                            "Çok önemli bir konuda karar aşamasındasın. Bu kararı verirken oldukça zorlanacaksın. Bu nedenle karar verirken çok iyi bir şekilde düşünmelisin. Aksi takdirde kararın neticesinde oluşacak olan zorluklara katlanmak zorunda kalabilirsin. Her insanın hayatında karar vermek zorunda olduğu önemli zaman dilimleri vardır. ").toString());
                } else if (sayi == 11) {
                    i.putExtra("resim",R.drawable.asiklar); // tarot_sonuc sayfasına drawable klasöründen aşıklar resmi gönderir
                    i.putExtra("fal1", ("Aşıklar\n" + //tarot_sonuc sayfasına aşıklar falı gönderilir
                            "Bu karttaki kişi kendini iyi bilmelidir. Bu kart, evliliğin ve dengeli bir ilişkinin simgesidir. Tam bir sağlık kartı diyebiliriz bu kart için. Bu kart, ikizler burcuna adanmıştır. Bu yüzden mantık ön plandadır. Dengeli ve uyumlu olduğundan şanslı sayısı 6’dır. Duygusal ve zihinsel görüşler kişiyi mutlu eder.").toString());
                } else if (sayi == 12) {
                    i.putExtra("resim",R.drawable.kupa_dortlusu); // tarot_sonuc sayfasına drawable klasöründen kupa örtlüsü resmi gönderir
                    i.putExtra("fal1", ("Kılıç dörtlüsü\n" + //tarot_sonuc sayfasına kupa dörtlüsü falı gönderilir
                            "Fiziksel ve psikolojik olarak yorgun olduğun bir dönemdesin. İyi bir dinlenme ile kendini toparlayabilirsin. İş yerinden izin almak mantıklı bir hareket olacaktır. Hem bu sayede kendin ile ilgili önemli kararlar alabilirsin. Geleceğin hakkında vereceğin kararlar ile başarı merdivenlerinden ilkini çıkabilirsin.").toString());
                } else if (sayi == 13) {
                    i.putExtra("resim",R.drawable.tilsim_krali); // tarot_sonuc sayfasına drawable klasöründen tılsım kralı resmi gönderir
                    i.putExtra("fal1", ("Tılsım Kralı\n" + //tarot_sonuc sayfasına tılsım kralı falı gönderilir
                            "Karşına çıkan fırsatları doğru olarak değerlendirmediğin için gereksiz olarak moral bozukluğu yaşıyorsun. Fakat moralini yüksek tutarsa ve kendine güvenirsen, hayatının en güzel günlerini geçireceğin bir dönemim içindesin. Güzel arkadaşlıklar ve samimi ilişkiler seni bekliyor.").toString());
                } else if (sayi == 14) {
                    i.putExtra("resim",R.drawable.kilic_sovalyesi); // tarot_sonuc sayfasına drawable klasöründen kılıç şovalyesi resmi gönderir
                    i.putExtra("fal1", ("Kılıç şovalye\n" + //tarot_sonuc sayfasına kılıç şovalyesi falı gönderilir
                            "Ağırlığını koyman gereken durumlar ve olaylar ile karşılaşabilirsin. Bu gibi durumlarda kesinlikle kendini geri çekmemen gerekiyor. Sporcu bir kimliğin var başarılı olacağın bir dönemdesin. Tartışmalarda dilini ve zekanı kullanman gerekiyor. Bu sayede insanların saygısını kazanabilirsin.").toString());
                } else if (sayi == 15) {
                    i.putExtra("resim",R.drawable.kilic_dokuzlusu); // tarot_sonuc sayfasına drawable klasöründen kılıç dokuzlusu resmi gönderir
                    i.putExtra("fal1", ("Kılıç dokuzlu\n" + //tarot_sonuc sayfasına kılıç dokuzlusu falı gönderilir
                            "Parasal yönden zor günler geçiriyorsun. Paraya çok değer verdiğin için bu durum seni daha fazla etkiliyor. Eğer bu dönemi hasarsız olarak atlatırsan, kendin için önemli bir sınavdan geçmiş olacaksın. Parasal yönden yaşadığın sıkıntıları çok fazla kafana takmaman gerekiyor.").toString());
                } else if (sayi == 16) {
                    i.putExtra("resim",R.drawable.degnek_onlusu); // tarot_sonuc sayfasına drawable klasöründen değnek onlusu resmi gönderir
                    i.putExtra("fal1", ("Değnek Onlusu\n" +//tarot_sonuc sayfasına değnek onlusu falı gönderilir
                            "Seni yakından alakadar etmeyen durumlarla ilgilenmene gerek yok. Bu durumlar senin yıpranmana neden olmaktadır. Sorumluluk alırken biraz daha bilinçli olman yararına olacaktır. Bu sayede aldığın sorumlukları layığı ile yerine getirebilirsiniz. Aksi takdirde çok fazla yıpranıyorsun. ").toString());
                } else if (sayi == 17) {
                    i.putExtra("resim",R.drawable.degnek_dokuzlusu); // tarot_sonuc sayfasına drawable klasöründen değnek dokuzlusu resmi gönderir
                    i.putExtra("fal1", ("Değnek Dokuzlu\n" + //tarot_sonuc sayfasına değnek dokuzlusu falı gönderilir
                            "Hayal kırıklığın uğramana neden olacak beklentiler içerisindesin. Bu senin hayata karşı olan beklentilerini azaltıyor. Hedeflerini ve hayallerini biraz daha makul seviyede tutman, daha mutlu olman için güzel bir adım olacaktır. Aynı zamanda maddi açıdan sorun yaşadığın günlerdesin.").toString());
                } else if (sayi == 18) {
                    i.putExtra("resim",R.drawable.kilic_beslisi);
                    i.putExtra("fal1", ("Kılıç beşlisi\n" +
                            "İş hayatındaki başarılarını kıskanan kişiler ile ufak tefek tartışmalar yaşayabilirsin. Seni kıskanan kişilerin kim olduğunu anlaman zor değil. Fakat tartışmalar sırasında terazinin kantarını kaçırmaman gerekiyor. Onlar ne kadar üstüne gelirse gelsin, senin daha ılıman yaklaşman onlara karşı üstünlüğünü gösterecektir.").toString());
                } else if (sayi == 19) {
                    i.putExtra("resim",R.drawable.adalet);
                    i.putExtra("fal1", ("Adalet\n" +
                            "Dengeyi ve olumlu kararları simgeler. Özellikle hayatın dengesini kuran hareket, bu kartı ifade eder. Bu kartı seçen kişi; kalp, zihin, ruh sağlığı, materyalizm, iş ve hareket için eşit zaman garantisiyle hayatını düzenlemeye başlar. Bu kişi, adaleti sağlamak için iç dürtülerini kullanır. “Ne ekersen onu biçersin” adalet kartının temel anlamıdır. Ayrıca bu kart, okulu sembolize eder.").toString());
                } else if (sayi == 20) {
                    i.putExtra("resim",R.drawable.kilic_uclusu);
                    i.putExtra("fal1", ("Kılıç üçlüsü\n" +
                            "Üzgünüm ama ufukta ayrılık görülüyor. İlişkin son günlerini yaşıyorsun. Ne kadar uğraşırsan uğraş, ilişkini kurtarmak için bir şansın olmadığını söyleyebilirim. Çok fazla acı çekebilirsin fakat bu acı geçecek. İhtiyacın olan tek şey zaman gibi duruyor. Zaman her şeyin ilacıdır. Sonrasında ise seni daha güzel günler bekliyor. Ayrılık ilişkilere dahildir. Bu nedenle acı çekmek yerine hayata adapte olmaya devam etmelisin.").toString());
                } else if (sayi == 21) {
                    i.putExtra("resim",R.drawable.kilic_altilisi);
                    i.putExtra("fal1", ("Kılıç altılı\n" +
                            "Düşüncelerinizi tekrar gözden geçirmek için doğru bir zaman dilimindesin. Neler yapabileceğini tam olarak belirlemen ve doğru adımlar atman gerekiyor. Aynı zamanda açığa çıkarmadığın yeteneklerini sergilemen gerekiyor. Bu sayede daha saygın ve sevilen biri haline gelebilirsin. Kendin ile oyun oynaman ve hayatı eğlenceli hale getirmen seni mutlu edecektir. Ailen ve arkadaşlarından destek isteyeme çekinmene gerek yok.").toString());
                } else if (sayi == 22) {
                    i.putExtra("resim",R.drawable.kupa_prensi);
                    i.putExtra("fal1", ("Kupa prensi\n" +
                            "Hayatının bu döneminde karşılaşacağın engeller seni yıldırmasın. En sonunda kazanan yine sen olacaksın. Engeller ve hileler elbet açığa çıkacak ve haklı/haksız kim herkes görecek. Dost görünen kişilere karşı dikkatli olman gerekiyor. Kim dost kim düşman bunu ayırt etmen lazım. Düşman diye baktığın insanlar senin iyiliğin için mücadele ediyor olabilir. Aşk hayatına ise bir süre ara vereceksin. ").toString());
                } else if (sayi == 23) {
                    i.putExtra("resim",R.drawable.yildiz);
                    i.putExtra("fal1", ("Yıldız\n" +
                            "Yıldız kartı, kartı seçen kişinin arzularını ve düşlerini ifade eder. Güven ile doğal yetenekleri aramayı gösterir. Olumlu, pozitif düşünce, iyi ruh ve fiziksel sağlığı simgeler. Meditasyon, bu kart ile sembolize edilir. Bu kartı seçen kişiyi, yeni yetenekler bulması, yaratıcı hedeflere ulaşması için destekleyin.").toString());
                } else if (sayi == 24) {
                    i.putExtra("resim",R.drawable.kupa_sovalyesi);
                    i.putExtra("fal1", ("Kupa şovalye\n" +
                            "Sakin, mutlu ve huzurlu bir yaşam sürüyorsun. Bu hayatta kendine dert arıyor gibisin. Senin yaşadığın hayatın hayalini kuran milyonlarca insan var. Fakat alıngan bir insan olman, yaşadığın hayattan kimi zaman zevk alamamana neden oluyor. Bu nedenle biraz daha rahat olman gerekiyor. İnsanların ne dediği, senin hakkında ne düşündüğü çok da önemli değil.").toString());
                }
                startActivity(i);
            }
        });


        ters.setOnClickListener(new View.OnClickListener() { //ters butonuna basıldığında aşağıdaki işlemler gerçekleşir
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ters_duz.this, tarot_sonuc.class); //tarot_sonuc sayfasına yönlendirilir


                Random m = new Random(); // rastgele fal atanması için rastgele sayı üretir
                sayi = m.nextInt(24) + 1;// rrastgele ürettiği sayılar 0 ile 24 arasıdır.+ 1 eklenerek 1 ile 24 arası sayı üretilmiş olur.

                if (sayi == 1) {
                    i.putExtra("resim",R.drawable.tilsim_uclusu_ters); //tarot_sonuc sayfasına ters tılsım üçlüsü resmi gönderilir
                    i.putExtra("fal1", ("Tılsım üçlüsü\n" + //tarot sonuç sayfasına tılsım üçlüsü fal sonucu gönderilir
                            "İsteklerini gerçekleştirmek yeterince konsantre olamadın ve bu nedenle çok fazla sorun yaşıyorsun. Yaşadığın hayal kırıklıkları seni biraz üzebilir. Yanlış hükümlerin ve kibrin yüzünden başkalarının dediklerini dinlemiyorsun ve kendi burnunun dikine gidiyorsun. Sana yardım etmek isteyen kişilere kulağını tıkamış durumdasın. Yapman gereken sana yardım etmek isteyen kişilere kulağını açmak ve onlardan faydalanmak. Hayatını zora sokman ve ya kolaylaştırmak sadece senin elindedir. Bu nedenle kararların her zaman seni ilgilendirir. Fakat başkalarından yardım alman senin için daha mantıklı bir hareket olacak gibi duruyor.").toString());
                } else if (sayi == 2) {
                    i.putExtra("resim",R.drawable.kupa_dortlusu_ters);  //tarot_sonuc sayfasına ters kupa dörtlüsü resmi gönderilir
                    i.putExtra("fal1", ("Kupa dörtlüsü\n" + //tarot sonuç sayfasına ters kupa dörtlüsü fal sonucu gönderilir
                            "Hayatının bu döneminde yeni arkadaşlıklara ve dostluklara açıksın. Yeni ortamlara girerek yeni insanlar ile tanışma fırsatı bulacaksın. Aynı zamanda çok sevdiğin eski bir arkadaşın sana zeytin dalı uzatacak. Arkadaşlık ve dostluk yönünden oldukça olumlu günler geçireceksin. Mutlu ve huzurlu bu günlerinde ise aşk hayatında bazı sorunlar yaşaman mümkün. Fakat sen dostluğu tercih ederek aşk hayatına kısa bir süre ara vereceksin.\n").toString());
                } else if (sayi == 3) {
                    i.putExtra("resim",R.drawable.tilsim_dortlusu_ters); //tarot_sonuc sayfasına ters tılsım dörtlüsü resmi gönderilir
                    i.putExtra("fal1", ("Tılsım dörtlüsü\n" +//tarot sonuç sayfasına ters tılsım dörtlüsü fal sonucu gönderilir
                            "Güçlü olmak istemen nedeniyle kontrolü kaybetmek üzeresin. Maddi anlamda yaşayacağın sorunların ana nedeni ise dikkatsizlik gibi duruyor. İş hayatında karşına çıkan sorunları çözme konusunda yetersiz kalabilirsin. Bunun nedeni yaşadığın sorunların tam olarak seni ilgilendirmemesi. Dış olaylar hayatını çok fazla etkiliyor. Biraz çekimser olman gerekiyor. Kendini güçsü hissettiğin bu dönemde yardım alman kişiler ile zaman geçirmen gerekir. Ailen ve arkadaşların sana yardım etmek için elinden geleni yapacaktır.\n").toString());
                } else if (sayi == 4) {
                    i.putExtra("resim",R.drawable.kupa_ikilisi_ters); //tarot_sonuc sayfasına ters kupa ikilisi resmi gönderilir
                    i.putExtra("fal1", ("Kupa ikilisi\n" + //tarot sonuç sayfasına ters kupa ikilisi fal sonucu gönderilir
                            "Aşık olduğun kişi ile aranda sert tartışmalar çıkacağını söyleyebilirim. Bu sert tartışmalar aranızın bozulmasına neden olabilir. Birlikteliğiniz bu nedenle son bulabilir. Kafanda yaşadığın sorunlar ve bencil bir karaktere sahip olman, sevgisizlik ile sonuçlanacak gibi duruyor. İlişkide denge çok önemlidir ve bu dengeyi koruyacak güce sahip değilsin. Karşı taraftan sürekli bir şeyler bekliyorsun fakat sen bir şeyler verecek kadar cesaret sahibi değilsin.").toString());
                } else if (sayi == 5) {
                    i.putExtra("resim",R.drawable.aziz_ters);
                    i.putExtra("fal1", ("Aziz\n" +
                            "Davranışların ile toplumda ne kadar aykırı olduğu bilinen birisin. Bu kimi zaman hoşuna gitse de, genel olarak bakılığı zaman senin için büyük bir sorun. Fakat yeni fikirlere açık biri olduğu için karşına çıkan fırsatları değerlendirme ihtimalin daha yüksek. Aşk hayatında ise olumsuzluklar olabilir. Birlikte olduğun kişi ile yaşadığın sorunlar, ilişkinizin bitmesine neden olabilir. İlişkini kurtarmak istiyorsan bir adım atman gerekiyor.").toString());
                } else if (sayi == 6) {
                    i.putExtra("resim",R.drawable.denge_ters);
                    i.putExtra("fal1", ("Denge\n" +
                            "Şu sıralar bazı davranışların olağan dışı. Planlarının gerçekleşmesini istiyorsan aşırılıktan kaçman gerekiyor. Yaşadığın olaylara karşı aşırı reaksiyon gösteriyorsun. Bunun nedeni ise sabırsız ve alıngan bir yapıya sahip olman. Aslında çok basit olan şeyleri kendi içinde karmaşık hale sokuyorsun. Sert ve aşırı olan davranışlarından kaçınman gerekiyor. İnsanlarla başarılı bir şekilde iletişim kurmak istiyorsan uyum sağlaman gerekiyor. Uyum sağladığın sürece ilişkilerinde başarı elde ettiğini gözlemleyeceksin.").toString());
                } else if (sayi == 7) {
                    i.putExtra("resim",R.drawable.kupa_prensi_ters);
                    i.putExtra("fal1", ("Kupa prensi\n" +
                            "Hayatının bu döneminde karşılaşacağın engeller seni yıldırmasın. En sonunda kazanan yine sen olacaksın. Engeller ve hileler elbet açığa çıkacak ve haklı/haksız kim herkes görecek. Dost görünen kişilere karşı dikkatli olman gerekiyor. Kim dost kim düşman bunu ayırt etmen lazım. Düşman diye baktığın insanlar senin iyiliğin için mücadele ediyor olabilir. Aşk hayatına ise bir süre ara vereceksin. Kafanda başka planlar var. Bu planları harekete geçirmek için doğru zamanı bekliyorsun.").toString());
                } else if (sayi == 8) {
                    i.putExtra("resim",R.drawable.yildiz_ters);
                    i.putExtra("fal1", ("Yıldız\n" +
                            "Pozitifliğini gün geçtikçe kaybediyorsun. Ruhsal ve duygusal açıdan karmaşık bir dönem içindesin. Karakterini ön plana çıkarmaman tüm bunların olmasına neden oluyor. Gücünün ve yaratıcılığının tam olarak farkında değilsin. Kendini yetersiz hissettiğin bu dönemde hayallerinin yıkılmasına izin vermemen gerekiyor. Uyanık olmalı ve yeni girişimlerde bulunmalısın. Seni bekleyen son süreci ancak bu şekilde atlatabilirsin. Kendin bulduğun zaman başarıya giden ilk adımı atmış olacaksın.").toString());
                } else if (sayi == 9) {
                    i.putExtra("resim",R.drawable.kupa_krali_ters);
                    i.putExtra("fal1", ("Kupa kralı\n" +
                            "Yaşadığın haksızlık yüzünden önemli kayıplar yaşayabilirsin. Çevrendeki insanların iki yüzlü olması nedeniyle çok fazla sorun yaşıyorsun. Düşmanlarını ve dostlarını iyi belirlemen gerekiyor. Düşmanlarına karşı tavırlarını doğru belirlemeli ve en beklemedikleri anda onlara derslerini vermelisin. Fakat onlarında senin boş anını beklediğini unutmaman gerekiyor. Hayatının bu karmaşık evresinde ailenden destek alman gerekiyor.\n").toString());
                } else if (sayi == 10) {
                    i.putExtra("resim",R.drawable.azize_ters);
                    i.putExtra("fal1", ("Azize\n" +
                            "Girdiğin tartışmalarda karşındaki insana yüzeysel bilgiler aktarıyorsun ve bu seni çekilmez biri kılıyor. Kibirli biri olduğun için insanlar seninle vakit geçirmek istemiyor. Her ne kadar gizlesen de bu durum duygusal olarak güçlük çekmene neden oluyor. Hayatına giren kadınlar genel olarak hep sana zarar vermiş. Bu da senin kadınlar hakkında bilgisiz olduğunu gösteriyor. Yapman gereken ise biraz daha mütevazi bir hayat tercih etmek. Radikal kararlar alarak kendine bir şans daha verebilirsin.").toString());
                } else if (sayi == 11) {
                    i.putExtra("resim",R.drawable.gunes_ters);
                    i.putExtra("fal1", ("Güneş\n" +
                            "İçinde bulunduğun sıkıntılı ve kederli durumdan kurtulmak için gerekli olan güce sahip değilsin. Yaşadığın hüsranlar ve yenilgiler senin kendine yardım etmene engel oluyor. Korkak ve dar görüşlü olman nedeniyle değişiklikler yapmakta zorlanıyorsun. Tüm bunlar ilişkilerinde ve evliliğinde sorunların oluşmasına neden olabilir. İş hayatında yaşadığın Başarsızlıklar da moralinin bozulmasına neden olabilir.").toString());
                } else if (sayi == 12) {
                    i.putExtra("resim",R.drawable.buyucu_ters);
                    i.putExtra("fal1", ("Büyücü\n" +
                            "Bazı karakter özelliklerin nedeniyle, görevlerinin tam anlamıyla hakkını veremiyorsun. Dikkatsiz ve düzensiz iri olman iş hayatında seni çok etkiliyor. Daha dikkatli olmak senin elinde fakat amacın üzerindeki işi atmak ve bir an önce rahata etmek. Bu nedenle hayatında çok fazla zorluk ile karşılaşıyorsun. Bununla birlikte çok yakınınızda seni sevdiğini iddia eden fakat hata yapmanı bekleyen biri var. Bu kişiden uzak durman gerekiyor. Aksi takdirde bu kişi senin hayatını alt üst edebilir.").toString());
                } else if (sayi == 13) {
                    i.putExtra("resim",R.drawable.degnek_yedilisi_ters);
                    i.putExtra("fal1", ("Asa yedilisi\n" +
                            "Yaşadığın zorlu günler nedeniyle her şeyden endişe ve kaygı duymaya başlamışsın. Bu kaygılar kimi zaman korku, kimi zamanda asabiyet olarak yansıyor. Bu nedenle işinde ve ilişkilerinde sorunlar yaşıyorsun. Doğal olamama ve konsantrasyon sorunları çekiyorsun. Bu sorunlardan kurtulmak için biraz daha fazla çaba sarf etmen gerektiğini söyleyebilirim. Kaygı ve endişe gibi duygular, insanı rahatsız eden duygulardır. Fakat hayatın bir parçası olduğunu kabul etmek gerekiyor. Yaşadığın zorlu süreçten kurtulmak için süreci benimsemen gerekiyor.").toString());
                } else if (sayi == 14) {
                    i.putExtra("resim",R.drawable.degnek_onlusu_ters);
                    i.putExtra("fal1", ("Asa onlusu\n" +
                            "Hayata karşı bakış açını genişletmen gerekiyor. Dar görüşlü olman nedeniyle çok fazla sorun yaşıyorsun. Bu sorunlardan kurtulmak senin elinde gibi duruyor. Yapman gereken olaylara farklı bakış açıları ile bakmayı öğrenmek. Bunu yapmak çok zor bir şey değil. Biraz daha aktif olman ve hayatın içine girmen gerekiyor. Bu süreçte bazı kayıplar yaşayabilirsin. Kendini geliştirdiğin için etrafındaki insanların değiştiğini görebilirsin. Fakat bu değişim senin için oldukça olumlu bir değişim olacak.").toString());
                } else if (sayi == 15) {
                    i.putExtra("resim",R.drawable.kupa_dortlusu_ters);
                    i.putExtra("fal1", ("Kupa dörtlüsü\n" +
                            "Hayatının bu döneminde yeni arkadaşlıklara ve dostluklara açıksın. Yeni ortamlara girerek yeni insanlar ile tanışma fırsatı bulacaksın. Aynı zamanda çok sevdiğin eski bir arkadaşın sana zeytin dalı uzatacak. Arkadaşlık ve dostluk yönünden oldukça olumlu günler geçireceksin. Mutlu ve huzurlu bu günlerinde ise aşk hayatında bazı sorunlar yaşaman mümkün. Fakat sen dostluğu tercih ederek aşk hayatına kısa bir süre ara vereceksin.").toString());
                } else if (sayi == 16) {
                    i.putExtra("resim",R.drawable.seytan_ters);
                    i.putExtra("fal1", ("Şeytan\n" +
                            "Korkularından kurtulacağın bir dönemim içindesin. Düşmanlarının zaaflarından yararlanarak onların üstesinden geleceksin. Geçmişte yaşadıkların sana güzel tecrübeler kazandırdı. Kazandığın tecrübeler ile doğru hamleler yaparak başarı olabileceğini anladın. İlerleyen süreçlerde çıkarcı insanlara karşı ilişkilerini daha sağlıklı yürütmeyi öğrendin. Bu dönem hayatının önemli süreçlerinden biri gibi duruyor. İyi bir şekilde atlatırsan, hayatının geri kalanını daha rahat geçirebilirsin.\n").toString());
                } else if (sayi == 17) {
                    i.putExtra("resim",R.drawable.degnek_beslisi_ters);
                    i.putExtra("fal1", (" Asa beşlisi\n" +
                            "Sevdiğin biri ile bir konu üzerinde şiddetli bir tartışma yaşamışsın. Tartışmanın boyutu istenmeyen boyutlara gelmiş ve bu durum seni fazlasıyla hırpalamış. Durumu düzeltmek için ilk adımı atması gereken kişi sensin. Eskiden olanların bir kenara bırakmalı ve yeni bir başlangıç yapmalısın. Ona karşı tavırlarını bir kez daha tartman gerekiyor. Daha ılımlı ve anlayışlı olursan tüm sorunların çözülebileceğini söyleyebilirim. Bazı konularda gurur yapmak büyük kayıplar yaşamana neden olabilir.").toString());
                } else if (sayi == 18) {
                    i.putExtra("resim",R.drawable.degnek_altilisi_ters);
                    i.putExtra("fal1", ("Asa altılısı\n" +
                            "Vermiş olduğun bir kararın sonuçları ile alakalı yeni haberler alacaksın. Bu haber hoşuna gitmeyebilir. Fakat bu seni yıldırmamalı. Aynı zamanda ilişkinde önemli bir gelişme yaşayabilirsin. Sevdiğin kişinin sadakatsizliği yüzünden ilişkin yıpranacak gibi duruyor. Hayatında her şeyin yolunda gittiğini düşünürken karşılaştığın bu tablo seni oldukça üzecek gibi duruyor. Hayatının bu evresinde kayıplar ve başarısızlıklar seni bekliyor. Fakat bu sürecin geçici olduğunu unutmaman gerekiyor. Güzel günlere ulaşmak için biraz sabretmen gerekmektedir.").toString());
                } else if (sayi == 19) {
                    i.putExtra("resim",R.drawable.degnek_krali_ters);
                    i.putExtra("fal1", (" Asa kralı\n" +
                            "Kendine olan özgüvenin sarsıldığı bir dönemdesin. Aklındaki tuhaf ve gereksiz fikirleri ir kenara koyup, hayata tutunmak için yeni bir başlangıç yapman gerekiyor. Bu başlangıç, istediğin hayatın olması için önemli bir adım olacaktır. Geçmişine takılıp kalmak yerine gelecek ile ilgili doğru planlar yapmanın ödüllerini alacaksın. Özgüven sorununu yenmek için gerekli olan güç kendinde var. Önemli olan bu gücü doğru olarak dışarı çıkartmak olduğunu söyleyebilirim.").toString());
                } else if (sayi == 20) {
                    i.putExtra("resim",R.drawable.kader_carki_ters);
                    i.putExtra("fal1", ("Kader çarkı\n" +
                            "Kısa süre içinde bittiğini düşündüğün bir durumun tekrar ortaya çıktığını duyacaksın. Büyük çaba harcadıktan sonra, az bir yol kat ettiğini öğrenmen moral bozukluğuna neden olabilir. Çok fazla zamana ihtiyacın var. Zamanı kendin yaratmak için bazı şeylerde feragat etmen gerekiyor. Yenilgiyi hiçbir zaman kabul etmemen gerekiyor. Eğer mantıklı adımlar atarsan, en sonunda başarıya ulaşabilirsin. Başarıya ulaşmak için gerekli olan bilgi ve birikim sende var.").toString());
                } else if (sayi == 21) {
                    i.putExtra("resim",R.drawable.imparator_ters);
                    i.putExtra("fal1", ("Kral\n" +
                            "Kurduğun hayallerin gerçekleşmesi için sıra dışı bir yol izlemen gerekiyor. İlişkilerinde ne kendi iç sesini dinliyorsun, ne de çevreni ciddiye alıyorsun. Bu sıralar her şeyi boşlamış durumdasın. Yapman gereken ise kendini toparlamak gibi duruyor. Bu kadar tatil yeterli diye düşünerek tekrar direksiyon başına geçmelisin. Ancak bu sayede güzel günlerine tekrar merhaba diyebilirsin. Aksi takdirde huysuz bir insan olarak anılacaksın.\n").toString());
                } else if (sayi == 22) {
                    i.putExtra("resim",R.drawable.tilsim_sekizlisi_ters);
                    i.putExtra("fal1", ("Tılsım sekizlisi\n" +
                            "Aşırı hırs sahibi biri olduğun için yanlış yollara sapma ihtimalin oldukça yüksek. Hedeflerine ulaşman için hırsından biraz da olsa sıyrılman gerekiyor. Uzun vadeli düşünmen ve sana zarar verecek işlerden uzak durman gerekmektedir. Kendine farkında olmadan çok fazla zarar verdin. Bu zararların artmaması için kendine daha fazla aman ayırman gerekiyor. Hayatın boyunca mutlu olman çok zor fakat aşırı hırsın senin kısa süreli mutlu olmanı bile engelliyor.").toString());
                } else if (sayi == 23) {
                    i.putExtra("resim",R.drawable.tilsim_dokuzlusu_ters);
                    i.putExtra("fal1", ("Tılsım dokuzlusu\n" +
                            "Sana verilen tavsiyelerin hepsi senin iyiliğin için. Bu tavsiyelere kulak asmamanın bedeli çok yüksek olabilir. Aynı zamanda maddi açıdan çok fazla sıkıntılar çekeceğin bir döneme giriyorsun. Bu dönemde kendine dikkat etmen gerekiyor. Sağlık açısından sorunlar yaşaman olası. Aşk hayatında da seni seven insanlara şans vermen lazım gibi gözüküyor. Eğer iyi bakarsan seni kimin sevdiğini, ve aşkı kimin hak ettiğini görebilirsin.").toString());
                } else if (sayi == 24) {
                    i.putExtra("resim",R.drawable.degnek_sovelyesi_ters);
                    i.putExtra("fal1", ("Asa Şövalyesi\n" +
                            "Ters Değnek Şövalyesi ateşin kontrolden çıkmış enerjisinin temsilcisidir. Nereye gittiğini bilen ve amacına odaklanmış Değnek Şövalyesinin aksine Ters Değnek Şövalyesi ne nereye gittiğini bilmektedir ne de ne yapmak istediğini. Enerjisini tek bir alana yoğunlaştırmayı bilmeyen bu şövalye bir orada bir buradadır fakat elde avuçta hiçbir somut başarı yoktur ve daha da kötüsü bu gidişle başarı ufukta bile görünmemektedir. Değnek Şövalyesini ters gören kişi her şeyi birden yapmak yerine sadece bir şeyi tam ve doğru olarak yapmaya çalışmalıdır.").toString());
                }

                startActivity(i);
            }
        });


    }

}