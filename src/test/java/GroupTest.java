import org.junit.Test;

import static org.junit.Assert.*;

public class GroupTest {

    @Test
    public void addStudent() {
        Student st = new Student(1,"Сидоров Вася");
        Group gr = new Group("Engineers");
        gr.addStudent(st);
        String actual = gr.getTitle();
        String expected = st.getGroup().getTitle();
        assertEquals(actual, expected);
    }

    @Test
    public void addHead() {
        Student st = new Student(1,"Иванов Коля");
        Group gr = new Group("Economists");
        gr.addHead(st);
        String actual = gr.getHead().getFIO();
        String expected = st.getFIO();
        assertEquals(actual, expected);
    }

    @Test
    public void searchStudent() {
        Student st = new Student(1,"Абрамов Иван");
        Group gr = new Group("Economists");
        gr.addStudent(st);
        String actual = gr.searchStudent(1).getFIO();
        String expected = st.getFIO();
        assertEquals(actual, expected);
    }
}