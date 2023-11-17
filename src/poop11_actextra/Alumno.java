package poop11_actextra;

public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numCuenta;
    private int edad;

    /**
     * Constructor con atributos.
     * @param nombre 
     * @param apellidoPaterno 
     * @param apellidoMaterno
     * @param numCuenta
     * @param edad 
     */
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String numCuenta, int edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    /**
     * Métodos Getter y Setter.
     * @return Atributos. 
    */
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    /**
     * Método ToString.
     * @return Los datos de los alumnos separados por comas, para escribirlos en el archivo CSV.
     */
    @Override
    public String toString() {
        return nombre + "," + apellidoPaterno + "," + apellidoMaterno + "," + numCuenta + "," + edad;
    }
}
