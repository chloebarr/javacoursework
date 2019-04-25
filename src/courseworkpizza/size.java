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
public enum size {
    Small(9.45),Medium(11.87),Large(15.90);
    private double value;
    size(double value){this.value = value;}
    public double getValue(){return this.value;}
    public String getValueAsString(){return String.valueOf(value);}

}
