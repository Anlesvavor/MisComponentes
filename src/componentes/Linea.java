/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author anlesvavor
 */
public class Linea extends JComponent{

    public Linea() {
        color = Color.BLACK;
        tipo = TipoLinea.DIAGONAL_INVERTIDA;
        espesor = 1;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEspesor() {
        return espesor;
    }

    public void setEspesor(int espesor) {
        this.espesor = espesor;
    }

    public enum TipoLinea {
        DIAGONAL,
        DIAGONAL_INVERTIDA,
        HORIZONTAL,
        VERTICAL
    }
    
    private TipoLinea tipo = TipoLinea.DIAGONAL_INVERTIDA;
    private Color color;
    private int espesor;
    
    
   
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
        grphcs.setColor(getColor());
        Graphics2D g = (Graphics2D) grphcs;
        g.setStroke(new BasicStroke(getEspesor()));
        grphcs.drawLine(xi, yi, xf, yf);
    }
    
}
