
package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import java.util.ArrayList;


public class GestorServicios {
    
    public ArrayList<ServicioTuristico> generarServicio(){

        ArrayList<ServicioTuristico> servicio = new ArrayList<>();
        
        servicio.add(new ExcursionCultural("Fuerte Bulnes","Caminata",2));
        servicio.add(new PaseoLacustre("Lancha a motor", "Paseo por el Lago Llanquihue", 2));
        servicio.add(new RutaGastronomica(3,"Ruta del Salmón",2));
        servicio.add(new PaseoLacustre("Ferri", "Cruce Puerto Montt - Bariloche",4));
        servicio.add(new ExcursionCultural("Iglesias de Chiloé","Paseo en bicicleta",3));

        return servicio;
    }
}

