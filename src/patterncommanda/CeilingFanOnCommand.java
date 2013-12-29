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
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
    
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        ceilingFan.on();
    }
    
    public void undo() {
        ceilingFan.off();
    }
}

