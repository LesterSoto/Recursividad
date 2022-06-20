public class Ejercicio_3 {
    public static int suma(int vector[], int a){
        if (a==0){
            return vector[0];
        }else {
            return vector[a] + suma(vector,a-1);
        }
    }
}
