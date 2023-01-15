public class Project {
    public static void main(String[] args) {
//Задание 1
        /*С некоторого момента прошло 234 дня.
        Сколько полных недель прошло за этот период? А месяцев?
        Выведите полученные значения в консоль.
         */
        int days = 234;
        int weeks = days / 7;
        int months = days / 31;
        System.out.println("Задание №1");
        System.out.println("Количество недель =" + weeks);
        System.out.println("Количество месяцев =" + months);



        //Задание 2
        /*Дано двузначное число 57.
        Найти:
        a.число десятков в нем;
        b.число единиц в нем;
        c.сумму его цифр;
        d.произведение его цифр.
         */
        int x = 57;
        int y = x / 10;
        System.out.println("Задание №2");
        System.out.println("Число десятков =" + y);
        int z = x % 50;
        System.out.println ("Число единиц =" + z);
        int b = y + z;
        System.out.println ("Сумма цифр =" + b);
        int c = y * z;
        System.out.println ("Произведение цифр =" + c);

        //Задание №3
        /*Найдите возраст человека, если известно, что год его рождения 1991.
        Выведите полученный результат в виде “Возраст = ...”
         */
        int birthDay = 1991;
        int currentYear = 2023;
        int age = currentYear - birthDay;
        System.out.println("Задание 3");
        System.out.printf("Возраст = %d" , age);













    }
}
