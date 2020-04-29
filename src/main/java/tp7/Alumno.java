
package tp7;

import java.util.HashSet;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;

    HashSet materias = new HashSet();    
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregarMateria(Materia materia){   
        if(!materias.contains(materia)){
            materias.add(materia);
            System.out.println(materia.getNombre() + " se agrego con exito.\n");
           
        }else{
            System.out.println("La materia " + materia.getNombre() + " ya ha sido agregada anteriormente\n");
        }
    }
    
    public void cantidadMaterias(){
        System.out.println("Las cantidad de materias que cursa " + this.getNombre() + " " + this.getApellido() + "| Legajo nro: " + this.getLegajo() + " es: " + materias.size());
    }
}
