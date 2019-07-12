/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domocore;

import java.util.ArrayList;
import java.util.List;
import util.Console;

/**
 *
 * @author Jheron Chacon
 */
public class Home{
    
    private List<OpenCloseElementByPiston> pistonedElements = new ArrayList<OpenCloseElementByPiston>();
    
    public void addWindow(PistonedWindow window) throws Exception{
        this.addElement(window);
    }
    
    public void addDoor(PistonedDoor door) throws Exception{
        this.addElement(door);
    }
    
    public void removeWindow(PistonedWindow window) throws Exception{
        this.removeElement(window);
    }
    
    public void removeDoor(PistonedDoor door) throws Exception{
        this.removeElement(door);
    }
    
    public PistonedWindow getPistonedWindow(int id) throws Exception{
        OpenCloseElementByPiston window = getElement(id);
        if(window != null)
            return (PistonedWindow)window;
        else
            throw new Exception("There is no Window with that id in this house");
    }
    
    public PistonedDoor getPistonedDoor(int id) throws Exception{
        OpenCloseElementByPiston door = getElement(id);
        if(door != null)
            return (PistonedDoor)door;
        else
            throw new Exception("There is no Door with that id in this house");
    }
    
    public void sayGeneralStatus(){
        String elementType = "";
        for(OpenCloseElementByPiston element : this.pistonedElements){
            elementType = element instanceof  PistonedWindow ? "window " : 
                    element instanceof PistonedDoor ? "door " :
                    "An openable/closable element by a Piston ";
            Console.write("The " + elementType + element.getId() + " is " + element.getStatus().name());
        }
    }
    
    public void openWindow(int id, int percentage) throws Exception{
        if(this.validateElementById(this.getElement(id))){
            for(OpenCloseElementByPiston element : this.pistonedElements){
                if(element instanceof PistonedWindow){
                    element.open(percentage);
                }
            }
        }else
            throw new Exception("That door doesn't exists in this house.");
    }
    
    public void openDoor(int id, int percentage) throws Exception{
        if(this.validateElementById(this.getElement(id))){
            for(OpenCloseElementByPiston element : this.pistonedElements){
                if(element instanceof PistonedDoor){
                    element.open(percentage);
                }
            }
        }else
            throw new Exception("That door doesn't exists in this house.");
    }
    
    public void closeWindow(int id, int percentage) throws Exception{
        if(this.validateElementById(this.getElement(id))){
            for(OpenCloseElementByPiston element : this.pistonedElements){
                if(element instanceof PistonedWindow){
                    element.close(percentage);
                }
            }
        }else
            throw new Exception("That door doesn't exists in this house.");
    }
    
    public void closeDoor(int id, int percentage) throws Exception{
        if(this.validateElementById(this.getElement(id))){
            for(OpenCloseElementByPiston element : this.pistonedElements){
                if(element instanceof PistonedDoor){
                    element.close(percentage);
                }
            }
        }else
            throw new Exception("That door doesn't exists in this house.");
    }
    
    private OpenCloseElementByPiston getElement(int id){
        for(OpenCloseElementByPiston element : this.pistonedElements){
            if(element.getId()==id)
                return element;
        }
        return null;
    }
    
    private boolean validateElementById(OpenCloseElementByPiston element) {
        return this.getElement(element.getId()) != null;
    }
    
    private void addElement(OpenCloseElementByPiston element) throws Exception{
        if(!this.validateElementById(element))
            this.pistonedElements.add(element);
        else
            throw new Exception("Another element has been added with that id");
    }

    private void removeElement(OpenCloseElementByPiston element) throws Exception {
        if(this.validateElementById(element)){
            this.pistonedElements.remove(element);
        }
        else
            throw new Exception("There is no element with that Id in the house");
    }
}
