
class Student{
    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;   // this refers to Current Object's Id
        this.name = name;  // LikeWise this.name refers Current objects Instance Name is assigned
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student" +
                "{" + id +
                "," +
                "name='" + name + '\'' +
                ',' + "address='" + address +
                '\''+
                "}"
                ;
    }
}


public class thiskeyword {
    public static void main(String[] args) {
    Student rahul = new Student(1275,"Rahul H","11/5 Kvs St Salem");
        System.out.println(rahul.toString());
        System.out.println("{" + rahul.name + " ,  " +rahul.address+ "}");
    }
}
