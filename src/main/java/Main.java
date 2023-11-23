import java.util.Scanner;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    //Task1
                    task1();
                    break;
                }
                case 2: {
                    //Task2
                    task2();
                    break;
                }
                case 3: {
                    //Task3
                    task3();
                    break;
                }
                case 4: {
                    //Task4
                    task4();
                    break;
                }
                case 5: {
                    //Task5
                    task5();
                    break;
                }
                case 6: {
                    //Task6
                    task6();
                }
                case 7: {
                    //Task7
                    task7();
                }
                case 8: {
                    //Task8
                    task8();
                }
                default:
                    System.out.println("Выберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да") || choice.equalsIgnoreCase("yes")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет") || choice.equalsIgnoreCase("no")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1() {
        //Ввод двух чисел
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        //Вывод чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            System.out.println("Текущее значение i: " + i);
        }
    }

    public static void task2() {
        //Ввод двух чисел
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        //Вывод чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            //Проверка на чётность
            if (i % 2 == 0) {
                System.out.println("Текущее значение i: " + i);
            }
        }
    }

    public static void task3() {
        //Ввод двух чисел
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        //Нормализация границ
        if (secondNum < firstNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;

        }

        //Вывод чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            //Проверка на чётность
            if (i % 2 != 0) {
                System.out.println("Текущее значение i: " + i);
            }
        }
    }

    public static void task4() {
        //Ввод двух чисел
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        //Переменная для хранения результата
        int result = firstNum;

        //Вычисление суммы чисел в диапазоне
        for (int i = firstNum; i <= secondNum; i++) {
            result = result + i;
        }

        //Вывод результатов
        System.out.println("Сумма чисел в диапазоне от " + firstNum + " до " + secondNum + " равна: " + result);
        System.out.println("Среднее арифметическое: " + result/(secondNum-firstNum));

    }

    public static void task5 () {
        //Ввод числа
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        //Переменная для хранения результата
        int result = 1;

        //Вычисление факториала числа
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        //Вывод результатов
        System.out.println("Факториал введенного числа равен: " + result);
    }

    public static void task6 () {
        //Ввод числа
        System.out.print("Введите число: ");
        int length = scanner.nextInt();

        //Вывод символов в кол-ве "length"
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }

        //Перенос строки для дальнейшего вывода
        System.out.println("\n");
    }

    public static void task7 () {
        //Ввод числа
        System.out.print("Введите число: ");
        int length = scanner.nextInt();

        //Вывод символов в кол-ве "length"
        for (int i = 0; i < length; i++) {
            System.out.println("%");
        }

        //Перенос строки для дальнейшего вывода
        System.out.println("\n");
    }

    public static void task8 () {
        //Ввод двух чисел
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        //Анализ чисел в диапазоне
        for (int i = firstNum; i < secondNum; i++) {


            if ((firstNum + i) % 3 == 0 && (firstNum + i) % 5 == 0) {
                System.out.println(firstNum + i + "Fizz Buzz");
            } else if ((firstNum + i) % 5 == 0) {
                System.out.println(firstNum + i + "Buzz");
            } else if ((firstNum + i) % 3 == 0) {
                System.out.println(firstNum + i + "Fizz");
            }
        }
    }
}
