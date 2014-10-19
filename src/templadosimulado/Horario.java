/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templadosimulado;

/**
 *
 * @author DAVID
 */
public class Horario {
    private String dia;
    private int horaI;
    private int horaF;
    private Salón salon;
    private Curso curso;
    
    public Horario(String dia,int horaI,int horaF){
        setDia(dia);
        setHoraI(horaI);
        setHoraF(horaF);
    }
    public Horario(String dia,int horaI,int horaF,Salón salon){
        setDia(dia);
        setHoraI(horaI);
        setHoraF(horaF);
        setSalon(salon);
    }
    

    /**
     * @return the salon
     */
    public Salón getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(Salón salon) {
        this.salon = salon;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the horaI
     */
    public int getHoraI() {
        return horaI;
    }

    /**
     * @param horaI the horaI to set
     */
    public void setHoraI(int horaI) {
        this.horaI = horaI;
    }

    /**
     * @return the horaF
     */
    public int getHoraF() {
        return horaF;
    }

    /**
     * @param horaF the horaF to set
     */
    public void setHoraF(int horaF) {
        this.horaF = horaF;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    @Override
    public String toString(){
        String mensaje="Hora inicial: ";
        mensaje=mensaje.concat(Integer.toString(horaI));
        mensaje=mensaje.concat(", Hora Final: ");
        mensaje=mensaje.concat(Integer.toString(horaF));
        mensaje=mensaje.concat(", Salon: ");
        mensaje=mensaje.concat(salon.getNombre());
        mensaje=mensaje.concat(", Curso: ");
        mensaje=mensaje.concat(curso.getNombre());
        mensaje=mensaje.concat(", Capacidad salón: ");
        mensaje=mensaje.concat(Integer.toString(salon.getCapacidad()));
        mensaje=mensaje.concat(", Inscritos curso: ");
        mensaje=mensaje.concat(Integer.toString(curso.getInscritos()));
        
        return mensaje;
        
    }
}