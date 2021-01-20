/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lucia
 */
public class servicio {

    private int Desde;
    private int Hasta;
    private float PrecioEspecial;
    private excursion Excursion;
    private comida Comida;
    private alojamiento Alojamiento;
    private transporte Transporte;

    public servicio() {
    }

    public servicio(int Desde, int Hasta, float PrecioEspecial, excursion Excursion, comida Comida, alojamiento Alojamiento, transporte Transporte) {
        this.Desde = Desde;
        this.Hasta = Hasta;
        this.PrecioEspecial = PrecioEspecial;
        this.Excursion = Excursion;
        this.Comida = Comida;
        this.Alojamiento = Alojamiento;
        this.Transporte = Transporte;
    }

    public alojamiento getAlojamiento() {
        return Alojamiento;
    }

    public void setAlojamiento(alojamiento Alojamiento) {
        this.Alojamiento = Alojamiento;
    }

    public comida getComida() {
        return Comida;
    }

    public void setComida(comida Comida) {
        this.Comida = Comida;
    }

    public int getDesde() {
        return Desde;
    }

    public void setDesde(int Desde) {
        this.Desde = Desde;
    }

    public excursion getExcursion() {
        return Excursion;
    }

    public void setExcursion(excursion Excursion) {
        this.Excursion = Excursion;
    }

    public int getHasta() {
        return Hasta;
    }

    public void setHasta(int Hasta) {
        this.Hasta = Hasta;
    }

    public float getPrecioEspecial() {
        return PrecioEspecial;
    }

    public void setPrecioEspecial(float PrecioEspecial) {
        this.PrecioEspecial = PrecioEspecial;
    }

    public transporte getTransporte() {
        return Transporte;
    }

    public void setTransporte(transporte Transporte) {
        this.Transporte = Transporte;
    }

    

}
