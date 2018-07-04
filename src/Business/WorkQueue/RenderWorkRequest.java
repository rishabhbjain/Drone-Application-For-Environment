/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Rendor.Rendor;

/**
 *
 * @author rishabhjain
 */
public class RenderWorkRequest extends WorkRequest{
    private Rendor rendor;
    
  
    public Rendor getRendor() {
        return rendor;
    }

    public void setRendor(Rendor rendor) {
        this.rendor = rendor;
    }

    
    
    
}
