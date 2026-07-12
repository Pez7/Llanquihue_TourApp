
package model;
        
public class RutaGastronomica extends ServicioTuristico implements Registrable{
    private int numeroDeParadas;

    public RutaGastronomica(int numeroDeParadas, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String mostrarResumen() {               
         return "Servicio turístico Gastronómico\n"+super.mostrarInformacion()+"\nParadas: " + numeroDeParadas ;
    }
    
}
