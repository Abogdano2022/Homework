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

            int neededLostWeight = 7000;
            int weightLostPerDay = 250;
            int daysQuantity250 = neededLostWeight/weightLostPerDay;
            System.out.println("Если худеет на 250 г - количество дней " + daysQuantity250);
            int weightLostPerDayPlus = 500;
            int daysQuantity500 = neededLostWeight/weightLostPerDayPlus;
            System.out.println("Если худеет на 500 г - количество дней " + daysQuantity500);

            int mariaSalary = 67760;
            float percent = 0.1f;
            var mariaSalary10 = mariaSalary*percent;
            var mariaSalaryIncrease = mariaSalary + mariaSalary10;
            int mariaSalaryAnnual = mariaSalary*12;
            float mariaSalaryAnnualNew = mariaSalaryIncrease*12;
            float mariaSalaryDifference = mariaSalaryAnnualNew - mariaSalaryAnnual;
            System.out.println("Маша теперь получает " + mariaSalaryIncrease);
            System.out.println ("Годовой доход вырос на " + mariaSalaryDifference);
            int denisSalary = 83690;
            var denisSalary10 = denisSalary*percent;
            var denisSalaryIncrease = denisSalary+denisSalary10;
            var denisSalaryAnnual = denisSalary*12;
            float denisSalaryAnnualNew = denisSalaryIncrease*12;
            float denisSalaryDifference = denisSalaryAnnualNew - denisSalaryAnnual;
            int christinaSalary = 76230;
            var christinaSalary10 = christinaSalary*percent;
            var christinaSalaryIncrease = christinaSalary + christinaSalary10;
            int christinaSalaryAnnual = christinaSalary*12;
            float christinaSalaryAnnualNew = christinaSalaryIncrease*12;
            float christinaSalaryDifference = christinaSalaryAnnualNew - christinaSalaryAnnual;
            System.out.println("Денис теперь получает " + denisSalaryIncrease);
            System.out.println ("Доход вырос на " + denisSalaryDifference);
            System.out.println("Кристина теперь получает " + christinaSalaryIncrease);
            System.out.println ("Годовой доход вырос на " + christinaSalaryDifference);





    }
    }
