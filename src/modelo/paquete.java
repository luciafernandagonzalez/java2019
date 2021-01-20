/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class paquete {

    private int Numero;
    private String Nombre;
    private String Descripcion;
    private String Itinirario;
    private String CondicionesComerciales;
    private int Dias;
    private int Noches;
    private ArrayList<servicio> Arrayservicios = new ArrayList<servicio>();
    private ciudad CiudadOrigen;
    private ArrayList<ciudad> Arraydestinos = new ArrayList<ciudad>();
    private ArrayList<base> Arraybases = new ArrayList<base>();
    private String Estado;
    private tarifa Tarifa;

    public paquete() {}

    public paquete(int Numero, String Nombre, String Descripcion, String Itinirario, String CondicionesComerciales, int Dias, int Noches, ciudad CiudadOrigen, String Estado, tarifa Tarifa) {
        this.Numero = Numero;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Itinirario = Itinirario;
        this.CondicionesComerciales = CondicionesComerciales;
        this.Dias = Dias;
        this.Noches = Noches;
        this.CiudadOrigen = CiudadOrigen;
        this.Estado = Estado;
        this.Tarifa = Tarifa;
    }



    public ArrayList<servicio> getArrayservicios() {
        return Arrayservicios;
    }

    public void setArrayservicios(ArrayList<servicio> Arrayservicios) {
        this.Arrayservicios = Arrayservicios;
    }



    public ciudad getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(ciudad CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public String getCondicionesComerciales() {
        return CondicionesComerciales;
    }

    public void setCondicionesComerciales(String CondicionesComerciales) {
        this.CondicionesComerciales = CondicionesComerciales;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getItinirario() {
        return Itinirario;
    }

    public void setItinirario(String Itinirario) {
        this.Itinirario = Itinirario;
    }

    public int getNoches() {
        return Noches;
    }

    public void setNoches(int Noches) {
        this.Noches = Noches;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public tarifa getTarifa() {
        return Tarifa;
    }

    public void setTarifa(tarifa Tarifa) {
        this.Tarifa = Tarifa;
    }

    public ArrayList<base> getArraybases() {
        return Arraybases;
    }

    public void setArraybases(ArrayList<base> Arraybases) {
        this.Arraybases = Arraybases;
    }

    public ArrayList<ciudad> getArraydestinos() {
        return Arraydestinos;
    }

    public void setArraydestinos(ArrayList<ciudad> Arraydestinos) {
        this.Arraydestinos = Arraydestinos;
    }
    

    

}
