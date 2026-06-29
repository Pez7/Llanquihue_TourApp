
package ui;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import data.GestorServicios;

public class Main {

    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        
        ServicioTuristico servicio1 = gestor.excursionUno();
        ServicioTuristico servicio2 = gestor.excursionDos();
        ServicioTuristico servicio3 = gestor.paseoUno();
        ServicioTuristico servicio4 = gestor.paseoDos();
        ServicioTuristico servicio5 = gestor.rutaUno();
        ServicioTuristico servicio6 = gestor.rutaDos();
        
        System.out.println("=== Listado de servicios LlanquihueTour ===");
        System.out.println();

        System.out.println(servicio1);
        System.out.println();
        System.out.println(servicio2);
        System.out.println();
        System.out.println(servicio3);
        System.out.println();
        System.out.println(servicio4);
        System.out.println();
        System.out.println(servicio5);
        System.out.println();
        System.out.println(servicio6);
    }
    
}
