/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main51;

import java.util.Scanner;

/**
 * 
 *
 * @author LENOVO
 */
public class Main51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        Manager m=new Manager();
        System.out.println("=== Perhitungan Gaji Karyawan ===");
        System.out.print("Masukkan NIK\t: ");
        m.setNik(input.nextLine());
        System.out.print("Masukkan Nama\t: ");
        m.setNama(input.nextLine());
        System.out.print("Masukan Jabatan (Manager/Kabag)\t: ");
        m.setJabatan(input.nextLine());
        System.out.print("Masukan Golongan (1/2/3)\t: ");
        m.setGolongan(input.nextInt());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        m.setKehaditan(input.nextInt());
        
        System.out.println("");
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("NIK : "+m.getNik());
        System.out.println("Nama : "+m.getNama());
        System.out.println("Golongan : "+m.getGolongan());
        System.out.println("Jabatan : "+m.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan : "+m.tunjanganGolongan(m.getGolongan()));
        System.out.println("Tunjangan Jabatan  : "+m.tunjanganJabatan(m.getJabatan()));
        System.out.println("Tunjangan Kehadiran : "+m.tunjanganKehadiran(m.getKehaditan()));
        System.out.println("Gaji Total : "+m.gajiTotal(m.tunjanganKehadiran(m.getKehaditan()), m.tunjanganJabatan(m.getJabatan()),m.tunjanganGolongan(m.getGolongan())));
              
    }
    
}
