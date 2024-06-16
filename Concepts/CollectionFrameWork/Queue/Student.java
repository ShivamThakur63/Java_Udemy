package Concepts.CollectionFrameWork.Queue;

public class Student 
{
    int rollNo ;
    String name ;

    public Student(String name,int rollNo) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    // why do we override this .equals and HashCode method
    // Because every object is different because of new keyboard but with equals method we can change that
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }


    
    
    
    
}
