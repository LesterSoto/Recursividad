public class Ejercicio_2 {
    public static int mcd (int num1, int num2){
        if (num1==0 || num2 == 0){
            return 0;
        }
        if (num1 == num2){
            return num1;
        }
        if (num1 > num2){
            return mcd(num1-num2,num2);
        }else{
            return mcd(num1,num2-num1);
        }
    }
}
