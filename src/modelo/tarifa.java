/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class tarifa {

    private int Precio;
//    private base Base;

    public tarifa() {
    }

    public tarifa(int Precio) {
        this.Precio = Precio;
    }


//    public tarifa(float Precio, base Base) {
//        this.Precio = Precio;
//        this.Base = Base;
//    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

//    public base getBase() {
//        return Base;
//    }
//
//    public void setBase(base Base) {
//        this.Base = Base;
//    }

    

    

}
