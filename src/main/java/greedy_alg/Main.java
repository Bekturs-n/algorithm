package greedy_alg;

import java.util.ArrayList;
import java.util.List;

/**
 * Жадные алгоритмы это такие алгоритмы, которые стремятся сделать оптимальный выбор в каждый
 * момент времени. На каждом шагу выбирается лучший выбор, не задумываясь о будущем.
 * <p>
 * Жадные алгоритмы — жадные. Они не смотрят в будущее, чтобы выбрать глобальное оптимальное решение.
 * Их интересует только лучшее решение в данный момент. Но общее оптимальное решение может отличаться
 * от решения, которое выбирает алгоритм на каждом шаге своей работы. Так же они никогда не
 * оглядываются назад на то, что сделали, чтобы понять, нужна ли глобальная оптимизация.
 * <p>
 * Жадные алгоритмы очень быстрые. Намного быстрее, чем две другие альтернативы
 * (Разделяй и властвуй — Divide & Conquer, и Динамическое программирование Dynamic Programming).
 * Они популярные, потому что они быстрые.
 * <p>
 * Подробнее:
 * https://webdevblog.ru/zhadnye-algoritmy-chast-1-algoritm-dejkstry/
 */
public class Main {

    public static void main(String[] args) {
//      Работает отлично со следующим примером
        System.out.println(change(30, new int[]{1, 2, 5, 10, 20, 50, 100}).toString());

//      Но если сделать следующее, он вернет нам 25, 1, 1, 1, 1, 1. Здесь лучший вариант 15 и 15
        System.out.println(change(30, new int[]{1, 15, 25}).toString());
    }

    /**
     * Пример простого жадного алгоритма
     */
    public static List<Integer> change(int change, int[] denominations) {
        List<Integer> toGiveBack = new ArrayList<Integer>();

        for (int pos = denominations.length - 1; pos >= 0; pos--) {
            while (denominations[pos] <= change) {
                change = change - denominations[pos];
                toGiveBack.add(denominations[pos]);
            }
        }

        return toGiveBack;
    }
}
