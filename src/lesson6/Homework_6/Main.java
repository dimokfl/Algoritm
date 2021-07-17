package lesson6.Homework_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

            Random random = new Random();
            int countTree = 100000;
            int balCount = 0;

            for (int i = 0; i < countTree; i++) {
                MyTreeMapHW<Integer, Integer> map = new MyTreeMapHW<>();
                int x = 0;
                while (map.height() < 6) {
                    x = random.nextInt(201) - 100;
                    map.put(x, x);
                }
                map.delete(x);
                if (map.isBalance()) {
                    balCount++;
                }
            }
            System.out.println("balCount " + balCount + " countTree " + countTree);
            System.out.println("balanced " + (double) balCount / countTree * 100 + " %");
            System.out.println("no balanced " + (double) (countTree - balCount) / countTree * 100 + " %");

    }
}
