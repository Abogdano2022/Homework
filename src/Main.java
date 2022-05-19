public class Main {
    public static void main(String[] args) {
            var table = 5;
            System.out.println(table);
            byte a = 120;
            System.out.println(a);
            short b = 25000;
            System.out.println(b);
            int c = 5000000;
            System.out.println(c);
            long d = 67804000;
            System.out.println(d);
            float e = 9.9902f;
            System.out.println(e);
            double f = 10.0945079;
            System.out.println(f);

            float firstBoxerWeight = 78.2f;
            float secondBoxerWeight = 82.7f;
            float commonBoxersWeight = firstBoxerWeight + secondBoxerWeight;
            System.out.println("Общий вес двух бойцов " + commonBoxersWeight + " кг");
            float weightDifference = secondBoxerWeight - firstBoxerWeight;
            System.out.println("Разница в весе " + weightDifference + " кг");

            byte banana = 80;
            byte milk = 100;
            byte iceCream = 100;
            byte egg = 70;
            int bananas = banana*5;
            int milks = milk*2;
            int iceCreams = iceCream*2;
            int eggs = egg*4;
            int breakfast = bananas + milks + iceCreams + eggs;
            System.out.println("Общий вес спорт-завтрака в граммах " + breakfast + " г");

            float breakfastInKg = breakfast/1000f;
            System.out.println("Вес спорт-завтрака в килограммах " + breakfastInKg + " кг");




    }
    }
