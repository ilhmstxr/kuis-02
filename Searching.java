/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package kuis02bp1;
import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] storage = new String[3][5];
        int pilih, kolom = 0 , baris = 0;
        do{
            System.out.println("Storage Barang");
            System.out.println("1. Tambah Barang\n2. Cari Barang\n3. Exit");
            System.out.print("Pilihan Anda = ");
            pilih = s.nextInt();
                switch(pilih){
                    case 1: String barang;
                    int i,
                     j = 0;
                    boolean find = false;
                    System.out.print("Nama Barang Yang Ingin Dimasukan = ");
                    barang = s.next();
                    for (i = 0; i < 3; i++) {
                        baris = i;
                        for (j = 0; j < 5; j++) {
                            kolom = j;
                            if (storage[i][j] == null)
                            {
                                find = true;
                                break;
                            }
                        }
                        if (find) {
                            break;
                        }
                    }
                    if (i == 3 && j == 5) { 
                        System.out.println("Penyimpanan Sudah Penuh");
                    } else {
                        storage[baris][kolom] = barang;  
                        System.out.println(baris + "-" + kolom);
                    }
                    break;
                case 2:
                    barang = "";
                    find = false;
                    j = 0;
                    System.out.print("Nama Barang Yang Ingin Dicari = ");
                    barang = s.next();
                    for (i = 0; i < 3; i++) {
                        baris = i;
                        for (j = 0; j < 5; j++) {
                            kolom = j;
                            if (storage[i][j].compareToIgnoreCase(barang) == 0) {
                                find = true;
                                break; 
                            }
                        }
                        if (find) {
                            break; 
                        }
                    }
                    if (i == 3) {
                        System.out.println("Barang Tidak Ditemukan");
                    } else {
                        System.out.println("Ada di " + baris + "-" + kolom);
                    }
                    break;
                }
        } while(pilih != 3);
        
        
    }

}
