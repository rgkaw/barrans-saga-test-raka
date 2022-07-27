import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BarrensSagaRiddleTest {
    //csv column : testCase  |  ageDeathA  |  yearDeathA  |  ageDeathB  |  yearDeathB  |  expected
    //csv file dir : /src/test/resources/testcases.scv
    @ParameterizedTest
    @DisplayName("Test1(ageDeathA, yearDeathA, ageDeathB, yearDeathB, expectedOutput")
    @CsvFileSource(resources = "/testcases.csv", numLinesToSkip = 1)
    void Test1(int ageDeathA,int yearDeathA,int ageDeathB,int yearDeathB,Double expected) {
        Villager A = new Villager(ageDeathA,yearDeathA);
        Villager B = new Villager(ageDeathB,yearDeathB);
        assertEquals(expected, BarrensSagaRiddle.AveragePeopleKilled(A,B));
    }
}