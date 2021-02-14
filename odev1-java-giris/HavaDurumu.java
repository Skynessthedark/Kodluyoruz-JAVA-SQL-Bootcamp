import java.util.Scanner;

public class HavaDurumu {
    
    public static void havaDurumu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        int derece = scanner.nextInt();
        scanner.close();
        String hava = "Hava";
        if(derece < 20) System.out.println(hava + " Soğuk.");
        else if(derece <= 30 && derece >= 20) System.out.println(hava + " Ilık.");
        else System.out.println(hava + " Sıcak.");
    }

    public static void main(String[] args){
    /**
     *  Havanın sıcaklığına göre hava durumu bilgisini ekrana yazdıran programı yazınız.
    
        Durumlar:
        Hava sıcaklığı 20 derecenin altındaysa soğuk
        Hava sıcaklığı 20 ve 30 değerleri dahil olmak üzere bu aralıktaysa ılık
        Hava sıcaklığı 30'dan yüksek değerlerde ise sıcak olarak baz alınacak ve
        ekrana hava sıcaklığı ile ilgili bilgi yazdırılacak.
     */
        havaDurumu();
    }
}
