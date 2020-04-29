
package tp7;

public class Main_TP7 {


    public static void main(String[] args) {
        Materia ingles = new Materia(1, "Ingles 1", 1);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno a1 = new Alumno(1001, "López", "Martín");
        Alumno a2 = new Alumno(1002, "Martínez", "Brenda");
        
        
        
        a1.agregarMateria(ingles);
        a1.agregarMateria(matematicas);
        a1.agregarMateria(laboratorio1);
        
        
        a2.agregarMateria(ingles);
        a2.agregarMateria(matematicas);
        a2.agregarMateria(laboratorio1);
        a2.agregarMateria(laboratorio1);

        
        a1.cantidadMaterias();
        a2.cantidadMaterias();
        
    }
    
}
