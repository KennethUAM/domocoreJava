/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Jheron Chacon
 */
public abstract class Console {
    
    public static int readInt(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
    
    public static String readString(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
    
    public static double readDouble(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextDouble();
    }
    
    public static void write(String message){
        System.out.println(message);
    }
    
    public static int askForInt(String message){
        write(message);
        return readInt();
    }
    
    public static double askForDouble(String message){
        write(message);
        return readDouble();
    }
    
    public static String askForString(String message){
        write(message);
        return readString();
    }
}
