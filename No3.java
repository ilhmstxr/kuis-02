package kuis2dio;
public class No3 {
    public static void main(String[] args) {
    String[][] namadanharga = {
            {"Kursi"   ,"50000"},
            {"Meja"    ,"200000"},
            {"Pensil", "3000"},
            {"Baju", "50000"},
            {"Botol", "65000"},
            {"Buku", "23000"},
            {"Kabel", "9000"},
            {"Bolpoin", "4000"},
        };
        System.out.println("Nama Barang |  Harga Barang");
    for(int i=0;i<=7;i++){
        
        System.out.print(namadanharga[i][0]+"           ");
        System.out.println("Rp "+namadanharga[i][1]+"");
    }      
  }
}

