package ex40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterRecordsTest {

    @Test
    void sortList() {
    }

    @Test
    void filterList() {
        Employee[] test1 =
        {
            new Employee("John", "Johnson", "Manager", "2016-12-31"),
            new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05")
        };
        Employee[] test2 =
        {
            new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05")
        };
        String search = "Xi";
        int number = test1.length;

        test1 = FilterRecords.filterList(test1, search, number);
        assertEquals(test2[0].getLastName(), test1[0].getLastName());


    }

    @Test
    void main() {
    }
}