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
public class TV {
    String name;
    
    public TV(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " TV on");
    }
    
    public void off() {
        System.out.println(name + " TV off");
    }
}

