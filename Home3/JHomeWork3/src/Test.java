import java.util.Scanner;

public class Test {
    static int a;

    public static void main(String[] args) {

    //5) Создать объект класса Cat и показать работу всех его методов.
        Cat cat = new Cat(2,11.5, "Murzik");
        System.out.println(cat.getName());
        cat.setName("Leo");
        cat.out();
        cat.eat();




        // 1) Вывести числа от одного до десяти при помощи каждого цикла. Объяснить в чем удобство каждого цикла
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        for (int x: arr) {
            System.out.print(x + " ");
        }
        //2) Сделать логический метод, который проверяет на равенство два числа
        int x = 10;
        int y = 10;
        int z = 11;
        if (x == y) {
            System.out.println("true");
        } else if (z != x) {
            System.out.println("true");
        } else if (x < y) {
            System.out.println("true");
        } else if (x > y) {
            System.out.println("error");
        }
        //3) Сделать процедуру для чтения с консоли значения в глобальную переменную
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println(a + " this is static");
    }
    //4) Сделать класс Cat с полями: age, weigth и name. Добавить конструктор для инициализации полей,
    // сделать методы акссессоры(геттеры и сеттеры)
    // и метод out для вывода на консоль всех значений объекта.
    static class Cat {
         private int age;
         private double weight;
         private String name;

        public Cat(int age, double weight, String name) {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void out() {
            System.out.println("Name is - " + name + ", age - " + age + ", weight - " + weight +".");
        }
        public void eat() {
            System.out.println("Cat is eating");
        }
    }

}

