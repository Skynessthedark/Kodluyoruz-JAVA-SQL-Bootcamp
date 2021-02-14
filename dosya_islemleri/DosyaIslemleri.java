import java.io.*;
import java.util.Scanner;

public class DosyaIslemleri{

    private File dosya;
    private FileWriter writer;
    private Scanner reader;

    public DosyaIslemleri(String dosya_yolu) throws Exception{
        try{
            this.dosya = new File(dosya_yolu);
            if(this.dosya.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }
            else{
                System.out.println("Dosya zaten mevcut.");
            }
        }catch(Exception ex){
            System.out.println("Dosya hatası.");
            ex.printStackTrace();
        }
        
    }

    public void setDosya(String dosya_yolu) throws Exception{
        try{
            this.dosya = new File(dosya_yolu);
            if(this.dosya.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }
            else{
                System.out.println("Dosya zaten mevcut.");
            }
        }catch(Exception ex){
            System.out.println("Dosya hatası.");
            ex.printStackTrace();
        }
        

    }

    public void dosyayaYaz(String txt) throws Exception{
        try{
            this.writer = new FileWriter(this.dosya);
            this.writer.write(txt);
            //this.writer.close();
            System.out.println("Dosya yazma işlemi tamamlandı.");
        }catch(Exception ex){
            System.out.println("Dosya yazma hatası.");
            ex.printStackTrace();
        }
    }

    public void dosyayaEkle(String txt) throws Exception{
        try{
            if(this.writer == null) this.writer = new FileWriter(this.dosya);
            this.writer.append(txt);
            System.out.println("Dosyaya ekleme işlemi tamamlandı.");
        }
        catch(Exception ex){
            System.out.println("Dosyaya ekleme hatası.");
            ex.printStackTrace();
        }
    }

    public void dosyaOkuma() throws Exception{
        try{
            this.reader = new Scanner(this.dosya);
            while(this.reader.hasNextLine()){
                System.out.println(this.reader.nextLine());
            }
            this.reader.close();
        }catch(Exception ex){
            System.out.println("Dosya okuma hatası.");
            ex.printStackTrace();
        }
    }

    public void dosyaBilgisi() throws Exception{
        try{
            System.out.println("Dosya adı: " + this.dosya.getName()
            + "\nDosya Büyüklüğü: "+ this.dosya.length()
            + "\nTam dizin: " + this.dosya.getAbsolutePath()
            + "\nOkunabilir mi?: " + this.dosya.canRead()
            + "\nYazılabilir mi?: " + this.dosya.canWrite()
            + "\nÇalıştırılabilir mi?: " + this.dosya.canExecute());
        }catch(Exception ex){
            System.out.println("Dosya bilgileri alma hatası.");
            ex.printStackTrace();
        }
    }

    public void okunabilirYap(){
        this.dosya.setReadable(true);
    }

    public void okunamazYap(){
        this.dosya.setReadable(false);
    }

    public void yazilabilirYap(){
        this.dosya.setWritable(true);
    }

    public void yazilamazYap(){
        this.dosya.setWritable(false);
    }

    public void calistirilabilirYap(){
        this.dosya.setExecutable(true);
    }

    public void calistirilamazYap(){
        this.dosya.setExecutable(false);
    }

    public void dosyaSil(){
        if(this.dosya.delete()){
            System.out.println("Silinen dosya: " + this.dosya.getName());
        }else{
            System.out.println("Dosya silme hatası.");
        }
    }

    public void klasorOlustur(String dizin_yolu){
        File klasor = new File(dizin_yolu);
        if(!klasor.exists()){
            klasor.mkdirs();
            System.out.println("Klasör oluşturuldu.");
        }else{
            System.out.println("Klasör oluşturma hatası.");
        }
    }

    public void klasorSil(String dizin_yolu){
        File klasor = new File(dizin_yolu);
        if(klasor.delete()){
            System.out.println("Silinen klasör: " + klasor.getName());
        }else{
            System.out.println("Klasör silme hatası.");
        }
    }
}