/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persepton;

import java.util.Scanner;
import persepton.model.PerseptonModel;

/**
 *
 * @author DELL
 */
public class Persepton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerseptonModel model = new PerseptonModel();
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("Masukkan nilai Theshold = ");
        float threshold = input.nextFloat(); 
        model.setThreshold(threshold);
        
        System.out.print("Masukkan nilai miu = ");
        float miu = input.nextFloat(); 
        model.setMiu(miu);
        
        System.out.print("Masukkan nilai epouch = ");
        float epoch = input.nextFloat(); 
        model.setEpoch(epoch);
        
        PerseptonHitung hitung = new PerseptonHitung(model);
        hitung.Hitung();
        
    }
    
}
