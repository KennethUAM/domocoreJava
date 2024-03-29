/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Actuators.Piston;
import Actuators.Actuator;

/**
 *
 * @author Jheron Chacon
 */
public class OpenCloseElementByPiston extends OpenCloseElement{
    
    public OpenCloseElementByPiston(int id){
        this.open = false;
        this.id = id;
        this.actuator = new Piston();
    }
    
    public int getPistonPercentage(){return ((Piston)this.actuator).getPercentage();}
    
    @Override
    public void open(){
        super.open();
        this.activateActuator(this.actuator);
    }
    
    @Override
    public void open(int percentage){
        super.open(percentage);
        this.activateActuator(this.actuator);
    }
    
    @Override
    public void close(){
        super.close();
        this.activateActuator(this.actuator);
    }
    
    @Override
    public void close(int percentage){
        super.close(percentage);
        this.activateActuator(this.actuator);
    }
    
    @Override
    public void activateActuator(Actuator actuator) {
        if(this.open)
            ((Piston)actuator).push(this.percentage);
        else
            ((Piston)actuator).pull(this.percentage);
    }
    
}
