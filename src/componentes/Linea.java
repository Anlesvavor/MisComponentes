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

    public Linea() {
    }

    public Linea(TipoLinea tipo) {
        this.tipo = tipo;
    }
    
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
        int ancho = getWidth()-1;
        int largo = getHeight()-1;
        int xi = 0, yi = 0 , xf = ancho, yf = largo;
        switch (getTipo()){
            case HORIZONTAL:
            xi = 0;
            yi = largo/2;
            xf = ancho;
            yf = yi;
            break;
            case VERTICAL:
            xi = ancho / 2;
            yi = 0;
            xf = ancho / 2;
            yf = largo;
            break;
            case DIAGONAL:
            xi = ancho;
            yi = 0;
            xf = 0;
            yf = largo;
            break;
            
        }
        grphcs.drawLine(xi, yi, xf, yf);
    }
    
}
