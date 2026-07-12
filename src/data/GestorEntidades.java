
package data;
import java.util.ArrayList;
import java.util.List;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Persona;
import model.Vehiculo;
import model.RutaGastronomica;
import model.Registrable;


public class GestorEntidades {
    List<Registrable> lista = new ArrayList<>();
    
      
     public GestorEntidades() {
        lista = new ArrayList<>();
    }
    
    public void agregarRegistro(Registrable registro) {
        lista.add(registro);
    }
    public String obtenerResumenRegistros() {

        if (lista.isEmpty()) {
            return "No hay registros para mostrar.";
        }

        String resumen = "";

        for (Registrable registro : lista) {

            if (registro instanceof ColaboradorExterno) {

                ColaboradorExterno colaborador = (ColaboradorExterno) registro;

                resumen += colaborador.mostrarResumen();

            } else if (registro instanceof GuiaTuristico) {

                GuiaTuristico guia = (GuiaTuristico) registro;

                resumen += guia.mostrarResumen();

            } else if (registro instanceof Vehiculo) {

                Vehiculo transporte = (Vehiculo) registro;

                resumen += transporte.mostrarResumen();
                
            } else if (registro instanceof RutaGastronomica) {

                RutaGastronomica ruta = (RutaGastronomica) registro;

                resumen += ruta.mostrarResumen();
            }

            resumen += "\n-----------------------------\n";
        }

        return resumen;
    }
}
