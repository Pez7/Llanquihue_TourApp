
package model;

public class RecursoAgencia {
    public String tipoDeRecurso;
    public int costo;
    public String estado;

    public RecursoAgencia(String tipoDeRecurso, int costo, String estado) {
        this.tipoDeRecurso = tipoDeRecurso;
        this.costo = costo;
        this.estado = estado;
    }

    public String getTipoDeRecurso() {
        return tipoDeRecurso;
    }

    public void setTipoDeRecurso(String tipoDeRecurso) {
        this.tipoDeRecurso = tipoDeRecurso;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String mostrarInformacion() {
        return "Tipo: " + tipoDeRecurso + "\n"
                + "Costo: " + costo + "\n"
                + "Estado: " + estado + "\n";
    }
}
