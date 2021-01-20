/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class excursion {

    private String Lugar;
    private float Seguro;

    public excursion() {
    }

    public excursion(String Lugar, float Seguro) {
        this.Lugar = Lugar;
        this.Seguro = Seguro;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public float getSeguro() {
        return Seguro;
    }

    public void setSeguro(float Seguro) {
        this.Seguro = Seguro;
    }

    

}
