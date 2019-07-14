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
public class Piston extends Actuator{
    public void push(int percentage){
        this.percentage = (this.percentage + percentage) < 100 ?
                this.percentage + percentage : 100;
    }
    public void pull(int percentage){
        this.percentage = (this.percentage - percentage) > 0 ?
                this.percentage - percentage : 0;
    }
}
