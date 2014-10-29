/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templadosimulado;

/**
 *
 * @author DAVID
 */
public class Curso {
    private String nombre;
    private int inscritos;
    private int horasDia;
    private int diasSemana; 
    private int horasConSalon;
    private boolean auditorio;
    private boolean computadores;
    
    public Curso(){}
    
    public Curso(String nombre,int inscritos,int horasDia,int dias,int horasConSalon,boolean especial,boolean computadores){
        setNombre(nombre);
        setInscritos(inscritos);
        setHorasDia(horasDia);
        setDiasSemana(dias);
        setHorasConSalon(horasConSalon);
        setAuditorio(especial);
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
     * @return the inscritos
     */
    public int getInscritos() {
        return inscritos;
    }

    /**
     * @param inscritos the inscritos to set
     */
    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    /**
     * @return the horas
     */
    public int getHorasDia() {
        return horasDia;
    }

    /**
     * @param horas the horas to set
     */
    public void setHorasDia(int horas) {
        this.horasDia = horas;
    }
    
    /**
     * @return the horas
     */
    public int getDiasSemana() {
        return diasSemana;
    }

    /**
     * @param horas the horas to set
     */
    public void setDiasSemana(int dias) {
        this.diasSemana = dias;
    }

    /**
     * @return the horasConSalon
     */
    public int getHorasConSalon() {
        return horasConSalon;
    }

    /**
     * @param horasConSalon the horasConSalon to set
     */
    public void setHorasConSalon(int horasConSalon) {
        this.horasConSalon = horasConSalon;
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
        String mensaje="Nombre del curso: ";
        mensaje=mensaje.concat(nombre);
        mensaje=mensaje.concat(", Inscritos: ");
        mensaje=mensaje.concat(Integer.toString(inscritos));
        
        return mensaje;
        
    }
}
