/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class base {

    private String Descripcion;
    private Integer Precio;
    private tarifa Tarifa;

    public base() {
    }

    public base(String Descripcion, Integer Precio, tarifa Tarifa) {
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Tarifa = Tarifa;
    }

    public tarifa getTarifa() {
        return Tarifa;
    }

    public void setTarifa(tarifa Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    

}
