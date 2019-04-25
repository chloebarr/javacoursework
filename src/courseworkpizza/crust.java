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
public enum crust {
    Thin(1.08),Deep(1.10),Stuffed(2.14);
    private double value;
    crust(double value){this.value = value;}
    public double getValue(){return this.value;}
    public String getValueAsString(){return String.valueOf(value);}
}
