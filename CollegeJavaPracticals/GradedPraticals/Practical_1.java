package CollegeJavaPracticals.GradedPraticals;

import java.util.Arrays;
import java.util.Scanner;

public class Practical_1 {
    public static void main(String[] args) {
        DVD dvd1 = new DVD("online lecture");
        DVD dvd2 = new DVD("anime");
        DVD dvd3 = new DVD("movies");

        DVD[] dvd = new DVD[]{dvd1, dvd2, dvd3};

        TextBook t1 = new TextBook("DS");
        TextBook t2 = new TextBook("Java");

        TextBook[] textBooks = new TextBook[]{t1, t2};

        Novel novel = new Novel("Merchant of Venice");

        Novel[] novels = new Novel[]{novel};

        int sum = DVD.countDVD + TextBook.countTextBook + Novel.countNovel;

        String[] shelf = new String[sum];

        for (int i = 0; i < dvd.length; i++) {
            shelf[i] = dvd[i].name;
        }
        for (int i = dvd.length; i < textBooks.length + dvd.length; i++) {
            shelf[i] = textBooks[i - dvd.length].name;
        }
        for (int i = dvd.length + textBooks.length; i < dvd.length + textBooks.length + novels.length; i++) {
            shelf[i] = novels[i - (dvd.length + textBooks.length)].name;
        }

        System.out.println(Arrays.toString(shelf));
    }
}

class DVD {
    static int countDVD = 0;
    String name;
    DVD(String name) {
        this.name = name;
        countDVD++;
    }
}

class TextBook {
    String name;

    static int countTextBook = 0;
    TextBook(String name) {
        this.name = name;
        countTextBook++;
    }
}

class Novel {
    String name;
    static int countNovel = 0;
    Novel(String name) {
        this.name = name;
        countNovel++;
    }
}