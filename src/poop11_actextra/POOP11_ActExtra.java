package poop11_actextra;

// Bibliotecas que tienen las funciones para escribir y leer archivos.
import java.io.*;
import java.util.*;

/**
 *
 * @author Clau, Ceci, Migue
 */

public class POOP11_ActExtra{
    public static void main(String[] args) {
        
        /**
         * Crear y escribir en el archivo CSV
         * List Alumno: Es una lista que almacena los atributos de cada objeto de la clase Alumno
         *              En este caso, se refiere a los datos personales de cada alumno.
         */
        List<Alumno> alumnos = new ArrayList<>();
        /**
         * add(): Es una función propia de las listas que adiciona objetos a la lista. 
         */
        alumnos.add(new Alumno("Antonio", "Ayala", "Barbosa", "10001", 20));
        alumnos.add(new Alumno("Claudio", "Flores", "Garcia", "10002", 20));
        alumnos.add(new Alumno("Cecilia", "Martinez", "Hernandez", "10003", 20));
        alumnos.add(new Alumno("Miguel", "Loza", "Regino", "10004", 20));
        alumnos.add(new Alumno("Mauricio", "Fernandez", "Herrera", "10005", 20));
        alumnos.add(new Alumno("Sejastian", "Altamirano", "Vazquez", "10006", 20));
        alumnos.add(new Alumno("Kiliano", "Ferrera", "Guadarrama", "10007", 20));
        alumnos.add(new Alumno("Diego", "Perez", "Martinez", "10008", 20));
        alumnos.add(new Alumno("Fernando", "Malabarista", "Vazquez", "10009", 20));
        alumnos.add(new Alumno("Oscar", "Rene", "Valdez", "10010", 20));

        /**
         * Escribir en el archivo CSV
         * nombreArchivo: Es el archivo creado, con la extensión CSV.
         */
        String nombreArchivo = "alumnos.csv";
        /**
         * writer: Abre un PrintWriter para escribir en un archivo especificado por 'nombreArchivo'.
         */
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (Alumno alumno : alumnos) {
                /**
                 * La sentencia escribre los datos de la lista 'alumno' en el archivo 
                 * utilizando toString, que por defecto separa los atributos por comas ','.
                 */
                writer.println(alumno.toString());
            }
            /**
             *  Muestra un mensaje por consola indicando que se escribió en el archivo. 
             */
            System.out.println("Datos de alumnos escritos en el archivo: " + nombreArchivo);
            /**
             * Captura y maneja cualquier excepción de tipo IOException que pueda 
             * ocurrir durante la escritura del archivo.
             */
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + '\n' + e.getMessage());
        }

        /**
         * Leer el archivo CSV y crear objetos Alumno
         * alumnosLeidos: Crea una lista con los datos de los alumnos ya obtenidos del archivo.
         */
        List<Alumno> alumnosLeidos = new ArrayList<>();
        
        /**
         * reader: Abre un BufferedReader para leer desde el archivo especificado por 'nombreArchivo'.
        */
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            /**
             * linea: Almacena cada linea obtenida del archivo.
             */
            String linea;
            /**
             * Lee una línea del archivo y continúa hasta que no haya más líneas (NULL).
             */
            while ((linea = reader.readLine()) != null) {
                /**
                 * Extrae los datos de la línea usando el StringTokenizer para obtener los tokens.
                 */
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");
                String nombre = tokenizer.nextToken();
                String apellidoPaterno = tokenizer.nextToken();
                String apellidoMaterno = tokenizer.nextToken();
                String numCuenta = tokenizer.nextToken();
                /**
                 * Parsea para la conversión de tipos. 
                */
                int edad = Integer.parseInt(tokenizer.nextToken());
                /**
                 * Crea un objeto Alumno con los datos extraídos de la línea
                 * add(): Almacena en la lista 'alumnosLeidos' los datos obtenidos en 'alumno'.
                 */
                Alumno alumno = new Alumno(nombre, apellidoPaterno, apellidoMaterno, numCuenta, edad);
                alumnosLeidos.add(alumno);
            }
            System.out.println("\nDatos de alumnos leidos del archivo: " + nombreArchivo + '\n');
            /**
             * A traves del loop, muestra todos los alumnos leidos en el archivo que estan
             * almacenados en la lista. 
             */
            for (Alumno alumno : alumnosLeidos) {
                System.out.println(alumno.toString());
            }
            /**
             * Captura y maneja cualquier excepción de tipo IOException que pueda ocurrir durante la lectura del archivo.
             */
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + '\n' + e.getMessage());
        }
    }
}