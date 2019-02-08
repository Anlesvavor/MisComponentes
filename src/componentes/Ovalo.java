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
public class Ovalo extends JComponent {

    public Ovalo() {
        lados = 100;
        anguloInicial = 0;
    }

    public Ovalo(int lados) {
        this.lados = lados;
    }

    public Ovalo(int lados, double anguloInicial) {
        this.lados = lados;
        this.anguloInicial = anguloInicial;
    }
    
    
    
    private int lados;
    private double anguloInicial;
    
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        int xc, yc;
        xc = getWidth()/2;
        yc = getHeight()/2;
        int r;
        
        r = xc < yc ? xc : yc; 
        
        double x1, y1, x2, y2, angulo = 0;
        
        for(int i = 0; i <= getLados(); i++) {
            double anguloFinal = i * Math.PI * 2 / getLados();
            x1 = r * Math.cos(angulo + getAnguloInicial()) + xc;
            y1 = r * Math.sin(angulo + getAnguloInicial()) + yc;
            x2 = r * Math.cos(anguloFinal + getAnguloInicial()) + xc;
            y2 = r * Math.sin(anguloFinal + getAnguloInicial()) + yc;
            grphcs.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            angulo = anguloFinal;
        }
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getAnguloInicial() {
        return anguloInicial;
    }

    public void setAnguloInicial(double anguloInicial) {
        this.anguloInicial = anguloInicial;
    }
    
}
