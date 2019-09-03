/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubo;



import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

import cubo.cubitorota;

import cubitorota.CubitoRota;


/**
 * @author m01
 */
public class CuboMid extends MIDlet implements CommandListener {

    
    Command salir;
    Command si;
    Display d;
    Lienzo l;
    CubitoRota cRota;
    
    
    public CuboMid(){
        
        //hace un canvas y meter el CubitoRota
        d = Display.getDisplay(this);
        salir = new Command("Salir", Command.EXIT, 0);
        si = new Command("Pintar", Command.OK, 0);
        l = new Lienzo();
        
        l.addCommand(salir);
        cRota = new CubitoRota();
        
        //l.paint();
        l.setCommandListener(this);
    }
        
    
    public void startApp() throws MIDletStateChangeException {
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Lienzo extends Canvas{

    public void paint(Graphics g){
        //aqui crear el cubitorota
        
    }
    
}

