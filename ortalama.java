import java.util.Scanner;
public class ortalama2 {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat , fizik , kimya , turkce , tarih  , muzik  ;

        // Scanner sınıfımızı tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcı değerleri
        System.out.println("Matematik Notunuzu Giriniz :");
        mat= inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : 5");
        kimya= inp.nextInt();

        System.out.println("Fizik  Notunuzu Giriniz :");
        fizik= inp.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz :");
        turkce= inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz :");
        tarih= inp.nextInt();

        System.out.println("Müzik Notunuzu Giriniz :");
        muzik= inp.nextInt();

        int toplam = ( mat + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : "+ sonuc );

        System.out.println(sonuc > 60 ? "tebrikler sınıfı geçtiniz : :)" : "üzgünüz sınıfta kaldınız : :( ");



    }
}
