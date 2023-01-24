package es.usoarrays;
/**
 *
 * @author Aitor Trabanco LLano
 */
public class UsoArrays extends OperacionesArrays {
//Para generar los métodos utilizamos la refactorización. Seleccionamos el código que queremos refactorizar, click derecho, "Refactor">"Introduce">"Method". Le asignamos el nombre y aceptamos. Si hay duplicados, nos avisa para sustituirlos también por el método.
    public static void main(String[] args) {

        int[] control = new int[NUM_ALUMNOS];
        int[] practicas = new int[NUM_ALUMNOS];
        float[] calificaciones = new float[NUM_ALUMNOS]; //Seleccionamos el número "Refactor">Introduce>Variable. Le asignamos el nombre y seleccionamos que sustituya el resto de ocurrencias iguales (5).
        int maxNota = 0;
        int minNota = 0;
        int countAprobados = 0;
        int countSuspensos = 0;
        float[] estadistica = new float[10];

        generarNotas(control);

        minNota = buscarMenor(control, minNota);

        maxNota = buscarMayor(control, maxNota);
        //Método buscarMayor
        
        //creamos el array de notas "practicas"
        generarNotas(practicas);

        generarCalificaciones(control, calificaciones, practicas);

        generarEstadisticas(control, calificaciones, estadistica);

        //Método generarAprobadosSuspensos
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            if (calificaciones[i] < 5) {
                countAprobados += 1;
            } else {
                countSuspensos += 1;
            }
        }
        //Método generarAprobadosSuspensos
        mostrarResultados(minNota, maxNota, control, practicas, calificaciones, countAprobados, countSuspensos);
    }
    

    private static void mostrarResultados(int minNota, int maxNota, int[] control, int[] practicas, float[] calificaciones, int countAprobados, int countSuspensos) {
        //Método mostrarResultados
        System.out.println("La nota mínima es  : " + minNota);
        System.out.println("La nota máxima es  : " + maxNota);
        System.out.println("Array de Notas     :" + Arrays.toString(control));
        System.out.println("Prácticas          :" + Arrays.toString(practicas));
        System.out.println("Calificaciones     :" + Arrays.toString(calificaciones));
        System.out.println("Número de aprobados: " + countAprobados);
        System.out.println("Número de suspensos: " + countSuspensos);
        //Método mostrarResultados         
    }
}