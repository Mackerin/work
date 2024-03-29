import org.w3c.dom.ls.LSOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int answer;
        int newAnswer;
        Scanner scan = new Scanner(System.in);
        ArrayList<Object> obj = new ArrayList<>();
        Object object1 = new Object("Квартира-студия", 1800000, "небольшая", "важен");
        Object object2 = new Object("Квартира в новостройке с хорошим ремонтом", 8300000, "небольшая", "важен");
        Object object3 = new Object("Многокомнатная квартира в спальном районе", 6000000, "большая", "важен");
        Object object4 = new Object("Многокомнатная квартира в элитном жилом комплексе", 11000000, "большая", "важен");
        Object object5 = new Object("Многокомнатная квартира на окраине города", 4500000, "большая", "неважен");
        Object object6 = new Object("Комфортабельная многокомнатная квартира на окраине города", 6000000, "большая", "неважен");
        Object object7 = new Object("Одноэтажный дом за чертой города", 7000000, "большая", "неважен");
        Object object8 = new Object("Одноэтажный дом в черте города", 5000000, "большая", "важен");
        Object object9 = new Object("Дом в 20-ти минутах езды от города", 9000000, "очень большая", "неважен");
        Object object10 = new Object("Двухэтажный дом в 20-ти минутах езды от города", 12000000, "очень большая", "важен");
        Object object11 = new Object("Уютная квартира в центре города", 5000000, "большая", "важен");
        Object object12 = new Object("Старинный особняк в историческом районе", 15000000, "очень большая", "важен");
        Object object13 = new Object("Квартира с видом на реку", 9000000, "большая", "неважен");
        Object object14 = new Object("Модерн квартира в высотном здании", 10000000, "большая", "важен");
        Object object15 = new Object("Таунхаус в элитном поселке", 18000000, "очень большая", "важен");
        Object object16 = new Object("Студия с балконом", 3000000, "небольшая", "неважен");
        Object object17 = new Object("Апартаменты в центре города", 7000000, "большая", "важен");
        Object object18 = new Object("Трешка с отличной планировкой", 8000000, "большая", "важен");
        Object object19 = new Object("Квартира с садом на крыше", 9500000, "большая", "неважен");
        Object object20 = new Object("Дом с бассейном на окраине", 14000000, "очень большая", "важен");
        Object object21 = new Object("Дачный участок в пригороде", 2000000, "большая", "неважен");
        Object object22 = new Object("Студия в новом микрорайоне", 3500000, "небольшая", "важен");
        Object object23 = new Object("Уютная квартира в спокойном районе", 6000000, "большая", "неважен");
        Object object24 = new Object("Элитная квартира с панорамным видом", 20000000, "очень большая", "важен");
        Object object25 = new Object("Трешка в современном жилом комплексе", 8500000, "большая", "неважен");
        HashSet<Object> uniqueObjects = new HashSet<>(obj);
        uniqueObjects.add(object1);
        uniqueObjects.add(object2);
        uniqueObjects.add(object3);
        uniqueObjects.add(object4);
        uniqueObjects.add(object5);
        uniqueObjects.add(object6);
        uniqueObjects.add(object7);
        uniqueObjects.add(object8);
        uniqueObjects.add(object9);
        uniqueObjects.add(object10);
        uniqueObjects.add(object11);
        uniqueObjects.add(object12);
        uniqueObjects.add(object13);
        uniqueObjects.add(object14);
        uniqueObjects.add(object15);
        uniqueObjects.add(object16);
        uniqueObjects.add(object17);
        uniqueObjects.add(object18);
        uniqueObjects.add(object19);
        uniqueObjects.add(object20);
        uniqueObjects.add(object21);
        uniqueObjects.add(object22);
        uniqueObjects.add(object23);
        uniqueObjects.add(object24);
        uniqueObjects.add(object25);
        obj.add(object1);
        obj.add(object2);
        obj.add(object3);
        obj.add(object4);
        obj.add(object5);
        obj.add(object6);
        obj.add(object7);
        obj.add(object8);
        obj.add(object9);
        obj.add(object10);
        obj.add(object11);
        obj.add(object12);
        obj.add(object13);
        obj.add(object14);
        obj.add(object15);
        obj.add(object16);
        obj.add(object17);
        obj.add(object18);
        obj.add(object19);
        obj.add(object20);
        obj.add(object21);
        obj.add(object22);
        obj.add(object23);
        obj.add(object24);
        obj.add(object25);
        obj.clear();


        obj.addAll(uniqueObjects);


        saveDataToFile(obj);
        do {
            System.out.println("Выберите из списка:");
            System.out.println("1 - Мне нужна помощь с подбором недвижимости\n" +
                    "2 - Я хочу ознакомиться с имеющимися предложениями\n" +
                    "3 - Я хочу добавить новое предложение\n" +
                    "4 - Я хочу удалить существующее предложение");
            newAnswer = scan.nextInt();
            switch (newAnswer) {
                case 1:
                    System.out.println("Ваш бюджет?");
                    System.out.println("1 - до 2 млн; 2 - от 2 до 7 млн; 3 - больше 7 млн");
                    int answer1 = scan.nextInt();
                    if (answer1 < 1 || answer1 > 3) {
                        System.out.println("Некорректный вариант, попробуйте заново");
                        break;
                    }
                    System.out.println("Какая площадь вам требуется?");
                    System.out.println("1 - небольшая; 2 - большая; 3 - очень большая");
                    int answer2 = scan.nextInt();
                    if (answer2 < 1 || answer2 > 3) {
                        System.out.println("Некорректный вариант, попробуйте заново");
                        break;
                    }
                    System.out.println("Важен ли вам район?");
                    System.out.println("1 - да; 2 - нет");
                    int answer3 = scan.nextInt();
                    if (answer3 < 1 || answer3 > 2) {
                        System.out.println("Некорректный вариант, попробуйте заново");
                        break;
                    }
                    switch (answer1) {
                        case 1:
                            for (Object element : obj) {
                                if (element.sum < 2000000) {
                                    System.out.println("Вам подойдет " + element.nomination);
                                }
                            }
                            break;
                        case 2:
                            switch (answer2) {
                                case 1:
                                    for (Object element : obj) {
                                        if (element.size.equals("небольшая") && element.sum <=
                                                7000000) {
                                            System.out.println("Вам подойдет " + element.nomination);
                                        }
                                    }
                                    break;
                                case 2:
                                    switch (answer3) {
                                        case 1:
                                            for (Object element : obj) {
                                                if (element.size.equals("большая") && element.sum <=
                                                        7000000 && element.importanceDistrict.equals("важен")) {
                                                    System.out.println("Вам подойдет " + element.nomination);
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (Object element : obj) {
                                                if (element.size.equals("большая") && element.sum <=
                                                        7000000 && element.importanceDistrict.equals("неважен")) {
                                                    System.out.println("Вам подойдет " + element.nomination);
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Такого варианта нет");
                                    }
                                    break;
                                case 3:
                                    switch (answer3) {
                                        case 1:
                                            for (Object element : obj) {
                                                if (element.size.equals("очень большая") && element.sum <=
                                                        7000000 && element.importanceDistrict.equals("важен")) {
                                                    System.out.println("Вам подойдет " + element.nomination);
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (Object element : obj) {
                                                if (element.size.equals("очень большая") && element.sum <=
                                                        7000000 && element.importanceDistrict.equals("неважен")) {
                                                    System.out.println("Вам подойдет " + element.nomination);
                                                }
                                            }
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Такого варианта нет");
                            }
                            break;
                        case 3:
                            switch (answer2) {
                                case 1:
                                    for (Object element : obj) {
                                        if (element.size.equals("небольшая") && element.sum > 7000000) {
                                            System.out.println("Вам подойдет " + element.nomination);
                                        }
                                    }
                                    break;
                                case 2:
                                    for (Object element : obj) {
                                        if (element.size.equals("большая") && element.sum > 7000000) {
                                            System.out.println("Вам подойдет " + element.nomination);
                                        }
                                    }
                                    break;
                                case 3:
                                    switch (answer3) {
                                        case 1:
                                            for (Object element : obj) {
                                                if (element.size.equals("очень большая") && element.sum >
                                                        7000000 && element.importanceDistrict.equals("важен")) {
                                                    System.out.println("Вам подойдет " + element.nomination);
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (Object element : obj) {
                                                if (element.size.equals("очень большая") && element.sum >
                                                        7000000 && element.importanceDistrict.equals("неважен")) {
                                                    System.out.println("Вам подойдет " + element.nomination);
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Нет такого варианта");
                                    }
                            }
                            break;
                        default:
                            System.out.println("Нет такого варианта");
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < obj.size(); i++) {
                        System.out.println((i + 1) + " - " + obj.get(i));
                        saveDataToFile(obj);
                    }
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Введите название жилой площади:");
                    String newNomination = scan.nextLine();
                    System.out.println("Введите сумму:");
                    int newSum = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Введите размер (небольшая, большая, очень большая):");
                    String newSize = scan.nextLine();
                    System.out.println("Введите важность района(важен, неважен):");
                    String newImportanceDistrict = scan.nextLine();
                    Object newObject = new Object(newNomination, newSum, newSize, newImportanceDistrict);
                    for (Object existingObj : obj) {
                        if (existingObj.equals(newObject)) {
                            System.out.println("Такое предложение уже существует");
                            break;
                        }else {
                            obj.add(newObject);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Выберите какое предложение хотите удалить:");
                    for (int i = 0; i < obj.size(); i++) {
                        System.out.println((i + 1) + " - " + obj.get(i));
                    }
                    int removeIndex = scan.nextInt() - 1;
                    if (removeIndex >= 0 && removeIndex < obj.size()) {
                        obj.remove(removeIndex);
                    } else {
                        System.out.println("Некорректный индекс");
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
            System.out.println("Повторить?");
            System.out.println("1 - да; 2 - нет");
            answer = scan.nextInt();
        } while (answer == 1);
        System.out.println("Проверка новой ветки");


    }

    private static void saveDataToFile(ArrayList<Object> obj) {
        try {
            FileWriter writer = new FileWriter("\\C:\\Users\\dan_e\\OneDrive\\Рабочий стол\\недвижимость.txt");
            for (Object element : obj) {
                writer.write(element.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
        }
    }
}
