/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Jheron Chacon
 */
public interface Openable {
    public void open();
    public void open(int percentage);
    public void close();
    public void close(int percentage);
}
