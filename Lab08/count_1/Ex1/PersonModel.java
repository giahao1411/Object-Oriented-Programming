import java.util.ArrayList;

public class PersonModel <T>
{
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj)
    {
        al.add(obj);
    }

    public void display()
    {
        for(T obj : al)
        {
            System.out.println(obj);
        }
    }

    public static void main(String[] args)
    {
        //Create PersonModel object to represent Student
        PersonModel<Student> stu = new PersonModel<Student>();

        stu.add(new Student("Tran Gia Hao", 2004, "522H0080", 8.21));
        stu.add(new Student("Nguyen Van B", 2003, "5321H220", 7.8));
        stu.display();
        System.out.println();

        //Create PersonModel object to represent Employee
        PersonModel<Employee> emp = new PersonModel<Employee>();

        emp.add(new Employee("Tran Gia Hao", 2004, "14", 25.0));
        emp.add(new Employee("Tran Van A", 2001, "16", 23.0));
        emp.display();
        System.out.println();

        //Create PersonModel object to represent Person
        {
            PersonModel<Person> per = new PersonModel<Person>();

            per.add(new Person("Banh Van C", 2005));
            per.add(new Person("Huynh Thi Thuy D", 1999));
            per.display();
        }
    }
}