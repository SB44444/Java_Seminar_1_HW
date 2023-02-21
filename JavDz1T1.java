// Урок 1.Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class JavDz1T1
{ 
public static void main(String[] args)   // Ф-ция main
    {
        Scanner sc = new Scanner(System.in, "UTF-8");  
        System.out.print("Input namber of n-Trangle: ");  //  Вводим номер n-угольнлго числа
        int n = sc.nextInt();
        sc.close();
        // nTrangle(n);
        System.out.printf("The summ of your n-Trangle digit is %d \n", nTrangle(n));  //  Вывод форматированной строкой суммы 
        System.out.printf("The factorial of your digit is %d", nFactorial(n)); // Вывод форматированной строкой факториала 
    }
public static int nTrangle(int n){   // Ф-ция вычисления  n-угольнлго числа
    return (n * (n +1) / 2);
}
public static int nFactorial(int n){  // Ф-ция вычисления факториала 
    int f = 1;
    for (int i = 2; i <= n; i++){
        f *= i;
    }
    return (f);
}
}    