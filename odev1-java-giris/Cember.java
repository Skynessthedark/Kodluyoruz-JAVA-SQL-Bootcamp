

public class Cember {

    String renk = "Yeşil";
    double yariCap = 1.0;

    public Cember(){
    }

    public Cember(double yariCap, String renk){
        this.renk = renk;
        this.yariCap = yariCap;
    }

    public void setRenk(String renk){
        this.renk = renk;
    }

    public String getRenk(){
        return this.renk;
    }

    public void setYariCap(double yariCap){
        this.yariCap = yariCap;
    }

    public double getYariCap(){
        return this.yariCap;
    }

    public double getAlan(){
        return Math.PI * yariCap * yariCap;
    }

    public void ekranaYazdir(){
        System.out.println("Çemberin -> \n Yarıçapı: " + this.yariCap + "\n Rengi: " + this.renk
        + "\n Alanı: "+ getAlan());
    }
}
