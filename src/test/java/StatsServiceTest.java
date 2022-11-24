import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void salesSumCheck() {
        StatsService service = new StatsService();

        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int expected = 209;
        int actual = service.salesSum(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageSalesCheck() {
        StatsService service = new StatsService();

        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int expected = 17;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSalesCheck() {
        StatsService service = new StatsService();

        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int expected = 10;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSalesCheck() {
        StatsService service = new StatsService();

        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int expected = 11;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void salesUnderAverageCheck() {
        StatsService service = new StatsService();

        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int expected = 8;
        int actual = service.salesUnderAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void salesAboveAverageCheck() {
        StatsService service = new StatsService();

        int[] sales = {
                15, 12, 10, 28, 16, 30, 16, 14, 7, 32, 4, 25
        };

        int expected = 4;
        int actual = service.salesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

}
