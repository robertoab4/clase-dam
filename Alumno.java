public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombreCompleto.length() < 3) {
            System.out.println("El parámetro 'nombreCompleto' debe tener mas de 2 caracateres");
            System.out.println();
        }
        if (numeroMatriculaAlumno.length() < 4) {
            System.out.println("El parámetro 'numeroMatriculaAlumno' debe tener mas de 3 caracateres");
            System.out.println();
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nuevoNombre;
        String nuevoNumeroMatricula;
        if (nombre.length() < 3){
            nuevoNombre = nombre;
        }
        else{
            nuevoNombre = nombre.substring(0, 3);
        }
        if (numeroMatricula.length() < 4){
            nuevoNumeroMatricula =  numeroMatricula;
        }
        else{
            nuevoNumeroMatricula = numeroMatricula.substring(0, 4);
        }
        return nuevoNombre + nuevoNumeroMatricula;
    }
}
