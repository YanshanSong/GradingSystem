public class Student {
    private String name;
    private String id;

    Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    Student(String stu_str){
        String[] attrs = stu_str.split(" ", 3);
        this.name = attrs[0];
        this.id = attrs[1];
    }
}
