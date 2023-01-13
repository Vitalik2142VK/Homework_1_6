public class Main
{
    public static void Task1()
    {
        System.out.println("Task1: ");
        int month = 0;
        int savings = 0;
        while (savings < 2_459_000)
        {
            savings += 15000;
            month++;
            System.out.println("Месяц "+ month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("##########");
    }

    public static void Task2()
    {
        System.out.println("Task2: ");
        int value = 0;
        while (value < 10)
        {
            value++;
            System.out.print(value + " ");
        }
        System.out.print("\n");
        for (int i = 10; i > 0; i--)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println("##########");
    }

    public static void Task3()
    {
        System.out.println("Task3: ");
        int populationY = 12_000_000;
        int years = 0;
        int birthRate;
        int mortality;
        while (years < 10)
        {
            years++;
            birthRate = populationY * 17 / 1000;
            mortality = populationY * 8 / 1000;
            populationY += (birthRate - mortality);
            System.out.println("Год " + years + ", численность населения составляет " + populationY + ".");
        }
        System.out.println("##########");
    }

    public static void Task4()
    {
        System.out.println("Task4: ");
        int month = 0;
        int savings = 15000;
        while (savings < 12_000_000)
        {
            month++;
            savings += (savings * 7 / 100);
            System.out.println("Месяц "+ month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("##########");
    }

    public static void Task5()
    {
        System.out.println("Task5: ");
        int month = 0;
        int savings = 15000;
        while (savings < 12_000_000)
        {
            month ++;
            savings += (savings * 7 / 100);
            if (month % 6 == 0)
                System.out.println("Месяц "+ month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Месяц "+ month + ", сумма накоплений равна " + savings + " рублей");
        System.out.println("##########");
    }

    public static void Task6()
    {
        System.out.println("Task6: ");
        int month = 0;
        int savings = 15000;
        while (month < 108)
        {
            month ++;
            savings += (savings * 7 / 100);
            if (month % 6 == 0)
                System.out.println("Месяц "+ month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Сумма накоплений за 9 лет равна " + savings + " рублей");
        System.out.println("##########");
    }

    public static void Task7()
    {
        System.out.println("Task7: ");
        int friday = 3;
        do
        {
            System.out.println("Сегодня пятница, "+ friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        while (friday < 32);
        System.out.println("##########");
    }

    public static void Task8()
    {
        System.out.println("Task8: ");
        int years = 0;
        do {
            if (years >= 1823)
                System.out.println(years);
            years += 79;
        }
        while (years <= 2123);
        System.out.println("##########");
    }

    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }
}