package payrollapp;


public class Empleado {
    public String nombreCompleto;
    public String Cedula;
    public String Puesto;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, String Cedula, String Puesto) {
        this.nombreCompleto = nombreCompleto;
        this.Cedula = Cedula;
        this.Puesto = Puesto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }
    
    
}
