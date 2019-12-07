import java.util.ArrayList;
import java.io.*;


public class StudentList {
    private ArrayList<Student> students;

    StudentList(String filename) throws IOException {
        this.students = new ArrayList<Student>();
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            Student new_student = new Student(line);
            this.students.add(new_student);
        }
    }

    StudentList(ArrayList<Student> list){
        this.students = list;
    }

    public void setList(ArrayList<Student> list){
        this.students = list;
    }

    public ArrayList<Student> getList(){
        return this.students;
    }
}



