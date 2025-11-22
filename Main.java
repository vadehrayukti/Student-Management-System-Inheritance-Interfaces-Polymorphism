public class Main {
    public static void main(String[] args) throws Exception {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "yukti", "yukti@mail.com", "B.Tech", 85);

        manager.addStudent(s1);

        s1.displayInfo();

        System.out.println("[Note] Overloaded display method:");
        s1.displayInfo(false);

        manager.showFinalMessage();

        manager = null;
        System.gc();

        Thread.sleep(1000);
    }
}
