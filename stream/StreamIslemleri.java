import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIslemleri {
    
    /**Streamler; collection, array vb elemental yapılar içinde onların yapısını değiştirmeden
     * onlarla işlem yapabilmemizi sağlar. Aynı zamanda kodlama kolaylığı sağlar.
    */

    public static void main(String[] args){
        //Stream<Integer> liste = Stream.of(1, 3, 5, 7);
        //lambda ifadesiyle streamler içerisinde işlem yapabiliriz(fonksiyon).
        //liste.forEach(sayi -> System.out.println(sayi));

        /**
         * Streamlerin dizilerle kullanımı
        */
        // Integer[] arr = {1, 7, 5, 9};
        // Stream<Integer> sArr = Stream.of(arr);

        /** Comparator sınıfı her elemanı dizideki diğer elemanlarla kıyaslıyor.
        * Comparator sınıfının reverseOrder() metoduyla dizi elemanlarını tersine sıraladık. 
        */ 

        //sArr.sorted(Comparator.reverseOrder()).forEach(sayi -> System.out.println(sayi));

        /**
         * Streamlerin Listlerle kullanımı
         */

        // List<Integer> list = new ArrayList<>();
        // for(int i=1; i<=6; i++) list.add(i);

        //Stream<Integer> sList = list.stream();
        /** filter metodundan dönen sayıları ekrana yazdırdık. */
        //sList.filter((sayi) -> sayi % 2 == 0).forEach(sayi -> System.out.println(sayi));

        



    }

}
