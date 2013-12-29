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
public class PatternCommanda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
            RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
            Light light = new Light("Living room");
            TV tv = new TV("Living room");
            Stereo stereo = new Stereo("Living room");
            Hottub hottub = new Hottub();
            
            Command lightOn = new LightOnCommand(light);
            Command stereoOn = new StereoOnCommand(stereo);
            Command tvOn = new TVOnCommand(tv);
            Command hottubOn = new HottubOnCommand(hottub);
            
            Command lightOff = new LightOffCommand(light);
            Command stereoOff = new StereoOffCommand(stereo);
            Command tvOff = new TVOffCommand(tv);
            Command hottubOff = new HottubOffCommand(hottub);
            
            Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
            Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };
            
            Command partyOnMacro = new MacroCommand(partyOn);
            Command partyOffMacro = new MacroCommand(partyOff);
            
            remoteControl.setCommand(1, partyOnMacro, partyOffMacro);
            
            System.out.println(remoteControl);
            System.out.println("--- Pushing Macro ON ---");
            remoteControl.onButtonWasPushed(0);
            System.out.println("--- Pushing Macro OFF ---");
            remoteControl.offButtonWasPushed(0);
         
    }

    
}
