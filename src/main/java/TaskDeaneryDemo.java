public class TaskDeaneryDemo {
    public static void main (String[] args){
        Deanery deanery = new Deanery();
        deanery.importStudents("students.json");
        deanery.importGroup("groups.json");
        deanery.addRandomMarks();
        deanery.addGroupHead();
        deanery.studentTransfer(2, "Economists");
        deanery.academicFailure ();
        deanery.printInfo();
        deanery.writeToFile("out.json");
    }
}