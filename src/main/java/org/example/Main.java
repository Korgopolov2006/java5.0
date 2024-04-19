package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void plantFlowers() {
        System.out.println("Выберите цветы , которые вы хотите поставить в магилу.");
        List<String> list = new ArrayList<>(Arrays.asList("1)Ромашки \t 100р", "\n 2)Тюльманы \t 200р"));
        System.out.println(list);
        System.out.println("Выберите цветы");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Укажите колличество ромашек ");
                int colvo = scanner.nextInt();
                System.out.println("К оплате " + colvo*100 + "р");
                break;
            case 2:
                System.out.println("Укажите колличество Тюльпанов ");
                int colvoo = scanner.nextInt();
                System.out.println("К оплате " + colvoo*200 + "р" );
                break;
        }
    }

    public static void  Occupiedgraves(int Occupiedgraves) {
        System.out.println("Количество занятых мест на кладбище : " + Occupiedgraves);

    }
    public static void  numberOfPlaces(int numberOfPlacess) {
        System.out.println("Количество доступных мест на кладбище : "+ numberOfPlacess);

    }
    public static void cleanGrave() {
        System.out.println("Выберите версию уборки: \n 1)Убрать с кайфом \n 2)Убрать без кайфа");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("К оплате 5,000р"  );
                break;
            case 2:
                System.out.println("К оплате 10,000р"   );
                break;
        }
    }

    public static void welcome() {
        System.out.println("Добро пожаловать на кладбище!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите войти? (Да/Нет)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Нет")) {
            System.out.println("Хорошо, приходите в следующий раз.");
            System.exit(0);
        }
    }


    public static void Actions() {
        System.out.println("Выберите действие:");
        System.out.println("1. Информация о работниках");
        System.out.println("2. Цветы");
        System.out.println("3. Уборка");
        System.out.println("4. Количество доступных мест");
        System.out.println("5. Вскрытие");
        System.out.println("6. Кремирование");
        System.out.println("7. Сожжение");
        System.out.println("8. Оплатить");
    }

    public  void employeesInfo() {
        System.out.println("Действующие работники :");
        List<String> list = new ArrayList<>(Arrays.asList("Иванов Иван Иванович, 89 лет , часть команды часть корабля через 2 года", "\n Коргополов Артём Витальевич 18 , часть команды часть корабля через 4 года"));
        System.out.println(list);
    }

    public static void exhumation() {
        System.out.println("Вскрытие могилы (дополнительная услуга).");
        System.out.println("Укажите номер могилы которую вы хотите вскрыть");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Укажите адресс , куда доставить вашего деда ");
        String adress = scanner.nextLine();
        System.out.println("Труп из могилы " + choice + " будет доставлен по адресу " + adress + " завтра");
    }

    public  void cremation() {
        System.out.println("Выберите сотрудника которого хотите кремировать .");
        List<String> list = new ArrayList<>(Arrays.asList("1)Иванов Иван Иванович, 89 лет , часть команды часть корабля через 2 года", "\n 2)Коргополов Артём Витальевич 18 , часть команды часть корабля через 4 года"));
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        list.remove(choice-1);
        System.out.println("Сотрудник с индексом " + choice +" кремирован заживо , оставшиеся сотрудники :" );
        System.out.println(list);
    }

    public  void burning() {
        System.out.println("Выберите сотрудника которого хотите сжечь заживо .");
        List<String> list = new ArrayList<>(Arrays.asList("1)Иванов Иван Иванович, 89 лет , часть команды часть корабля через 2 года", "\n 2)Коргополов Артём Витальевич 18 , часть команды часть корабля через 4 года"));
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        list.remove(choice-1);
        System.out.println("Сотрудник с индексом " + choice +" сожжён заживо , оставшиеся сотрудники :" );
        System.out.println(list);
    }


    public static void main(String[] args) {
        int Occupiedgravess = 100;
        int numberOfPlacess = 200;
        Main Main = new Main();
        welcome();
        do {
            Actions();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Main.employeesInfo();
                    break;
                case 2:
                    plantFlowers();
                    break;
                case 3:
                    cleanGrave();
                    break;
                case 4:
                    numberOfPlaces(Occupiedgravess);
                    break;
                case 5:
                    exhumation();
                    break;
                case 6:
                    Main.cremation();
                    break;
                case 7:
                    Main.burning();
                    break;
                case 8:
                    Occupiedgraves(100);
                    break;


                default:
                    System.out.println("Неверный выбор. Повторите попытку.");
            }
            }while (true) ;


        }
    }
