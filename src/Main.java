public class Main {
    public static void main(String[] args) {
        //Задача 1

        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String separator = " ";
        String fullName = lastName+separator+firstName+separator+middleName;

        System.out.println("Ф. И. О. сотрудника — "+fullName);

        //Задача 2

        System.out.println("Задача 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());

        //Задача 3

        System.out.println("Задача 3");
//Вариант 1
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName.replace('ё', 'e'));
//Вариант 2
        String fullName2 = fullName.replace('ё','е');
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName2);

    }
}