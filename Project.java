public class Project {
    public static void main(String[] args) {
        //Задание 3
        //Найдите возраст человека, если известно, что год его рождения 1991. Выведитеполученный результат в виде “Возраст = ...”
        int yearbirth = 1991;
        int currentyear = 2023;
        int age=currentyear-yearbirth;
        System.out.println ("Возраст =" +age);

        //Задание 2
        //Дано двузначное число 57. Найти:a.число десятков в нем;b.число единиц в нем;c.сумму его цифр;d.произведение его цифр.
        int x=57;
        int y=x/10;
        System.out.println(y);
        int z=x%50;
        System.out.println (z);
        int b=y+z;
        System.out.println (b);
        int c=y*z;
        System.out.println (c);











    }
}
