/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actuators;

/**
 *
 * @author Jheron Chacon
 */
public class LinearMotor extends Actuator{
    public void roteLeft(){
        this.percentage = 100;
    }
    public void roteRight(){
        this.percentage = 0;
    }
}
