/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persepton.model;

/**
 *
 * @author DELL
 */
public class PerseptonModel {
    float threshold, epoch, miu;
    int[][] input = new int[][]{
        {1,0,0},{1,0,1},{1,1,0},{1,1,1}
    };
    int[] target = new int[]{
        0,1,1,0
    };
    float[] bobot = new float[5];

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }

    public float getEpoch() {
        return epoch;
    }

    public void setEpoch(float epoch) {
        this.epoch = epoch;
    }

    public float getMiu() {
        return miu;
    }

    public void setMiu(float miu) {
        this.miu = miu;
    }

    public int getInput(int i,int j) {
        return input[i][j];
    }

    public void setInput(int[][] input) {
        this.input = input;
    }

    public int getTarget(int i) {
        return target[i];
    }
    
    public int[] getTarget() {
        return target;
    }

    public void setTarget(int[] target) {
        this.target = target;
    }

    public float getBobot(int i) {
        return bobot[i];
    }
    
    public float[] getBobot() {
        return bobot;
    }

    public void setBobot(float bobot,int i) {
        this.bobot[i] = bobot;
    }
     
}
