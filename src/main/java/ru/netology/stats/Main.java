package ru.netology.stats;


public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int salesSum = service.salesSum(sales);
        System.out.println(salesSum);


        int averageSales = service.averageSales(sales);
        System.out.println(averageSales);


        int maxSales = service.maxSales(sales);
        System.out.println(maxSales);


        int minSales = service.minSales(sales);
        System.out.println(minSales);


        int underAverage = service.salesUnderAverage(sales);
        System.out.println(underAverage);


        int aboveAverage = service.salesAboveAverage(sales);
        System.out.println(aboveAverage);

    }
}