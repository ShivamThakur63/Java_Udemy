package Concepts.CollectionFrameWork.Set;

public class Employee implements Comparable<Employee>
{
    String name ;
    int id ;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public int compareTo(Employee o)
    {
        return o.id-id;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
    
   
    
}
