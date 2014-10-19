/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templadosimulado;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author DAVID
 */
public class TempladoSimulado {

    public static ArrayList<Curso> cursos=new ArrayList<Curso>();
    public static ArrayList<Salón> edificio=new ArrayList<Salón>();
    public static Horario[][] horariosLunes;
    public static Horario[][] horariosMartes;
    public static Horario[][] horariosMiercoles;
    public static Horario[][] horariosJueves;
    public static Horario[][] horariosViernes;
    public static int numH=6;
    public static int iteraciones=0;
    public static int temperatura=10;
    public static boolean todos=false;
    public static Random rnd = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        iniciaCursosYEdificio();
                        
        for(Curso temp : cursos){
            System.out.println(temp.toString());
        }     
        System.out.println();
        for(Salón temp : edificio){
            System.out.println(temp.toString());
        }
        System.out.println();
        horariosLunes=new Horario[edificio.size()][numH];
        horariosMartes=new Horario[edificio.size()][numH];
        horariosMiercoles=new Horario[edificio.size()][numH];
        horariosJueves=new Horario[edificio.size()][numH];
        horariosViernes=new Horario[edificio.size()][numH];
        inicializadorSalones();
        
        imprimirHorarios();
               
        System.out.println("Simulacion de Templado Simulado");
        System.out.println("Edificio compuesto por 2 salones, 2 salas de computadores y 2 auditorios");
        System.out.println();
        
        //Funcion de templado simulado        
        while(todos==false){
            int pos1=rnd.nextInt(horariosLunes.length);
            int pos2=0;
            do{
                pos2=rnd.nextInt(horariosLunes.length);
            }while(pos1==pos2);
            //System.out.println(pos1);

                    Curso swap1=horariosLunes[pos1][0].getCurso();
                    Curso swap2=horariosLunes[pos2][0].getCurso();
                    
                    horariosLunes[pos1][0].setCurso(swap2);
                    horariosLunes[pos2][0].setCurso(swap1);
                
            
            suficiencia();
            iteraciones++;
        }
        System.out.println("Numero de iteraciones: "+ iteraciones);
        imprimirHorarios();
        
    }
    
    /*public static void templadoS(Horario horario1, Horario horario2){
    }*/
    
    public static void suficiencia(){
        for(int i=0;i<6;i++){
           Horario temp = horariosLunes[i][0];
           int sal=temp.getSalon().getCapacidad();
           int cur=temp.getCurso().getInscritos();
           int total=sal-cur;
           //System.out.println(temp.getCurso().getNombre());
           if((total>=0)&&(total<=7)){
               todos=true;
           }
           else{
               todos=false;
               break;
           }
        }  
    }
    
    public static void iniciaCursosYEdificio(){
           
        //Cursos en salones, con distribución normal(35,5) para inscritos
        cursos.add(new Curso("Algebra Lineal",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Ingenieria de Software I",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Quimica Basica",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Calculo Integral",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Matematicas Discretas I",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Matematicas Discretas II",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Dibujo Basico",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Principios de Estatica",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Principios de Dinamica",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Calculo en Varias Variables",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Ecuaciones Diferenciales",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Probabilidad y Estadistica Fundamental",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Introduccion a la Teoria de la Computacion",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Aprendizaje de Maquina",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Desarrollo de la Ingenieria en Colombia",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Fundamentos de Construccion",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Diseño Estructural",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Mecanica de Suelos",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Mecanica de Fluidos",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Mecanica de Solidos",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Fisicoquimica",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Fluidos",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Ingenieria y Desarrollo Sostenible",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Robotica",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Sensores y Acturadores",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Gerencia y Gestion de Proyectos",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Dibujo de Maquinas",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Motores de Combustion Interna",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Electronica Digital I",Normal(35,5),2,2,0,false,false));
        cursos.add(new Curso("Electronica Analoga I",Normal(35,5),2,2,0,false,false));
        
        //Cusos en auditorio, con distribución normal(80,15) para inscritos
        cursos.add(new Curso("Introduccion a Ingenieria de Sistemas",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Industrial",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Electronica",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria de Civil",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Mecatronica",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Electrica",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Mecanica",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Agricola",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a Ingenieria Agronoma",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Fundamentos de Mecanica",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Fundamentos de Electricidad y Magnetismo",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Matematicas Basicas",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Calculo Diferencial",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Amenaza, Riesgo y Desarrollo",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Beatles y Algo Mas: Musica, Cultura y Sociedad",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Estructuras Hidraulicas",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Finanzas",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Economia General",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Materiales de Ingenieria",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Catedra Ingenio, Ciencia, Teconologia y Sociedad",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Ciencia, Tecnologia y Desarrollo",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Sistemas Numericos",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Tecnicas de Inteligencia Artificial",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Tecnologia Digital",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Sensibilidad y Pensamiento Cinematografico",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Ingenieria de Nuevos Negocios en Telecomunicaciones",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introduccion a la Astronomia",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introducción a los Estudios Urbanos",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Introducción al Viaje Espacial",Normal(80,15),2,3,0,true,false));
        cursos.add(new Curso("Recursos Geneticos, Aspectos Tecnicos y Juridicos",Normal(80,15),2,3,0,true,false));
        
        //Cursos en salas de computadores, con distribución normal(30,5)para inscritos
        cursos.add(new Curso("Programacion Orientada a Objetos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Programacion de Computadores",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Ingenieria Economica",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Metodos Numericos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Algoritmos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Redes de Computadores",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Sistemas de Informacion",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Teoria de la Informacion",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Elementos de Computadores",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Arquitectura de Computadores",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Introduccion a los Sistemas Inteligentes",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Estructuras de Datos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Bases de Datos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Computacion Visual",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Modelos y Simulacion",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Optimizacion",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Lenguajes de Programacion",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Pensamiento Sistemico",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Bases de Datos y Sistemas de Bioinformacion",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Desarrollo de Aplicaciones Para Dispositivos Moviles",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Desarrollo de Videojuegos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Diseño de Plantas y Equipos",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Señales y Sistemas I",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Ingenieria de Software II",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Regulacion de Energia",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Arquitectura de Software",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Computacion Paralela y Distribuida",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Modelos Estocasticos y Simulacion en Computacion y Comunicaciones",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Pensamiento Sistemico",Normal(30,5),2,2,0,false,true));
        cursos.add(new Curso("Optimizacion",Normal(30,5),2,2,0,false,true));
        
        //Salones disponibles en edificio: 2 auditorios, 2 salones, 2 salas de computadores      
        edificio.add(new Salón(1,103,100,true,false));
        edificio.add(new Salón(1,104,100,true,false));
        edificio.add(new Salón(1,105,40,false,false));
        edificio.add(new Salón(2,205,40,false,false));
        edificio.add(new Salón(2,206,35,false,true));
        edificio.add(new Salón(2,208,35,false,true));
    }
    
    public static void inicializadorSalones(){
        for(int i=0;i<edificio.size();i++){
                horariosLunes[i][0]= new Horario("Lunes",7,9,edificio.get(i));
                horariosLunes[i][1]= new Horario("Lunes",9,11,edificio.get(i));
                horariosLunes[i][2]= new Horario("Lunes",11,13,edificio.get(i));
                horariosLunes[i][3]= new Horario("Lunes",14,16,edificio.get(i));
                horariosLunes[i][4]= new Horario("Lunes",16,18,edificio.get(i));
                horariosLunes[i][5]= new Horario("Lunes",18,20,edificio.get(i));
                
                horariosMartes[i][1]= new Horario("Martes",9,11,edificio.get(i));
                horariosMartes[i][2]= new Horario("Martes",11,13,edificio.get(i));
                horariosMartes[i][3]= new Horario("Martes",14,16,edificio.get(i));
                horariosMartes[i][4]= new Horario("Martes",16,18,edificio.get(i));
                horariosMartes[i][5]= new Horario("Martes",18,20,edificio.get(i));
                
                horariosMiercoles[i][0]= new Horario("Miercoles",7,9,edificio.get(i));
                horariosMiercoles[i][1]= new Horario("Miercoles",9,11,edificio.get(i));
                horariosMiercoles[i][2]= new Horario("Miercoles",11,13,edificio.get(i));
                horariosMiercoles[i][3]= new Horario("Miercoles",14,16,edificio.get(i));
                horariosMiercoles[i][4]= new Horario("Miercoles",16,18,edificio.get(i));
                horariosMiercoles[i][5]= new Horario("Miercoles",18,20,edificio.get(i));
                
                horariosJueves[i][0]= new Horario("Jueves",7,9,edificio.get(i));
                horariosJueves[i][1]= new Horario("Jueves",9,11,edificio.get(i));
                horariosJueves[i][2]= new Horario("Jueves",11,13,edificio.get(i));
                horariosJueves[i][3]= new Horario("Jueves",14,16,edificio.get(i));
                horariosJueves[i][4]= new Horario("Jueves",16,18,edificio.get(i));
                horariosJueves[i][5]= new Horario("Jueves",18,20,edificio.get(i));
                
                horariosViernes[i][0]= new Horario("Viernes",7,9,edificio.get(i));
                horariosViernes[i][1]= new Horario("Viernes",9,11,edificio.get(i));
                horariosViernes[i][2]= new Horario("Viernes",11,13,edificio.get(i));
                horariosViernes[i][3]= new Horario("Viernes",14,16,edificio.get(i));
                horariosViernes[i][4]= new Horario("Viernes",16,18,edificio.get(i));
                horariosViernes[i][5]= new Horario("Viernes",18,20,edificio.get(i));
        }
         horariosLunes[0][0].setCurso(cursos.get(0));
         horariosLunes[0][0].setSalon(edificio.get(1));
         horariosLunes[1][0].setCurso(cursos.get(1));
         horariosLunes[1][0].setSalon(edificio.get(4));
         horariosLunes[2][0].setCurso(cursos.get(2));
         horariosLunes[2][0].setSalon(edificio.get(0));
         horariosLunes[3][0].setCurso(cursos.get(3));
         horariosLunes[3][0].setSalon(edificio.get(5));
         horariosLunes[4][0].setCurso(cursos.get(4));
         horariosLunes[4][0].setSalon(edificio.get(2));
         horariosLunes[5][0].setCurso(cursos.get(5));
         horariosLunes[5][0].setSalon(edificio.get(3));
    }
    
    public static void imprimirHorarios(){
        
        for(int i=0;i<edificio.size();i++){
            //for(int j=0;j<numH;j++){
                System.out.println(horariosLunes[i][0]);
            //}
            
        }
        System.out.println();
    }
    
    public static int Normal(double Media, double DStd) {
        double Suma = 0;
        for (int i = 1; i <= 12; i++) {
            //r obtiene el valor pseudo aleatorio
            double r = Math.random();
            Suma = Suma + r;//Suma acumula el valor de los valores aleatorios
        }
        //x obtiene el valor del algoritmo del libro del ing Carlos Ernesto Garcia
        double x = DStd * (Suma - 6) + Media;
        System.out.println(x);
        return (int)x;//se retorna x
    }
}