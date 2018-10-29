/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan63_10117081_latihan63_gradiengarislurus;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan suatu gradien berdasarkan koordinat X dan Y
 */
public class Latihan63_10117081_Latihan63_GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat k1 = new Koordinat(2, 10, 5, 7);
        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik (2,10) dan (5,7) "
                + "memiliki gradien sebesar " + k1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) "
                + "memiliki gradien sebesar " + k2.hitungGradien());
    }
    
}
