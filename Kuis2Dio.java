
package kuis2dio;
public class Kuis2Dio {
    public static void main(String[] args) {
        String NamaBarang[];
        NamaBarang = new String[5];
        NamaBarang[0]="Kursi"; NamaBarang[1]="Meja"; NamaBarang[2]="Botol"; NamaBarang[3]="Spidol"; NamaBarang[4]="Pensil";
        int HargaBarang[];
        HargaBarang = new int [5];
        HargaBarang[0]=75000; HargaBarang[1]=125000; HargaBarang[2]=20000; HargaBarang[3]=9000; HargaBarang[4]=2000;
        
        System.out.println("Nama Barang        Harga Barang");
        for(int i=0; i<5; i++){
            System.out.println("   "+NamaBarang[i]+"             Rp "+HargaBarang[i]);
        }
        
    }
    
}

