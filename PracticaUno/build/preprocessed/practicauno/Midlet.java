/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicauno;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author m01
 */
public class Midlet extends MIDlet implements CommandListener{
    Command c;
    Command magicoALV;
    Alert a;
    TextField tf;
    //TextField res;
    Display d;
    Form f;
    
    public Midlet(){
        d = Display.getDisplay(this);
        c = new Command("Salir", Command.EXIT, 0);
        magicoALV = new Command("Hazlo", Command.OK, 0);
        a = new Alert("Numero maravilloso");
        f = new Form("Numeros maravillosos");
        tf = new TextField("Numero natural:", "", 256, 3);
        //res = new TextField("Maravilloso:", "", 256, 3);
        f.append(tf);
        //f.append(res);
        f.addCommand(c);
        f.addCommand(magicoALV);
        f.setCommandListener(this);
    }
    private String numeroMaravillosos(){
        String num = tf.getString();
        int aux = Integer.parseInt(num);
        int maravilloso;
        if(aux < 0){
                return aux + " no es maravilloso";
        }
        do{
            
            if(aux%2 == 0){
                if(aux/2 == 1){
                    //System.out.println(this.maravilloso + " es un numero maravilloso");
                    maravilloso = Integer.parseInt(num);
                    break;
                }else{
                    aux = aux/2;
                }    
            }else{
                aux = aux*3 + 1;
            }
        }while(true);
        
        return maravilloso + " es maravilloso";
        
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
        }else if(co == magicoALV){
            a.setString(numeroMaravillosos());
            a.setType(AlertType.INFO);
            a.setTimeout(Alert.FOREVER);
            d.setCurrent(a);
            /*
            res.setString(numeroMaravillosos());
            f.append(res);
            d.setCurrent(f);
            **/
        }
    }
}