package linear_binary;

/**
 * Примеры линейного и бинарного поиска и сравнение их по производительности
 * <p>
 * Важно, бинарный поиск будет работать только на отсортированных/поиндексированных данных!
 * <p>
 * Пример поиска корня числа
 */
public class Main {
    public static void main(String[] args) {
        linear(58.876345);
        System.out.println("=====================================");
        binary(58.876345);
    }

    public static void linear(double d) {
        int i = 0;
        double result = 0;

        while (Math.abs(result * result - d) >= 0.001) {
            result += 0.00001;
            i++;
        }

        System.out.println("Корень числа " + d + " равен " + result);
        System.out.println("Линейный поиск сделал " + i + " операций");
    }

    public static void binary(double d) {
        double low = 0;
        double high = d;
        double middle = (high + low) / 2;
        int i = 0;
//        double result = 0;

        while (Math.abs(middle * middle - d) >= 0.001){
            if(middle * middle < d){
                low = middle;
            } else {
                high = middle;
            }
            middle = (high + low) / 2;
            i++;
        }
        System.out.println("Корень числа " + d + " равен " + middle);
        System.out.println("Бинарный поиск сделал " + i + " операций");
    }
}
