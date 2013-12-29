/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patterncommanda;

/**
 *
 * @author lenovo
 */
public class GarageDoor {
    String name;
    
    GarageDoor(String name) {
        this.name = name;
    }
    
    public void up() {
        System.out.println(name + " Door is up!");
    }
    
    public void down() {
        System.out.println(name + " Door is down!");
    }
    
    public void stop() {
        System.out.println(name + " Door is stopped!");
    }
    
    public void lightOn() {
        System.out.println(name + " Light is on!");
    }
    
    public void lightOff() {
        System.out.println(name + " Light is off!");
    }
}
