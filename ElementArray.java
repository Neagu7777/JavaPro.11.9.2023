package arrays;

import java.util.ArrayList;
import java.util.Random;
/*
Создайте ArrayList, заполните его 100 случайными значениями, используя библиотеку Random


Решите две задачи и пришлите решение ссылкой на гитхаб


1) Выведите все элементы списка, которые больше предыдущего элемента этого же списка.
Пример, если список выглядит так - 1 5 2 4 3
То мы выведем - 5 4


2) Выведите значение наименьшего из всех положительных элементов в списке


Пример, если список выглядит так - 5 -4 3 -2 1
То мы выведем - 1
 */

public class ElementArray {
        public static void main(String[] args) {
            ArrayList<Integer> myList = new ArrayList<>();
            Random random = new Random();

            // Заполнение списка 100 случайными значениями от -100 до 100
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(201) - 100;
                myList.add(randomNumber);
            }

            // Решение первой задачи: Вывод элементов больше предыдущего
            for (int i = 1; i < myList.size(); i++) {
                if (myList.get(i) > myList.get(i - 1)) {
                    System.out.print(myList.get(i) + " ");
                }
            }

            System.out.println(); // Перейдем на следующую строку

            // Решение второй задачи: Наименьший положительный элемент
            int minPositive = Integer.MAX_VALUE; // Начальное значение наименьшего положительного
            for (int num : myList) {
                if (num > 0 && num < minPositive) {
                    minPositive = num;
                }
            }

            if (minPositive != Integer.MAX_VALUE) {
                System.out.println("Наименьший положительный элемент: " + minPositive);
            } else {
                System.out.println("В списке нет положительных элементов");
            }
        }
    }

//    Этот код создает ArrayList, заполняет его случайными значениями от -100 до 100,
//    и затем решает две задачи:
//
//1. Выводит элементы списка, которые больше предыдущего.
//2. Выводит наименьший положительный элемент списка.
