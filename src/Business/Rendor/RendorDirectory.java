/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rendor;

import java.util.ArrayList;

/**
 *
 * @author runhzx
 */
public class RendorDirectory {
    private ArrayList<Rendor> rendorList;

    public RendorDirectory() {
        rendorList = new ArrayList<>();
    }

    public ArrayList<Rendor> getRendorList() {
        return rendorList;
    }

    public void setRendorList(ArrayList<Rendor> rendorList) {
        this.rendorList = rendorList;
    }
    
    
    
}
