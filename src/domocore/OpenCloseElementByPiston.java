/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domocore;

/**
 *
 * @author Jheron Chacon
 */
public class OpenCloseElementByPiston extends OpenCloseElement{
    
    protected Piston piston = new Piston();
    
    public OpenCloseElementByPiston(int id){
        this.open = false;
        this.id = id;
    }
    
    public int getPistonPercentage(){return this.piston.getPercentage();}
    
    @Override
    public void open(){
        super.open();
        this.activateActuator(this.piston);
    }
    
    @Override
    public void open(int percentage){
        super.open(percentage);
        this.activateActuator(this.piston);
    }
    
    @Override
    public void close(){
        super.close();
        this.activateActuator(this.piston);
    }
    
    @Override
    public void close(int percentage){
        super.close(percentage);
        this.activateActuator(this.piston);
    }
    
    @Override
    protected void activateActuator(Actuator actuator) {
        if(this.open)
            ((Piston)actuator).push(this.percentage);
        else
            ((Piston)actuator).pull(this.percentage);
    }
    
}
