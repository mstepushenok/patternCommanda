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
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
    
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }        
    }
}

