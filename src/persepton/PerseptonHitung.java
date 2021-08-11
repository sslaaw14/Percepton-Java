/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persepton;

import java.util.Random;
import persepton.model.PerseptonModel;

/**
 *
 * @author DELL
 */
public class PerseptonHitung {
    PerseptonModel model;
    
    public PerseptonHitung(PerseptonModel model){
        this.model = model;
        float values;
        Random randomnumber = new Random();
        for(int i=0 ; i<3 ; i++){
            values = randomnumber.nextLong();
            model.setBobot(values, i);
            System.out.println("Bobot("+i+") = "+values);
        }
        System.out.println("-----------------------");
    }
    
    public void Hitung(){
        float bias;
        int status;
        int error;
        int akhir=0;
        for(int i=1; i<=model.getEpoch();i++){
            System.out.println("\nEpoch ke-"+i);
            for(int j=0; j<model.getTarget().length;j++){
                bias = HitungBias(j);
                System.out.println("Hasil Bias = "+bias);
                if(bias > model.getThreshold()){
                    status = 1;
                }
                else{
                    status = 0;
                }
                System.out.println("Hasil status = "+status);

                error = model.getTarget(i) - status;
                System.out.println("Hasil error = "+error);

                HitungBobot(j,error);
            }
        }
        
        for(int i=0;i<4;i++){
            System.out.println("\nHasil Akhir : ");
            bias = HitungBias(i);
            if(bias > model.getThreshold()){
                status = 1;
            }
            else{
                status = 0;
            }
            System.out.println("Hasil Bias ke-"+i+" = "+bias+"    Status = "+status);
            if(status == model.getTarget(i)){
                akhir++;
            }
        }
        System.out.println("\n--------------------------------------");
        if(akhir == 4){
            System.out.println("Hasil Akhir Mendekati Target");
        } else {
            System.out.println("Hasil Akhir Tidak Mendekati Target");
        }
        System.out.println("--------------------------------------");
    }
    
    public float HitungBias(int i){
        float bias=0;
        for(int j=0; j<3; j++){
            bias = bias + (model.getBobot(j)*model.getInput(i,j));   
        }
        return bias;
    }
    
    public void HitungBobot(int i, float error){
        float bobot;
        for(int j=0; j<3 ; j++){
            bobot = model.getBobot(j)+(model.getMiu()*model.getInput(i,j)*error);
            model.setBobot(bobot,j);
            System.out.println("   W["+j+"] = "+model.getBobot(j));
        }
    }
    
}
