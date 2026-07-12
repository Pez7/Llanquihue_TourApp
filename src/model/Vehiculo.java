
package model;

public class Vehiculo extends RecursoAgencia implements Registrable {
    public String marca;
    public String patente;
    public String modelo;
    public int capacidadPersonas;

    public Vehiculo(String marca, String patente, String modelo, int capacidadPersonas, String tipoDeRecurso, int costo, String estado) {
        super(tipoDeRecurso, costo, estado);
        this.marca = marca;
        this.patente = patente;
        this.modelo = modelo;
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
    
    @Override
    public String mostrarResumen() {
        return "Recurso Vehicular\n"+super.mostrarInformacion() + "Marca: "+marca+"\nModelo: "+ modelo+"\nCantidad de pasajeros: "+capacidadPersonas+".";
    }
}
