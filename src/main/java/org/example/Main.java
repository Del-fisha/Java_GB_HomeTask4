package org.example;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dataBase = new ArrayList<>();
        print("Для редактирования базы нажмите \"n\"");

        String choise = write();
        if(Objects.equals(choise, "n")) {
            print("Для добавления новых людей в базу нажмите \"n\"");
            print("Для выхода из программы нажмите \"q\"");
            print("Для отображения развёрнутого списка нажмите \"p\"");
            print("Для отображения сокращённого списка нажмите \"a\"");
            while (true) {
                String input = write();
                if (input.equalsIgnoreCase("Q")) {
                    break;
                }
                if (input.equalsIgnoreCase("n")) {
                    newName(dataBase);
                    print("Для добавления новых людей в базу нажмите \"n\"");
                    print("Для выхода из программы нажмите \"q\"");
                    print("Для отображения развёрнутого списка нажмите \"p\"");
                    print("Для отображения сокращённого списка нажмите \"a\"");
                }
                if(input.equalsIgnoreCase("p")) {
                    print(dataBase);
                    print("Для добавления новых людей в базу нажмите \"n\"");
                    print("Для выхода из программы нажмите \"q\"");
                    print("Для отображения сокращённого списка нажмите \"a\"");
                }
                if(input.equalsIgnoreCase("a")){
                    abbreviated(dataBase);
                    print("Для добавления новых людей в базу нажмите \"n\"");
                    print("Для выхода из программы нажмите \"q\"");
                    print("Для отображения развёрнутого списка нажмите \"p\"");
                }
                }
            }
        }


    // Метод добавления имени
    public static void newName(ArrayList<ArrayList<String>> data){
        ArrayList<String> person = new ArrayList<>(6);
        for (int i = 0; i < 1; i++) {
            String id = String.valueOf(data.size() + 1);
            person.add(id);

            print("Введите фамилию: ");
            String surname = write();
            surname = surname.substring(0,1).toUpperCase() + surname.substring(1);
            person.add(surname);

            print("Введите имя: ");
            String name = write();
            name = name.substring(0,1).toUpperCase() + name.substring(1);
            person.add(name);

            print("Введите отчество: ");
            String middleName = write();
            middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1);
            person.add(middleName);

            print("Введите пол: ");
            String gender = write();
            gender = gender.toUpperCase();
            person.add(gender);

            print("Введите возраст: ");
            String age = write();
            person.add(age);
        }
        data.add(person);

    }

    // Метод вывода в консоль
    public static void print(Object smth){
        System.out.println(smth);
    }

    // Метод записи
    public static String write(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    //Метод отображения сокращённого ФИО
    public static void abbreviated(ArrayList<ArrayList<String>> smth){
        for (ArrayList<String> value:smth) {
             print(value.get(1) + " "
                     + value.get(2).charAt(0) + ". "
                     + value.get(3).charAt(0) + ". "
                     + value.get(4) + " "
                     + value.get(5));
        }
    }
}