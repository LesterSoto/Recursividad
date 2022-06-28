public class Ejercicio_4 {
    /*
    Invertir una cadena de texto con recursividad.
     */
    private static String invertirCadena(String cadena, int indice){
        String inversa;
        if (indice == 0){
            inversa =String.valueOf(cadena.charAt(indice));
        }
        else {
            inversa = String.valueOf(cadena.charAt(indice)) + invertirCadena(cadena,indice-1);
        }
        return inversa;
    }
    /*
    Metodo auxiliar
     */
    public static String invertirCadena(String cadena){
        return invertirCadena(cadena,cadena.length()-1);
    }
}
