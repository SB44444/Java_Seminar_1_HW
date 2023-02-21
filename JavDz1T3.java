// Задание 3.  Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;   // Импорт сканера
public class JavDz1T3 {
    public static void main(String[] args) {
        double num1; double num2; double anser; char math_char;   // Создаем перемнные
        Scanner sc = new Scanner(System.in);                      // Создаем пременную ввода
        System.out.print("Введите первое число и нажмите ENTER: ");       // Диалоговый блок ввода данных
        num1 = sc.nextDouble();
        System.out.print("Выберите действие (+ ,- ,* ,/ ) и нажмите ENTER: ");
        math_char = sc.next().charAt(0);
        System.out.print("Введите второе число и нажмите ENTER: ");
        num2 = sc.nextDouble();
        sc.close();                                         // Закрываем сканер
                            // Сравниваем значение перменной math_char с введенным символом, если совпадает, то выполняется вычисление 
        switch(math_char) {
            case '+': anser = num1 + num2;
            break;
            case '-': anser = num1 - num2;
            break;
            case '*': anser = num1 * num2;
            break;
            case '/': anser = num1 / num2;
            break;
            default:  System.out.printf("Ошибка! Повториете ввод");  //  Иначе выводится ошибка
            return;
        }
        System.out.print("Ответ:\n");   // вывод выражения и результата
        System.out.printf(num1 + " " + math_char + " " + num2 + " = " + anser);
    }
}
