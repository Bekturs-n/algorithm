package bigO;

import java.util.TreeSet;

/**
 * Асимптотическая сложность алгоритмов представляет
 * собой время и память, которые понадобятся вашей программе в процессе экзекуции.
 * или
 * Асимптотика - поведение функции при стремлении аргумента к бесконечности
 * Виды асимптотического обозначения: Big O (О-большое) является общепризнанной категорией
 *                                          для обсуждения асимптотического времени работы алгоритмов;
 *                                    Big Ω (Омега-большое);
 *                                    Big θ (Тета-большое);
 *                                    Little O (О-малое);
 *
 * Большое О - (одна из)асмиптотическая оценка времени (указывалась выше);
 * С помощью Big O Notation можно математически описать то,
 * как поведет себя программа в условиях наихудшего сценария при большом количестве входных данных
 *
 * Обозначение О-Большое:
 *          T(n) = O(f(n)) тогда и только тогда, когда Т(n) в конечном итоге
 *          ограничена сверху постоянной, кратной функции f(n).
 *
 * Подробнее:
 * https://proglib.io/p/asymptotic-complexity
 *
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(getNumber(new int[]{1,2,3}, 1));
        System.out.println("==========================================");
        System.out.println(findDigit_v1(6));
        System.out.println("==========================================");
        System.out.println(findDigit_v2(4));
        System.out.println("==========================================");
        System.out.println(commonDigit(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println("==========================================");
        System.out.println(findDuplicate(new int[]{3,2,3}));
        System.out.println("==========================================");
        System.out.println(findDigit_v3(5));
    }

    public static int getNumber(int[] a, int i){
        System.out.println("Асимптотическое время исполнения - О(1), т.е. выполняется за константное время");
        if(a.length <= Math.abs(i)){
            System.out.print("Нет такого индекса: ");
            return i;
        }
        return a[Math.abs(i)];
    }

    public static boolean findDigit_v1(int n){
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
/**
 * Учитывается худшее время выполнения кода, в данном случае придется перебрать весь массив,
 * то есть n раз - поэтому O(n);
 */
        System.out.println("Асимптотическое время исполнения - О(n)");
        for(int i = 0; i < a.length; i++){
            if(a[i] == n)
                return true;
        }
        return false;
    }

    public static boolean findDigit_v2(int n){
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{6,7,8,9,0};

        System.out.println("Асимптотическое время исполнения - О(n)");
        for(int i = 0; i < a.length; i++){
            if(a[i] == n)
                return true;
        }
        for(int i = 0; i < b.length; i++){
            if(b[i] == n)
                return true;
        }
        return false;
    }
/**
 * Перебираем n элементов n раз или n*n -> (n^2)
 */
    public static boolean commonDigit(int[] a, int[] b ){
        System.out.println("Асимптотическое время исполнения - О(n^2)");

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean findDuplicate(int[] a){
        System.out.println("Асимптотическое время исполнения - О(n^2)");
        for(int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean findDigit_v3(int n){
       TreeSet<Integer> set = new TreeSet<Integer>();
       for(int i = 0; i < 10; i++){
           set.add(i);
       }
       System.out.println("Асимптотическое время исполнения - О(log n)");
       return set.contains(n);
    }
}
