import java.util.Scanner;
public class main {

    public static void main(String[] args) {
           /*
        KDV Tutarı Hesaplayan Program Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        KDV tutarını hesaplayıp ekrana bastıran programı yazın. (Not : KDV tutarını 18% olarak alın)
            KDV'siz Fiyat = 10;
            KDV'li Fiyat = 11.8;
            KDV tutarı = 1.8;
        Ödev: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
        KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        girilenTutar kullanıcının girdiği değer double olacak


        */

        Scanner kdvhesap = new Scanner(System.in);
        double tutar, kdvorani = 0.08, kdvorani1 = 0.18, sonuc, sonuc1;
        boolean kdvKosulu;
        boolean kdvOrani;
        System.out.print("Tutar: ");
        tutar = kdvhesap.nextInt();
        System.out.println("Kdv'siz fiyat:  " + tutar);
        kdvKosulu = !(0 < tutar && tutar < 1000);
        sonuc = kdvKosulu ? tutar + (kdvorani * tutar) : tutar + (kdvorani1 * tutar);
        System.out.println("Kdv'li Fiyat: " + sonuc);
        kdvOrani = !(0 < tutar && tutar < 1000);
        sonuc1 = kdvOrani ? kdvorani : kdvorani1;
        System.out.println("Kdv Orani: " + sonuc1);


    }
}