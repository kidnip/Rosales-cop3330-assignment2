package ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordSorterTest {

    @Test
    void sortList() {
        Employee[] test1 = {
                new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
                new Employee("John", "Johnson", "Manager", "2016-12-31")
        };
        Employee[] test2 = {
                new Employee("John", "Johnson", "Manager", "2016-12-31"),
                new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05")
        };
        int counter = test1.length;
        test1 = RecordSorter.sortList(test1, counter);

        assertEquals(test2[0].getLastName(), test1[0].getLastName());
    }

    @Test
    void main() {
    }
}