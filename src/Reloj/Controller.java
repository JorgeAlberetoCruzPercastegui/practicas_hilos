/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PERCASTEGUI
 */
public class Controller implements ActionListener {

    public static void main(String[] args){
    Controller c = new Controller();
    }
    vista view;
    principal p;
    
    public Controller(){
    view = new vista();
    view.setVisible(true);
    
    view.canguro.setText("Canguro");
    view.perro.setText("perro");
    view.gato.setText("gato");
    
    p = new principal(view.canguro,view.perro,view.gato);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
