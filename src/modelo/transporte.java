/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class transporte {

    private tipoTransporte Tipo;
    private comodidad Comodidad;
    private int Seguro;

    public transporte() {
    }

    public transporte(tipoTransporte Tipo, comodidad Comodidad, int Seguro) {
        this.Tipo = Tipo;
        this.Comodidad = Comodidad;
        this.Seguro = Seguro;
    }

    public comodidad getComodidad() {
        return Comodidad;
    }

    public void setComodidad(comodidad Comodidad) {
        this.Comodidad = Comodidad;
    }

    public int getSeguro() {
        return Seguro;
    }

    public void setSeguro(int Seguro) {
        this.Seguro = Seguro;
    }

    public tipoTransporte getTipo() {
        return Tipo;
    }

    public void setTipo(tipoTransporte Tipo) {
        this.Tipo = Tipo;
    }

    

}
