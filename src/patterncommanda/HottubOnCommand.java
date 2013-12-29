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
public class HottubOnCommand implements Command {
    Hottub hottub;
    
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        hottub.on();
    }
    
    public void undo() {
        hottub.off();
    }
}


