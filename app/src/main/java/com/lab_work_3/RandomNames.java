package com.lab_work_3;


import java.util.Random;

public class RandomNames {
    private static final int COUNT = 6;
    private static Random rnd;

    private static String[] mSurname = new String[] {"Шварцнегер", "Уиллис",
            "Бёртон", "Кубрик", "Болдырев", "Панченко"};
    private static String[] mName = new String[] {"Владимир", "Пётр",
            "Николай", "Артём", "Александр", "Дмитрий", "Григорий", "Арнольд"};
    private static String[] mFatherName = new String[] {"Сергеевич", "Романович",
            "Андреевич", "Алексеевич", "Владимирович", "Михайлович"};

    private static String[] fSurname = new String[] {"Болдырева", "Подольская",
            "Костина", "Бурунова", "Седых", "Курочкина", "Панченко"};
    private static String[] fName = new String[] {"Анастасия", "Надежда",
            "Дарья", "Евгения", "Алёна", "Мария"};
    private static String[] fFatherName = new String[] {"Сергеевна", "Романовна",
            "Андреевна", "Алексеевна", "Владимировна", "Михайловна"};

    public static String getRandFio() {
        rnd = new Random(System.currentTimeMillis());
        String fio = "";
        if (rnd.nextInt(2) == 0) {
            fio += mSurname[rnd.nextInt(COUNT)] + " ";
            fio += mName[rnd.nextInt(COUNT)] + " ";
            fio += mFatherName[rnd.nextInt(COUNT)];
        }
        else {
            fio += fSurname[rnd.nextInt(COUNT)] + " ";
            fio += fName[rnd.nextInt(COUNT)] + " ";
            fio += fFatherName[rnd.nextInt(COUNT)];
        }
        return fio;
    }

    public static String getIvan() {
        return "Иванов Иван Иванович";
    }
}
