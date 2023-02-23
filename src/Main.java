import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fiz, kimya, biyo, turkce;
        double ort=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuz:");
        fiz=input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya=input.nextInt();

        System.out.print("Biyoloji notunuz:");
        biyo=input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce=input.nextInt();

        if(mat>=0 && mat<=100){
            ort+=mat;
        }
        if (fiz>=0 && fiz<=100) {
            ort+=fiz;
        }
         if (kimya>=0 && kimya<=100) {
            ort+=kimya;
        }
         if (biyo>=0 && biyo<=100) {
            ort+=biyo;
        }
         if (turkce>=0 && turkce<=100) {
            ort+=turkce;
        }
         ort=ort/5;
        System.out.println("Ortalamanız"+ort);
         if(ort<55){
             System.out.println("Sınıfta kaldınız");

         }
        else {
             System.out.println("Sınıfı geçtiniz");
         }


    }
}