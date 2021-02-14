import java.util.Scanner;

public class TersString {
    
    public static void tersString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yazı girin: ");
        String text = scanner.nextLine();
        scanner.close();
        char[] txt = text.toCharArray();
        char[] tersArr = new char[txt.length];
        for(int i=0, j=txt.length - 1; i < txt.length || j >=0; i++, j--){
            tersArr[i] = txt[j];
        }
        System.out.println(tersArr);
    }

    public static void main(String[] args) {

        /**Kullanıcı tarafından girilen yazıları ters şekilde ekrana yazdıran programı yazınız.
        Örnek; kullanıcı girdisi "hello world" ise, program çıktısı "dlrow olleh" şeklinde olmalıdır.*/

        tersString();
    }
}
