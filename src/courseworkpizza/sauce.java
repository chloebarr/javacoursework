/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworkpizza;

/**
 *
 * @author up888489
 */
public enum sauce {
    Tomato(0.00),Pesto(0.50);
    private double value;
    sauce(double value){this.value = value;}
    public double getValue(){return this.value;}
    public String getValueAsString(){return String.valueOf(value);}
}
