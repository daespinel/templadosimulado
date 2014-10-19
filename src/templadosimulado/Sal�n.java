/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templadosimulado;

/**
 *
 * @author DAVID
 */
public class Salón {
    
    private int piso;
    private int aula;
    private String nombre;
    private int capacidad;
    private boolean auditorio;
    private boolean computadores;
    
    public Salón(int piso, int aula, int capacidad, boolean audotorio, boolean computadores){
        setPiso(piso);
        setAula(aula);
        setCapacidad(capacidad);
        String Nombre="Salon ";
        Nombre=Nombre.concat(Integer.toString(piso));
        Nombre=Nombre.concat("-");
        Nombre=Nombre.concat(Integer.toString(aula));
        setNombre(Nombre);
        setAuditorio(auditorio);
        setComputadores(computadores);
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    /**
     * @return the piso
     */
    public int getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }

    /**
     * @return the aula
     */
    public int getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(int aula) {
        this.aula = aula;
    }

    /**
     * @return the auditorio
     */
    public boolean isAuditorio() {
        return auditorio;
    }

    /**
     * @param auditorio the auditorio to set
     */
    public void setAuditorio(boolean auditorio) {
        this.auditorio = auditorio;
    }

    /**
     * @return the computadores
     */
    public boolean isComputadores() {
        return computadores;
    }

    /**
     * @param computadores the computadores to set
     */
    public void setComputadores(boolean computadores) {
        this.computadores = computadores;
    }
        
    @Override
    public String toString(){
        String mensaje="Nombre del salon: ";
        mensaje=mensaje.concat(nombre);
        mensaje=mensaje.concat(", Capacidad: ");
        mensaje=mensaje.concat(Integer.toString(capacidad));
        
        return mensaje;
        
    }
}
