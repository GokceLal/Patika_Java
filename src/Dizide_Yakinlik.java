import java.util.Arrays;
import java.util.Scanner;

public class Dizide_Yakinlik {
    public static void main(String[] args) {
        /**
         * Dizi : {15,12,788,1,-1,-778,2,0}
         * Girilen Sayı : 5
         * Girilen sayıdan küçük en yakın sayı : 2
         * Girilen sayıdan büyük en yakın sayı : 12
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int number = input.nextInt();

        int nearestSmall = 0;
        int nearestBig = 0;
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
       Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            if(number < array[i]) {
                nearestBig = array[i];
                nearestSmall = array[i-1];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestSmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestBig);
    }

}
