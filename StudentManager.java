import java.util.*;

public final class StudentManager extends ManagerBase {

    private final Map<Integer, Student> studentMap = new HashMap<>();
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public boolean addStudent(Student s) {
        if (s == null) return false;
        if (studentMap.containsKey(s.getRollNo())) {
            return false; // duplicate prevention
        }
        studentMap.put(s.getRollNo(), s);
        studentList.add(s);
        return true;
    }

    @Override
    public boolean deleteStudent(int rollNo) {
        Student st = studentMap.remove(rollNo);
        if (st != null) {
            studentList.removeIf(s -> s.getRollNo() == rollNo);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStudent(int rollNo, Student updated) {
        if (!studentMap.containsKey(rollNo)) return false;
        studentMap.put(rollNo, updated);

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getRollNo() == rollNo) {
                studentList.set(i, updated);
                break;
            }
        }
        return true;
    }

    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    @Override
    public List<Student> viewAllStudents() {
        return new ArrayList<>(studentList);
    }

    // Method overriding example
    @Override
    public void showManagerType() {
        System.out.println("Manager Type: StudentManager");
    }

    // final method
    public final void showFinalMessage() {
        System.out.println("This is a final method in a final class.");
    }

    // finalize demonstration
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before object is garbage collected.");
        super.finalize();
    }
}
