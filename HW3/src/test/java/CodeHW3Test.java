import net.jqwik.api.*;
import net.jqwik.api.arbitraries.IntegerArbitrary;
import net.jqwik.api.statistics.Histogram;
import net.jqwik.api.statistics.Statistics;
import net.jqwik.api.statistics.StatisticsReport;
import org.example.CodeHW3;
import org.junit.jupiter.api.Assertions;

public class CodeHW3Test {
    @Provide
    IntegerArbitrary validInteger() {
        return Arbitraries.integers().between(-100, 100);
    }


    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format = Histogram.class)
    void evenOrOddTest(@ForAll("validInteger") int value) {
        CodeHW3 hw3 = new CodeHW3();
        boolean result = hw3.evenOrOdd(value);
        boolean isEven = isEven(value);

        Assertions.assertEquals(isEven, result);
        Statistics.label("ExpectedResult").collect(isEven);
        Statistics.label("OurMethod").collect(result);
    }


    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format = Histogram.class)
    void isPrimeTest(@ForAll("validInteger") int value) {
        CodeHW3 hw3 = new CodeHW3();
        boolean result = hw3.isPrime(value);
        boolean isPrime = isPrimeCheck(value);

        Assertions.assertEquals(isPrime, result);
        Statistics.label("ExpectedResult").collect(isPrime);
        Statistics.label("OurMethod").collect(result);
    }


    private boolean isEven(int value){
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isPrimeCheck(int value) {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


}
