import java.util.Scanner;
public class Pemilihan2Percobaan215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        float sudut1,sudut2,sudut3,totalSudut;

        System.out.print("Masukkan sudut1 : ");
        sudut1 = input15.nextFloat();
         System.out.print("Masukkan sudut2 : ");
         sudut2 = input15.nextFloat();
         System.out.print("Masukkan sudut3 : ");
         sudut3 = input15.nextFloat();
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {

            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            }
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1))
            {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }
            else
            System.out.println("Segitiga tersebut adalah segitiga sembarang.");
            } 
        else
        System.out.println ("Bukan Segitiga");
    }
}
