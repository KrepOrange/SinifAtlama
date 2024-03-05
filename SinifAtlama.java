import java.util.Scanner;

public class SinifAtlama {
    public static void main(String[] args) {
        //variable
        double mat, fiz, turk, kim, muzik, average;
        Scanner input = new Scanner(System.in);
        int gradeCount = 5;

        System.out.print("Matematik dersi notunuzu giriniz: ");
        mat = input.nextDouble();
        if (mat < 0 || mat > 100){
            mat = 0;
            gradeCount--;
        }

        System.out.print("Fizik dersi notunuzu giriniz: ");
        fiz = input.nextDouble();
        if (fiz < 0 || fiz > 100){
            fiz = 0;
            gradeCount--;
        }

        System.out.print("Türkçe dersi notunuzu giriniz: ");
        turk = input.nextDouble();
        if (turk < 0 || turk > 100){
            turk = 0;
            gradeCount--;
        }

        System.out.print("Kimya dersi notunuzu giriniz: ");
        kim = input.nextDouble();
        if (kim < 0 || kim > 100){
            kim = 0;
            gradeCount--;
        }

        System.out.print("Müzik dersi notunuzu giriniz: ");
        muzik = input.nextDouble();
        if (muzik < 0 || muzik > 100){
            muzik = 0;
            gradeCount--;
        }

        if(gradeCount == 0)
            average = mat + fiz + turk + kim + muzik;
        else
            average = (mat + fiz + turk + kim + muzik) / gradeCount;

        if(average >= 55)
            System.out.println(average + " ortalama ile sınıfı başarıyla geçtiniz.");
        else
            System.out.println(average + " ortalama ile sınıfta kaldınız.");
    }
}
