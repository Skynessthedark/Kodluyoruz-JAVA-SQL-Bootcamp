import java.util.ArrayList;
import java.util.Scanner;

public class Palindrom {
        
    public static void palindrom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrom olup olmadığını merak ettiğiniz sayıyı girin: ");
        int num = scanner.nextInt();
        scanner.close();
        if(num <= 9){
            System.out.println(num + " sayısı palindrom.");
            return;
        }
        else{
            ArrayList<Integer> arr = new ArrayList<>();
            int x = num;
            boolean stat = true;
            while(x != 0){
                arr.add(x%10);
                x = x / 10;
            }
            for(int i = 0, j = arr.size() - 1; i <= j; i++, j--){
                if(arr.get(i) != arr.get(j)){
                    stat = false;
                }
            }
            if(stat == true)System.out.println(num + " sayısı palindrom.");
            else System.out.println(num + " sayısı palindrom değil.");
        }
    }

    public static void main(String[] args){

        /**
         * Kullanıcı tarafından girilen sayının palindrom bir sayı olup olmadığını kontrol eden ve
         * ekrana yazdıran programı yazınız.
        */
        palindrom();
    }
    
}
