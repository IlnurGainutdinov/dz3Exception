package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void run()  {
        while (true) {
            System.out.println("Введите данные через пробел: " +
                    "Фамилия Имя Отчество дата рождения(дд.мм.гггг) номер телефона пол(f/m)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Ошибка ввода. Введена пустая строка");

            }
            String[] splitedClient = input.split(" ");
            if (splitedClient.length != 6){
                System.out.println("Ошибка ввода. Введено либо больше либо меньше данных");
                continue;
            }
            else{
                    System.out.println("Данные введены успешно");
            }


            String surname = splitedClient[0];
            String name = splitedClient[1];
            String patronymic = splitedClient[2];
            String birthDate = splitedClient[3];
            String telephoneNumber = splitedClient[4];
            String gender = splitedClient[5];
            Client client = new Client(surname, name, patronymic, birthDate, telephoneNumber, gender);
            File file = new File(client.getSurname());
            try (FileWriter writer = new FileWriter(file, true)) {
                if (client.getTelephoneNumber().length() != 11) {
                    throw new RuntimeException("Введен некорректный номер телефона");
                } else {
                    writer.append(client + "\n");
                }
            } catch (RuntimeException e) {
                System.out.println("Введен некорректный номер телефона");
            } catch (IOException e) {
                System.out.println("Ошибка Input/Output");
                e.printStackTrace();
            }
        }
    }

}
