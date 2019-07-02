import org.junit.Test;

import static org.junit.Assert.*;

public class DeaneryTest {

    @Test
    public void studentTransfer() {
        Deanery deanery = new Deanery();
        Student st1 = new Student(1,"Бочков Вячеслав Алексеевич");
        Student st2 = new Student(2,"Блохина Мария Сергеевна");
        Group gr1 = new Group("Economists");
        Group gr2 = new Group("Engineers");
        deanery.getGroups().add(gr1);
        deanery.getGroups().add(gr2);
        deanery.getGroups().get(deanery.getGroups().indexOf(gr1)).addStudent(st1);
        deanery.getGroups().get(deanery.getGroups().indexOf(gr2)).addStudent(st2);
        deanery.studentTransfer(1,"Engineers");
        String actual = deanery.getGroups().get(deanery.getGroups().indexOf(gr2)).getStaff().get(deanery.getGroups().get(deanery.getGroups().indexOf(gr2)).getStaff().indexOf(st1)).getFIO();
        String expected = "Бочков Вячеслав Алексеевич";
        assertEquals(actual,expected);
    }
}