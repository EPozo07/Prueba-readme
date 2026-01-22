package unidad05;

/**
 * Este programa encuentra el valor mas grande del array y 
 * muestra cuantas veces aparece ese valor.
 */
public class Y { 
/**
 * Punto de entrada del programa
 * Recorre un array de números para encontrar el mayor
 * y contar sus repeticiones.
 */
    public static void main(String[] args) { 
    	
  
    	
        int[] d = {4, 7, 2, 9, 2, 5};  //  Son los valores que existen dentro de el array.

        int e = 0; // Variable que va a contar cuantas veces aparece un valor.

        int f = d[0]; //Variable que va a mostrar el valor más alto.

  

        for (int i = 1; i < d.length; i++) {  // Este bucle sirve para encontrar el valor mas grande.

            if (d[i] > f) { 

                f = d[i]; 

            } 

        } 

  

        for (int i = 0; i < d.length; i++) { // Este bucle sirve para encontrar cuantas veces aparece dentro del array el número más grande.

            if (d[i] == f) { 

                e++; 

            } 

        } 

  

        System.out.println(f + ":" + e); 

    } 

} 