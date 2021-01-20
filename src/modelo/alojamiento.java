/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class alojamiento {

    private String nombre;
    private int CantidadEstrellas;
    private ciudad Ciudad;

    public alojamiento() {
    }

    public alojamiento(String nombre, int CantidadEstrellas, ciudad Ciudad) {
        this.nombre = nombre;
        this.CantidadEstrellas = CantidadEstrellas;
        this.Ciudad = Ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public int getCantidadEstrellas() {
        return CantidadEstrellas;
    }

    public void setCantidadEstrellas(int CantidadEstrellas) {
        this.CantidadEstrellas = CantidadEstrellas;
    }

    public ciudad getCiudad() {
        return Ciudad;
    }

    public void setCiudad(ciudad Ciudad) {
        this.Ciudad = Ciudad;
    }

    

}
