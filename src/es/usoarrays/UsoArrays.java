package es.usoarrays;

public class UsoArrays {

    public static void main(String[] args) {

        int[] control = new int[40];
        int[] practicas = new int[40];
        float[] calificaciones = new float[40];
        int maxNota = 0;
        int minNota = 0;
        int countAprobados = 0;
        int countSuspensos = 0;
        float[] estadistica = new float[10];

        //Método generarNotas
        //Genera notas random entre 1 y 10
        for (int i = 0; i < control.length; i++) {
            control[i] = (int) (Math.random() * 11);
        }
        //Método generarNotas

        //Método buscarMenor        
        int postEval = 11;
        for (int i = 0; i < control.length; i++) {
            int preEval = control[i];
            if (preEval < postEval) {
                minNota = preEval;
                postEval = control[i];
            }
        }
        //Método buscarMenor

        //Método buscarMayor        
        int postEva2 = 0;
        for (int i = 0; i < control.length; i++) {
            int preEval = control[i];
            if (preEval > postEva2) {
                maxNota = preEval;
                postEva2 = control[i];
            }
        }
        //Método buscarMayor

        //creamos el array de notas "practicas"
        for (int i = 0; i < practicas.length; i++) {
            practicas[i] = (int) (Math.random() * 11);
        }

        //Método generarCalificaciones
        for (int i = 0; i < control.length; i++) {
            calificaciones[i]
                    = (((float) control[i]
                    + (float) practicas[i])
                    / 2);
        }
        //Método generarCalificaciones       

        //Método generarEstadisticas
        //Sacamos la estadística de calificaciones
        //hacemos un array de 10 para la estadística.      
        for (int i = 0; i < 10; i++) {
            float count = 0;
            float sum = 0;
            for (int j = 0; j < control.length; j++) {
                if ((i < calificaciones[j]) && ((i + 1) >= calificaciones[j])) {
                    sum += calificaciones[j];
                    count += 1;
                }
            }
            if (count != 0) {
                estadistica[i] = ((float) count / 40);
            } else {
                estadistica[i] = 0;
            }
            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
            System.out.println("Estadística nota tramo <="
                    + (i + 1) + " = "
                    + sol + "%");
        }
        //Método generarEstadisticas   

        //Método generarAprobadosSuspensos
        for (int i = 0; i < 40; i++) {
            if (calificaciones[i] < 5) {
                countAprobados += 1;
            } else {
                countSuspensos += 1;
            }
        }
        //Método generarAprobadosSuspensos

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