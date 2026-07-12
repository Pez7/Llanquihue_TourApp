
package model;

public class ColaboradorExterno extends Persona implements Registrable{
    public String especialidad;
    public String certificaciones;
    
    public ColaboradorExterno(String especialidad, String certificaciones, String nombre, String rut, int telefono) {
        super(nombre, rut, telefono);
        this.especialidad = especialidad;
        this.certificaciones = certificaciones;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador externo: "+ super.mostrarInformacion() + "\nEspecialidad: "+especialidad+"\nCertificaciones: "+ certificaciones+".";
    }
    
}
