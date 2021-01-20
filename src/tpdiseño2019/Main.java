/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpdiseño2019;
import java.util.ArrayList;
import modelo.base;
import modelo.ciudad;
import vista.principal;
import modelo.paquete;
import modelo.servicio;
import modelo.comida;
import modelo.tarifa;
import modelo.tipoComida;
import vista.nuevopaquete;

/**
 *
 * @author lucia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ArrayList<servicio> Arrayservicioprueba = new ArrayList<servicio>();
       ArrayList<ciudad> Arraydestinoprueba = new ArrayList<ciudad>();
       ArrayList<base> Arraybaseprueba = new ArrayList<base>();
       
       tipoComida ntc = new tipoComida();
       ntc.setComida("Desayuno");
        
       comida nc = new comida();
       nc.setTipo(ntc);

       servicio ns = new servicio();
       ns.setDesde(2);
       ns.setHasta(3);
       ns.setPrecioEspecial(1000);
       ns.setComida(nc);
       Arrayservicioprueba.add(ns);

       ciudad nuevaciudad = new ciudad();
       ciudad destino1 = new ciudad();
       ciudad destino2 = new ciudad();
       destino1.setNombre("Jujuy");
       destino2.setNombre("Salta");
       Arraydestinoprueba.add(destino1);
       Arraydestinoprueba.add(destino2);

       base nuevabase = new base();
       nuevabase.setDescripcion("Doble");
       nuevabase.setPrecio(3000);
       tarifa tarifanueva = new tarifa();
       tarifanueva.setPrecio(4000);
       nuevabase.setTarifa(tarifanueva);


       Arraybaseprueba.add(nuevabase);

       paquete np = new paquete();
       np.setNumero(1);
       np.setNombre("paquete1");
       np.setDescripcion("descripcion1");
       np.setItinirario("itinerario1");
       np.setCondicionesComerciales("condiciones1");
       np.setDias(3);
       np.setNoches(3);
       np.setArrayservicios(Arrayservicioprueba);
       nuevaciudad.setNombre("Tucuman");
       np.setCiudadOrigen(nuevaciudad);
       np.setArraydestinos(Arraydestinoprueba);
       np.setArraybases(Arraybaseprueba);
       np.setEstado("Inactivo");
       np.setTarifa(tarifanueva);

       nuevopaquete.Arraypaquetes.add(np);


       principal p= new principal();
    }

}
