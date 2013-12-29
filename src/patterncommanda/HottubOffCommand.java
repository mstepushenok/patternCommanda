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
public class HottubOffCommand implements Command {
    Hottub hottub;
    
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        hottub.off();
    }
    
    public void undo() {
        hottub.on();
    }
}

