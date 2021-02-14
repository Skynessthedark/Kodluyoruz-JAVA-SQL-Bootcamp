

public class Television {

    private int width, height, screenSize, maxVolume = 30, volume = 0;
    private boolean power = false;

    public Television(int w, int h, int ss) {
        this.width = w;
        this.height = h;
        this.screenSize = ss;
    }

    public Television() {
        this.width = 50;
        this.height = 50;
        this.screenSize = 100;
    }

    //Ses Arttırma
    public void volumeUp(){
        if(this.power){
            if(this.volume < this.maxVolume){
                this.volume++;
                System.out.println("Current volume is: "+this.volume);
            }else{
                System.out.println("Volume is at the maximum: "+this.maxVolume);
            }
        }else{
            System.out.println("Televizyon kapalı, bu işlemi yapamazsınız.");
        }
    }

    //Ses Azaltma
    public void volumeDown(){
        if(this.power == true){
            if(this.volume > 0){
                this.volume--;
                System.out.println("Current volume is: "+this.volume);
            }else{
                System.out.println("Volume is at the minimum: 0.");
            }
        }else{
            System.out.println("Televizyon kapalı, bu işlemi yapamazsınız.");
        }
    }

    //Televizyon açma
    public void powerOn(){
        if(this.power == true) System.out.println("Televizyon zaten açık.");
        else{
            this.power = true;
            System.out.println("Televizyon açıldı.");
        }

    }

    //Televizyon kapama
    public void powerOff(){
        if(this.power == false) System.out.println("Televizyon zaten kapalı.");
        else {
            this.power = false;
            System.out.println("Televizyon kapandı.");
        }
    }

    public void setVolume(int volume){
        this.volume= volume;
    }
}
