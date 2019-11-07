/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main51;

/**
 *
 * @author LENOVO
 */
public class Manager extends Karyawan {
   private int kehaditan;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehaditan() {
        return kehaditan;
    }

    public void setKehaditan(int kehaditan) {
        this.kehaditan = kehaditan;
    }
    
    public float tunjanganKehadiran( int hadir){
        float hasil_tK= 10000*hadir;
        return hasil_tK;
    }
    
    public float tunjanganJabatan(String jabatan){
       switch (jabatan) {
           case "Manager":
           {
               float tJ=2000000;
               return tJ;
           }
           case "Kabag":
           {
               float tJ=1000000;
               return tJ;
           }
           default:
               return 0;
       }
        
    }
    
    public float tunjanganGolongan(int golongan){
       switch (golongan) {
           case 1:
           {
               float tG=500000;
               return tG;
           }
           case 2:
           {
               float tG=1000000;
               return tG;
           }
           case 3:
           {
               float tG=1500000;
               return tG;
           }
           default:
               return 0;
       }
        
    }
    
    public float gajiTotal(float tK,float tJ,float tG){
        float total=tK+tJ+tG;
        return total;
    } 
}
