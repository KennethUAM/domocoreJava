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
public class Servo extends Actuator{
    public int limit;
    private int steps;
    public void walkForward(int steps){
        this.steps += steps;
    }
    public void walkTowards(int steps){
        this.steps -= steps;
    }
    public int getSetps(){return this.steps;}
}
