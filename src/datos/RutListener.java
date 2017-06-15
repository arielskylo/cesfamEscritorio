/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author Skylo
 */
public class RutListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        //ACTUA AL PRESIONAR Y AL SOLTAR LA TECLA
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //ACTUA AL PRESIONAR LA TECLA
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //ACTUA AL SOLTAR LA TECLA
        JTextField in = (JTextField) e.getSource();
        String old = in.getText().replaceAll("-", "");
        if (old.length() > 1) {
            in.setText(old.substring(0, old.length() - 1) + "-" + old.charAt(old.length() - 1));
        }
    }
    
}
