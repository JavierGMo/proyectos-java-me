/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logoraza;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;


/**
 * @author m01
 */
public class LoguitoRaza extends MIDlet implements CommandListener{
    
    Command salir;
    Command si;
    Display d;
    Lienzo l;
    
    
    public LoguitoRaza(){
        d = Display.getDisplay(this);
        salir = new Command("Salir", Command.EXIT, 0);
        si = new Command("Pintar", Command.OK, 0);
        l = new Lienzo();
        l.addCommand(salir);
        l.setCommandListener(this);
        
    }
    
    public void startApp() throws MIDletStateChangeException{
        d.setCurrent(l);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command comanco, Displayable di) {
        if(comanco == salir){
            destroyApp(false);
            notifyDestroyed();
            
        }
        
    }
}

class Lienzo extends Canvas{

    public void paint(Graphics g){
        /*
        g.drawRect(23, 23, 50, 50);
        g.drawArc(23, 23, 50, 50, 0, 360);
        g.drawRect(23+8, 23+8, 50, 50);
        g.drawArc(23+8, 23+8, 50, 50, 0, 360);
        
        */        
        
        //15 + 8 + 8
        int alto = getHeight(), ancho = getWidth();
        //int alto = 300, ancho = 300;
        
        //int x = 15, y = 15;
        int x = 0, y = 0;
        int aux = 71, aux1 = 71;
        int a = 100, b = 0;
        int hipo = ((int)Math.sqrt(a*a + a*a))-1;
        x = hipo*((int)Math.sin(145));
        y = hipo*((int)Math.cos(145));
        
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, ancho, alto);
        //g.fillArc(0, 0, ancho, alto, 0, 0);
        g.setColor(0, 0, 0);
        g.setColor(0, 255, 0);
        g.drawLine(0, 200/2, ancho, 200/2);
        g.drawLine(200/2, 0, 200/2, alto);
        g.drawLine(0, 0, 200/2, 200/2);
        
        
        g.drawLine(0, alto/2, ancho, alto/2);
        g.drawLine(ancho/2, 0, ancho/2, alto);
        
        
        g.drawRect(0, 0, 200, 200);
        g.drawArc(0, 0, 200, 200, 0, 360);
        g.drawLine(0, y, x, y);
        
        g.setColor(0, 0, 0);
        g.drawLine((int)Math.sin(135)+30, (int)Math.cos(135)+30, 200/2, 200/2);
        //g.drawLine(111*(int)Math.sin(135), 111*(int)Math.cos(135), 200/2, 200/2);
        g.drawRect(30, 30, 140, 140);
        g.drawArc(30, 30, 140, 140, 0, 360);
        
        g.drawRect(50, 50, 99, 99);
        g.drawArc(50, 50, 99, 99, 0, 360);
        
        g.drawRect(65, 65, 69, 69);
        g.drawArc(65, 65, 69, 69, 0, 360);
        
        g.drawRect(75, 75, 49, 49);
        g.drawArc(75, 75, 49, 49, 0, 360);
        
        /*
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, ancho, alto);
        g.fillArc(0, 0, ancho, alto, 0, 0);
        g.setColor(0, 0, 0);
        //f
        g.drawRect(0, 0, 100, 100);
        g.drawArc(0, 0, 100, 100, 0, 360);
        //f
        x = y =((int)(Math.sqrt((a*a)/2))-1);
        System.out.println("alto: " + alto + " \nancho:" + ancho +"   ");
        g.drawRect(x, y, 71-(71/4+4), 71-(71/4+4));
        g.drawArc(x, y, 71-(71/4+4), 71-(71/4+4), 0, 360);
       */
    }
    
}