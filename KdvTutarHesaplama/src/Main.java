import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar,kdvOran,kdvTutar,kdvliTutar;

        System.out.print("Ucret tutarini giriniz : ");
        tutar = input.nextDouble();
        if (tutar<=1000){
            kdvOran=0.18;
        }
        else {
            kdvOran=0.8;
        }
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV Tutari :" + kdvTutar);
        System.out.println("KDV'li Tutari :" + kdvliTutar);
    }
}