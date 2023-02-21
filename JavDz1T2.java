// Задание 2.  Вывести все простые числа от 1 до 1000
public class JavDz1T2
{
public static void main(String[] args){
    int n = 1000;      //  Можно задать любой интервал, n > 0 
    lstPrimeNum(n);    //  Запуск ф-ции
}
public static void lstPrimeNum(int n) {  // Ф-ция вычисления и вывода простого числа
    for (int i = 2; i <= n; i++) {      //  Цикл проходит по всем числам интервала
        boolean flaf = true;          // Пока условие выполняется флаг true
        for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++)  // Составное число имеет хотя бы один делитель в интервале от 3 до корня из n
        {
            if ((i % j) == 0) { //Если tcnm делитель флаг сменится на false
                flaf = false;
                break;  // Для этого числа дальнейшие вычисления не нужны
            }
        }
        if (flaf)  //если делителей нет, то флаг останется true
        {
            System.out.print(i + "; ");  //  Вывод в строку, через разделитель
        }
    }
    }
}