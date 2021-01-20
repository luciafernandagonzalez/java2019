/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class comida {

    private tipoComida Tipo;

    public comida() {
    }

    public comida(tipoComida Tipo) {
        this.Tipo = Tipo;
    }

    public tipoComida getTipo() {
        return Tipo;
    }

    public void setTipo(tipoComida Tipo) {
        this.Tipo = Tipo;
    }

    

}
