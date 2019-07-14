/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Actuators.Actuator;

/**
 *
 * @author Jheron Chacon
 */
public abstract class OpenCloseElement implements Openable{
    protected int id;
    protected boolean open;
    protected int percentage;
    Actuator actuator;
    
    @Override
    public void open(){
        this.openElement(100);
    }
    
    @Override
    public void close(){
        this.closeElement(100);
    }
    
    @Override
    public void open(int percentage){
        this.openElement(percentage);
    }   
    
    @Override
    public void close(int percentage) {
        this.closeElement(percentage);
    }
    
    public int getId(){return this.id;}
    
    public Status getStatus(){return this.open ? Status.OPEN : Status.CLOSE;}
    
    public int getPercentage(){return this.percentage;}
    
    private void openElement(int percentage){
        this.open = true;
        this.percentage = percentage;
    }
    private void closeElement(int percentage){
        this.percentage = percentage;
        if(this.percentage == 100)
            this.open = false;
    }
    
    protected abstract void activateActuator(Actuator actuator);
}
