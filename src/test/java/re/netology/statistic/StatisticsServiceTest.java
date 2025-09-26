package re.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findMaxWithNegativeAndZero() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-10, 0, -5, -20, -1};

        long expected = 0;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
