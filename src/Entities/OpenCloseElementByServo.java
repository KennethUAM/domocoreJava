/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Actuators.Actuator;
import Actuators.Servo;

/**
 *
 * @author Jheron Chacon
 */
public class OpenCloseElementByServo extends OpenCloseElement{
    public OpenCloseElementByServo(int id){
        this.open = false;
        this.id = id;
        this.actuator = new Servo();
    }
    
    public int getServoSteps(){return ((Servo)this.actuator).getSetps();}
    
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
        if(percentage == ((Servo)this.actuator).getSetps()){
            percentage = 100;
        }
        super.close(percentage);
        this.activateActuator(this.actuator);
    }
    
    @Override
    public void activateActuator(Actuator actuator) {
        if(this.open)
            ((Servo)actuator).walkForward(this.percentage);
        else
            ((Servo)actuator).walkTowards(this.percentage);
    }   
    
}
