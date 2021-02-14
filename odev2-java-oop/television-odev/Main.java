

public class Main {

    public static void main(String[] args){
        Television tv1 = new Television(75, 75, 150);
        Television tv2 = new Television();

        //Televizyon açma/kapama
        tv1.powerOn();
        //Tv açık uyarısı
        tv1.powerOn();
        tv2.powerOn();
        tv1.powerOff();
        tv2.powerOff();
        //TV kapalı uyarısı
        tv2.powerOff();

        //Ses arttırma/azaltma
        tv1.volumeUp();
        tv1.powerOn();
        tv2.powerOn();
        //Min. ses uyarısı
        tv2.volumeDown();

        tv1.setVolume(29);
        tv1.volumeUp();
        //max.ses uyarısı
        tv1.volumeUp();
        tv2.volumeUp();
        tv2.volumeUp();

        /*Kapsulleme hatası
        System.out.println("Tv1 Ekran Boyutu: "+ tv1.screenSize);
        Output: java: screenSize has private access in soru2.Television

         */
    }
}
