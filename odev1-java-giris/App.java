public class App {

    public static void main(String[] args) {

        /**
         *  Yarıçap ve renk özelliklerine sahip bir çember sınıfı oluştup çemberin alanını ve
            yarıçapını değerini çağırabileceğiniz ve değiştirebileceğiniz bir yapı oluşturun.
            Bu sınıftan bir nesne yaratarak oluşturduğunuz çemberin yarıçapını ve
            alanını hesaplayıp ekrana yazdıran programı yazınız.
         */
        
        Cember cember1 = new Cember();
        cember1.ekranaYazdir();
        Cember cember2 = new Cember(2, "Sarı");
        System.out.println(cember2.getYariCap() + " " +cember2.getAlan());
        cember2.setYariCap(1.0);
        System.out.println(cember2.getYariCap() + " " +cember2.getAlan());
        cember2.ekranaYazdir();
    }
}
