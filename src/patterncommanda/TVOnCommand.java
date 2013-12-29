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
public class TVOnCommand implements Command {
    TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.on();
    }
    
    public void undo() {
        tv.off();
    }
}

