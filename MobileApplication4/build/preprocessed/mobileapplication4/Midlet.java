/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobileapplication4;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author m01
 */
public class Midlet extends MIDlet implements CommandListener{
    Command c;
    Command chido;
    Display d;
    TextField tf;
    TextField res;
    Form f;
    
    public Midlet(){
        d = Display.getDisplay(this);
        c = new Command("Saldir", Command.EXIT, 2);
        chido = new Command("Hacer",Command.OK, 2);
        f = new Form("Un usuario");
        tf = new TextField("Numero natural:", "", 256, 3);
        res = new TextField("XD", "", 256, 3);
        f.append(tf);
        f.append(res);
        f.addCommand(chido);
        f.addCommand(c);
        //f.append(tf);
        f.setCommandListener(this);
    }
    
    public void startApp() throws MIDletStateChangeException{
        d.setCurrent(f);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command co, Displayable di) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(co == c){
            destroyApp(false);
            notifyDestroyed();
        }/*else if(co == chido){
            f.append(res);
        }*/
    }
}
