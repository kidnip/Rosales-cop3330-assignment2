package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeListTest {

    @Test
    void removeName() {
        String[] testList1 = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] testList2 = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};
        Assertions.assertArrayEquals(testList2, EmployeeList.removeName("Chris Jones", testList1));
    }

    @Test
    void main() {
    }
}