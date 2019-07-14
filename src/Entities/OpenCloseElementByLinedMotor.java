/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Actuators.Actuator;
import Actuators.LinearMotor;

/**
 *
 * @author Jheron Chacon
 */
public class OpenCloseElementByLinedMotor extends OpenCloseElement{
    public OpenCloseElementByLinedMotor(int id){
        this.open = false;
        this.id = id;
        this.actuator = new LinearMotor();
    }
    public int getPosition(){
        return this.actuator.getPercentage();
    }
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
            ((LinearMotor)actuator).roteLeft();
        else
            ((LinearMotor)actuator).roteRight();
    }
}
