
package ui;
import model.ServicioTuristico;
import data.GestorServicios;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        
        ArrayList <ServicioTuristico> servicios = gestor.generarServicio();
        
        System.out.println("-------Lista de Servicios de LlanquihueTour-------");
        
        for(ServicioTuristico servicio : servicios){
            
           servicio.mostrarInformacion();
        }
        
    }
    
}
