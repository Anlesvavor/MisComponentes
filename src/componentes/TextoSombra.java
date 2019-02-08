/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author anlesvavor
 */
public class TextoSombra extends JLabel {

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Color frente = getForeground();
        for (int i = 0; i < 3; i++){
            int c = i * 50;
            grphcs.setColor(new Color(c, c, c));
            grphcs.drawString(getText(), 2 * i +12, i + 12);
        }
        
    }
    
}
