/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author anlesvavor
 */
public class Linea extends JComponent{

    public TipoLinea getTipo() {
        return tipo;
    }

    public void setTipo(TipoLinea tipo) {
        this.tipo = tipo;
    }

    public enum TipoLinea {
        DIAGONAL,
        DIAGONAL_INVERTIDA,
        HORIZONTAL,
        VERTICAL
    }
    
    private TipoLinea tipo;
   
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        // dibujar de forma relativa a las dimensiones del componente
        grphcs.drawLine(0, 0, getWidth()-1, getHeight()-1);
    }
    
}
