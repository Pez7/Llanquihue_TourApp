
package data;
import java.util.ArrayList;
import java.util.List;
import model.ColaboradorExterno;
import model.GuiaTuristico;
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

            switch (registro) {
                case ColaboradorExterno colaborador -> resumen += colaborador.mostrarResumen();
                case GuiaTuristico guia -> resumen += guia.mostrarResumen();
                case Vehiculo transporte -> resumen += transporte.mostrarResumen();
                case RutaGastronomica ruta -> resumen += ruta.mostrarResumen();
                default -> {
                }
            }

            resumen += "\n-----------------------------\n";
        }

        return resumen;
    }
}
