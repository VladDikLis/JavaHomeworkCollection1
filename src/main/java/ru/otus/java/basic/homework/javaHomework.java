package ru.otus.java.basic.homework;

import java.util.ArrayList;

public class javaHomework {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        m1(list1, 1, 10);
        m2(list1);
        m3(list1, 10);
        m4(list1, 10);

        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("Игорь", 26));
        list2.add(new Employee("Алексей", 18));
        list2.add(new Employee("Константин", 32));
        m5(list2);
        m6(list2, 25);
        m7(list2, 25);
        m8(list2);
    }

    public static ArrayList<Integer> m1 (ArrayList<Integer> list, Integer min, Integer max) {
        for (int i = min; i<=max; i++) {
            list.add(i);
        }
        System.out.println("Итоговый массив:");
        System.out.println(list);
        System.out.println();
        return list;
    }

    public static void m2 (ArrayList<Integer> list) {
        Integer a = 0;
        for (int i = 0; i<=list.size()-1; i++) {
            if (list.get(i) > 5) {
                a += list.get(i);
            }
        }
        System.out.println("Сумма элементов, что больше пяти: " + a);
        System.out.println();
    }

    public static ArrayList<Integer> m3 (ArrayList<Integer> list, Integer a) {
        for (int i = 0; i<=list.size()-1; i++) {
                list.set(i, a);
        }
        System.out.println("Итоговый массив после замены всех элементов на число:");
        System.out.println(list);
        System.out.println();
        return list;
    }

    public static ArrayList<Integer> m4 (ArrayList<Integer> list, Integer a) {
        for (int i = 0; i<=list.size()-1; i++) {
            list.set(i, list.get(i) + a);
        }
        System.out.println("Итоговый массив после прибавления ко всем элементам числа:");
        System.out.println(list);
        System.out.println();
        return list;
    }

    public static void m5 (ArrayList<Employee> list) {
        ArrayList<String> listEmployee = new ArrayList<>();
        for (int i = 0; i<=list.size()-1; i++) {
            listEmployee.add(list.get(i).name);
        }
        System.out.println("Список имён:");
        System.out.println(listEmployee);
        System.out.println();
    }

    public static void m6 (ArrayList<Employee> list, Integer a) {
        ArrayList<String> listEmployee = new ArrayList<>();
        for (int i = 0; i<=list.size()-1; i++) {
            if (list.get(i).age >= a) {
                listEmployee.add(list.get(i).name);
            }
        }
        System.out.println("Список имён сотрудников старше или соответствующие указанному возрасту:");
        System.out.println(listEmployee);
        System.out.println();
    }

    public static void m7 (ArrayList<Employee> list, Integer a) {
        Double b = 0.0;
        for (int i = 0; i<=list.size()-1; i++) {
            b += list.get(i).age;
        }
        if (b/list.size() > a) {
            System.out.println("Средний возозраст сотрудников превышает минимальный средний возраст");
        } else {
            System.out.println("Средний возозраст сотрудников не превышает минимальный средний возраст");
        }
        System.out.println();
    }

    public static void m8 (ArrayList<Employee> list) {
        Integer a = 200;
        Integer index = 0;
        for (int i = 0; i<=list.size()-1; i++) {
            if (a > list.get(i).age) {
                a = list.get(i).age;
                index = i;
            }
        }
        System.out.println("Самый молодой сотрудник " +  list.get(index).name);
        System.out.println();
    }


}
