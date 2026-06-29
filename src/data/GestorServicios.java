
package data;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;


public class GestorServicios {
    
        public ServicioTuristico excursionUno() {
        return new ExcursionCultural("Fuerte Bulnes","Caminata",2);
    }
        public ServicioTuristico excursionDos() {
        return new ExcursionCultural("Iglesias de Chiloé","Paseo en bicicleta",3);
    }
        public ServicioTuristico paseoUno() {
        return new PaseoLacustre("Lancha a motor", "Paseo por el Lago Llanquihue", 2);
    }
        public ServicioTuristico paseoDos() {
        return new PaseoLacustre("Ferri", "Cruce Puerto Montt - Bariloche",4);
    }
        public ServicioTuristico rutaUno() {
        return new RutaGastronomica(3,"Ruta del Salmón",2);
    }
        public ServicioTuristico rutaDos() {
        return new RutaGastronomica(2,"Ruta de la Cerveza",3);
    }
}
