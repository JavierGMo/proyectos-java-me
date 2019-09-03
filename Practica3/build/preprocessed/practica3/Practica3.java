/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author m01
 */
public class Practica3 extends MIDlet implements CommandListener {
    
    Command salir;
    Command okfibo;
    Command okPrimo;
    Command okPal;
    TextField primo;
    TextField fibo;
    TextField palindromos;
    Alert a;
    //TextField res;
    Display d;
    Form f;
    
    
    Practica3(){
        d = Display.getDisplay(this);
        primo = new TextField("Primo", "", 256, 3);
        fibo = new TextField("Fibonacci", "", 256, 3);
        palindromos = new TextField("Palindromo", "", 256, 0);
        a = new Alert("Alerta");
        f = new Form("Practica 3");
        
        salir = new Command("Salir", Command.EXIT, 0);
        okfibo = new Command("Fibo", Command.OK, 0);
        okPrimo = new Command("Primo", Command.OK, 0);
        okPal = new Command("Palindromo", Command.OK, 0);
        f.append(primo);
        f.append(fibo);
        f.append(palindromos);
        f.addCommand(salir);
        f.addCommand(okPrimo);
        f.addCommand(okfibo);
        f.addCommand(okPal);
        f.setCommandListener(this);
    }
    
    public void startApp() {
        d.setCurrent(f);
        
    }
    
    private String primo(){
        int pr = Integer.parseInt(primo.getString());
        String prr = "";
        if(pr == 0 || pr == 1){
            prr = pr + " no es primo";
        }else if(pr == 2 || pr == 3 || pr == 5 || pr == 7){
            prr = pr + " es primo";
        }else if(pr%2 == 0 || pr%3 == 0 || pr%5 == 0 || pr%7 == 0){
            prr = pr + " no es primo";
            
        }else{
            prr = pr + " es primo";
        }
        return prr;
    }
    
    private String fibo(){
        int numF = Integer.parseInt(fibo.getString());
        String mensajeF = numF + " no esta en fibo";
        int a=0, b=1, aux=0;
        for (int i = 0; i < numF+1; i++) {
            if(numF == aux || numF == b){
                mensajeF = numF + " esta en fibonacci";
                break;
            }
            aux = a;
            a = b;
            b = aux+b;
            
            System.out.println(a + " " + b);
        }
        
        return mensajeF;
    }
    
    /*********************PALINDROMO*****************/
    private String palindromo(){
        String contP = palindromos.getString();
        String contPP = "";
        String reversaP = "";
        int tam = contP.length();
        for (int i = 0; i < tam; i++) {
            if(contP.charAt(i) != ' '){
                reversaP = contP.charAt(i) + reversaP;
            }
        }
        System.out.println(reversaP);
        for (int i = 0; i < tam; i++) {
            if(contP.charAt(i) != ' '){
                contPP += contP.charAt(i);
            }
        }
        
        System.out.println(contP);
        
        if(contPP.equals(reversaP)){
            return contP + " es palindromo";
        }
        
        System.out.println(contP);
        
        return contP + " no es palindromo";
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable di) {
        if(salir == c){
            destroyApp(false);
            notifyDestroyed();
        }else if(okPrimo == c){
            
            a.setString(primo());
            a.setType(AlertType.INFO);
            a.setTimeout(Alert.FOREVER);
            d.setCurrent(a);
        }else if(okfibo == c){
            a.setString(fibo());
            a.setType(AlertType.INFO);
            a.setTimeout(Alert.FOREVER);
            d.setCurrent(a);
        }else if(okPal == c){
            a.setString(palindromo());
            a.setType(AlertType.INFO);
            a.setTimeout(Alert.FOREVER);
            d.setCurrent(a);
        }
    }
}
