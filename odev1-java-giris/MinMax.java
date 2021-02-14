public class MinMax {
    
    public static void getMinMax(){
        for(int i=0; i<4;i++){
            int len = (int)(Math.random() * (8 + 1 - 3) + 3);
            int[] arr = new int[len];
            for(int j=0; j < len; j++){
                arr[j] = (int)(Math.random() * 10 + 1);
            }
            int min = arr[0];
            for(int item:arr){
                if(min > item) min=item;
            }
            int max = arr[0];
            for(int item:arr){
                if(max < item) max=item;
            }
            System.out.println((i + 1) + ". Dizi için->\n Maksimum:" + max+
                    ", Minimum: " + min);
        }
    }

    public static void main(String[] args) {
        
    /**
     *  Elemanları rastgele sayılardan oluşan bir dizideki maksimum ve minimum elemanı bulacak bir metot yazınız.
        Yazdığınız metodu elemanları rastgele sayılardan oluşan minimum 3,
        maksimum 8 elemanlı 4 tane örnek dizi oluşturarak kullanınız.
    */
        getMinMax();
    }
}
