
package model;

public class GuiaTuristico extends Persona implements Registrable {
    public String idioma;
    public String tipoDeTour;

    public GuiaTuristico(String idioma, String tipoDeTour, String nombre, String rut, int telefono) {
        super(nombre, rut, telefono);
        this.idioma = idioma;
        this.tipoDeTour = tipoDeTour;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTipoDeTour() {
        return tipoDeTour;
    }

    public void setTipoDeTour(String tipoDeTour) {
        this.tipoDeTour = tipoDeTour;
    }

    @Override
    public String mostrarResumen() {
        return "Guía turístico: " +super.mostrarInformacion() + "\nIdioma: "+idioma+"\nTipo de tour: "+tipoDeTour+".";

    }
    
}
